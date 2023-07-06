package com.nuoding.wechat.api.service.product;

import com.nuoding.wechat.common.model.MapRequest;
import com.nuoding.wechat.common.model.MapResponse;

public interface ProductDetailService {

    MapResponse getProductDetailList(MapRequest mapRequest);

}
