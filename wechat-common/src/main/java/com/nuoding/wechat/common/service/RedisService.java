package com.nuoding.wechat.common.service;


import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.List;
import java.util.Set;

/**
 * @Author jhc
 * @Date 2017/09/20
 * @Description
 */
public interface RedisService {
    boolean getLock(String key, int secornds);

    StringRedisTemplate getStringRedisTemplate();

    Long incrAndGet(String key);

    Long incrAndGet(String key, long liveTime);

    void listPush(String key, String value);

    void listPush(String key, String value, long liveTime);

    List listGetAll(String key);

    Long listGetSize(String key);

    void setValue(String key, String value);

    void setValue(String key, String value, int seconds);

    String getValue(String key);

    Long getExpire(String key);

    String getHash(String key, String field);

    void setHash(String key, String field, String value);

    void setHash(String key, String field, String value, int second);

    void delValue(String key);

    void asyncSetValue(String key, String value, int seconds);

    void delHashValue(String key, String field);

    Boolean collContains(String key, String value);

    Set<String> collGetAll(String key);

    void collPush(String key, Set<String> values, int second);

    void collRemoveValue(String key, Set<String> values);
}
