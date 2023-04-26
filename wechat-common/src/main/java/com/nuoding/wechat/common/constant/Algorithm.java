package com.nuoding.wechat.common.constant;

/**
 * 加密算法枚举类型
 *
 * @author zzt
 * @version 1.0.0
 * @date 2022/8/2 10:04
 */
public enum Algorithm {

    /**
     * 国密 SM2 非对称加密算法，基于 ECC
     */
    SM2,

    /**
     * 国密 SM3 消息摘要算法，可以用 MD5 作为对比理解
     */
    SM3,

    /**
     * 国密 SM4 对称加密算法，无线局域网标准的分组数据算法
     */
    SM4,

    Algorithm() {
    }
}
