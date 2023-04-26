package com.nuoding.wechat.common.interceptor;

import com.nuoding.wechat.common.constant.StaticTradeKey;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface StaticTrade {
    String name();

    String type() default StaticTradeKey.RESULT_CODE;
}
