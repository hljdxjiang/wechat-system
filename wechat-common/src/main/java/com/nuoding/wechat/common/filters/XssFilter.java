package com.nuoding.wechat.common.filters;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @Author:JHC
 * @Date:2022/3/30 - 16:34
 * @Description:
 */
public class XssFilter implements Filter {
    @Override
    public void init(FilterConfig config) {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        MultiReadHttpRequestWrapper xssRequest = new MultiReadHttpRequestWrapper(
                (HttpServletRequest) request);
        chain.doFilter(xssRequest, response);
    }

    @Override
    public void destroy() {
    }
}
