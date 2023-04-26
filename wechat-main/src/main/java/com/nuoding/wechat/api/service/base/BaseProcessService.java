package com.nuoding.wechat.api.service.base;

import com.nuoding.wechat.common.model.MapRequest;
import com.nuoding.wechat.common.model.MapResponse;

public interface BaseProcessService {
    MapResponse processTask(MapRequest request);
}
