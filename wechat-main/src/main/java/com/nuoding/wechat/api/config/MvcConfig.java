package com.nuoding.wechat.api.config;

import com.nuoding.wechat.api.interceptor.CommonInterceptor;
import com.nuoding.wechat.common.interceptor.RequestLogInterceptor;
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
    private RequestLogInterceptor requestLogInterceptor;

    @Autowired
    private CommonInterceptor commonInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 注册监控拦截器
        registry.addInterceptor(requestLogInterceptor)
                .addPathPatterns("/**");

        registry.addInterceptor(commonInterceptor)
                .addPathPatterns("/**");
    }
}
