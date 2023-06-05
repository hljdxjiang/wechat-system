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
 * 微信个性化菜单匹配表
 *
 * @Author: hzq
 * @Date: 2023-06-05 17:49:46
 */
@Entity
@Table(name = "wechat_menus_matchrule")
public class WechatMenusMatchruleEntity implements Serializable {

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
             * 菜单ID
             */
                    @Column(name = "menu_id")
                    private String menuId;
                    
            /**
             * 匹配字段
             */
                    @Column(name = "rule_id")
                    private String ruleId;
                    
            /**
             * 匹配字段值
             */
                    @Column(name = "rule_value")
                    private String ruleValue;
                    
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
                    @Column(name = "last_modified_time")
                    private Date lastModifiedTime;
            
    
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
         * 获取：菜单ID
         */
        public String getMenuId() {
            return menuId;
        }

        /**
         * 设置：菜单ID
         */
        public void setMenuId(String menuId) {
            this.menuId=menuId;
        }
    
        /**
         * 获取：匹配字段
         */
        public String getRuleId() {
            return ruleId;
        }

        /**
         * 设置：匹配字段
         */
        public void setRuleId(String ruleId) {
            this.ruleId=ruleId;
        }
    
        /**
         * 获取：匹配字段值
         */
        public String getRuleValue() {
            return ruleValue;
        }

        /**
         * 设置：匹配字段值
         */
        public void setRuleValue(String ruleValue) {
            this.ruleValue=ruleValue;
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
        public Date getLastModifiedTime() {
            return lastModifiedTime;
        }

        /**
         * 设置：最后修改时间
         */
        public void setLastModifiedTime(Date lastModifiedTime) {
            this.lastModifiedTime=lastModifiedTime;
        }
    }
