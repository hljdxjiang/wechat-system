package com.nuoding.wechat.api.service.base.impl;

import com.nuoding.wechat.api.service.base.BaseProcessService;
import com.nuoding.wechat.common.model.MapRequest;
import com.nuoding.wechat.common.model.MapResponse;
import com.nuoding.wechat.common.service.strategy.BaseStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class BaseProcessServiceImpl implements BaseProcessService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private Map<String, BaseStrategy> map;

    @Override
    public MapResponse processTask(MapRequest request) {
        MapResponse mapResponse = new MapResponse();
        String transCode = request.getHeader().getTransCode();
        BaseStrategy strategy = map.get(transCode);
        return strategy.process(request);
    }
}
