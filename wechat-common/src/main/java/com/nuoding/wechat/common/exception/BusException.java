package com.nuoding.wechat.common.exception;

import com.nuoding.wechat.common.enums.RespStatusEnum;

/**
 * @author :tf
 * @create :2022/04/29
 * @desc : 业务通用异常
 **/
public class BusException extends RuntimeException {

    private final RespStatusEnum rspStatus;

    public BusException(RespStatusEnum rspStatus) {
        super(rspStatus.getMessage());
        this.rspStatus = rspStatus;
    }

    public BusException(String message, RespStatusEnum rspStatus) {
        super(message);
        this.rspStatus = rspStatus;
    }

    public BusException(String message, Throwable cause, RespStatusEnum rspStatus) {
        super(message, cause);
        this.rspStatus = rspStatus;
    }

    public BusException(Throwable cause, RespStatusEnum rspStatus) {
        super(cause);
        this.rspStatus = rspStatus;
    }

    public RespStatusEnum getRspStatus() {
        return rspStatus;
    }
}
