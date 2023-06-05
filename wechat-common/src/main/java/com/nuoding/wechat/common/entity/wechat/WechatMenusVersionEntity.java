package com.nuoding.wechat.common.entity.wechat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.math.BigDecimal;


/**
 * 微信菜单版本表
 *
 * @Author: hzq
 * @Date: 2023-06-05 17:49:46
 */
@Entity
@Table(name = "wechat_menus_version")
public class WechatMenusVersionEntity implements Serializable {

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
             * 最后修改时间
             */
                        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
                    @Column(name = "last_modified_time")
                    private Date lastModifiedTime;
                    
            /**
             * 选项ID
             */
                    @Column(name = "option_id")
                    private String optionId;
                    
            /**
             * 微信选项ID
             */
                    @Column(name = "option_key")
                    private String optionKey;
                    
            /**
             * 选项中文描述
             */
                    @Column(name = "option_desc")
                    private String optionDesc;
                    
            /**
             * 选项类型：text 文本 select 下拉
             */
                    @Column(name = "option_type")
                    private String optionType;
            
    
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
         * 获取：最后修改时间
         */
        public Date getLastModifiedTime() {
            return lastModifiedTime;
        }

        /**
         * 设置：最后修改时间
         */
        public void setLastModifiedTime(Date lastModifiedTime) {
            this.lastModifiedTime=lastModifiedTime;
        }
    
        /**
         * 获取：选项ID
         */
        public String getOptionId() {
            return optionId;
        }

        /**
         * 设置：选项ID
         */
        public void setOptionId(String optionId) {
            this.optionId=optionId;
        }
    
        /**
         * 获取：微信选项ID
         */
        public String getOptionKey() {
            return optionKey;
        }

        /**
         * 设置：微信选项ID
         */
        public void setOptionKey(String optionKey) {
            this.optionKey=optionKey;
        }
    
        /**
         * 获取：选项中文描述
         */
        public String getOptionDesc() {
            return optionDesc;
        }

        /**
         * 设置：选项中文描述
         */
        public void setOptionDesc(String optionDesc) {
            this.optionDesc=optionDesc;
        }
    
        /**
         * 获取：选项类型：text 文本 select 下拉
         */
        public String getOptionType() {
            return optionType;
        }

        /**
         * 设置：选项类型：text 文本 select 下拉
         */
        public void setOptionType(String optionType) {
            this.optionType=optionType;
        }
    }
