package com.nuoding.wechat.api.service.check;

import com.nuoding.wechat.common.interceptor.Authorize;

public interface AuthorizeCheckService {

    boolean check(Authorize authorize);

}
