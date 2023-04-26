package com.nuoding.wechat.common.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (SysTokenConfig)实体类
 *
 * @author jhc
 * @since 2023-03-07 14:39:02
 */
public class SysTokenConfig implements Serializable {
    private static final long serialVersionUID = 777195061723961043L;

    private Integer id;
    /**
     * 租户ID
     */
    private String tenantId;
    /**
     * Token中文名
     */
    private String tokenName;
    /**
     * Token码值
     */
    private String tokenKey;
    /**
     * Token描述
     */
    private String tokenDesc;
    /**
     * Token有效期类型
     */
    private String tokenVaildType;
    /**
     * token有效期时常
     */
    private Long tokenValidTime;
    /**
     * 配置状态
     */
    private Integer tokenStatus;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 最后修改时间
     */
    private Date lastUpdateTime;


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

    public String getTokenName() {
        return tokenName;
    }

    public void setTokenName(String tokenName) {
        this.tokenName = tokenName;
    }

    public String getTokenKey() {
        return tokenKey;
    }

    public void setTokenKey(String tokenKey) {
        this.tokenKey = tokenKey;
    }

    public String getTokenDesc() {
        return tokenDesc;
    }

    public void setTokenDesc(String tokenDesc) {
        this.tokenDesc = tokenDesc;
    }

    public String getTokenVaildType() {
        return tokenVaildType;
    }

    public void setTokenVaildType(String tokenVaildType) {
        this.tokenVaildType = tokenVaildType;
    }

    public Long getTokenValidTime() {
        return tokenValidTime;
    }

    public void setTokenValidTime(Long tokenValidTime) {
        this.tokenValidTime = tokenValidTime;
    }

    public Integer getTokenStatus() {
        return tokenStatus;
    }

    public void setTokenStatus(Integer tokenStatus) {
        this.tokenStatus = tokenStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

}

