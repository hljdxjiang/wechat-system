package com.nuoding.wechat.common.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (BackSysUser)实体类
 *
 * @author jhc
 * @since 2023-03-07 14:38:32
 */
public class BackSysUser implements Serializable {
    private static final long serialVersionUID = 109759361663461873L;

    private Integer id;
    /**
     * 租户ID
     */
    private String tenantId;
    /**
     * 用户ID
     */
    private String userId;
    /**
     * 密码
     */
    private String passwd;
    /**
     * 用户分组ID
     */
    private String groupId;
    /**
     * 角色ID
     */
    private String roleId;
    /**
     * 姓名
     */
    private String userName;
    /**
     * 手机号
     */
    private String mobileNo;
    /**
     * 邮箱地址
     */
    private String email;
    /**
     * 证件号
     */
    private String idNo;
    /**
     * 证件类型
     */
    private String idType;
    /**
     * 二次认证码
     */
    private String oauthCode;
    /**
     * 用户备注
     */
    private String remark;
    /**
     * 用户状态
     */
    private Object status;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 最后修改时间
     */
    private Date lastModifiedTime;


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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getOauthCode() {
        return oauthCode;
    }

    public void setOauthCode(String oauthCode) {
        this.oauthCode = oauthCode;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Object getStatus() {
        return status;
    }

    public void setStatus(Object status) {
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

}

