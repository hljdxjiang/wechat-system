package com.nuoding.wechat.api.service.check.impl;

import com.nuoding.wechat.api.service.check.LockTradeCheckService;
import com.nuoding.wechat.common.constant.RedisKey;
import com.nuoding.wechat.common.service.RedisService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LockTradeCheckServiceImpl implements LockTradeCheckService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private RedisService redisService;

    public final static ThreadLocal<String> LOCK_KEY_STRING = new ThreadLocal<>();

    @Override
    public boolean check(String userID, String transCode, int second) {
        LOCK_KEY_STRING.remove();
        String key = RedisKey.getLockKeyHttpTrade() + transCode + userID;
        boolean lock = redisService.getLock(key, second);
        logger.info("trade lockRun 是否获取到锁:" + key + "," + lock);
        if (lock) {
            LOCK_KEY_STRING.set(key);
            // handle
            return true;
        } else {
            logger.info("trade lockRun 没有获取到锁，不执行请求任务!");
            return false;
        }
    }

    @Override
    public void releaseKey(String userID, String method) {
        String lockKey = LOCK_KEY_STRING.get();
        if (StringUtils.isNotBlank(lockKey)) {
            redisService.delValue(lockKey);
            logger.info("trade lockRun 任务结束，释放锁!");
            LOCK_KEY_STRING.remove();
        }

    }
}
