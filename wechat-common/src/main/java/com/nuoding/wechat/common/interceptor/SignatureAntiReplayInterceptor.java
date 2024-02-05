package com.nuoding.wechat.common.interceptor;

import com.google.common.hash.Hashing;
import com.nuoding.wechat.common.constant.RedisKey;
import com.nuoding.wechat.common.constant.SessionKey;
import com.nuoding.wechat.common.enums.RespStatusEnum;
import com.nuoding.wechat.common.filters.MultiReadHttpRequestWrapper;
import com.nuoding.wechat.common.model.ReqHeader;
import com.nuoding.wechat.common.model.base.MapRequest;
import com.nuoding.wechat.common.model.base.MapResponse;
import com.nuoding.wechat.common.service.RedisService;
import com.nuoding.wechat.common.utils.JsonUtil;
import org.apache.commons.io.Charsets;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.AsyncHandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Ahther:JHC
 * @Description:报文唯一性验证拦截器
 * @Date:2023/4/14 下午6:40
 */
public class SignatureAntiReplayInterceptor implements AsyncHandlerInterceptor {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Value("system.timestamp.expire.time")
    private Long EXPIRE_TIME;

    @Autowired
    private RedisService redisService;

    @Override
    public boolean preHandle(HttpServletRequest servletRequest, HttpServletResponse servletResponse, Object handler) throws Exception {
        MultiReadHttpRequestWrapper request = new MultiReadHttpRequestWrapper((HttpServletRequest) servletRequest);
        if (request == null) {
            logger.error("SignatureAntiReplayInterceptor preHandle begin.request is null");
            return false;
        }
        String method = request.getMethod().toLowerCase();
        logger.info("SignatureAntiReplayInterceptor preHandle begin.method:{}", method);
//        if ("options".equals(method)) {
//            return true;
//        }
        final HandlerMethod handlerMethod = (HandlerMethod) handler;
        SignatureIgnore signatureIgnore = handlerMethod.getMethodAnnotation(SignatureIgnore.class);
        if (signatureIgnore != null) {
            // 忽略带SignatureIgnore注解的请求
            logger.info("SignatureAntiReplayInterceptor preHandle end.signatureIgnore");
            return true;
        }
        boolean checkSession = false;
        if (handlerMethod.getMethodAnnotation(SessionValue.class) != null) {
            logger.info("SignatureAntiReplayInterceptor preHandle.need checkSession");
            checkSession = true;
        }
        String body = this.readBody(request);
        MapRequest mapRequest = JsonUtil.json2Obj(body, MapRequest.class);
        checkValue(mapRequest, servletResponse, checkSession);
        return true;
    }

    /***
     * 验证报文签名
     * @param request
     * @param response
     * @param checkSession
     * @throws Exception
     */
    private void checkValue(MapRequest request, HttpServletResponse response, boolean checkSession) throws Exception {
        ReqHeader header = request.getHeader();
        String body = JsonUtil.obj2Json(request.getBody());
        if (!checkParam(header, checkSession)) {
            logger.info("SignatureAntiReplayInterceptor checkValue.checkParam return false");
            returnJson(response, RespStatusEnum.ARGS_NULL);
        }
        //检查时钟服务是否正常
        if (!checkExpire(Long.parseLong(header.getTimeStamp()))) {
            logger.info("SignatureAntiReplayInterceptor checkValue.checkExpire return false");
            returnJson(response, RespStatusEnum.REQUEST_TIME_ERROR);
        }
        //判断RequestID请求重复
        String redisRequestId = redisService.getValue(RedisKey.USER_REQUEST_REPLAY_KEY_PRE.concat(header.getRequestId()));
        if (StringUtils.equals(header.getRequestId(), redisRequestId)) {
            logger.info("SignatureAntiReplayInterceptor checkValue.requestID return false");
            returnJson(response, RespStatusEnum.REQUEST_REPEAT);
        }
        //检查报文完整性
        if (!checkSession(header, checkSession)) {
            logger.info("SignatureAntiReplayInterceptor checkValue.checkSession return false");
            returnJson(response, RespStatusEnum.REQUEST_SESSION_ERROR);
        }

        //比对报文签章
        if (!checkSign(header, body)) {
            logger.info("SignatureAntiReplayInterceptor checkValue.checkSign return false");
            returnJson(response, RespStatusEnum.REQUEST_ILLEGAL);
        }
    }

    private boolean checkSign(ReqHeader header, String body) {
        String signature = header.getSignature();
        List<String> list = new ArrayList<>();
        list.add(header.getUserId());
        list.add(header.getRequestId());
        list.add(header.getVersion());
        list.add(header.getTransCode());
        list.add(header.getNonce());

        String decryptData = getSign(list);
        if (!StringUtils.equals(signature, decryptData)) {
            return false;
        }
        return true;
    }

    private boolean checkExpire(long requestTime) {
        return EXPIRE_TIME > System.currentTimeMillis() - requestTime;
    }

    /***
     * 检查报文完整性
     * @param header
     * @param checkSession
     * @return
     */
    private boolean checkParam(ReqHeader header, boolean checkSession) {
        if (header == null) {
            return false;
        }
        String userID = header.getUserId();
        String signature = header.getSignature();
        String timeStamp = header.getTimeStamp();
        String requestId = header.getRequestId();
        if (StringUtils.isBlank(signature) || StringUtils.isBlank(timeStamp) || StringUtils.isBlank(requestId)) {
            return false;
        }
        if (checkSession && StringUtils.isBlank(userID)) {
            return false;
        }
        return true;
    }

    /***
     * 检查session是否一致
     * @param header
     * @return
     */
    private boolean checkSession(ReqHeader header, boolean checkSession) {
        if (checkSession && StringUtils.equals(header.getUserId(), SessionKey.getLoginID())) {
            return false;
        }
        return true;
    }

    private String getSign(List<String> list) {
        list.removeAll(Collections.singleton(null));
        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            sb.append(s);
        }
        String ret = Hashing.sha1().hashString(sb, Charsets.UTF_8).toString().toUpperCase();
        return ret;
    }

    /***
     * 检查不通过，返回报错信息
     * @param response
     * @param respStatusEnum
     * @throws Exception
     */
    private void returnJson(HttpServletResponse response, RespStatusEnum respStatusEnum) throws Exception {
        PrintWriter writer = null;
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=utf-8");

        MapResponse mp = new MapResponse();
        mp.setResponse(respStatusEnum);
        String json = JsonUtil.obj2Json(mp);
        try {
            writer = response.getWriter();
            writer.print(json);

        } catch (IOException e) {
            logger.error("SignatureAntiReplayInterceptor response error", e);
        } finally {
            if (writer != null) writer.close();
        }
    }

    public String readBody(HttpServletRequest request) {
        StringBuffer sb = new StringBuffer();
        try {
            BufferedReader isr = request.getReader();
            char[] charBuffer = new char[2048];
            int readCount = 0;
            while ((readCount = isr.read(charBuffer)) != -1) {
                sb.append(charBuffer, 0, readCount);
            }
        } catch (IOException e) {
            logger.error("SignatureAntiReplayInterceptor readBody end with Exception:{}", e.getMessage());
        }
        return sb.toString();
    }
}
