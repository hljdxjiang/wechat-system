package com.nuoding.wechat.api.model;

import com.nuoding.wechat.common.model.BaseDTO;

public class FlowItemDTO extends BaseDTO {
    private String flowId;

    public String getFlowId() {
        return flowId;
    }

    public void setFlowId(String flowId) {
        this.flowId = flowId;
    }
}
