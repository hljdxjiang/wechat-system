package com.nuoding.wechat.common.config;

import com.nuoding.wechat.common.filters.RequestResponseFilter;
import com.nuoding.wechat.common.filters.XssFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author:JHC
 * @Date:2022/3/30 - 16:31
 * @Description:全局过滤器设置
 */
@Configuration
public class FilterConfig {
    /**
     * 预防xss（跨站脚本攻击）过滤器
     */
    @Bean
    public FilterRegistrationBean<XssFilter> xssFilter() {
        FilterRegistrationBean<XssFilter> bean = new FilterRegistrationBean<>();
        //注册自定义过滤器
        bean.setFilter(new XssFilter());
        bean.setName("xssFilter");
        //过滤所有路径
        bean.addUrlPatterns("/*");
        //优先级 越低越优先
        bean.setOrder(1);
        return bean;
    }

    @Bean
    public FilterRegistrationBean<RequestResponseFilter> requestRespFilter() {
        FilterRegistrationBean<RequestResponseFilter> bean = new FilterRegistrationBean<>();
        bean.setFilter(new RequestResponseFilter());
        bean.setName("requestRespFilter");
        //过滤所有路径
        bean.addUrlPatterns("/*");
        bean.setOrder(FilterRegistrationBean.LOWEST_PRECEDENCE);
        return bean;
    }
}
