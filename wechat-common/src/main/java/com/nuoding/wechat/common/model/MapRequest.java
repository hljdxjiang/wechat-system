package com.nuoding.wechat.common.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.nuoding.wechat.common.utils.JsonUtil;

import java.io.Serializable;
import java.util.Map;

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

    public T getBody(Class<T> valueType) {
        Map map = (Map) body;
        return (T)JsonUtil.jsonMap2Obj(map, valueType);
    }

    public void setBody(T body) {
        this.body = body;
    }
}
