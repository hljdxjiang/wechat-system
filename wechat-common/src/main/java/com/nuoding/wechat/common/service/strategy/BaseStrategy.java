package com.nuoding.wechat.common.service.strategy;

import com.nuoding.wechat.common.model.BaseDTO;
import com.nuoding.wechat.common.model.base.MapResponse;
import com.nuoding.wechat.common.model.ReqHeader;

public interface BaseStrategy<DTO extends BaseDTO> {
    MapResponse process(ReqHeader header, DTO dto);
}
