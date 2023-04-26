package com.nuoding.wechat.api.service.check;

import com.nuoding.wechat.common.interceptor.SessionValue;

public interface SessionCheckService {
    boolean check(SessionValue sessionValue);
}
