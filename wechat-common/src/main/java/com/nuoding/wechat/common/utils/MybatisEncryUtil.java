package com.nuoding.wechat.common.utils;

import com.nuoding.wechat.common.constant.Algorithm;

/**
 * @Author:JHC
 * @Date:2022/10/25 - 15:43
 * @Description: 加解密方法
 */
public class MybatisEncryUtil {

    /**
     * 加密方法
     *
     * @param algorithm 加密方法类型
     * @param data      明文数据
     * @return 加密后数据
     */
    public static String encrypt(Algorithm algorithm, String data) {
        String resultData = data;
        switch (algorithm) {
            case SM2:
                //resultData = StringUtils.isNotBlank(data) ? UnionAPIUtil.servE160(data) : data;
                break;
            case SM3:
            case SM4:
            default:
        }
        return resultData;
    }

    /**
     * 解密方法
     *
     * @param algorithm 解密方法类型
     * @param data      明文数据
     * @return 解密后数据
     */
    public static String decrypt(Algorithm algorithm, String data) {
        switch (algorithm) {
            case SM2:
                //data = StringUtils.isNotBlank(data) ? UnionAPIUtil.servE161(data) : data;
                break;
            case SM3:
            case SM4:
            default:
        }
        return data;
    }
}
