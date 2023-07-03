package com.nuoding.wechat.api.service.page;

import com.nuoding.wechat.common.model.MapRequest;
import com.nuoding.wechat.common.model.MapResponse;

public interface ItemService {

    MapResponse getFlowItem(MapRequest mapRequest);

    MapResponse getImageItem(MapRequest mapRequest);

    MapResponse getContentItem(MapRequest mapRequest);

}
