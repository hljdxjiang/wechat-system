package com.nuoding.wechat.api.service.page;

import com.nuoding.wechat.common.entity.sys.SysFlowInfoEntity;
import com.nuoding.wechat.common.entity.sys.SysPageFlowInfoEntity;

import java.util.List;
import java.util.Map;

public interface PageInfoService {
    List<SysPageFlowInfoEntity> getPageFLowInfo(String pageID);

    List<SysFlowInfoEntity> getFlowInfo(String flowID);

    Map getPageInfo(String pageId);
}
