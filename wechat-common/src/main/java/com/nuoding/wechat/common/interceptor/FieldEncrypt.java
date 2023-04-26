package com.nuoding.wechat.common.interceptor;


import com.nuoding.wechat.common.constant.Algorithm;

import java.lang.annotation.*;

/**
 * 加密注解
 *
 * @author zzt
 * @version 1.0.0
 * @date 2022/8/2 10:03
 */
@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.ANNOTATION_TYPE})
public @interface FieldEncrypt {
    /**
     * 秘钥(对称加密用,必须是16位字符串)
     *
     * @return
     */
    String key() default "";

    /**
     * 加密解密算法(默认SM4算法)
     *
     * @return
     */
    Algorithm algorithm() default Algorithm.SM4;
}
