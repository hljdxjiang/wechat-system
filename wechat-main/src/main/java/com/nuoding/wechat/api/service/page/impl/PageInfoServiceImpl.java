package com.nuoding.wechat.api.service.page.impl;

import com.nuoding.wechat.api.service.page.PageInfoService;
import com.nuoding.wechat.common.entity.sys.SysFlowInfoEntity;
import com.nuoding.wechat.common.entity.sys.SysPageFlowInfoEntity;
import com.nuoding.wechat.common.service.sys.SysFlowInfoService;
import com.nuoding.wechat.common.service.sys.SysPageFlowInfoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PageInfoServiceImpl implements PageInfoService {

    private SysPageFlowInfoService pageFlowInfoService;

    private SysFlowInfoService flowInfoService;

    public PageInfoServiceImpl(SysPageFlowInfoService pageFlowInfoService) {
        this.pageFlowInfoService = pageFlowInfoService;
    }

    @Override
    public List<SysPageFlowInfoEntity> getPageFLowInfo(String pageID) {
        SysPageFlowInfoEntity entity = new SysPageFlowInfoEntity();
        entity.setPageId(pageID);
        return pageFlowInfoService.queryAllByLimit(entity);
    }

    @Override
    public List<SysFlowInfoEntity> getFlowInfo(String flowID) {
        SysFlowInfoEntity entity = new SysFlowInfoEntity();
        entity.setFlowId(flowID);
        return flowInfoService.queryAllByLimit(entity);
    }
}
