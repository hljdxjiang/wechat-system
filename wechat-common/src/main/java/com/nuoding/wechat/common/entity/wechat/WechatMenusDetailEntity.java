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
@Table(name = "wechat_menus_detail")
public class WechatMenusDetailEntity implements Serializable {

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
    @Column(name = "menu_id")
    private String menuId;

    /**
     * 菜单父ID
     */
    @Column(name = "item_pid")
    private String itemPid;

    /**
     * 菜单ID
     */
    @Column(name = "item_id")
    private String itemId;

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
     * 排序
     */
    @Column(name = "sort")
    private Integer sort;


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
    public String getMenuId() {
        return menuId;
    }

    /**
     * 设置：菜单ID
     */
    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    /**
     * 获取：菜单父ID
     */
    public String getItemPid() {
        return itemPid;
    }

    /**
     * 设置：菜单父ID
     */
    public void setItemPid(String itemPid) {
        this.itemPid = itemPid;
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
     * 获取：排序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置：排序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }
}
