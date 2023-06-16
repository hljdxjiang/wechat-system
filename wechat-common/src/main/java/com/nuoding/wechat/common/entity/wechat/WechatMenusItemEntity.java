package com.nuoding.wechat.common.entity.wechat;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;


/**
 * 微信菜单要素表
 *
 * @Author: hzq
 * @Date: 2023-06-08 17:37:05
 */
@Entity
@Table(name = "wechat_menus_item")
public class WechatMenusItemEntity implements Serializable {

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
     * 菜单ID
     */
    @Column(name = "item_id")
    private String itemId;

    /**
     * 菜单名称
     */
    @Column(name = "name")
    private String name;

    /**
     * 菜单类型
     */
    @Column(name = "type")
    private String type;

    /**
     * 事件ID
     */
    @Column(name = "key")
    private String key;

    /**
     * 跳转链接
     */
    @Column(name = "url")
    private String url;

    /**
     * 小程序ID
     */
    @Column(name = "appid")
    private String appid;

    /**
     * 小程序地址
     */
    @Column(name = "pagepath")
    private String pagepath;

    /**
     * 图文消息ID
     */
    @Column(name = "article_id")
    private String articleId;

    /**
     *
     */
    @Column(name = "article_view_limited")
    private String articleViewLimited;

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
     * 获取：菜单ID
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * 设置：菜单ID
     */
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    /**
     * 获取：菜单名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置：菜单名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取：菜单类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置：菜单类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取：事件ID
     */
    public String getKey() {
        return key;
    }

    /**
     * 设置：事件ID
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * 获取：跳转链接
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置：跳转链接
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取：小程序ID
     */
    public String getAppid() {
        return appid;
    }

    /**
     * 设置：小程序ID
     */
    public void setAppid(String appid) {
        this.appid = appid;
    }

    /**
     * 获取：小程序地址
     */
    public String getPagepath() {
        return pagepath;
    }

    /**
     * 设置：小程序地址
     */
    public void setPagepath(String pagepath) {
        this.pagepath = pagepath;
    }

    /**
     * 获取：图文消息ID
     */
    public String getArticleId() {
        return articleId;
    }

    /**
     * 设置：图文消息ID
     */
    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    /**
     * 获取：
     */
    public String getArticleViewLimited() {
        return articleViewLimited;
    }

    /**
     * 设置：
     */
    public void setArticleViewLimited(String articleViewLimited) {
        this.articleViewLimited = articleViewLimited;
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
