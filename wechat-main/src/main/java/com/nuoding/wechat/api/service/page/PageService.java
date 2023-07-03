package com.nuoding.wechat.api.service.page;

import com.nuoding.wechat.common.entity.sys.SysFlowInfoEntity;
import com.nuoding.wechat.common.entity.sys.SysPageFlowInfoEntity;
import com.nuoding.wechat.common.model.MapRequest;
import com.nuoding.wechat.common.model.MapResponse;

import java.util.List;
import java.util.Map;

public interface PageService {
    MapResponse getPageFLowInfo(MapRequest mapRequest);

    MapResponse getFlowItemInfo(MapRequest mapRequest);

    MapResponse getPageInfo(MapRequest mapRequest);

    MapResponse getIntemInfo(MapRequest mapRequest);
}
