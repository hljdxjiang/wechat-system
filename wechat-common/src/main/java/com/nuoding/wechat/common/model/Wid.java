package com.nuoding.wechat.common.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.nuoding.wechat.common.entity.WechatUser;
import org.apache.commons.lang3.StringUtils;

/**
 * @Author jiaowz
 * @Date 2018/03/14
 * @Description
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Wid {
    private String openId;
    private String mOpenId;
    private String unionId;

    public Wid() {
    }

    public Wid(String openId, String mOpenId, String unionId) {
        this.openId = openId;
        this.mOpenId = mOpenId;
        this.unionId = unionId;
    }

    public Wid(WechatUser user) {
        this.openId = user.getWxopenid();
        this.unionId = user.getUnionid();
    }

    public String getWid() {
        if (!StringUtils.isEmpty(openId)) {
            return openId;
        }

        if (!StringUtils.isEmpty(unionId)) {
            return unionId;
        }

        if (!StringUtils.isEmpty(mOpenId)) {
            return mOpenId;
        }

        return null;
    }

    public String getWidType() {
        if (!StringUtils.isEmpty(openId)) {
            return OPENID;
        }

        if (!StringUtils.isEmpty(unionId)) {
            return UNIONID;
        }

        if (!StringUtils.isEmpty(mOpenId)) {
            return MOPENID;
        }

        return null;

    }

    public static final String OPENID = "O";
    public static final String MOPENID = "M";
    public static final String UNIONID = "U";

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getmOpenId() {
        return mOpenId;
    }

    public void setmOpenId(String mOpenId) {
        this.mOpenId = mOpenId;
    }

    public String getUnionId() {
        return unionId;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId;
    }
}
