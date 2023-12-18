package com.nuoding.wechat.api.strategy.pages;

import com.nuoding.wechat.api.model.ProductInfoDTO;
import com.nuoding.wechat.api.service.product.ProductService;
import com.nuoding.wechat.common.model.MapRequest;
import com.nuoding.wechat.common.model.MapResponse;
import com.nuoding.wechat.common.service.strategy.BaseStrategy;
import org.springframework.stereotype.Component;

/**
 * @Ahther:JHC
 * @Description:页面楼层查询接口
 * @Date:2023/6/8 下午5:10
 */
@Component("P004001")
public class ProductInfoStrategy implements BaseStrategy<ProductInfoDTO> {

    private final ProductService productService;

    public ProductInfoStrategy(ProductService productService) {
        this.productService = productService;
    }

    /***
     * 查询页面楼层信息
     * @param request
     * @return
     */
    @Override
    public MapResponse process(MapRequest request) {
        return productService.getProductList(request);
    }
}
