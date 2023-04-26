package com.nuoding.wechat.background.config;

import com.nuoding.wechat.common.interceptor.LockTradeInterceptor;
import com.nuoding.wechat.common.interceptor.RequestLogInterceptor;
import com.nuoding.wechat.common.interceptor.SessionValueInterceptor;
import com.nuoding.wechat.common.interceptor.StaticsTradeInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author:JHC
 * @Date:2022/6/27 - 18:31
 * @Description:
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer {
    @Autowired
    private SessionValueInterceptor sessionValueInterceptor;

    @Autowired
    private RequestLogInterceptor requestLogInterceptor;

    @Autowired
    private LockTradeInterceptor lockTradeInterceptor;

    @Autowired
    private StaticsTradeInterceptor staticsTradeInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 注册监控拦截器
        registry.addInterceptor(requestLogInterceptor)
                .addPathPatterns("/**");
        registry.addInterceptor(sessionValueInterceptor)
                .addPathPatterns("/**");
        registry.addInterceptor(lockTradeInterceptor)
                .addPathPatterns("/**");
        registry.addInterceptor(staticsTradeInterceptor)
                .addPathPatterns("/**");
    }
}
