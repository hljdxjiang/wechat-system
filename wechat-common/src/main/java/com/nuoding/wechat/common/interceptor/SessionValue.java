package com.nuoding.wechat.common.interceptor;

import java.lang.annotation.*;

/**
 * @Author jhc
 * @Date 2023/02/26
 * @Description
 */

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SessionValue {
    String[] values() default {};
}
