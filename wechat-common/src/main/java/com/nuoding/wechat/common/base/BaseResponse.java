package com.nuoding.wechat.common.base;

import com.nuoding.wechat.common.enums.RespStatusEnum;

import java.io.Serializable;

public class BaseResponse implements Serializable {
    /**
     * 响应码
     */
    private String code;
    /**
     * 响应信息
     */
    private String message;

    public BaseResponse() {
        this.code = RespStatusEnum.SUCCESS.getStatus();
        this.message = RespStatusEnum.SUCCESS.getMessage();
    }

    public BaseResponse(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
