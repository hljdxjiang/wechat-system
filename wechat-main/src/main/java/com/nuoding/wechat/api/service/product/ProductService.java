package com.nuoding.wechat.api.service.product;

import com.nuoding.wechat.common.model.base.MapRequest;
import com.nuoding.wechat.common.model.base.MapResponse;

public interface ProductService {

    MapResponse getProductList(MapRequest mapRequest);

    MapResponse getProductDetail(MapRequest mapRequest);

}
