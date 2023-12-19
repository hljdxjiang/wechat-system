package com.nuoding.wechat.api.strategy.pages;

import com.alibaba.excel.util.CollectionUtils;
import com.nuoding.wechat.api.model.ImgQueryDTO;
import com.nuoding.wechat.api.util.ItemShowCheckUtil;
import com.nuoding.wechat.common.entity.back.BackImgInfoEntity;
import com.nuoding.wechat.common.model.base.MapResponse;
import com.nuoding.wechat.common.model.ReqHeader;
import com.nuoding.wechat.common.service.back.BackImgInfoService;
import com.nuoding.wechat.common.service.strategy.BaseStrategy;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @Ahther:JHC
 * @Description:楼层图片信息查询
 * @Date:2023/6/8 下午5:10
 */
@Component("P003002")
public class FlowImgInfoStrategy implements BaseStrategy<ImgQueryDTO> {
    private final BackImgInfoService backImgInfoService;

    public FlowImgInfoStrategy(BackImgInfoService backImgInfoService) {
        this.backImgInfoService = backImgInfoService;
    }

    /***
     * 查询图片列表
     * @param header
     * @param vo
     * @return
     */
    @Override
    public MapResponse process(ReqHeader header, ImgQueryDTO vo) {
        MapResponse mapResponse = new MapResponse();
        BackImgInfoEntity queryEntity = new BackImgInfoEntity();
        queryEntity.setImgType(vo.getImgType());
        queryEntity.setStatus(0);
        List<BackImgInfoEntity> list = backImgInfoService.queryAllByLimit(queryEntity);
        List<BackImgInfoEntity> retlist = new ArrayList<>();
        String channel = header.getChannelNo();
        if (!CollectionUtils.isEmpty(list)) {
            for (BackImgInfoEntity entity : list) {
                boolean b = ItemShowCheckUtil.checkChannel(channel, entity.getChannelNo());
                if (b) {
                    b = ItemShowCheckUtil.checkStatus(entity.getValidTime(), entity.getExpireTime());
                }
                if (b) {
                    retlist.add(entity);
                }
            }
        }
        mapResponse.setData(retlist);
        return mapResponse;
    }
}
