package com.nuoding.wechat.common.base;

import java.io.Serializable;
import java.util.List;

/**
 * @author :tf
 * @create :2022/05/12
 * @desc : 当前用户信息
 **/
public class CurrentUser implements Serializable {

    public CurrentUser() {

    }

    /**
     * 用户id
     */
    private Integer userId;
    /**
     * 用户编号
     */
    private String userNo;
    /**
     * 姓名
     */
    private String userName;
    /**
     * 账号昵称
     */
    private String accountNo;
    /**
     * 状态 0：未激活 1 ：激活
     */
    private Boolean status;
    /**
     * 登录token
     */
    private String token;
    /**
     * 角色id
     */
    private Integer roleId;
    /**
     * 角色名称
     */
    private String roleName;
    /**
     * 菜单权限
     */
    private List<Integer> permissions;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public List<Integer> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Integer> permissions) {
        this.permissions = permissions;
    }
}
