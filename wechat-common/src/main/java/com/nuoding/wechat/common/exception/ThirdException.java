package com.nuoding.wechat.common.exception;

import com.nuoding.wechat.common.enums.RespStatusEnum;

/**
 * @author :tf
 * @create :2022/04/29
 * @desc : 三方调用异常
 **/
public class ThirdException extends RuntimeException {

    private final RespStatusEnum rspStatus;

    public ThirdException(RespStatusEnum rspStatus) {
        super(rspStatus.getMessage());
        this.rspStatus = rspStatus;
    }

    public ThirdException(String message, RespStatusEnum rspStatus) {
        super(message);
        this.rspStatus = rspStatus;
    }

    public ThirdException(String message, Throwable cause, RespStatusEnum rspStatus) {
        super(message, cause);
        this.rspStatus = rspStatus;
    }

    public ThirdException(Throwable cause, RespStatusEnum rspStatus) {
        super(cause);
        this.rspStatus = rspStatus;
    }

    public RespStatusEnum getRspStatus() {
        return rspStatus;
    }
}
