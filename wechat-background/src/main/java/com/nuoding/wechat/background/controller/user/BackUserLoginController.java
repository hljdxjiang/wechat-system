package com.nuoding.wechat.background.controller.user;

import com.nuoding.wechat.background.model.LoginDTO;
import com.nuoding.wechat.background.service.UserLoginService;
import com.nuoding.wechat.background.service.UserRoleInfoService;
import com.nuoding.wechat.common.constant.LockTradeType;
import com.nuoding.wechat.common.constant.SessionKey;
import com.nuoding.wechat.common.entity.BackUserLoginRecord;
import com.nuoding.wechat.common.enums.RespStatusEnum;
import com.nuoding.wechat.common.interceptor.LockTrade;
import com.nuoding.wechat.common.interceptor.StaticTrade;
import com.nuoding.wechat.common.model.MapResponse;
import com.nuoding.wechat.common.service.BackUserLoginRecordService;
import com.nuoding.wechat.common.utils.IpUtil;
import com.nuoding.wechat.common.utils.RequestUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Map;

/**
 * 用户登录相关接口
 *
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@LockTrade(name = LockTradeType.LOGIN)
@RestController
@RequestMapping("/background/userLogin")
public class BackUserLoginController {

    @Autowired
    private UserLoginService userLoginService;

    @Autowired
    private UserRoleInfoService userRoleInfoService;

    @Autowired
    private BackUserLoginRecordService backUserLoginRecordService;

    /***
     * 用户登录接口
     * @param loginDTO
     * @return
     */
    @StaticTrade(name = "login")
    @LockTrade(name = LockTradeType.LOGIN)
    @PostMapping("/login")
    public MapResponse login(@RequestBody LoginDTO loginDTO) {
        MapResponse mapResponse = userLoginService.login(loginDTO);
        BackUserLoginRecord record = new BackUserLoginRecord();
        String tenantId = SessionKey.getValue(SessionKey.TENANT_ID);
        if (MapResponse.verifyMapResponse(mapResponse)) {
            Map map = (Map) mapResponse.get("data");
            String roleId = (String) map.get("roleId");
            if (StringUtils.isBlank(roleId)) {
                mapResponse.setResponse(RespStatusEnum.USER_NO_ROLEID);
                return mapResponse;
            }
            SessionKey.setValue(SessionKey.LOGIN_KEY, loginDTO.getUserId());
            SessionKey.setValue(SessionKey.LOGIN_ROLE_ID, map.get("roleId"));
            map.putAll(userRoleInfoService.getRoleDetail(tenantId, roleId));
            mapResponse.put("data", map);
        } else {
            mapResponse.setResponse(RespStatusEnum.PASSWD_CODE_ERROR);
        }
        record.setIpAddr(IpUtil.getIpAddr(RequestUtil.getRequest()));
        record.setUserId(loginDTO.getUserId());
        record.setTenantId(tenantId);
        record.setLoginResult(mapResponse.getMessage());
        record.setLoginResultCode(mapResponse.getCode());
        record.setLoginTime(new Date());
        backUserLoginRecordService.asyncInsert(record);
        return mapResponse;
    }

    /***
     * 用户登出接口
     * @param loginDTO
     * @return
     */
    @PostMapping("/logOut")
    public MapResponse logOut(@RequestBody LoginDTO loginDTO) {
        MapResponse mapResponse = new MapResponse();
        SessionKey.removeKey(SessionKey.LOGIN_KEY);
        SessionKey.removeKey(SessionKey.LOGIN_ROLE_ID);
        return mapResponse;
    }
}

