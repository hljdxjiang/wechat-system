package com.nuoding.wechat.common.interceptor;

import com.nuoding.wechat.common.constant.SessionKey;
import com.nuoding.wechat.common.constant.SwitchKey;
import com.nuoding.wechat.common.constant.UtilConstant;
import com.nuoding.wechat.common.model.base.MapResponse;
import com.nuoding.wechat.common.utils.JsonUtil;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.AsyncHandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Method;

/**
 * @Author:JHC
 * @Date:2022/6/27 - 18:31
 * @Description:Session拦截器
 */

//TODO 补充session拦截器
@Component
public class SessionValueInterceptor implements AsyncHandlerInterceptor {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Value("${system.session.check}")
    private String checkSession;

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {
        if (!handler.getClass().isAssignableFrom(HandlerMethod.class)) {
            return true;
        }
        if (StringUtils.equals(checkSession, SwitchKey.SWITCH_OFF)) {
            return true;
        }
//        handlerSession(request);

        final HandlerMethod handlerMethod = (HandlerMethod) handler;
        final Method method = handlerMethod.getMethod();

        logger.info("handler user:" + SessionKey.getLoginID() + ",methodName:" + method.getName());

        final Class<?> clazz = method.getDeclaringClass();
        if (method.isAnnotationPresent(SessionValue.class)) {
            SessionValue sessionValue = method.getAnnotation(SessionValue.class);
            return handleSessionValue(request, response, sessionValue, method.getName());
        } else if (clazz.isAnnotationPresent(SessionValue.class)) {
            SessionValue sessionValue = clazz.getAnnotation(SessionValue.class);
            return handleSessionValue(request, response, sessionValue, method.getName());
        }

        return true;
    }

    private boolean handleSessionValue(HttpServletRequest request, HttpServletResponse response,
                                       SessionValue sessionValue, String methodName) throws Exception {
        if (sessionValue == null) {
            return true;
        }

        if (sessionValue.values().length < 1) {
            return true;
        }

        String[] values = sessionValue.values();
        String[] vs = null;
        boolean oneFind = false;
        for (String v : values) {
            if (!StringUtils.isEmpty(v) && v.contains(UtilConstant.OR)) {
                vs = null;
                oneFind = false;
                vs = v.split(UtilConstant.OR);
                if (vs == null || vs.length < 1) {
                    return returnFalse(v, request, response, methodName);
                }

                for (String vsOne : vs) {
                    String sv = SessionKey.getValue(vsOne);
                    if (!StringUtils.isEmpty(sv)) {
                        oneFind = true;
                        break;
                    }
                }

                if (!oneFind) {
                    return returnFalse(v, request, response, methodName);
                }
            } else {
                String svalue = SessionKey.getValue(v);
                if (StringUtils.isEmpty(svalue)) {
                    return returnFalse(v, request, response, methodName);
                }
            }
        }
        logger.info("handler user:" + SessionKey.getLoginID() + ",methodName:" + methodName);
        return true;
    }

    private boolean returnFalse(String v, HttpServletRequest request, HttpServletResponse response, String methodName) throws Exception {
        logger.error("returnFalse methodName:" + methodName + "," + v + " missing,cookies:" + JsonUtil.obj2Json(request.getCookies()));

        returnJson(response);
        return false;
    }

    private void returnJson(HttpServletResponse response) throws Exception {
        PrintWriter writer = null;
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=utf-8");

        MapResponse mp = new MapResponse();
        mp.setSessionError("页面异常,请刷新");
        String json = JsonUtil.obj2Json(mp);
        try {
            writer = response.getWriter();
            writer.print(json);

        } catch (IOException e) {
            logger.error("response error", e);
        } finally {
            if (writer != null)
                writer.close();
        }
    }


//    public void handlerSession(HttpServletRequest request) {
//        String sessionId = request.getHeader(SESSION_KEY);
//        if(org.apache.commons.lang3.StringUtils.isBlank(sessionId)){
//            sessionId=SessionKey.getValue(SESSION_KEY);
//        }
//        if (org.apache.commons.lang3.StringUtils.isNotBlank(sessionId)) {
//            SessionData model = (SessionData) redisUtils.get(SESSION_KEY_PREFIX+sessionId);
//            if (model == null) {
//                return ;
//            }
//            request.setAttribute(SESSION_KEY,sessionId);
//            Integer userCode = model.getUserCode();
//            if (userCode != null) {
//                request.setAttribute(USER_CODE_SESSION_KEY, Long.valueOf(userCode));
//            }
//            String mobile = model.getMobileNumber();
//            if (mobile != null) {
//                request.setAttribute(MOBILE_NUMBER_SESSION_KEY, mobile);
//            }
//        }
//        return ;
//    }
//}
}
