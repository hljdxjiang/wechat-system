package com.nuoding.wechat.common.entity.market;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.math.BigDecimal;


/**
 * 优惠券使用规则控制
 *
 * @Author: hzq
 * @Date: 2023-05-08 19:32:48
 */
@Entity
@Table(name = "market_coupon_rule")
public class MarketCouponRuleEntity implements Serializable {

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
             * 优惠券编号
             */
                    @Column(name = "coupon_id")
                    private String couponId;
                    
            /**
             * 状态
             */
                    @Column(name = "status")
                    private Integer status;
                    
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
             * 规则ID
             */
                    @Column(name = "rule_id")
                    private String ruleId;
            
    
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
         * 获取：优惠券编号
         */
        public String getCouponId() {
            return couponId;
        }

        /**
         * 设置：优惠券编号
         */
        public void setCouponId(String couponId) {
            this.couponId=couponId;
        }
    
        /**
         * 获取：状态
         */
        public Integer getStatus() {
            return status;
        }

        /**
         * 设置：状态
         */
        public void setStatus(Integer status) {
            this.status=status;
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
    
        /**
         * 获取：规则ID
         */
        public String getRuleId() {
            return ruleId;
        }

        /**
         * 设置：规则ID
         */
        public void setRuleId(String ruleId) {
            this.ruleId=ruleId;
        }
    }
