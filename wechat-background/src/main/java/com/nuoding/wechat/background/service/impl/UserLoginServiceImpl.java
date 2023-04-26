package com.nuoding.wechat.background.service.impl;

import com.nuoding.wechat.background.model.LoginDTO;
import com.nuoding.wechat.background.service.UserLoginService;
import com.nuoding.wechat.common.constant.RedisKey;
import com.nuoding.wechat.common.constant.SessionKey;
import com.nuoding.wechat.common.constant.SysParamConfigKey;
import com.nuoding.wechat.common.dao.BackSysUserDao;
import com.nuoding.wechat.common.entity.BackSysUser;
import com.nuoding.wechat.common.enums.RespStatusEnum;
import com.nuoding.wechat.common.model.MapResponse;
import com.nuoding.wechat.common.service.RedisService;
import com.nuoding.wechat.common.service.SysParamConfigService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
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

    @Resource
    private BackSysUserDao backSysUserDao;

    @Autowired
    private SysParamConfigService sysParamConfigService;

    @Autowired
    private RedisService redisService;

    @Override
    public MapResponse login(LoginDTO loginDTO) {
        MapResponse mapResponse = new MapResponse();
        String userId = loginDTO.getUserId();
        String passWD = loginDTO.getPassWD();
        String tenantId = SessionKey.getValue(SessionKey.TENANT_ID);
        String maxConfigCnt = sysParamConfigService.getConfigByCatch(
                tenantId, SysParamConfigKey.USER_LOGIN_ERROR_MAX_CNT);
        String notAllLoginFlag = redisService.getValue(RedisKey.USER_NOT_ALLOW_FLAG.concat(tenantId).concat(userId));
        if (StringUtils.isNotBlank(notAllLoginFlag)) {
            mapResponse.setResponse(RespStatusEnum.USER_NOT_ALLOW_LOGIN);
            return mapResponse;
        }
        int errCnt = 0;
        String err = redisService.getValue(RedisKey.USER_ERROR_CNT.concat(tenantId).concat(userId));
        if (!StringUtils.isBlank(err)) {
            errCnt = Integer.valueOf(err);
        }
        if (errCnt >= Integer.valueOf(maxConfigCnt)) {
            mapResponse.setResponse(RespStatusEnum.PASSWD_ERROR_TOO_MATCH);
            return mapResponse;
        }

        BackSysUser backSysUser = new BackSysUser();
        backSysUser.setUserId(userId);
        backSysUser.setTenantId(SessionKey.getValue(SessionKey.TENANT_ID));
        List<BackSysUser> list = backSysUserDao.queryAllByLimit(backSysUser);
        if (!CollectionUtils.isEmpty(list)) {
            backSysUser = list.get(0);
            if (!StringUtils.equals(passWD, backSysUser.getPasswd())) {
                mapResponse.setResponse(RespStatusEnum.LOGIN_SUCCESS);
                Map map = new HashMap<>();
                map.put("userId", userId);
                map.put("roleId", backSysUser.getRoleId());
                map.put("userName", backSysUser.getUserName());
                map.put("tenantId", backSysUser.getTenantId());
                mapResponse.put("data", map);
                redisService.delValue(RedisKey.USER_ERROR_CNT.concat(tenantId).concat(userId));
            } else {
                mapResponse.setResponse(RespStatusEnum.PASSWD_CODE_ERROR);
                redisService.setValue(RedisKey.USER_ERROR_CNT.concat(tenantId).concat(userId)
                        , String.valueOf(errCnt + 1), 10 * 60);
            }
        } else {
            mapResponse.setResponse(RespStatusEnum.USER_NULL);
        }
        return mapResponse;
    }

    @Override
    public boolean logout(LoginDTO loginDTO) {
        SessionKey.removeKey(SessionKey.LOGIN_KEY);
        return true;
    }
}
