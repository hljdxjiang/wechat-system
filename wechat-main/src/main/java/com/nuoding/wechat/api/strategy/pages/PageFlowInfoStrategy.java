package com.nuoding.wechat.api.strategy.pages;

import com.alibaba.excel.util.CollectionUtils;
import com.nuoding.wechat.api.service.page.PageInfoService;
import com.nuoding.wechat.common.entity.sys.SysPageFlowInfoEntity;
import com.nuoding.wechat.common.model.MapRequest;
import com.nuoding.wechat.common.model.MapResponse;
import com.nuoding.wechat.common.service.strategy.BaseStrategy;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @Ahther:JHC
 * @Description:楼层信息查询接口
 * @Date:2023/6/8 下午5:10 
 */
@Component("P002001")
public class PageFlowInfoStrategy implements BaseStrategy {
    private final PageInfoService pageInfoService;

    public PageFlowInfoStrategy(PageInfoService pageInfoService) {
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
        List<SysPageFlowInfoEntity> list=pageInfoService.getPageFLowInfo(pageFlowInfoEntity.getPageId());
        List<SysPageFlowInfoEntity> retlist=new ArrayList<>();
        String channel=request.getHeader().getChannelNo();
        if(!CollectionUtils.isEmpty(list)){
            for(SysPageFlowInfoEntity entity:list){
                //TODO 判断使用渠道
                if(true){
                    retlist.add(entity);
                }
            }
        }
        mapResponse.setData(retlist);
        return mapResponse;
    }
}
