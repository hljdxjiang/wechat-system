package com.nuoding.wechat.api.service.product.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.PageInfo;
import com.nuoding.wechat.api.model.ProductDetailDTO;
import com.nuoding.wechat.api.service.product.ProductService;
import com.nuoding.wechat.common.entity.crm.CrmProdDetailEntity;
import com.nuoding.wechat.common.entity.crm.CrmProdDetailOutEntity;
import com.nuoding.wechat.common.entity.crm.CrmProdInfoEntity;
import com.nuoding.wechat.common.entity.crm.CrmProdInfoOutEntity;
import com.nuoding.wechat.common.enums.RespStatusEnum;
import com.nuoding.wechat.common.model.MapRequest;
import com.nuoding.wechat.common.model.MapResponse;
import com.nuoding.wechat.common.model.PageQueryBaseDTO;
import com.nuoding.wechat.common.model.crm.ProdFuzzyFuzzyQueryDTO;
import com.nuoding.wechat.common.service.crm.CrmProdDetailService;
import com.nuoding.wechat.common.service.crm.CrmProdInfoService;
import com.nuoding.wechat.common.utils.JsonUtil;
import com.nuoding.wechat.common.utils.PageInfoUtil;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final CrmProdInfoService prodInfoService;

    private final CrmProdDetailService prodDetailService;

    public ProductServiceImpl(CrmProdInfoService prodInfoService, CrmProdDetailService prodDetailService) {
        this.prodInfoService = prodInfoService;
        this.prodDetailService = prodDetailService;
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

    @Override
    public MapResponse getProductDetail(MapRequest mapRequest) {
        MapResponse mapResponse = new MapResponse();
        ProductDetailDTO dto = (ProductDetailDTO) mapRequest.getBody();
        if (StringUtils.isBlank(dto.getProdId())) {
            mapResponse.setResponse(RespStatusEnum.ARGS_ERROR);
            return mapResponse;
        }
        dto.setProdId(dto.getProdId());
        CrmProdInfoEntity entity = prodInfoService.queryByProdId(dto.getProdId());
        Map map = null;
        if (entity != null) {
            map.put("prodTitle", entity.getProdTitle());
            map.put("prodPrice", entity.getProdPrice());
            map.put("prodLogo", entity.getProdLogo());
            map.put("prodName", entity.getProdName());
            map.put("prodSpecs", entity.getProdSpecs());
            List<CrmProdDetailEntity> list = prodDetailService.queryByProdId(dto.getProdId());
            if (list != null) {
                List<CrmProdDetailOutEntity> retList = new ArrayList<>();
                BeanUtils.copyProperties(list, retList);
                map.put("detail", retList);
            }
        }
        mapResponse.setData(map);

        return mapResponse;
    }
}
