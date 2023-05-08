package com.nuoding.wechat.common.interceptor;


import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Authorize {

    String[] roles() default {};

    String[] permissions() default {};

    String authType() default AuthorizeType.OR;
}
