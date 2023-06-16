package com.nuoding.wechat.common.entity.back;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;


/**
 * 系统菜单表
 *
 * @Author: hzq
 * @Date: 2023-06-08 17:37:04
 */
@Entity
@Table(name = "back_sys_menus")
public class BackSysMenusEntity implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
     * 主键ID
     */
    @Id
    @Column(length = 32)
    private Integer id;

    /**
     * 菜单ID
     */
    @Column(name = "menu_id")
    private String menuId;

    /**
     * 跳转路径
     */
    @Column(name = "path")
    private String path;

    /**
     * 菜单权限标题
     */
    @Column(name = "name")
    private String name;

    /**
     * 菜单图标
     */
    @Column(name = "icon")
    private String icon;

    /**
     * 是否展示0展示1不展示
     */
    @Column(name = "hideInMenu")
    private Integer hideinmenu;

    /**
     * 匹配规则，0精确匹配
     */
    @Column(name = "exact")
    private Integer exact;

    /**
     * 链接组件
     */
    @Column(name = "component")
    private String component;

    /**
     * 菜单类型
     */
    @Column(name = "type")
    private String type;

    /**
     * 权限父ID
     */
    @Column(name = "parent_id")
    private String parentId;

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
     * 备注信息
     */
    @Column(name = "remark")
    private String remark;


    /**
     * 获取：主键ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置：主键ID
     */
    public void setId(Integer id) {
        this.id = id;
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
     * 获取：跳转路径
     */
    public String getPath() {
        return path;
    }

    /**
     * 设置：跳转路径
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * 获取：菜单权限标题
     */
    public String getName() {
        return name;
    }

    /**
     * 设置：菜单权限标题
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取：菜单图标
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置：菜单图标
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * 获取：是否展示0展示1不展示
     */
    public Integer getHideinmenu() {
        return hideinmenu;
    }

    /**
     * 设置：是否展示0展示1不展示
     */
    public void setHideinmenu(Integer hideinmenu) {
        this.hideinmenu = hideinmenu;
    }

    /**
     * 获取：匹配规则，0精确匹配
     */
    public Integer getExact() {
        return exact;
    }

    /**
     * 设置：匹配规则，0精确匹配
     */
    public void setExact(Integer exact) {
        this.exact = exact;
    }

    /**
     * 获取：链接组件
     */
    public String getComponent() {
        return component;
    }

    /**
     * 设置：链接组件
     */
    public void setComponent(String component) {
        this.component = component;
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
     * 获取：权限父ID
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * 设置：权限父ID
     */
    public void setParentId(String parentId) {
        this.parentId = parentId;
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
     * 获取：备注信息
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置：备注信息
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}
