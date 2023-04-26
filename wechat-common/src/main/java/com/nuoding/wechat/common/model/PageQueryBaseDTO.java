package com.nuoding.wechat.common.model;

import java.io.Serializable;

/**
 * @Ahther:JHC
 * @Description:分页查询接受DTO,页码默认是1，默认查询10条
 * @Date:2023/4/26 下午2:11
 */
public class PageQueryBaseDTO implements Serializable {
    private static final long serialVersionUID = -8635327507859410192L;
    int page;
    int size;

    public int getPage() {
        if (page < 1) {
            return 1;
        }
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        if (size < 1) {
            return 10;
        }
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
