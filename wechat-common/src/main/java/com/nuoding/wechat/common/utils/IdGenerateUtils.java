package com.nuoding.wechat.common.utils;

import com.nuoding.wechat.common.constant.Constants;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author :tf
 * @create :2022/05/08
 * @desc : id生成器
 **/
public class IdGenerateUtils {

    private final static AtomicInteger atomic = new AtomicInteger(0);

    private final static SnowFlake snowFlake = new SnowFlake(2, 3);

    /***
     * @Description:生成18位唯一ID
     * @Param:
     * @return:
     * @Ahther:JHC
     * @Date:2022/4/8 16:26 
     */
    public static String nextID() {
        return String.valueOf(snowFlake.nextId());
    }

    /**
     * @Description:生成指定位数的随机数。。长度不足，默认补零，最低6位
     * @Param:[length]位数
     * @return:java.lang.String
     * @Ahther:JHC
     * @Date:2022/4/8 16:34
     */
    public static String ReadomID(int length) {
        if (length < 6) {
            length = 6;
        }
        int random = (int) (Math.random() * 9 + 1);
        String val = String.valueOf(random);
        int hashCode = UUID.randomUUID().toString().hashCode();
        if (hashCode < 0) {
            hashCode = -hashCode;
        }
        return val + String.format("%0" + (length - 1) + "d", hashCode);
    }

    /**
     * preFix+8位自增
     */
    public static String generatePrefix(String preFix) {
        return preFix + generateTimesTamp();
    }

    /**
     * preFix+offset位自增
     */
    public static String generatePrefix(String preFix, String offset) {
        return preFix + generateTimesTamp(offset);
    }

    /**
     * yyyyMMddHHmmss+8位自增
     */
    public static String generateTimesTamp() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss")) + generate();
    }

    /**
     * yyyyMMddHHmmss+offset位自增
     */
    public static String generateTimesTamp(String offset) {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss")) + generate(offset);
    }

    /**
     * offset位自增
     */
    public static String generate(String offset) {
        return String.format(offset, atomic.incrementAndGet());
    }

    /**
     * 8位自增
     */
    public static String generate() {
        return String.format(Constants.OFFSET, atomic.incrementAndGet());
    }

    /**
     * ESC
     */
    public static String escSeqNo(String preFix) {
        String seq = String.valueOf(snowFlake.nextId());
        seq = seq.substring(8);
        return preFix + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss")) + seq;
    }

    /**
     * ESC
     */
    public static String escSubId(String preFix) {
        return preFix + snowFlake.nextId();
    }

    public static String prefixId(String prefix) {
        prefix = prefix == null ? "" : prefix;
        return escSubId(prefix);
    }


    /**
     * 基于redis 的8位自增
     */
    public static String generateRedis(Long incrKey) {
        return String.format(Constants.OFFSET, incrKey);
    }
}
