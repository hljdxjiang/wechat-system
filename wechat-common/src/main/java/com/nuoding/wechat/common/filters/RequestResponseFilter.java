package com.nuoding.wechat.common.filters;


import com.nuoding.wechat.common.constant.CommonConstant;
import com.nuoding.wechat.common.constant.UtilConstant;
import com.nuoding.wechat.common.utils.CommonUtil;
import com.nuoding.wechat.common.utils.EncryptionUtil;
import com.nuoding.wechat.common.utils.JsonUtil;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.util.StreamUtils;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


/**
 * @author jhc
 * @date 2022/4/20
 * @desciption 统一过滤器
 */
public class RequestResponseFilter implements Filter {
    private final static Logger logger = LoggerFactory.getLogger(RequestResponseFilter.class);

    private final static String APPLICATION_JSON_UTF8_VALUE = "application/json;charset=UTF-8";

    /**
     * PP - data-from加密，参数需放到parameter中
     * BB - body加密，解密后数据放回body
     *
     * @param servletRequest
     * @param servletResponse
     * @param filterChain
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        // 获取haeder
        String enx = request.getHeader("en_x");
        // 无en_x参数则不处理
        if (StringUtils.isEmpty(enx)) {
            filterChain.doFilter(servletRequest, servletResponse);
            return;
        }
        response.setHeader("en_x", enx);
        // 添加mdc
        String uuid = CommonUtil.generateUUID();
        MDC.put(UtilConstant.REQUEST_ID, uuid);
        // 原参数decodeParameterToBody
        switch (enx) {
            //form表单
            case CommonConstant.PP:
                HttpServletRequest requestWrapper = decodeParameter(request);
                ResponseWrapper responseWrapper = new ResponseWrapper(response);
                filterChain.doFilter(requestWrapper, response);
                encodeRespData(responseWrapper, response);
                break;
            // http json
            case CommonConstant.BB:
                HttpServletRequest requestWrapperBB = decodeBodyToBody(request);
                ResponseWrapper responseWrapperBB = new ResponseWrapper(response);
                filterChain.doFilter(requestWrapperBB, responseWrapperBB);
                encodeRespData(responseWrapperBB, response);
                break;
            default:
                filterChain.doFilter(servletRequest, servletResponse);
                break;
        }
        // 移除MDC
        MDC.remove(UtilConstant.REQUEST_ID);

    }

    /**
     * 加密返回数据
     *
     * @param responseWrapper
     */
    private void encodeRespData(ResponseWrapper responseWrapper, HttpServletResponse response) throws IOException {
        byte[] content = responseWrapper.getContent();
        if (content == null || content.length < 1) {
            logger.info("encodeRespData 返回数据为空,getContent()为null");
            return;
        }
        //加密数据
        String cipherText = "999";
        try {
            String retStr = new String(content);
            logger.info("encodeRespData 原数据={}", retStr);
            cipherText = EncryptionUtil.encrypt(retStr);
        } catch (Exception e) {
            logger.error("encodeRespData加密失败", e);
        }
        response.setHeader("Content-Type", "text/plain;charset=UTF-8");
        byte[] cipher = cipherText.getBytes();
        response.setContentLength(cipher.length);
        ServletOutputStream out = response.getOutputStream();
        out.write(cipher);
        out.flush();
        out.close();
    }

    /**
     * 从 参数 中解密数据，并添加到 parameter中
     * form表单
     *
     * @param request
     */
    private HttpServletRequest decodeParameter(HttpServletRequest request) throws IOException {
        String cipher = request.getParameter(CommonConstant.M);
        if (StringUtils.isEmpty(cipher)) {
            logger.info("decodeParameter 上传参数M为空");
            return request;
        }
        // 解密
        String params = null;//TODO 解密数据
        if (StringUtils.isEmpty(params)) {
            logger.info("decodeParameter 解密后数据为空");
            return request;
        }
        Map<String, String[]> m = new HashMap(request.getParameterMap());
        m.putAll(JsonUtil.json2Map(params));
        return new ParameterRequestWrapper(request, m);
    }

    /**
     * 从 body 中解密数据，并写会到 body
     * json
     *
     * @param request
     */
    private HttpServletRequest decodeBodyToBody(HttpServletRequest request) throws IOException {
        // 从body中读取数据
        ServletInputStream inputStream = request.getInputStream();
        if (inputStream == null) {
            logger.info("decodeBodyToBody 上传参数为空");
            return request;
        }
        byte[] body = StreamUtils.copyToByteArray(inputStream);
        // 解密
        String decodeStr = EncryptionUtil.decrypt(new String(body));
        byte[] decodeParams = decodeStr.getBytes();

        logger.info("decodeBodyToBody 解密后数据={}", decodeStr);
        Map<String, String[]> m = new HashMap(request.getParameterMap());
        ParameterRequestWrapper requestWrapper = new ParameterRequestWrapper(request, m, decodeParams);
        requestWrapper.addHeader("content-type", APPLICATION_JSON_UTF8_VALUE);
        requestWrapper.setContentType(APPLICATION_JSON_UTF8_VALUE);
        return requestWrapper;
    }

    @Override
    public void destroy() {

    }
}
