package com.nuoding.wechat.api.model;

import com.nuoding.wechat.common.model.BaseDTO;

public class FlowInfoDTO extends BaseDTO {
    private String flowId;

    private String itemType;

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getFlowId() {
        return flowId;
    }

    public void setFlowId(String flowId) {
        this.flowId = flowId;
    }
}
