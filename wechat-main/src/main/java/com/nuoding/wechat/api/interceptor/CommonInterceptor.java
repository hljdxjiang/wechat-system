package com.nuoding.wechat.api.interceptor;

import com.nuoding.wechat.api.service.check.LockTradeCheckService;
import com.nuoding.wechat.api.service.check.SessionCheckService;
import com.nuoding.wechat.api.service.check.SignatureCheckService;
import com.nuoding.wechat.common.constant.SessionKey;
import com.nuoding.wechat.common.entity.user.UserOperaRecordEntity;
import com.nuoding.wechat.common.enums.RespStatusEnum;
import com.nuoding.wechat.common.filters.MultiReadHttpRequestWrapper;
import com.nuoding.wechat.common.filters.ResponseWrapper;
import com.nuoding.wechat.common.interceptor.LockTrade;
import com.nuoding.wechat.common.interceptor.SessionValue;
import com.nuoding.wechat.common.interceptor.SignatureIgnore;
import com.nuoding.wechat.common.interceptor.StaticTrade;
import com.nuoding.wechat.common.model.base.MapRequest;
import com.nuoding.wechat.common.model.base.MapResponse;
import com.nuoding.wechat.common.model.ReqHeader;
import com.nuoding.wechat.common.service.strategy.BaseStrategy;
import com.nuoding.wechat.common.service.user.UserOperaRecordService;
import com.nuoding.wechat.common.utils.IpUtil;
import com.nuoding.wechat.common.utils.JsonUtil;
import com.nuoding.wechat.common.utils.RequestUtil;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StreamUtils;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.AsyncHandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Map;

@Component
public class CommonInterceptor implements AsyncHandlerInterceptor {

    private static final Logger logger = LoggerFactory.getLogger(CommonInterceptor.class);

    public CommonInterceptor(Map<String, BaseStrategy> map, SignatureCheckService signatureCheckService, SessionCheckService sessionCheckService, LockTradeCheckService lockTradeCheckService, UserOperaRecordService userOperaRecordService) {
        this.map = map;
        this.signatureCheckService = signatureCheckService;
        this.sessionCheckService = sessionCheckService;
        this.lockTradeCheckService = lockTradeCheckService;
        this.userOperaRecordService = userOperaRecordService;
    }

    private final Map<String, BaseStrategy> map;

    private final SignatureCheckService signatureCheckService;

    private final SessionCheckService sessionCheckService;

    private final LockTradeCheckService lockTradeCheckService;

    private final UserOperaRecordService userOperaRecordService;

    public ThreadLocal<UserOperaRecordEntity> currentTrade = null;


    @Override
    public boolean preHandle(HttpServletRequest servletRequest, HttpServletResponse httpServletResponse, Object handler) throws IOException {

        MultiReadHttpRequestWrapper request = new MultiReadHttpRequestWrapper(servletRequest);
        if (request == null) {
            logger.error("CommonInterceptor preHandle begin.request is null");
            return false;
        }
        String method = request.getMethod();
        if (StringUtils.equalsIgnoreCase(method, "GET")) {
            final HandlerMethod handlerMethod = (HandlerMethod) handler;
            final Method method1 = handlerMethod.getMethod();
            return true;
        }
        MapResponse mapResponse = new MapResponse();
        byte[] bytes = StreamUtils.copyToByteArray(request.getInputStream());
        String req = new String(bytes, request.getCharacterEncoding());

        MapRequest mapRequest = JsonUtil.json2Obj(req, MapRequest.class);
        String transCode = mapRequest.getHeader().getTransCode();
        logger.info("CommonInterceptor preHandle begin.transCode:{}", transCode);
        if (StringUtils.isBlank(transCode)) {
            mapResponse.setResponse(RespStatusEnum.ARGS_TRANS_CODE_NULL);
            returnFalse(httpServletResponse, mapResponse, 0);
        }
        BaseStrategy strategy = map.get(transCode);
        if (strategy == null) {
            mapResponse.setResponse(RespStatusEnum.ARGS_TRANS_CODE_ERROR);
            returnFalse(httpServletResponse, mapResponse, 0);
        }
        final Class<?> clazz = strategy.getClass();
        if (clazz.isAnnotationPresent(SessionValue.class)) {
            SessionValue sessionValue = clazz.getAnnotation(SessionValue.class);
            if (!sessionCheckService.check(sessionValue)) {
                mapResponse.setResponse(RespStatusEnum.SESSION_ERROR);
                returnFalse(httpServletResponse, mapResponse, 401);
            }
        }
        if (!clazz.isAnnotationPresent(SignatureIgnore.class)) {
            if (!signatureCheckService.check(mapRequest)) {
                mapResponse.setResponse(RespStatusEnum.REQUEST_ILLEGAL);
                returnFalse(httpServletResponse, mapResponse, 0);
            }
        }

        if (clazz.isAnnotationPresent(LockTrade.class)) {
            LockTrade lockTrade = clazz.getAnnotation(LockTrade.class);
            String name = lockTrade.name();
            int second = lockTrade.seconds();
            if (!lockTradeCheckService.check(SessionKey.getLoginID(), name, second)) {
                mapResponse.setResponse(RespStatusEnum.REQUEST_REPEAT);
                returnFalse(httpServletResponse, mapResponse, 0);
            }
        }
        if (clazz.isAnnotationPresent(StaticTrade.class)) {
            ReqHeader reqHeader = mapRequest.getHeader();
            currentTrade = new ThreadLocal<UserOperaRecordEntity>();
            StaticTrade staticTrade = clazz.getAnnotation(StaticTrade.class);
            UserOperaRecordEntity userOperaRecord = new UserOperaRecordEntity();
            userOperaRecord.setUserid(reqHeader.getUserId());
            userOperaRecord.setSessionid(SessionKey.getSessionID());
            userOperaRecord.setUserIp(reqHeader.getIp().concat("-").concat(IpUtil.getIpAddr(RequestUtil.getRequest())));
            userOperaRecord.setOperationType(staticTrade.name());
            userOperaRecord.setReplayid(reqHeader.getRequestId());
            userOperaRecord.setTransCode(transCode);
            userOperaRecord.setMacAddr(reqHeader.getMac());
            userOperaRecord.setVersion(reqHeader.getVersion());
            userOperaRecord.setRequestBody(JsonUtil.obj2Json(mapRequest));
            userOperaRecord.setCreatetime(new Date());//TODO 补充userOperaRecord
            currentTrade.set(userOperaRecord);
        }


        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        if (currentTrade != null) {
            ResponseWrapper responseWrapper = new ResponseWrapper(response);
            byte[] content = responseWrapper.getContent();
            MapResponse mapResponse = JsonUtil.json2Obj(content.toString(), MapResponse.class);
            UserOperaRecordEntity userOperaRecord = currentTrade.get();
            lockTradeCheckService.releaseKey(userOperaRecord.getUserid(), userOperaRecord.getTransCode());
            userOperaRecord.setResponseCode(mapResponse.getCode());
            userOperaRecordService.asyncInsert(userOperaRecord);
        }
    }

    private boolean returnFalse(HttpServletResponse response, MapResponse mapResponse, int status) {
        if (Integer.compare(0, status) != 0) {
            response.setStatus(status);
        }
        returnJson(response, mapResponse);
        return false;
    }

    private void returnJson(HttpServletResponse response, MapResponse mapResponse) {
        PrintWriter writer = null;
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=utf-8");

        String json = JsonUtil.obj2Json(mapResponse);
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


}
