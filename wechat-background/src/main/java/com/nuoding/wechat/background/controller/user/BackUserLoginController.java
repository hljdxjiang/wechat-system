package com.nuoding.wechat.background.controller.user;

import com.nuoding.wechat.background.model.LoginDTO;
import com.nuoding.wechat.background.service.UserLoginService;
import com.nuoding.wechat.common.constant.LockTradeType;
import com.nuoding.wechat.common.constant.SessionKey;
import com.nuoding.wechat.common.enums.RespStatusEnum;
import com.nuoding.wechat.common.interceptor.LockTrade;
import com.nuoding.wechat.common.interceptor.SessionValue;
import com.nuoding.wechat.common.interceptor.StaticTrade;
import com.nuoding.wechat.common.model.base.MapResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
//        record.setIpAddr(IpUtil.getIpAddr(RequestUtil.getRequest()));
//        record.setUserId(loginDTO.getUserId());
//        record.setTenantId(tenantId);
//        record.setLoginResult(mapResponse.getMessage());
//        record.setLoginResultCode(mapResponse.getCode());
//        record.setLoginTime(new Date());
//        backUserLoginRecordService.asyncInsert(record);
        return mapResponse;
    }

    /***
     * 用户登出接口
     * @param loginDTO
     * @return
     */
    @SessionValue(values = {SessionKey.LOGIN_KEY})
    @PostMapping("/logOut")
    public MapResponse logOut(@RequestBody LoginDTO loginDTO) {
        MapResponse mapResponse = new MapResponse();
        boolean b = userLoginService.logout(loginDTO);
        if (!b) {
            mapResponse.setResponse(RespStatusEnum.FAIL);
        }
        return mapResponse;
    }
}

