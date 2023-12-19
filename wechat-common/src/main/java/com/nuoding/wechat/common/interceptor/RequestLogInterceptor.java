package com.nuoding.wechat.common.interceptor;

import com.nuoding.wechat.common.constant.Constants;
import com.nuoding.wechat.common.utils.StringUuidUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.AsyncHandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @desc : aop 日志打印请求入参及出参
 **/
@Component
public class RequestLogInterceptor implements AsyncHandlerInterceptor {
    private static final Logger logger = LoggerFactory.getLogger(RequestLogInterceptor.class);

    private static final String start = "start";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse httpServletResponse, Object handler) {
        String uuid = MDC.get(Constants.REQUEST_ID);
        if (StringUtils.isBlank(uuid)) {
            uuid = StringUuidUtils.generateStr();
            MDC.put(Constants.REQUEST_ID, uuid);
        }
        request.setAttribute(start, System.currentTimeMillis());
        logger.info("logger preHandle,put requestId ({}) to logger", uuid);
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        String uuid = MDC.get(Constants.REQUEST_ID);
        logger.info("logger afterCompletion,requestId ({}) from logger needs：{}ms", uuid, System.currentTimeMillis() - (long) request.getAttribute(start));
        String enx = request.getHeader("en_x");
        // 无en_x参数则不处理
        if (StringUtils.isEmpty(enx)) {
            MDC.remove(Constants.REQUEST_ID);
        }

    }

}
