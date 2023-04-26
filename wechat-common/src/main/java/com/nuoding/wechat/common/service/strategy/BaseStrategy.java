package com.nuoding.wechat.common.service.strategy;

import com.nuoding.wechat.common.model.MapRequest;
import com.nuoding.wechat.common.model.MapResponse;

public interface BaseStrategy {
    MapResponse process(MapRequest request);
}
