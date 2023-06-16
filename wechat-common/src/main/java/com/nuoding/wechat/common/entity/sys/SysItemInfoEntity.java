package com.nuoding.wechat.common.entity.sys;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;


/**
 * 楼层要素表
 *
 * @Author: hzq
 * @Date: 2023-06-08 17:37:05
 */
@Entity
@Table(name = "sys_item_info")
public class SysItemInfoEntity implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
     *
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
     * 标签ID
     */
    @Column(name = "item_id")
    private String itemId;

    /**
     * 排序
     */
    @Column(name = "item_sort")
    private Integer itemSort;

    /**
     * 用户状态
     */
    @Column(name = "status")
    private Integer status;

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
     *
     */
    @Column(name = "item_title")
    private String itemTitle;

    /**
     * 要素值
     */
    @Column(name = "item_value")
    private String itemValue;

    /**
     * 要素描述
     */
    @Column(name = "item_desc")
    private String itemDesc;

    /**
     * 要素类型
     */
    @Column(name = "item_type")
    private String itemType;

    /**
     * 标题展示样式
     */
    @Column(name = "title_show_type")
    private String titleShowType;

    /**
     * 标题跳转链接
     */
    @Column(name = "title_url")
    private String titleUrl;

    /**
     * 值跳转练级
     */
    @Column(name = "value_url")
    private String valueUrl;

    /**
     * 值展示样式
     */
    @Column(name = "value_show_type")
    private String valueShowType;


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
     * 获取：标签ID
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * 设置：标签ID
     */
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    /**
     * 获取：排序
     */
    public Integer getItemSort() {
        return itemSort;
    }

    /**
     * 设置：排序
     */
    public void setItemSort(Integer itemSort) {
        this.itemSort = itemSort;
    }

    /**
     * 获取：用户状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置：用户状态
     */
    public void setStatus(Integer status) {
        this.status = status;
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

    /**
     * 获取：
     */
    public String getItemTitle() {
        return itemTitle;
    }

    /**
     * 设置：
     */
    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    /**
     * 获取：要素值
     */
    public String getItemValue() {
        return itemValue;
    }

    /**
     * 设置：要素值
     */
    public void setItemValue(String itemValue) {
        this.itemValue = itemValue;
    }

    /**
     * 获取：要素描述
     */
    public String getItemDesc() {
        return itemDesc;
    }

    /**
     * 设置：要素描述
     */
    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    /**
     * 获取：要素类型
     */
    public String getItemType() {
        return itemType;
    }

    /**
     * 设置：要素类型
     */
    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    /**
     * 获取：标题展示样式
     */
    public String getTitleShowType() {
        return titleShowType;
    }

    /**
     * 设置：标题展示样式
     */
    public void setTitleShowType(String titleShowType) {
        this.titleShowType = titleShowType;
    }

    /**
     * 获取：标题跳转链接
     */
    public String getTitleUrl() {
        return titleUrl;
    }

    /**
     * 设置：标题跳转链接
     */
    public void setTitleUrl(String titleUrl) {
        this.titleUrl = titleUrl;
    }

    /**
     * 获取：值跳转练级
     */
    public String getValueUrl() {
        return valueUrl;
    }

    /**
     * 设置：值跳转练级
     */
    public void setValueUrl(String valueUrl) {
        this.valueUrl = valueUrl;
    }

    /**
     * 获取：值展示样式
     */
    public String getValueShowType() {
        return valueShowType;
    }

    /**
     * 设置：值展示样式
     */
    public void setValueShowType(String valueShowType) {
        this.valueShowType = valueShowType;
    }
}
