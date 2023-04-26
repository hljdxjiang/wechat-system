package com.nuoding.wechat.common.exception;

import com.nuoding.wechat.common.enums.RespStatusEnum;

/**
 * @author :tf
 * @create :2022/04/29
 * @desc : 不会滚异常
 **/
public class NoRollBackException extends RuntimeException {

    private final RespStatusEnum rspStatus;

    public NoRollBackException(RespStatusEnum rspStatus) {
        super(rspStatus.getMessage());
        this.rspStatus = rspStatus;
    }

    public NoRollBackException(String message, RespStatusEnum rspStatus) {
        super(message);
        this.rspStatus = rspStatus;
    }

    public NoRollBackException(String message, Throwable cause, RespStatusEnum rspStatus) {
        super(message, cause);
        this.rspStatus = rspStatus;
    }

    public NoRollBackException(Throwable cause, RespStatusEnum rspStatus) {
        super(cause);
        this.rspStatus = rspStatus;
    }

    public RespStatusEnum getRspStatus() {
        return rspStatus;
    }
}
