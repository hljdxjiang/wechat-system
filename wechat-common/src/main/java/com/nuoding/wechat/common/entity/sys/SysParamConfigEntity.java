package com.nuoding.wechat.common.entity.sys;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.math.BigDecimal;


/**
 * 系统参数配置表
 *
 * @Author: hzq
 * @Date: 2023-12-18 14:57:38
 */
@Entity
@Table(name = "sys_param_config")
public class SysParamConfigEntity implements Serializable {

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
             * 配置中文名
             */
                    @Column(name = "config_name")
                    private String configName;
                    
            /**
             * 配置主键
             */
                    @Column(name = "config_key")
                    private String configKey;
                    
            /**
             * 配置值
             */
                    @Column(name = "config_value")
                    private String configValue;
                    
            /**
             * 配置描述
             */
                    @Column(name = "config_desc")
                    private String configDesc;
                    
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
            this.id=id;
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
            this.tenantId=tenantId;
        }
    
        /**
         * 获取：配置中文名
         */
        public String getConfigName() {
            return configName;
        }

        /**
         * 设置：配置中文名
         */
        public void setConfigName(String configName) {
            this.configName=configName;
        }
    
        /**
         * 获取：配置主键
         */
        public String getConfigKey() {
            return configKey;
        }

        /**
         * 设置：配置主键
         */
        public void setConfigKey(String configKey) {
            this.configKey=configKey;
        }
    
        /**
         * 获取：配置值
         */
        public String getConfigValue() {
            return configValue;
        }

        /**
         * 设置：配置值
         */
        public void setConfigValue(String configValue) {
            this.configValue=configValue;
        }
    
        /**
         * 获取：配置描述
         */
        public String getConfigDesc() {
            return configDesc;
        }

        /**
         * 设置：配置描述
         */
        public void setConfigDesc(String configDesc) {
            this.configDesc=configDesc;
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
            this.createTime=createTime;
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
            this.lastUpdateTime=lastUpdateTime;
        }
    }
