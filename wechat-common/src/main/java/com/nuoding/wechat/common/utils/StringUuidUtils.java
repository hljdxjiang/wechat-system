package com.nuoding.wechat.common.utils;

import org.apache.commons.lang3.time.DateFormatUtils;

import java.util.Date;
import java.util.UUID;

/**
 * @author :tf
 * @create :2022/05/07
 * @desc : UUID生成工具
 **/
public class StringUuidUtils {
    private StringUuidUtils() {

    }

    /**
     * 获取指定前缀的string类型uuid
     */
    public static String generate(String prefix) {
        return prefix + generateStr();
    }

    /**
     * 获取string类型uuid
     */
    public static String generateStr() {
        return generate().replaceAll("-", "");
    }

    /**
     * 获取uuid
     */
    public static String generate() {
        return UUID.randomUUID().toString();
    }

    /**
     * 基于UUID的token
     */
    public static String generateToken() {
        return String.format("%s-%s", generateStr(), DateFormatUtils.format(new Date(), "yyyyMMddHHmmss"));
    }
}
