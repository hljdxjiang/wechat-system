package com.nuoding.wechat.background.service.impl;

import com.nuoding.wechat.background.model.LoginDTO;
import com.nuoding.wechat.background.service.UserLoginService;
import com.nuoding.wechat.common.constant.RedisKey;
import com.nuoding.wechat.common.constant.SessionKey;
import com.nuoding.wechat.common.dao.back.BackSysUserDao;
import com.nuoding.wechat.common.entity.back.BackSysRoleDetailEntity;
import com.nuoding.wechat.common.entity.back.BackSysUserEntity;
import com.nuoding.wechat.common.enums.RespStatusEnum;
import com.nuoding.wechat.common.model.base.MapResponse;
import com.nuoding.wechat.common.service.RedisService;
import com.nuoding.wechat.common.service.back.BackSysRoleDetailService;
import com.nuoding.wechat.common.service.sys.SysParamConfigService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Ahther:JHC
 * @Description:用户登录Service
 * @Date:2023/4/11 下午5:19
 */
@Service
public class UserLoginServiceImpl implements UserLoginService {

    private BackSysUserDao backSysUserDao;

    private SysParamConfigService sysParamConfigService;

    private BackSysRoleDetailService backSysRoleDetailService;

    private RedisService redisService;

    public UserLoginServiceImpl(BackSysUserDao backSysUserDao, SysParamConfigService sysParamConfigService, BackSysRoleDetailService backSysRoleDetailService, RedisService redisService) {
        this.backSysUserDao = backSysUserDao;
        this.sysParamConfigService = sysParamConfigService;
        this.backSysRoleDetailService = backSysRoleDetailService;
        this.redisService = redisService;
    }

    @Override
    public MapResponse login(LoginDTO loginDTO) {
        MapResponse mapResponse = new MapResponse();
        String userId = loginDTO.getUserId();
        String passWD = loginDTO.getPassWD();
        String maxConfigCnt = sysParamConfigService.getConfigByCatch(RedisKey.USER_ERROR_CNT);
        int maxErrCnt = 5;
        if (StringUtils.isNoneBlank(maxConfigCnt)) {
            maxErrCnt = Integer.valueOf(maxConfigCnt);
        }
        String notAllLoginFlag = redisService.getValue(RedisKey.USER_NOT_ALLOW_FLAG.concat(userId));
        if (StringUtils.isNotBlank(notAllLoginFlag)) {
            mapResponse.setResponse(RespStatusEnum.USER_NOT_ALLOW_LOGIN);
            return mapResponse;
        }
        int errCnt = 0;
        String err = redisService.getValue(RedisKey.USER_ERROR_CNT.concat(userId));
        if (!StringUtils.isBlank(err)) {
            errCnt = Integer.valueOf(err);
        }
        if (errCnt >= maxErrCnt) {
            mapResponse.setResponse(RespStatusEnum.PASSWD_ERROR_TOO_MATCH);
            return mapResponse;
        }

        BackSysUserEntity backSysUser = new BackSysUserEntity();
        backSysUser.setUserId(userId);
        backSysUser.setTenantId(SessionKey.getValue(SessionKey.TENANT_ID));
        Map retMap = new HashMap<>();
        List<BackSysUserEntity> list = backSysUserDao.queryAllByLimit(backSysUser);
        if (!CollectionUtils.isEmpty(list)) {
            backSysUser = list.get(0);
            if (StringUtils.equals(passWD, backSysUser.getPasswd())) {
                mapResponse.setResponse(RespStatusEnum.LOGIN_SUCCESS);
                retMap.put("userId", userId);
                retMap.put("token", userId);
                retMap.put("roleId", backSysUser.getRoleId());
                retMap.put("userName", backSysUser.getUserName());
                redisService.delValue(RedisKey.USER_ERROR_CNT.concat(userId));
            } else {
                mapResponse.setResponse(RespStatusEnum.PASSWD_CODE_ERROR);
                redisService.setValue(RedisKey.USER_ERROR_CNT.concat(userId)
                        , String.valueOf(errCnt + 1), 10 * 60);
            }
            String roleID = backSysUser.getRoleId();
            if (StringUtils.isNotBlank(roleID)) {
                SessionKey.setValue(SessionKey.LOGIN_KEY, backSysUser.getUserId());
                SessionKey.setValue(SessionKey.LOGIN_ROLE_ID, roleID);
                SessionKey.setValue(SessionKey.TENANT_ID, backSysUser.getTenantId());
                List<BackSysRoleDetailEntity> menus = new ArrayList<>();
                List<BackSysRoleDetailEntity> revokes = new ArrayList<>();
                BackSysRoleDetailEntity entity = new BackSysRoleDetailEntity();
                entity.setRoleid(roleID);
                List<BackSysRoleDetailEntity> detailEntities = backSysRoleDetailService.queryAllByLimit(entity);
                if (!CollectionUtils.isEmpty(detailEntities)) {
                    for (BackSysRoleDetailEntity entity2 : detailEntities) {
                        String type = entity2.getType();
                        if (StringUtils.equalsIgnoreCase(type, "MENU")) {
                            menus.add(entity2);
                        }

                        if (StringUtils.equalsIgnoreCase(type, "REVOKE")) {
                            revokes.add(entity2);
                        }
                    }
                }
                retMap.put("menus", menus);
                retMap.put("permission", revokes);
                mapResponse.put("data", retMap);
            } else {
                mapResponse.setResponse(RespStatusEnum.USER_NO_ROLEID);
            }
        } else {
            mapResponse.setResponse(RespStatusEnum.USER_NULL);
        }
        return mapResponse;
    }

    @Override
    public boolean logout(LoginDTO loginDTO) {
        SessionKey.removeKey(SessionKey.LOGIN_KEY);
        SessionKey.removeKey(SessionKey.TENANT_ID);
        SessionKey.removeKey(SessionKey.LOGIN_ROLE_ID);
        return true;
    }
}
