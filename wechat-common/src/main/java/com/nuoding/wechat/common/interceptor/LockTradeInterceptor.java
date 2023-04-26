package com.nuoding.wechat.common.interceptor;

import com.nuoding.wechat.common.constant.RedisKey;
import com.nuoding.wechat.common.constant.SessionKey;
import com.nuoding.wechat.common.enums.RespStatusEnum;
import com.nuoding.wechat.common.model.MapResponse;
import com.nuoding.wechat.common.service.RedisService;
import com.nuoding.wechat.common.utils.JsonUtil;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.AsyncHandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Method;

/**
 * @author jhc
 * @date 2022-11-02-13:52
 * @Description 防止重复请求拦截器
 */
@Component
public class LockTradeInterceptor implements AsyncHandlerInterceptor {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private RedisService redisService;

    public final static ThreadLocal<String> LOCK_KEY_STRING = new ThreadLocal<>();

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        if (!handler.getClass().isAssignableFrom(HandlerMethod.class)) {
            return true;
        }
        final HandlerMethod handlerMethod = (HandlerMethod) handler;
        final Method method = handlerMethod.getMethod();
        if (method.isAnnotationPresent(LockTrade.class)) {
            LOCK_KEY_STRING.remove();
            //若无openId不进行拦截
            String userID = SessionKey.getLoginID();
            if (StringUtils.isBlank(userID)) {
                return true;
            }
            LockTrade lockTrade = method.getAnnotation(LockTrade.class);
            //方法名称
            String methName = lockTrade.name();
            //方法锁定时间
            int lockTime = lockTrade.seconds();
            String key = RedisKey.getLockKeyHttpTrade() + methName + userID;
            boolean lock = redisService.getLock(key, lockTime);
            logger.info("trade lockRun 是否获取到锁:" + key + "," + lock);
            if (lock) {
                LOCK_KEY_STRING.set(key);
                // handle
                return true;
            } else {
                logger.info("trade lockRun 没有获取到锁，不执行请求任务!");
                returnJson(response);
                return false;
            }
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {
        if (!handler.getClass().isAssignableFrom(HandlerMethod.class)) {
            return;
        }
        final HandlerMethod handlerMethod = (HandlerMethod) handler;
        final Method method = handlerMethod.getMethod();
        if (method.isAnnotationPresent(LockTrade.class)) {
            String lockKey = LOCK_KEY_STRING.get();
            if (StringUtils.isNotBlank(lockKey)) {
                redisService.delValue(lockKey);
                logger.info("trade lockRun 任务结束，释放锁!");
                LOCK_KEY_STRING.remove();
            }
        }
    }

    private void returnJson(HttpServletResponse response) {
        PrintWriter writer = null;
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=utf-8");

        MapResponse mp = new MapResponse();
        mp.setResponse(RespStatusEnum.REQUEST_REPEAT);
        String json = JsonUtil.obj2Json(mp);
        try {
            writer = response.getWriter();
            writer.print(json);

        } catch (IOException e) {
            logger.error("response error", e);
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }

}
