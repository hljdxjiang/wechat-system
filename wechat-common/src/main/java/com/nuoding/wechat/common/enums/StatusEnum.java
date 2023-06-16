package com.nuoding.wechat.common.enums;

/**
 * @Author:JHC
 * @Date:2022/3/25 - 10:36
 * @Description:
 */
public enum StatusEnum {

    /**
     * 历史表修改类型
     */
    DEFAULT(0, "正常"),
    DISABLED(1, "时效"),;
    private final Integer code;

    private final String message;

    StatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getStatus() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
