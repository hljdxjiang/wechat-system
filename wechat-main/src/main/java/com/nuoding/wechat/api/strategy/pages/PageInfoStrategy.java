package com.nuoding.wechat.api.strategy.pages;

import com.nuoding.wechat.api.model.PageDTO;
import com.nuoding.wechat.api.service.page.PageService;
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
public class PageInfoStrategy  implements BaseStrategy<PageDTO> {

    private final PageService pageService;

    public PageInfoStrategy(PageService pageService) {
        this.pageService = pageService;
    }

    /***
     * 查询页面楼层信息
     * @param request
     * @return
     */
    @Override
    public MapResponse process(MapRequest request) {
        return pageService.getPageInfo(request);
    }
}
