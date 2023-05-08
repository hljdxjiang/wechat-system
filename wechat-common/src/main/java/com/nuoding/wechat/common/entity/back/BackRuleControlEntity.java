package com.nuoding.wechat.common.entity.back;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.math.BigDecimal;


/**
 * 开关控制表
 *
 * @Author: hzq
 * @Date: 2023-05-08 19:32:48
 */
@Entity
@Table(name = "back_rule_control")
public class BackRuleControlEntity implements Serializable {

    private static final long serialVersionUID = 1L;

            
            /**
             * ID
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
             * 产品类型
             */
                    @Column(name = "control_type")
                    private String controlType;
                    
            /**
             * 产品描述
             */
                    @Column(name = "control_desc")
                    private String controlDesc;
                    
            /**
             * 规则范围
             */
                    @Column(name = "rule_range")
                    private String ruleRange;
                    
            /**
             * 控制开关
             */
                    @Column(name = "control_switch")
                    private String controlSwitch;
                    
            /**
             * 规则表达式
             */
                    @Column(name = "rule_expr")
                    private String ruleExpr;
                    
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
         * 获取：ID
         */
        public Integer getId() {
            return id;
        }

        /**
         * 设置：ID
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
         * 获取：产品类型
         */
        public String getControlType() {
            return controlType;
        }

        /**
         * 设置：产品类型
         */
        public void setControlType(String controlType) {
            this.controlType=controlType;
        }
    
        /**
         * 获取：产品描述
         */
        public String getControlDesc() {
            return controlDesc;
        }

        /**
         * 设置：产品描述
         */
        public void setControlDesc(String controlDesc) {
            this.controlDesc=controlDesc;
        }
    
        /**
         * 获取：规则范围
         */
        public String getRuleRange() {
            return ruleRange;
        }

        /**
         * 设置：规则范围
         */
        public void setRuleRange(String ruleRange) {
            this.ruleRange=ruleRange;
        }
    
        /**
         * 获取：控制开关
         */
        public String getControlSwitch() {
            return controlSwitch;
        }

        /**
         * 设置：控制开关
         */
        public void setControlSwitch(String controlSwitch) {
            this.controlSwitch=controlSwitch;
        }
    
        /**
         * 获取：规则表达式
         */
        public String getRuleExpr() {
            return ruleExpr;
        }

        /**
         * 设置：规则表达式
         */
        public void setRuleExpr(String ruleExpr) {
            this.ruleExpr=ruleExpr;
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
