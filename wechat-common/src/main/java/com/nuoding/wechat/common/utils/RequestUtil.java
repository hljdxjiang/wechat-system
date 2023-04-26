package com.nuoding.wechat.common.utils;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


/**
 * @Description:获取HTTPRequest
 * @Param:
 * @return:
 * @Ahther:JHC
 * @Date:2022/3/31 9:18
 */
public class RequestUtil {

    public static HttpServletRequest getRequest() {
        return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
    }

    public static HttpSession getSession() {
        HttpServletRequest request = getRequest();
        return getSession(request);
    }

    public static HttpSession getSession(HttpServletRequest request) {
        return request.getSession();
    }
}
