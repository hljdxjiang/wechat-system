package com.nuoding.wechat.common.service.impl;

import com.nuoding.wechat.common.service.RedisService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.support.atomic.RedisAtomicLong;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;


@Service
public class RedisServiceImpl implements RedisService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Override
    public StringRedisTemplate getStringRedisTemplate() {
        return stringRedisTemplate;
    }

//    @Autowired
//    RedisTemplate redisTemplate;

    @Async
    public void asyncSetValue(String key, String value, int seconds) {
        setValue(key, value, seconds);
    }

//    private  static final String lock = "task-job-lock";

    @Override
    public boolean getLock(String key, int seconds) {
        /** value is time for ttl **/
        logger.info("getLock start");
        long now = System.currentTimeMillis();
        boolean result = setLockAndExpire(key, seconds, now);
        logger.info("getLock result:" + result);
        if (!result) {
            String setTime = getValue(key);
            logger.info("getLock setTime:" + setTime + ", seconds:" + seconds + ", now:" + now);
            /** 处理老数据 **/
            if (StringUtils.isNotEmpty(setTime) && !stringIsLong(setTime)) {
                logger.info("getLock reset for old values");
                setValue(key, Long.toString(now), seconds);
                return false;
            }

            if (!StringUtils.isEmpty(setTime) && seconds > 0
                    && Long.parseLong(setTime) + seconds * 1000 < now) {
                logger.info("getLock del and retry get lock");
                delValue(key);
                result = setLockAndExpire(key, seconds, now);
            }
        }

        return result;
    }

    private boolean setLockAndExpire(String key, int seconds, long now) {
        boolean result = stringRedisTemplate.opsForValue().setIfAbsent(key, Long.toString(now));
        if (result && seconds > 0) {
            stringRedisTemplate.expire(key, seconds, TimeUnit.SECONDS);
        }
        return result;
    }

    private boolean stringIsLong(String str) {
        try {
            Long.parseLong(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Long incrAndGet(String key, long liveTime) {
        RedisAtomicLong entityIdCounter = new RedisAtomicLong(key, stringRedisTemplate.getConnectionFactory());
        Long increment = entityIdCounter.incrementAndGet();

        if (liveTime > 0) {//操作过后，重置过期时间
            entityIdCounter.expire(liveTime, TimeUnit.SECONDS);
        }

        return increment;
    }

    @Override
    public Long incrAndGet(String key) {
        return incrAndGet(key, 60 * 60 * 24);// 默认24小时的过期时间
    }

    @Override
    public void listPush(String key, String value, long liveTime) {
        stringRedisTemplate.opsForList().rightPush(key, value);
        if (liveTime > 0) {//push 之后还要存活多久
            stringRedisTemplate.expire(key, liveTime, TimeUnit.SECONDS);
        }
    }

    @Override
    public void listPush(String key, String value) {
        listPush(key, value, 60 * 60); // 默认1小时的过期时间
    }

    @Override
    public List listGetAll(String key) {
        return stringRedisTemplate.opsForList().range(key, 0, -1);
    }

    @Override
    public Long listGetSize(String key) {
        return stringRedisTemplate.opsForList().size(key);
    }

    /**
     * 默认5分钟的有效时长
     **/
    public void setValue(String key, String value) {
        if (StringUtils.isEmpty(key) || StringUtils.isEmpty(value)) return;
        stringRedisTemplate.opsForValue().set(key, value, 5 * 60, TimeUnit.SECONDS);
    }

    public void setValue(String key, String value, int seconds) {
        if (StringUtils.isEmpty(key) || StringUtils.isEmpty(value) || seconds <= 0) return;
        stringRedisTemplate.opsForValue().set(key, value, seconds, TimeUnit.SECONDS);
    }

    public String getValue(String key) {
        if (StringUtils.isEmpty(key)) return "";
        return stringRedisTemplate.opsForValue().get(key);
    }

    public Long getExpire(String key) {
        if (StringUtils.isEmpty(key)) return -1l;
        return stringRedisTemplate.getExpire(key);
    }

    public String getHash(String key, String field) {
        if (StringUtils.isEmpty(key)) {
            return "";
        }
        return (String) stringRedisTemplate.opsForHash().get(key, field);
    }

    public void setHash(String key, String field, String value) {
        if (StringUtils.isAnyEmpty(key, field)) {
            return;
        }
        stringRedisTemplate.opsForHash().put(key, field, value);
    }

    public void setHash(String key, String field, String value, int second) {
        if (StringUtils.isAnyEmpty(key, field)) {
            return;
        }
        setHash(key, field, value);
        stringRedisTemplate.expire(key, second, TimeUnit.SECONDS);
    }

    @Override
    public void collPush(String key, Set<String> values, int second) {
        if (StringUtils.isAnyEmpty(key)) {
            return;
        }
        String[] array = values.toArray(new String[values.size()]);

        Long add = stringRedisTemplate.opsForSet().add(key, array);

        stringRedisTemplate.expire(key, second, TimeUnit.SECONDS);
    }

    @Override
    public void collRemoveValue(String key, Set<String> values) {
        if (StringUtils.isAnyEmpty(key) || values == null) {
            return;
        }
        String[] array = values.toArray(new String[values.size()]);

        stringRedisTemplate.opsForSet().remove(key, array);
    }

    @Override
    public Boolean collContains(String key, String value) {
        if (StringUtils.isAnyEmpty(key, value)) {
            return false;
        }
        Boolean member = stringRedisTemplate.opsForSet().isMember(key, value);
        return member;
    }

    @Override
    public Set<String> collGetAll(String key) {
        if (StringUtils.isAnyEmpty(key)) {
            return null;
        }
        Set<String> members = stringRedisTemplate.opsForSet().members(key);
        return members;
    }

    @Override
    public void delValue(String key) {
        if (StringUtils.isEmpty(key)) {
            return;
        }
        stringRedisTemplate.delete(key);
    }

    @Override
    public void delHashValue(String key, String field) {
        if (StringUtils.isAnyEmpty(key, field)) {
            return;
        }
        stringRedisTemplate.opsForHash().delete(key, field);
    }
}
