package com.nuoding.wechat.background.model.back;

import com.nuoding.wechat.common.model.BaseDTO;

import java.util.List;

public class SaveRoleDetail extends BaseDTO {

    /**
     * 角色编号
     */
    private String roleId;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 角色描述
     */
    private String roleDesc;

    private List<String> menus;

    private List<String> revokes;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    public List<String> getMenus() {
        return menus;
    }

    public void setMenus(List<String> menus) {
        this.menus = menus;
    }

    public List<String> getRevokes() {
        return revokes;
    }

    public void setRevokes(List<String> revokes) {
        this.revokes = revokes;
    }
}
