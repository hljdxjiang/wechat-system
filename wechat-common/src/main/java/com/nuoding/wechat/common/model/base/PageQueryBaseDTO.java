package com.nuoding.wechat.common.model.base;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

/**
 * @Ahther:JHC
 * @Description:分页查询接受DTO,页码默认是1，默认查询10条
 * @Date:2023/4/26 下午2:11
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PageQueryBaseDTO implements Serializable {
    private static final long serialVersionUID = -8635327507859410192L;
    int pageNum;
    int pageSize;

    public int getPageNum() {
        if (pageNum < 1) {
            return 1;
        }
        return pageNum;
    }

    public void setPageNum(int page) {
        this.pageNum = page;
    }

    public int getPageSize() {
        if (pageSize < 1) {
            return 10;
        }
        return pageSize;
    }

    public void setPageSize(int size) {
        this.pageSize = size;
    }
}
