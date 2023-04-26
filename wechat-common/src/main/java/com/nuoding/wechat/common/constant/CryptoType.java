package com.nuoding.wechat.common.constant;

/**
 * 加密解密枚举
 *
 * @author zzt
 * @version 1.0.0
 * @date 2022/8/2 18:26
 */
public enum CryptoType {
    /**
     * ENCRYPT 加密
     */
    ENCRYPT("encrypt"),

    /**
     * DECRYPT 解密
     */
    DECRYPT("decrypt");

    CryptoType() {
    }

    /**
     * 对应加密器方法名称
     */
    private String method;

    CryptoType(String method) {
        this.method = method;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }
}
