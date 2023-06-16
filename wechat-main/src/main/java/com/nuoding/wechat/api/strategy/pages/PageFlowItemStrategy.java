package com.nuoding.wechat.api.strategy.pages;

import com.nuoding.wechat.api.service.page.PageInfoService;
import com.nuoding.wechat.common.entity.sys.SysFlowItemsEntity;
import com.nuoding.wechat.common.model.MapRequest;
import com.nuoding.wechat.common.model.MapResponse;
import com.nuoding.wechat.common.service.strategy.BaseStrategy;
import org.springframework.stereotype.Component;

/**
 * @Ahther:JHC
 * @Description:楼层要素信息查询接口
 * @Date:2023/6/8 下午5:10 
 */
@Component("P003001")
public class PageFlowItemStrategy implements BaseStrategy {
    private final PageInfoService pageInfoService;

    public PageFlowItemStrategy(PageInfoService pageInfoService) {
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
        SysFlowItemsEntity entity=(SysFlowItemsEntity)request.getBody();
        mapResponse.setData(pageInfoService.getPageFLowInfo(entity.getFlowId()));
        return mapResponse;
    }
}
