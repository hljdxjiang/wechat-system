package com.nuoding.wechat.common.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class BaseDTO implements Serializable {

    @JsonProperty(value = "header")
    private ReqHeader header;

    public ReqHeader getHeader() {
        return header;
    }

    public void setHeader(ReqHeader header) {
        this.header = header;
    }
}
