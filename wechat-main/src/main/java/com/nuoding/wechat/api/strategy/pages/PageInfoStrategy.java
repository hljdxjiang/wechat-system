package com.nuoding.wechat.api.strategy.pages;

import com.nuoding.wechat.api.service.page.PageInfoService;
import com.nuoding.wechat.common.entity.sys.SysPageFlowInfoEntity;
import com.nuoding.wechat.common.model.MapRequest;
import com.nuoding.wechat.common.model.MapResponse;
import com.nuoding.wechat.common.service.strategy.BaseStrategy;
import org.springframework.stereotype.Component;

/**
 * @Ahther:JHC
 * @Description:页面楼层查询接口
 * @Date:2023/6/8 下午5:10 
 */
@Component("P001001")
public class PageInfoStrategy  implements BaseStrategy {
    private final PageInfoService pageInfoService;

    public PageInfoStrategy(PageInfoService pageInfoService) {
        this.pageInfoService = pageInfoService;
    }

    /***
     * 查询页面楼层信息
     * @param request
     * @return
     */
    @Override
    public MapResponse process(MapRequest request) {
        MapResponse mapResponse=new MapResponse();
        SysPageFlowInfoEntity pageFlowInfoEntity=(SysPageFlowInfoEntity)request.getBody();
        mapResponse.setData(pageInfoService.getPageFLowInfo(pageFlowInfoEntity.getPageId()));
        return mapResponse;
    }
}
