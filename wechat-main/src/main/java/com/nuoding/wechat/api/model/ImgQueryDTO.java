package com.nuoding.wechat.api.model;

import com.nuoding.wechat.common.model.BaseDTO;

public class ImgQueryDTO extends BaseDTO {
    private String imgType;

    public String getImgType() {
        return imgType;
    }

    public void setImgType(String imgType) {
        this.imgType = imgType;
    }
}
