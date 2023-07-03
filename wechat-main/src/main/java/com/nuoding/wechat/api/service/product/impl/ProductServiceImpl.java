package com.nuoding.wechat.api.service.product.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.PageInfo;
import com.nuoding.wechat.api.service.product.ProductService;
import com.nuoding.wechat.common.entity.crm.CrmProdInfoEntity;
import com.nuoding.wechat.common.entity.crm.CrmProdInfoOutEntity;
import com.nuoding.wechat.common.model.MapRequest;
import com.nuoding.wechat.common.model.MapResponse;
import com.nuoding.wechat.common.model.PageQueryBaseDTO;
import com.nuoding.wechat.common.model.crm.ProdFuzzyFuzzyQueryDTO;
import com.nuoding.wechat.common.service.crm.CrmProdInfoService;
import com.nuoding.wechat.common.utils.JsonUtil;
import com.nuoding.wechat.common.utils.PageInfoUtil;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {

    private final CrmProdInfoService prodInfoService;

    public ProductServiceImpl(CrmProdInfoService prodInfoService) {
        this.prodInfoService = prodInfoService;
    }

    @Override
    public MapResponse getProductList(MapRequest mapRequest) {
        MapResponse mapResponse = new MapResponse();
        String channel = mapRequest.getHeader().getChannelNo();
        ProdFuzzyFuzzyQueryDTO dto = null;
        PageQueryBaseDTO pageQueryBaseDTO = null;
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            dto = objectMapper.readValue(JsonUtil.obj2Json(mapRequest.getBody()), ProdFuzzyFuzzyQueryDTO.class);
            pageQueryBaseDTO = objectMapper.readValue(JsonUtil.obj2Json(mapRequest.getBody()), PageQueryBaseDTO.class);
        } catch (Exception e) {
        }


        List<CrmProdInfoOutEntity> list = prodInfoService.queryFuzzyList(dto);
        if (pageQueryBaseDTO != null) {
            PageInfo pageInfo = new PageInfo(list);
            Map map = PageInfoUtil.parseReturnMap(pageInfo);
            mapResponse.setData(map);
        } else {
            mapResponse.setData(list);
        }
        return mapResponse;
    }
}
