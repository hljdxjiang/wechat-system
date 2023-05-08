package com.nuoding.wechat.common.constant;

import com.nuoding.wechat.common.model.Wid;
import com.nuoding.wechat.common.utils.JsonUtil;
import com.nuoding.wechat.common.utils.RequestUtil;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpServletRequest;

public class SessionKey {

    public static final String OPENID_OR_WID = SessionKey.WECHAT_OPENID + UtilConstant.OR + SessionKey.WECHAT_WID;

    public static final String WECHAT_OPENID = "wechat:openid";
    public static final String PARTER_CHANNEL = "parter_channel";
    public static final String WECHAT_MINIP_UNIONID = "wechat:minip:unionid";
    public static final String WECHAT_WID = "wechat:wid";

    public static String getValue(String key) {
        return (String) RequestUtil.getSession().getAttribute(key);
    }

    public static String getValue(HttpServletRequest request, String key) {
        return (String) RequestUtil.getSession(request).getAttribute(key);
    }

    public static void setValue(String key, Object value) {
        RequestUtil.getSession().setAttribute(key, value);
    }

    public static void removeKey(HttpServletRequest request, String key) {
        RequestUtil.getSession(request).removeAttribute(key);
    }

    public static void removeKey(String key) {
        RequestUtil.getSession().removeAttribute(key);
    }

    public static final String LOGIN_KEY = "login:userid";
    public static final String LOGIN_ROLE_ID = "login:roleid";
    public static final String LOGIN_TOKEN = "login:token";
    public static final String TENANT_ID = "login:user:tenantid";

    public static String getLoginID() {
        return getValue(LOGIN_KEY);
    }

    public static String getRoleID() {
        return getValue(LOGIN_ROLE_ID);
    }

    public static String getToken() {
        return getValue(LOGIN_TOKEN);
    }

    public static String getSessionID() {
        return RequestUtil.getSession().getId();
    }

    public static Wid getWid() {
        return getWid(null);
    }

    public static Wid getWid(HttpServletRequest request) {
        Wid wid;
        String widJson = request != null ? getValue(request, SessionKey.WECHAT_WID)
                : getValue(SessionKey.WECHAT_WID);
        String openId = request != null ? getValue(request, SessionKey.WECHAT_OPENID)
                : getValue(SessionKey.WECHAT_OPENID);
        if (!StringUtils.isEmpty(widJson)) {
            wid = JsonUtil.json2Obj(widJson, Wid.class);
            if (wid != null && StringUtils.isEmpty(wid.getOpenId())) {
                wid.setOpenId(openId);
            }
            return wid;
        } else if (!StringUtils.isEmpty(openId)) {
            wid = new Wid();
            wid.setOpenId(openId);
            return wid;
        }

        return null;
    }
}
