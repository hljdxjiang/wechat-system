package com.nuoding.wechat.api.strategy.pages;

import com.alibaba.excel.util.CollectionUtils;
import com.nuoding.wechat.api.vo.page.FlowImgInfoVo;
import com.nuoding.wechat.common.entity.back.BackImgInfoEntity;
import com.nuoding.wechat.common.model.MapRequest;
import com.nuoding.wechat.common.model.MapResponse;
import com.nuoding.wechat.common.service.back.BackImgInfoService;
import com.nuoding.wechat.common.service.strategy.BaseStrategy;
import org.springframework.stereotype.Component;
import com.nuoding.wechat.api.util.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @Ahther:JHC
 * @Description:楼层图片信息查询
 * @Date:2023/6/8 下午5:10 
 */
@Component("P003002")
public class FlowImgInfoStrategy implements BaseStrategy {
    private final BackImgInfoService backImgInfoService;

    public FlowImgInfoStrategy(BackImgInfoService backImgInfoService) {
        this.backImgInfoService = backImgInfoService;
    }

    /***
     * 查询图片列表
     * @param request
     * @return
     */
    @Override
    public MapResponse process(MapRequest request) {
        MapResponse mapResponse=new MapResponse();
        FlowImgInfoVo vo=(FlowImgInfoVo)request.getBody();
        BackImgInfoEntity queryEntity=new BackImgInfoEntity();
        queryEntity.setImgType(vo.getImgType());
        queryEntity.setStatus(0);
        List<BackImgInfoEntity> list=backImgInfoService.queryAllByLimit(queryEntity);
        List<BackImgInfoEntity> retlist=new ArrayList<>();
        String channel=request.getHeader().getChannelNo();
        if(!CollectionUtils.isEmpty(list)){
            for(BackImgInfoEntity entity:list){
                boolean b=ItemShowCheckUtil.checkChannel(channel,entity.getChannelNo());
                if(b){
                    b=ItemShowCheckUtil.checkStatus(entity.getValidTime(),entity.getExpireTime());
                }
                if(b){
                    retlist.add(entity);
                }
            }
        }
        mapResponse.setData(retlist);
        return mapResponse;
    }
}
