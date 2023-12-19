package com.nuoding.wechat.common.entity.wechat;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;


/**
 * 微信推送模板
 *
 * @Author: hzq
 * @Date: 2023-12-18 14:57:37
 */
@Entity
@Table(name = "wechat_template_info")
public class WechatTemplateInfoEntity implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
     * id
     */
    @Id
    @Column(length = 32)
    private Integer id;

    /**
     * 租户ID
     */
    @Column(name = "tenant_id")
    private String tenantId;

    /**
     * 模板ID
     */
    @Column(name = "template_id")
    private String templateId;

    /**
     * 模板类型
     */
    @Column(name = "template_type")
    private String templateType;

    /**
     * 模板功能描述
     */
    @Column(name = "template_des")
    private String templateDes;

    /**
     * 跳转URL
     */
    @Column(name = "template_url")
    private String templateUrl;

    /**
     * 模板配置：是否起用|是否推送非实名|是否保存推送记录0否1是
     */
    @Column(name = "template_config")
    private String templateConfig;

    /**
     * 跳转小程序ID
     */
    @Column(name = "minip_appid")
    private String minipAppid;

    /**
     * 跳转小程序路径
     */
    @Column(name = "minip_page_path")
    private String minipPagePath;

    /**
     * 消息类型：TEMPLATE：模板消息SUBSCRIBLE:订阅消息
     */
    @Column(name = "message_type")
    private String messageType;

    /**
     * 创建时间
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
     * 获取：id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置：id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取：租户ID
     */
    public String getTenantId() {
        return tenantId;
    }

    /**
     * 设置：租户ID
     */
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
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
        this.templateId = templateId;
    }

    /**
     * 获取：模板类型
     */
    public String getTemplateType() {
        return templateType;
    }

    /**
     * 设置：模板类型
     */
    public void setTemplateType(String templateType) {
        this.templateType = templateType;
    }

    /**
     * 获取：模板功能描述
     */
    public String getTemplateDes() {
        return templateDes;
    }

    /**
     * 设置：模板功能描述
     */
    public void setTemplateDes(String templateDes) {
        this.templateDes = templateDes;
    }

    /**
     * 获取：跳转URL
     */
    public String getTemplateUrl() {
        return templateUrl;
    }

    /**
     * 设置：跳转URL
     */
    public void setTemplateUrl(String templateUrl) {
        this.templateUrl = templateUrl;
    }

    /**
     * 获取：模板配置：是否起用|是否推送非实名|是否保存推送记录0否1是
     */
    public String getTemplateConfig() {
        return templateConfig;
    }

    /**
     * 设置：模板配置：是否起用|是否推送非实名|是否保存推送记录0否1是
     */
    public void setTemplateConfig(String templateConfig) {
        this.templateConfig = templateConfig;
    }

    /**
     * 获取：跳转小程序ID
     */
    public String getMinipAppid() {
        return minipAppid;
    }

    /**
     * 设置：跳转小程序ID
     */
    public void setMinipAppid(String minipAppid) {
        this.minipAppid = minipAppid;
    }

    /**
     * 获取：跳转小程序路径
     */
    public String getMinipPagePath() {
        return minipPagePath;
    }

    /**
     * 设置：跳转小程序路径
     */
    public void setMinipPagePath(String minipPagePath) {
        this.minipPagePath = minipPagePath;
    }

    /**
     * 获取：消息类型：TEMPLATE：模板消息SUBSCRIBLE:订阅消息
     */
    public String getMessageType() {
        return messageType;
    }

    /**
     * 设置：消息类型：TEMPLATE：模板消息SUBSCRIBLE:订阅消息
     */
    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    /**
     * 获取：创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置：创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
        this.lastModifiedTime = lastModifiedTime;
    }
}
