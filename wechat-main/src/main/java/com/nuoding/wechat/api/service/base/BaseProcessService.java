package com.nuoding.wechat.api.service.base;

import com.nuoding.wechat.common.model.base.MapRequest;
import com.nuoding.wechat.common.model.base.MapResponse;

public interface BaseProcessService {
    MapResponse processTask(MapRequest request);
}
