package com.nuoding.wechat.common.constant;

/**
 * @Author:JHC
 * @Date:2022/4/1 - 13:47
 * @Description:
 */
public class DataTransConstants {

    //迁移中
    public static final Integer DATA_TRANING = 1;

    //待迁移
    public static final Integer DATA_WAITING_TRANS = 0;

    //已经被迁移
    public static final Integer DATA_BEEN_TRANS = 2;

    //缺失微信信息
    public static final Integer DATA_NO_WECHAT_INFO = 3;

    //缺失微信信息
    public static final Integer DATA_NO_MINIP_INFO = 4;

    //缺失手机注册信息
    public static final Integer DATA_NO_MOBILE_INFO = 5;

    //用户未注册
    public static final Integer USER_NOT_REGISTER = 6;

    //用户不需要迁移
    public static final Integer USER_NOT_NEED_TRANS = 7;

    //迁移失败
    public static final Integer DATA_TRANS_FAIL = 8;

    //迁移成功
    public static final Integer DATA_TRAN_SUCC = 9;
}
