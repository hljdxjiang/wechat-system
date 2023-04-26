package com.nuoding.wechat.common.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户订阅信息表(WechatSubscribeInfo)实体类
 *
 * @author jhc
 * @since 2023-03-07 14:39:17
 */
public class WechatSubscribeInfo implements Serializable {
    private static final long serialVersionUID = 120511414413449701L;

    private Integer id;
    /**
     * 微信APPID
     */
    private String appid;
    /**
     * 微信Openid
     */
    private String wxopenid;
    /**
     * 模板ID
     */
    private String templateId;
    /**
     * 场景值
     */
    private Integer popupSence;
    /**
     * 用户点击行为：同意、取消发送通知
     */
    private String subscribeStatusString;
    /**
     * 插入时间
     */
    private Date createTime;
    /**
     * 最后修改时间
     */
    private Date lastModifiedTime;
    /**
     * 0未发送，1发送失败 9发生成功
     */
    private Integer sendStatus;
    /**
     * 推送结果
     */
    private String sendResult;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getWxopenid() {
        return wxopenid;
    }

    public void setWxopenid(String wxopenid) {
        this.wxopenid = wxopenid;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public Integer getPopupSence() {
        return popupSence;
    }

    public void setPopupSence(Integer popupSence) {
        this.popupSence = popupSence;
    }

    public String getSubscribeStatusString() {
        return subscribeStatusString;
    }

    public void setSubscribeStatusString(String subscribeStatusString) {
        this.subscribeStatusString = subscribeStatusString;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    public Integer getSendStatus() {
        return sendStatus;
    }

    public void setSendStatus(Integer sendStatus) {
        this.sendStatus = sendStatus;
    }

    public String getSendResult() {
        return sendResult;
    }

    public void setSendResult(String sendResult) {
        this.sendResult = sendResult;
    }

}

