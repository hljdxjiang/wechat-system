package com.nuoding.wechat.common.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (SysParamConfig)实体类
 *
 * @author jhc
 * @since 2023-03-07 14:39:00
 */
public class SysParamConfig implements Serializable {
    private static final long serialVersionUID = 484952783175145103L;

    private Integer id;
    /**
     * 租户ID
     */
    private String tenantId;
    /**
     * 配置中文名
     */
    private String configName;
    /**
     * 配置主键
     */
    private String configKey;
    /**
     * 配置值
     */
    private String configValue;
    /**
     * 配置描述
     */
    private String configDesc;
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

    public String getConfigName() {
        return configName;
    }

    public void setConfigName(String configName) {
        this.configName = configName;
    }

    public String getConfigKey() {
        return configKey;
    }

    public void setConfigKey(String configKey) {
        this.configKey = configKey;
    }

    public String getConfigValue() {
        return configValue;
    }

    public void setConfigValue(String configValue) {
        this.configValue = configValue;
    }

    public String getConfigDesc() {
        return configDesc;
    }

    public void setConfigDesc(String configDesc) {
        this.configDesc = configDesc;
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

