package com.nuoding.wechat.common.enums;

/**
 * @Author:JHC
 * @Date:2022/3/25 - 10:36
 * @Description:
 */
public enum UserStatusEnum {

    /**
     * 历史表修改类型
     */
    CREATE_USER("5001", "新建注册信息"),
    UPDATE_USER("5002", "修改注册信息"),
    DELETE_USER("5003", "删除注册信息"),
    REBIND_USER("5004", "微信换绑"),
    MOBILE_USER_DISABLE("5005", "手机渠道注销"),
    MOBILE_USER_DISABLE_AND_DELETE("5006", "手机渠道注销"),
    WECHAT_USER_DISABLE("5007", "微信渠道注销"),
    WECHAT_USER_DISABLE_AND_DELETE("5008", "微信渠道注销");
    private final String code;

    private final String message;

    UserStatusEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getStatus() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
