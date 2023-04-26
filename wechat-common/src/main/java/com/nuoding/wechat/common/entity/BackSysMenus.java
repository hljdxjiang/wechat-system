package com.nuoding.wechat.common.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 系统菜单表(BackSysMenus)实体类
 *
 * @author jhc
 * @since 2023-03-07 14:38:29
 */
public class BackSysMenus implements Serializable {
    private static final long serialVersionUID = 461868703708164147L;
    /**
     * 主键ID
     */
    private Integer id;
    /**
     * 权限ID
     */
    private String menuId;
    /**
     * 菜单权限标题
     */
    private String menusTitle;
    /**
     * 菜单类型
     */
    private String menuType;

    /**
     * 菜单跳转路径
     */
    private String menuPath;
    /**
     * 权限父ID
     */
    private String parentId;

    private Date createTime;

    private Date lastModifiedTime;
    /**
     * 备注信息
     */
    private String remark;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getMenusTitle() {
        return menusTitle;
    }

    public void setMenusTitle(String menusTitle) {
        this.menusTitle = menusTitle;
    }

    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(String menuType) {
        this.menuType = menuType;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getMenuPath() {
        return menuPath;
    }

    public void setMenuPath(String menuPath) {
        this.menuPath = menuPath;
    }
}

