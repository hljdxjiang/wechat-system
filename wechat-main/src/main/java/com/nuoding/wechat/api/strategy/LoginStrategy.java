package com.nuoding.wechat.api.strategy;


import com.nuoding.wechat.api.model.ProductInfoDTO;
import com.nuoding.wechat.common.interceptor.SignatureIgnore;
import com.nuoding.wechat.common.model.ReqHeader;
import com.nuoding.wechat.common.model.base.MapResponse;
import com.nuoding.wechat.common.service.strategy.BaseStrategy;
import org.springframework.stereotype.Component;

@Component("W001001")
@SignatureIgnore
public class LoginStrategy implements BaseStrategy<ProductInfoDTO> {
    @Override
    public MapResponse process(ReqHeader header, ProductInfoDTO dto) {
        MapResponse mapResponse = new MapResponse();
        mapResponse.setData(dto);
        return mapResponse;
    }
}
