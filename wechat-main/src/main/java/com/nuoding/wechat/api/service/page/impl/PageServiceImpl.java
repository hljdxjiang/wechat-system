package com.nuoding.wechat.api.service.page.impl;

import com.nuoding.wechat.api.model.PageBackDTO;
import com.nuoding.wechat.api.model.PageDTO;
import com.nuoding.wechat.api.service.page.PageService;
import com.nuoding.wechat.api.util.ItemShowCheckUtil;
import com.nuoding.wechat.common.entity.sys.SysPageFlowInfoEntity;
import com.nuoding.wechat.common.entity.sys.SysPageInfoEntity;
import com.nuoding.wechat.common.enums.StatusEnum;
import com.nuoding.wechat.common.model.MapRequest;
import com.nuoding.wechat.common.model.MapResponse;
import com.nuoding.wechat.common.service.sys.SysFlowItemsService;
import com.nuoding.wechat.common.service.sys.SysPageFlowInfoService;
import com.nuoding.wechat.common.service.sys.SysPageInfoService;
import com.nuoding.wechat.common.utils.CollectionUtil;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.BeanUtils;

import java.util.List;

public class PageServiceImpl implements PageService {

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
        MapResponse mapResponse=new MapResponse();
        String channel=mapRequest.getHeader().getChannelNo();
        PageDTO dto=(PageDTO)mapRequest.getBody();
        List<SysPageInfoEntity> list=null;
        return mapResponse;
    }

    @Override
    public MapResponse getFlowInfo(MapRequest mapRequest) {
        MapResponse mapResponse=new MapResponse();
        String channel=mapRequest.getHeader().getChannelNo();
        PageDTO dto=(PageDTO)mapRequest.getBody();
        List<SysPageInfoEntity> list=null;
        return mapResponse;
    }

    @Override
    public MapResponse getPageInfo(MapRequest mapRequest) {
        MapResponse mapResponse=new MapResponse();
        String channel=mapRequest.getHeader().getChannelNo();
        PageDTO dto=(PageDTO)mapRequest.getBody();
        String pageID=dto.getPageId();
        SysPageInfoEntity entity=new SysPageInfoEntity();
        entity.setStatus(StatusEnum.DEFAULT.getStatus());
        entity.setPageId(pageID);
        List<SysPageInfoEntity> list= ItemShowCheckUtil.getCheckedLIst(channel,pageInfoService.queryAllByLimit(entity));
        if(!CollectionUtils.isEmpty(list)){
            entity=list.get(0);
            PageBackDTO pageBackDTO=new PageBackDTO();
            BeanUtils.copyProperties(entity,pageBackDTO);
            SysPageFlowInfoEntity flowInfoEntity=new SysPageFlowInfoEntity();
            flowInfoEntity.setPageId(pageID);
            flowInfoEntity.setStatus(StatusEnum.DEFAULT.getStatus());
            pageBackDTO.setList(ItemShowCheckUtil.getCheckedLIst(channel,pageFlowInfoService.queryAllByLimit(flowInfoEntity)));
            mapResponse.setData(pageBackDTO);
        }
        return mapResponse;
    }
}
