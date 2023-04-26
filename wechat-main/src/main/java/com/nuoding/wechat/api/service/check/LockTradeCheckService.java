package com.nuoding.wechat.api.service.check;

public interface LockTradeCheckService {
    boolean check(String userID, String method, int second);

    void releaseKey(String userID, String method);

}
