package com.nuoding.wechat.api.service.check;

import com.nuoding.wechat.common.model.MapRequest;

public interface SignatureCheckService {
    boolean check(MapRequest mapRequest);
}
