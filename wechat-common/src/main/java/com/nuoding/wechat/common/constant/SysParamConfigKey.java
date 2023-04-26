package com.nuoding.wechat.common.constant;

public enum SysParamConfigKey {
    USER_LOGIN_ERROR_MAX_CNT("USER_LOGIN_ERROR_MAX_CNT", "5", "最大登录错误次数");

    private final String key;

    private final String code;

    private final String desc;

    SysParamConfigKey(String key, String code, String desc) {
        this.key = key;
        this.code = code;
        this.desc = desc;
    }

    public String getKey() {
        return key;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
