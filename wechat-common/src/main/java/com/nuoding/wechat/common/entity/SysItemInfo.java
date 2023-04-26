package com.nuoding.wechat.common.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 楼层要素表(SysItemInfo)实体类
 *
 * @author jhc
 * @since 2023-04-21 15:15:11
 */
public class SysItemInfo implements Serializable {
    private static final long serialVersionUID = -96092977439782093L;
    
    private Integer id;
    /**
     * 租户ID
     */
    private String tenantId;
    /**
     * 标签ID
     */
    private String itemId;
    /**
     * 排序
     */
    private Integer itemSort;
    /**
     * 用户状态
     */
    private Integer status;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 最后修改时间
     */
    private Date lastModifiedTime;
    
    private String itemTitle;
    /**
     * 要素值
     */
    private String itemValue;
    /**
     * 要素描述
     */
    private String itemDesc;
    /**
     * 标题展示样式
     */
    private String titleShowType;
    /**
     * 值展示样式
     */
    private String valueShowType;
    /**
     * 标题跳转链接
     */
    private String titleUrl;
    /**
     * 值跳转练级
     */
    private String valueUrl;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public Integer getItemSort() {
        return itemSort;
    }

    public void setItemSort(Integer itemSort) {
        this.itemSort = itemSort;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    public String getItemValue() {
        return itemValue;
    }

    public void setItemValue(String itemValue) {
        this.itemValue = itemValue;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    public String getTitleShowType() {
        return titleShowType;
    }

    public void setTitleShowType(String titleShowType) {
        this.titleShowType = titleShowType;
    }

    public String getValueShowType() {
        return valueShowType;
    }

    public void setValueShowType(String valueShowType) {
        this.valueShowType = valueShowType;
    }

    public String getTitleUrl() {
        return titleUrl;
    }

    public void setTitleUrl(String titleUrl) {
        this.titleUrl = titleUrl;
    }

    public String getValueUrl() {
        return valueUrl;
    }

    public void setValueUrl(String valueUrl) {
        this.valueUrl = valueUrl;
    }

}

