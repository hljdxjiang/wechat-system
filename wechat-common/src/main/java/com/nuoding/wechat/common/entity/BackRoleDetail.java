package com.nuoding.wechat.common.entity;

import java.io.Serializable;

/**
 * 角色权限详情表(BackRoleDetail)实体类
 *
 * @author jhc
 * @since 2023-03-07 14:38:27
 */
public class BackRoleDetail implements Serializable {
    private static final long serialVersionUID = -53091285871821036L;

    private Integer id;
    /**
     * 租户ID
     */
    private String tenantId;

    private String roleId;

    private String keyValue;

    private String keyType;


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

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getKeyValue() {
        return keyValue;
    }

    public void setKeyValue(String keyValue) {
        this.keyValue = keyValue;
    }

    public String getKeyType() {
        return keyType;
    }

    public void setKeyType(String keyType) {
        this.keyType = keyType;
    }

}

