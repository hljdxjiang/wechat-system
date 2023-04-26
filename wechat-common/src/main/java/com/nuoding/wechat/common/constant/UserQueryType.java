package com.nuoding.wechat.common.constant;

/**
 * @Author:JHC
 * @Date:2022/3/25 - 11:41
 * @Description:
 */
public class UserQueryType {
    private UserQueryType() {
        throw new IllegalStateException("Utility class");
    }

    public static final Integer QUERY_BY_OPENID = 1;
    public static final Integer QUERY_BY_UNIONID = 2;
    public static final Integer QUERY_BY_MOBILENO = 3;
    public static final Integer QUERY_BY_MOBILE_USERID = 4;
    public static final Integer QUERY_BY_USERID = 5;
    public static final Integer QUERY_BY_CERTNO = 6;
}
