package com.nuoding.wechat.api.service.page;

import com.nuoding.wechat.common.model.base.MapRequest;
import com.nuoding.wechat.common.model.base.MapResponse;

public interface PageService {
    MapResponse getPageFLowInfo(MapRequest mapRequest);

    MapResponse getFlowItemInfo(MapRequest mapRequest);

    MapResponse getPageInfo(MapRequest mapRequest);

    MapResponse getIntemInfo(MapRequest mapRequest);
}
