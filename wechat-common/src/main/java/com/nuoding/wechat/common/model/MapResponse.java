package com.nuoding.wechat.common.model;

import com.nuoding.wechat.common.enums.RespStatusEnum;

import java.util.HashMap;

public class MapResponse extends HashMap<String, Object> {

    private String code = RespStatusEnum.SUCCESS.getStatus();
    private String message = RespStatusEnum.SUCCESS.getMessage();
    private Object data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
        this.put("code", code);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        this.put("message", message);
    }

    public MapResponse() {
        super();
        this.put("code", code);
        this.put("message", message);
    }

    public static boolean verifyMapResponse(MapResponse mp) {
        if (mp == null || !mp.getCode().equals(RespStatusEnum.SUCCESS.getStatus())) {
            return false;
        }
        return true;
    }


    public void setSessionError(String message) {
        this.setResponse(RespStatusEnum.SESSION_ERROR);
    }

    public void setParamError(String message) {
        this.setResponse(RespStatusEnum.ARGS_ERROR);
    }

    public void setError(String err) {
        this.setResponse(RespStatusEnum.FAIL.getStatus(), message);
    }

    public void setResponse(String code, String message) {
        this.setCode(code);
        this.setMessage(message);
    }

    public void setResponse(RespStatusEnum statusEnum) {
        this.setCode(statusEnum.getStatus());
        this.setMessage(statusEnum.getMessage());
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
        this.put("data", data);
    }
}
