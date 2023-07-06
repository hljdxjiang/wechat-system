package com.nuoding.wechat.api.strategy;


import com.nuoding.wechat.common.interceptor.SignatureIgnore;
import com.nuoding.wechat.common.model.MapRequest;
import com.nuoding.wechat.common.model.MapResponse;
import com.nuoding.wechat.common.service.strategy.BaseStrategy;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component("W001001")
@SignatureIgnore
public class LoginStrategy implements BaseStrategy {
    @Override
    public MapResponse process(MapRequest request) {
        Map map = (Map) request.getBody();
        MapResponse mapResponse = new MapResponse();
        mapResponse.setData(map);
        return mapResponse;
    }
}
