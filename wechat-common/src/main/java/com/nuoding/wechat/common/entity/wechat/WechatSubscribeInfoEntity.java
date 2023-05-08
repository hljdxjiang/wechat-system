package com.nuoding.wechat.common.entity.wechat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.math.BigDecimal;


/**
 * 用户订阅信息表
 *
 * @Author: hzq
 * @Date: 2023-05-08 19:32:47
 */
@Entity
@Table(name = "wechat_subscribe_info")
public class WechatSubscribeInfoEntity implements Serializable {

    private static final long serialVersionUID = 1L;

            
            /**
             * 
             */
            @Id
            @Column(length = 32)
            private Integer id;
                    
            /**
             * 微信APPID
             */
                    @Column(name = "appid")
                    private String appid;
                    
            /**
             * 微信Openid
             */
                    @Column(name = "wxopenid")
                    private String wxopenid;
                    
            /**
             * 模板ID
             */
                    @Column(name = "template_id")
                    private String templateId;
                    
            /**
             * 场景值
             */
                    @Column(name = "popup_sence")
                    private Integer popupSence;
                    
            /**
             * 用户点击行为：同意、取消发送通知
             */
                    @Column(name = "subscribe_status_string")
                    private String subscribeStatusString;
                    
            /**
             * 插入时间
             */
                        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
                    @Column(name = "create_time")
                    private Date createTime;
                    
            /**
             * 最后修改时间
             */
                        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
                    @Column(name = "last_modified_time")
                    private Date lastModifiedTime;
                    
            /**
             * 0未发送，1发送失败 9发生成功
             */
                    @Column(name = "send_status")
                    private Integer sendStatus;
                    
            /**
             * 推送结果
             */
                    @Column(name = "send_result")
                    private String sendResult;
            
    
        /**
         * 获取：
         */
        public Integer getId() {
            return id;
        }

        /**
         * 设置：
         */
        public void setId(Integer id) {
            this.id=id;
        }
    
        /**
         * 获取：微信APPID
         */
        public String getAppid() {
            return appid;
        }

        /**
         * 设置：微信APPID
         */
        public void setAppid(String appid) {
            this.appid=appid;
        }
    
        /**
         * 获取：微信Openid
         */
        public String getWxopenid() {
            return wxopenid;
        }

        /**
         * 设置：微信Openid
         */
        public void setWxopenid(String wxopenid) {
            this.wxopenid=wxopenid;
        }
    
        /**
         * 获取：模板ID
         */
        public String getTemplateId() {
            return templateId;
        }

        /**
         * 设置：模板ID
         */
        public void setTemplateId(String templateId) {
            this.templateId=templateId;
        }
    
        /**
         * 获取：场景值
         */
        public Integer getPopupSence() {
            return popupSence;
        }

        /**
         * 设置：场景值
         */
        public void setPopupSence(Integer popupSence) {
            this.popupSence=popupSence;
        }
    
        /**
         * 获取：用户点击行为：同意、取消发送通知
         */
        public String getSubscribeStatusString() {
            return subscribeStatusString;
        }

        /**
         * 设置：用户点击行为：同意、取消发送通知
         */
        public void setSubscribeStatusString(String subscribeStatusString) {
            this.subscribeStatusString=subscribeStatusString;
        }
    
        /**
         * 获取：插入时间
         */
        public Date getCreateTime() {
            return createTime;
        }

        /**
         * 设置：插入时间
         */
        public void setCreateTime(Date createTime) {
            this.createTime=createTime;
        }
    
        /**
         * 获取：最后修改时间
         */
        public Date getLastModifiedTime() {
            return lastModifiedTime;
        }

        /**
         * 设置：最后修改时间
         */
        public void setLastModifiedTime(Date lastModifiedTime) {
            this.lastModifiedTime=lastModifiedTime;
        }
    
        /**
         * 获取：0未发送，1发送失败 9发生成功
         */
        public Integer getSendStatus() {
            return sendStatus;
        }

        /**
         * 设置：0未发送，1发送失败 9发生成功
         */
        public void setSendStatus(Integer sendStatus) {
            this.sendStatus=sendStatus;
        }
    
        /**
         * 获取：推送结果
         */
        public String getSendResult() {
            return sendResult;
        }

        /**
         * 设置：推送结果
         */
        public void setSendResult(String sendResult) {
            this.sendResult=sendResult;
        }
    }
