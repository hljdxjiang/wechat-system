package com.nuoding.wechat.common.entity.crm;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.math.BigDecimal;


/**
 * 销售支付记录表
 *
 * @Author: hzq
 * @Date: 2023-12-18 14:57:37
 */
@Entity
@Table(name = "crm_sale_pay_info")
public class CrmSalePayInfoEntity implements Serializable {

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
             * 批次ID
             */
                    @Column(name = "batch_id")
                    private Integer batchId;
                    
            /**
             * 优惠券ID
             */
                    @Column(name = "coupon_id")
                    private Integer couponId;
                    
            /**
             * 抵扣金额
             */
                    @Column(name = "coupon_amount")
                    private String couponAmount;
                    
            /**
             * 抵扣类型
             */
                    @Column(name = "coupon_type")
                    private BigDecimal couponType;
                    
            /**
             * 优惠券ID
             */
                    @Column(name = "user_coupon_id")
                    private String userCouponId;
                    
            /**
             * 用户备注
             */
                    @Column(name = "remark")
                    private String remark;
                    
            /**
             * 用户状态
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
         * 获取：批次ID
         */
        public Integer getBatchId() {
            return batchId;
        }

        /**
         * 设置：批次ID
         */
        public void setBatchId(Integer batchId) {
            this.batchId=batchId;
        }
    
        /**
         * 获取：优惠券ID
         */
        public Integer getCouponId() {
            return couponId;
        }

        /**
         * 设置：优惠券ID
         */
        public void setCouponId(Integer couponId) {
            this.couponId=couponId;
        }
    
        /**
         * 获取：抵扣金额
         */
        public String getCouponAmount() {
            return couponAmount;
        }

        /**
         * 设置：抵扣金额
         */
        public void setCouponAmount(String couponAmount) {
            this.couponAmount=couponAmount;
        }
    
        /**
         * 获取：抵扣类型
         */
        public BigDecimal getCouponType() {
            return couponType;
        }

        /**
         * 设置：抵扣类型
         */
        public void setCouponType(BigDecimal couponType) {
            this.couponType=couponType;
        }
    
        /**
         * 获取：优惠券ID
         */
        public String getUserCouponId() {
            return userCouponId;
        }

        /**
         * 设置：优惠券ID
         */
        public void setUserCouponId(String userCouponId) {
            this.userCouponId=userCouponId;
        }
    
        /**
         * 获取：用户备注
         */
        public String getRemark() {
            return remark;
        }

        /**
         * 设置：用户备注
         */
        public void setRemark(String remark) {
            this.remark=remark;
        }
    
        /**
         * 获取：用户状态
         */
        public Integer getStatus() {
            return status;
        }

        /**
         * 设置：用户状态
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
    }
