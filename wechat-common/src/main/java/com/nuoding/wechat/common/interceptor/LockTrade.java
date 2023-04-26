package com.nuoding.wechat.common.interceptor;

import java.lang.annotation.*;


/**
 * @author jhc
 * @date 2022-11-02-13:52
 * @Description 防止重复请求注解
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LockTrade {
    String name();

    int seconds() default 3;
}
