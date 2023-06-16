package com.nuoding.wechat.common.entity.wechat;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;


/**
 * 微信菜单表
 *
 * @Author: hzq
 * @Date: 2023-06-08 17:37:05
 */
@Entity
@Table(name = "wechat_menus")
public class WechatMenusEntity implements Serializable {

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
     * 菜单名称
     */
    @Column(name = "menu_name")
    private String menuName;

    /**
     * 微信返回的ID
     */
    @Column(name = "wx_menu_id")
    private String wxMenuId;

    /**
     * 使用版本
     */
    @Column(name = "version")
    private String version;

    /**
     * 菜单备注
     */
    @Column(name = "remark")
    private String remark;

    /**
     * 菜单类型0标准菜单1个性化菜单
     */
    @Column(name = "menu_type")
    private String menuType;

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
     * 获取：菜单名称
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * 设置：菜单名称
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    /**
     * 获取：微信返回的ID
     */
    public String getWxMenuId() {
        return wxMenuId;
    }

    /**
     * 设置：微信返回的ID
     */
    public void setWxMenuId(String wxMenuId) {
        this.wxMenuId = wxMenuId;
    }

    /**
     * 获取：使用版本
     */
    public String getVersion() {
        return version;
    }

    /**
     * 设置：使用版本
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * 获取：菜单备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置：菜单备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取：菜单类型0标准菜单1个性化菜单
     */
    public String getMenuType() {
        return menuType;
    }

    /**
     * 设置：菜单类型0标准菜单1个性化菜单
     */
    public void setMenuType(String menuType) {
        this.menuType = menuType;
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
