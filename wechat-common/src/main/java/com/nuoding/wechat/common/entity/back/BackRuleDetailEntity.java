package com.nuoding.wechat.common.entity.back;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


/**
 * 角色权限详情表
 *
 * @Author: hzq
 * @Date: 2023-06-08 17:37:05
 */
@Entity
@Table(name = "back_rule_detail")
public class BackRuleDetailEntity implements Serializable {

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
     *
     */
    @Column(name = "role_id")
    private String roleId;

    /**
     *
     */
    @Column(name = "key_value")
    private String keyValue;

    /**
     *
     */
    @Column(name = "key_type")
    private String keyType;


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
     * 获取：
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * 设置：
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取：
     */
    public String getKeyValue() {
        return keyValue;
    }

    /**
     * 设置：
     */
    public void setKeyValue(String keyValue) {
        this.keyValue = keyValue;
    }

    /**
     * 获取：
     */
    public String getKeyType() {
        return keyType;
    }

    /**
     * 设置：
     */
    public void setKeyType(String keyType) {
        this.keyType = keyType;
    }
}
