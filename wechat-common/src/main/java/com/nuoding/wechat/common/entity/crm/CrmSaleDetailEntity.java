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
 * 销售记录表
 *
 * @Author: hzq
 * @Date: 2023-05-08 19:32:48
 */
@Entity
@Table(name = "crm_sale_detail")
public class CrmSaleDetailEntity implements Serializable {

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
             * 销售数量
             */
                    @Column(name = "amount")
                    private String amount;
                    
            /**
             * 真实销售金额
             */
                    @Column(name = "real_price")
                    private BigDecimal realPrice;
                    
            /**
             * 产品ID
             */
                    @Column(name = "prod_id")
                    private String prodId;
                    
            /**
             * 产品建议售价
             */
                    @Column(name = "prod_price")
                    private BigDecimal prodPrice;
                    
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
         * 获取：销售数量
         */
        public String getAmount() {
            return amount;
        }

        /**
         * 设置：销售数量
         */
        public void setAmount(String amount) {
            this.amount=amount;
        }
    
        /**
         * 获取：真实销售金额
         */
        public BigDecimal getRealPrice() {
            return realPrice;
        }

        /**
         * 设置：真实销售金额
         */
        public void setRealPrice(BigDecimal realPrice) {
            this.realPrice=realPrice;
        }
    
        /**
         * 获取：产品ID
         */
        public String getProdId() {
            return prodId;
        }

        /**
         * 设置：产品ID
         */
        public void setProdId(String prodId) {
            this.prodId=prodId;
        }
    
        /**
         * 获取：产品建议售价
         */
        public BigDecimal getProdPrice() {
            return prodPrice;
        }

        /**
         * 设置：产品建议售价
         */
        public void setProdPrice(BigDecimal prodPrice) {
            this.prodPrice=prodPrice;
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
