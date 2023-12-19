package com.nuoding.wechat.api.service.product;

import com.nuoding.wechat.common.model.base.MapRequest;
import com.nuoding.wechat.common.model.base.MapResponse;

public interface ProductDetailService {

    MapResponse getProductDetailList(MapRequest mapRequest);

}
