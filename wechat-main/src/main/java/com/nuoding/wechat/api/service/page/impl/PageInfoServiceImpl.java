package com.nuoding.wechat.api.service.page.impl;

import com.alibaba.excel.util.CollectionUtils;
import com.nuoding.wechat.api.service.page.PageInfoService;
import com.nuoding.wechat.api.util.ItemShowCheckUtil;
import com.nuoding.wechat.common.entity.sys.SysFlowInfoEntity;
import com.nuoding.wechat.common.entity.sys.SysPageFlowInfoEntity;
import com.nuoding.wechat.common.entity.sys.SysPageInfoEntity;
import com.nuoding.wechat.common.enums.StatusEnum;
import com.nuoding.wechat.common.service.sys.SysFlowInfoService;
import com.nuoding.wechat.common.service.sys.SysPageFlowInfoService;
import com.nuoding.wechat.common.service.sys.SysPageInfoService;
import com.nuoding.wechat.common.utils.CollectionUtil;
import com.nuoding.wechat.common.utils.JsonUtil;
import org.apache.commons.collections4.MapUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PageInfoServiceImpl implements PageInfoService {

    private SysPageFlowInfoService pageFlowInfoService;

    private SysFlowInfoService flowInfoService;

    private SysPageInfoService pageInfoService;

    public PageInfoServiceImpl(SysPageFlowInfoService pageFlowInfoService, SysFlowInfoService flowInfoService, SysPageInfoService pageInfoService) {
        this.pageFlowInfoService = pageFlowInfoService;
        this.flowInfoService = flowInfoService;
        this.pageInfoService = pageInfoService;
    }

    @Override
    public List<SysPageFlowInfoEntity> getPageFLowInfo(String pageID) {
        List<SysPageFlowInfoEntity> retList=new ArrayList<>();
        SysPageFlowInfoEntity entity = new SysPageFlowInfoEntity();
        entity.setPageId(pageID);
        List<SysPageFlowInfoEntity> list= pageFlowInfoService.queryAllByLimit(entity);
        if(!CollectionUtils.isEmpty(list)){
            for(SysPageFlowInfoEntity entity1:list){
                if(ItemShowCheckUtil.checkChannel("",""));
            }
        }

        return retList;
    }

    @Override
    public List<SysFlowInfoEntity> getFlowInfo(String flowID) {
        SysFlowInfoEntity entity = new SysFlowInfoEntity();
        entity.setFlowId(flowID);
        return flowInfoService.queryAllByLimit(entity);
    }

    @Override
    public Map getPageInfo(String pageId) {
        Map ret=null;
        SysPageInfoEntity entity=new SysPageInfoEntity();
        entity.setPageId(pageId);
        entity.setStatus(StatusEnum.DEFAULT.getStatus());
        List<SysPageInfoEntity> list=pageInfoService.queryAllByLimit(entity);
        if(!CollectionUtils.isEmpty(list)){
            entity=list.get(0);
            ret=new HashMap();
            ret.put("pageId",entity.getPageId());
            ret.put("title",entity.getPageTitle());
            ret.put("needLogin",entity.getNeedLogin());
            ret.put("type",entity.getPageType());
            ret.put("flow",getPageFLowInfo(pageId));
        }
        return ret;
    }
}
