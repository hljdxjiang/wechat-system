package com.nuoding.wechat.common.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class MapRequest<header extends ReqHeader, T> implements Serializable {

    public MapRequest() {
    }

    public MapRequest(header header, T body) {
        super();
        this.header = header;
        this.body = body;
    }

    @JsonProperty(value = "header")
    private ReqHeader header;

    @JsonProperty(value = "body")
    private T body;

    public ReqHeader getHeader() {
        return header;
    }

    public void setHeader(ReqHeader header) {
        this.header = header;
    }

    public T getBody() {
        return (T) body;
    }

    public void setBody(T body) {
        this.body = body;
    }
}
