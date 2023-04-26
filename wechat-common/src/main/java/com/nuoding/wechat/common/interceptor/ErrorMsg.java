package com.nuoding.wechat.common.interceptor;

/**
 * @Classname ErrorMsg
 * @Description
 * @Date 2022/8/6 14:30
 * @Created by jhc
 */
public class ErrorMsg {
    /**
     * 校验字段
     */
    private String field;
    /**
     * 校验对象名
     */
    private String objectName;
    /**
     *
     */
    private String message;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
