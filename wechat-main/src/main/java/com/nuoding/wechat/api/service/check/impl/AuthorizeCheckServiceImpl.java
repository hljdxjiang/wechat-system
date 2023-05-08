package com.nuoding.wechat.api.service.check.impl;

import com.nuoding.wechat.api.service.check.AuthorizeCheckService;
import com.nuoding.wechat.common.constant.SessionKey;
import com.nuoding.wechat.common.interceptor.Authorize;
import com.nuoding.wechat.common.interceptor.AuthorizeType;
import org.apache.commons.lang3.StringUtils;

public class AuthorizeCheckServiceImpl implements AuthorizeCheckService {

    @Override
    public boolean check(Authorize authorize) {
        if (authorize == null) {
            return true;
        }
        String[] roles = authorize.roles();
        String[] permissions = authorize.permissions();
        String authType = authorize.authType();

        if (authorize.roles().length < 1 && authorize.permissions().length < 1) {
            return true;
        }
        boolean roleAuth = true;
        if (authorize.roles().length > 0) {
            roleAuth = checkRoles(roles);
        }

        boolean permissionAuth = true;
        if (permissions.length > 0) {
            permissionAuth = checkPermissions(permissions);
        }

        if (StringUtils.equalsIgnoreCase(authType, AuthorizeType.AND)) {
            if (roleAuth && permissionAuth) {
                return true;
            }
        } else if (StringUtils.equalsIgnoreCase(authType, AuthorizeType.OR)) {
            if (roleAuth || permissionAuth) {
                return true;
            }
        }


        return false;
    }

    /**
     * @Ahther:JHC
     * @Description:角色判断
     * @Date:2023/5/8 上午11:33
     */
    private boolean checkRoles(String[] roles) {
        if (roles.length < 1) {
            return true;
        }
        String role = SessionKey.getRoleID();
        for (String s : roles) {
            if (StringUtils.equalsIgnoreCase(s, role)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @Ahther:JHC
     * @Description:权限判断
     * @Date:2023/5/8 上午11:33
     */
    private boolean checkPermissions(String[] permissions) {
        //TODO 判断权限 待获取角色详情完成后完善
        return false;
    }
}
