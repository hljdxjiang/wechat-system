package com.nuoding.wechat.api.service.base.impl;

import com.nuoding.wechat.api.service.base.BaseProcessService;
import com.nuoding.wechat.common.enums.RespStatusEnum;
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
        MapResponse mapResponse =null;
        String transCode = request.getHeader().getTransCode();
        logger.info("processTask begin.transCode:{}",transCode);
        BaseStrategy strategy = map.get(transCode);
        if(strategy==null){
            logger.info("processTask.transCode is not exists");
            mapResponse=new MapResponse();
            mapResponse.setResponse(RespStatusEnum.ARGS_TRANS_CODE_ERROR);
        }else{
            mapResponse=strategy.process(request);
        }
        return mapResponse;
    }
}
