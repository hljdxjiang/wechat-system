package com.nuoding.wechat.common.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.AsyncHandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 * @Author jhc
 * @Description 保存操作记录
 * @Date 下午1:42 2023/4/11
 **/
@Component
public class StaticsTradeInterceptor implements AsyncHandlerInterceptor {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /***
     * 重写方法
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) {
        try {
            if (!handler.getClass().isAssignableFrom(HandlerMethod.class)) {
                return;
            }
            final HandlerMethod handlerMethod = (HandlerMethod) handler;
            final Method method = handlerMethod.getMethod();
            final Class<?> clazz = method.getDeclaringClass();
            StaticTrade staticTrade = null;
            if (method.isAnnotationPresent(StaticTrade.class)) {
                staticTrade = method.getAnnotation(StaticTrade.class);
            } else if (clazz.isAnnotationPresent(StaticTrade.class)) {
                staticTrade = clazz.getAnnotation(StaticTrade.class);
            }
            if (staticTrade != null) {
                handlestaticTrade(request, response, staticTrade);
            }
        } catch (Exception e) {
            logger.error("StaticTradeInterceptor postHandle exception:{}", e.getMessage());
        }
    }


    /***
     * 处理事务
     * @param request
     * @param response
     * @param staticTrade
     * @return
     */
    private boolean handlestaticTrade(HttpServletRequest request,
                                      HttpServletResponse response, StaticTrade staticTrade) {
        return true;

    }
}
