package com.nuoding.wechat.common.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.nuoding.wechat.common.utils.JsonUtil;

import java.io.Serializable;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MapRequest implements Serializable {

    public MapRequest() {
    }

    public MapRequest(ReqHeader header, Map body) {
        super();
        this.header = header;
        this.body = body;
    }

    @JsonProperty(value = "header")
    private ReqHeader header;

    @JsonProperty(value = "body")
    private Map body;

    public ReqHeader getHeader() {
        return header;
    }

    public void setHeader(ReqHeader header) {
        this.header = header;
    }

    public Map getBody() {
        return  body;
    }

    public void setBody(Map body) {
        this.body = body;
    }
}
