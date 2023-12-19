package com.nuoding.wechat.api.service.page.impl;

import com.nuoding.wechat.api.model.PageBackDTO;
import com.nuoding.wechat.api.model.PageDTO;
import com.nuoding.wechat.api.service.page.PageService;
import com.nuoding.wechat.api.util.ItemShowCheckUtil;
import com.nuoding.wechat.common.entity.sys.SysPageFlowInfoEntity;
import com.nuoding.wechat.common.entity.sys.SysPageInfoEntity;
import com.nuoding.wechat.common.enums.RespStatusEnum;
import com.nuoding.wechat.common.enums.StatusEnum;
import com.nuoding.wechat.common.model.base.MapRequest;
import com.nuoding.wechat.common.model.base.MapResponse;
import com.nuoding.wechat.common.service.sys.SysFlowItemsService;
import com.nuoding.wechat.common.service.sys.SysPageFlowInfoService;
import com.nuoding.wechat.common.service.sys.SysPageInfoService;
import com.nuoding.wechat.common.utils.JsonUtil;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PageServiceImpl implements PageService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private SysPageInfoService pageInfoService;

    private SysPageFlowInfoService pageFlowInfoService;

    private SysFlowItemsService flowItemsService;

    public PageServiceImpl(SysPageInfoService pageInfoService, SysPageFlowInfoService pageFlowInfoService, SysFlowItemsService flowItemsService) {
        this.pageInfoService = pageInfoService;
        this.pageFlowInfoService = pageFlowInfoService;
        this.flowItemsService = flowItemsService;
    }

    @Override
    public MapResponse getPageFLowInfo(MapRequest mapRequest) {
        MapResponse mapResponse = new MapResponse();
//        String channel = mapRequest.getHeader().getChannelNo();
//        PageDTO dto = (PageDTO) mapRequest.getBody();
//        String pageID = dto.getPageId();
//        logger.info("getPageFLowInfo.begin.channel:{},pageID:{}", channel, pageID);
//        mapRequest.setBody(ItemShowCheckUtil.getCheckedLIst(channel, this.getPageFlowInfoByPageID(pageID)));
        return mapResponse;
    }

    private List<SysPageFlowInfoEntity> getPageFlowInfoByPageID(String pageID) {
        logger.info("getPageFlowInfoByPageID.begin.pageID:{}", pageID);
        SysPageFlowInfoEntity flowInfoEntity = new SysPageFlowInfoEntity();
        flowInfoEntity.setPageId(pageID);
        flowInfoEntity.setStatus(StatusEnum.DEFAULT.getStatus());
        List<SysPageFlowInfoEntity> list = pageFlowInfoService.queryAllByLimit(flowInfoEntity);
        return list;

    }

    @Override
    public MapResponse getFlowItemInfo(MapRequest mapRequest) {
        MapResponse mapResponse = new MapResponse();
//        String channel = mapRequest.getHeader().getChannelNo();
//        FlowItemDTO dto = (FlowItemDTO) mapRequest.getBody(FlowItemDTO.class);
//        String flowId = dto.getFlowId();
//        logger.info("getFlowItemInfo.begin.channelL:{},pageID:{}", channel, flowId);
//        SysFlowItemsEntity entity = new SysFlowItemsEntity();
//        entity.setFlowId(flowId);
//        entity.setStatus(StatusEnum.DEFAULT.getStatus());
//        List<SysFlowItemsEntity> list = ItemShowCheckUtil.getCheckedLIst(channel, flowItemsService.queryAllByLimit(entity));
//        mapRequest.setBody(list);
        return mapResponse;
    }

    @Override
    public MapResponse getPageInfo(MapRequest mapRequest) {
        MapResponse mapResponse = new MapResponse();
        String channel = mapRequest.getHeader().getChannelNo();
        PageDTO dto = JsonUtil.json2Obj(mapRequest.getBody().toString(),PageDTO.class);
        String pageID = dto.getPageId();
        logger.info("getPageInfo.begin.channel:{},pageID:{}", channel, pageID);
        if (StringUtils.isBlank(pageID)) {
            logger.info("getPageInfo.pageID is null");
            mapResponse.setResponse(RespStatusEnum.ARGS_ERROR);
            return mapResponse;
        }
        SysPageInfoEntity entity = new SysPageInfoEntity();
        entity.setStatus(StatusEnum.DEFAULT.getStatus());
        entity.setPageId(pageID);
        List<SysPageInfoEntity> list = ItemShowCheckUtil.getCheckedLIst(channel, pageInfoService.queryAllByLimit(entity));
        if (!CollectionUtils.isEmpty(list)) {
            logger.info("getPageInfo list.size:{}", list.size());
            entity = list.get(0);
            PageBackDTO pageBackDTO = new PageBackDTO();
            BeanUtils.copyProperties(entity, pageBackDTO);
            pageBackDTO.setList(ItemShowCheckUtil.getCheckedLIst(channel, this.getPageFlowInfoByPageID(pageID)));
            mapResponse.setData(pageBackDTO);
        }
        return mapResponse;
    }

    @Override
    public MapResponse getIntemInfo(MapRequest mapRequest) {
        MapResponse mapResponse = new MapResponse();
//        String channel = mapRequest.getHeader().getChannelNo();
//        FlowInfoDTO dto = (FlowInfoDTO) mapRequest.getBody();
//        String itemType = dto.getItemType();
//        String flowId = dto.getFlowId();
//        List retList = new ArrayList();
//        switch (itemType.toUpperCase()) {
//            case "ITEM":
//                retList = null;
//                break;
//            case "FLOW":
//                retList = null;
//                break;
//            case "IMAGE":
//                retList = null;
//                break;
//            case "BANNER":
//                retList = null;
//                break;
//        }
//        mapRequest.setBody(retList);
        return mapResponse;
    }
}
