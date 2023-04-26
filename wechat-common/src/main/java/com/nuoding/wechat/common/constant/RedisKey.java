package com.nuoding.wechat.common.constant;

import com.nuoding.wechat.common.utils.CommonUtil;
import org.apache.commons.lang3.StringUtils;

import java.util.Date;

public class RedisKey {

    /**
     * lock keys
     **/
    public static final String REDIS_LOCK_PRE = "redis:lock:";

    /**
     * 缓存角色key
     */
    public static final String REDIS_ROLE_PRE = "redis:role:";
    /**
     * 防止重复请求锁key
     */
    public static final String HTTP_TRADE_KEY = "methodName:userId:";

    /**
     * 用户最大错误次数
     */
    public static final String USER_ERROR_CNT = "user:error:cnt:";

    /**
     * 用户禁止登录标识
     */
    public static final String USER_NOT_ALLOW_FLAG = "user:not:allow:login:";

    /**
     * 系统配置字段缓存前缀
     */
    public static final String SYS_PARAM_CONFIG_KEY_PRE = "sys:param:config:key:";

    /**
     * 用户请求防冲ID
     */
    public static final String USER_REQUEST_REPLAY_KEY_PRE = "user:request:replay:key:";


    public static String getPreKey(String pre, String openId) {
        return pre + openId;
    }

    public static String getPreKey(String pre, String openId, String userIp) {
        return pre + openId + userIp;
    }

    private static String getKeyAddBase(String preKey, Integer interval) {
        long keyLong = getKeyLong(interval) + interval;
        return getPreKey(preKey, CommonUtil.conString(keyLong));
    }

    private static final String DATE_FORMATE = "yyyyMMddHHmm";

    private static long getKeyLong(Integer interval) {
        String now = CommonUtil.getDateWithFormat(DATE_FORMATE);
        Long nowLong = CommonUtil.conLong(now);
        long left = nowLong % interval;
        return nowLong - left;
    }

    public static Date getStaticDate(String key) {
        if (StringUtils.isEmpty(key) || !key.contains(":")) {
            return null;
        }

        String[] keyStrs = key.split(":");
        if (keyStrs.length < 1) {
            return null;
        }

        String dateString = keyStrs[keyStrs.length - 1];
        if (StringUtils.isEmpty(dateString)) {
            return null;
        }

        return CommonUtil.getDateFromString(dateString, DATE_FORMATE);
    }


    public static String getLockKeyHttpTrade() {
        return getPreKey(REDIS_LOCK_PRE, HTTP_TRADE_KEY);
    }

}
