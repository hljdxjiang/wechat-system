package com.nuoding.wechat.background.service;

import com.nuoding.wechat.background.model.LoginDTO;
import com.nuoding.wechat.common.model.base.MapResponse;

/**
 * @Ahther:JHC
 * @Description:获取用户权限详情
 * @Date:2023/4/11 下午5:19
 */
public interface UserLoginService {
    MapResponse login(LoginDTO loginDTO);

    boolean logout(LoginDTO loginDTO);

}
