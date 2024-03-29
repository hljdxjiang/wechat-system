package com.nuoding.wechat.common.entity.sys;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;


/**
 * token信息表
 *
 * @Author: hzq
 * @Date: 2023-12-18 14:57:37
 */
@Entity
@Table(name = "sys_token_config")
public class SysTokenConfigEntity implements Serializable {

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
     * 程序ID
     */
    @Column(name = "appid")
    private String appid;

    /**
     * Token码值
     */
    @Column(name = "token_key")
    private String tokenKey;

    /**
     * Token描述
     */
    @Column(name = "token_desc")
    private String tokenDesc;

    /**
     * Token有效期类型
     */
    @Column(name = "token_vaild_type")
    private String tokenVaildType;

    /**
     * token有效期时常
     */
    @Column(name = "token_valid_time")
    private Long tokenValidTime;

    /**
     * 配置状态
     */
    @Column(name = "token_status")
    private Integer tokenStatus;

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
    @Column(name = "last_update_time")
    private Date lastUpdateTime;


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
     * 获取：程序ID
     */
    public String getAppid() {
        return appid;
    }

    /**
     * 设置：程序ID
     */
    public void setAppid(String appid) {
        this.appid = appid;
    }

    /**
     * 获取：Token码值
     */
    public String getTokenKey() {
        return tokenKey;
    }

    /**
     * 设置：Token码值
     */
    public void setTokenKey(String tokenKey) {
        this.tokenKey = tokenKey;
    }

    /**
     * 获取：Token描述
     */
    public String getTokenDesc() {
        return tokenDesc;
    }

    /**
     * 设置：Token描述
     */
    public void setTokenDesc(String tokenDesc) {
        this.tokenDesc = tokenDesc;
    }

    /**
     * 获取：Token有效期类型
     */
    public String getTokenVaildType() {
        return tokenVaildType;
    }

    /**
     * 设置：Token有效期类型
     */
    public void setTokenVaildType(String tokenVaildType) {
        this.tokenVaildType = tokenVaildType;
    }

    /**
     * 获取：token有效期时常
     */
    public Long getTokenValidTime() {
        return tokenValidTime;
    }

    /**
     * 设置：token有效期时常
     */
    public void setTokenValidTime(Long tokenValidTime) {
        this.tokenValidTime = tokenValidTime;
    }

    /**
     * 获取：配置状态
     */
    public Integer getTokenStatus() {
        return tokenStatus;
    }

    /**
     * 设置：配置状态
     */
    public void setTokenStatus(Integer tokenStatus) {
        this.tokenStatus = tokenStatus;
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
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * 设置：最后修改时间
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
}
