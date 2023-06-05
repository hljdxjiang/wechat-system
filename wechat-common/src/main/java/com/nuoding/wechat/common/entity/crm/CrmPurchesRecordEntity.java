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
 * 进货记录表
 *
 * @Author: hzq
 * @Date: 2023-06-05 17:49:47
 */
@Entity
@Table(name = "crm_purches_record")
public class CrmPurchesRecordEntity implements Serializable {

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
             * 品牌
             */
                    @Column(name = "brand_id")
                    private String brandId;
                    
            /**
             * 进货数量
             */
                    @Column(name = "amount")
                    private String amount;
                    
            /**
             * 到货日期
             */
                        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
                    @Column(name = "arrival_time")
                    private Date arrivalTime;
                    
            /**
             * 下单日期
             */
                        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
                    @Column(name = "order_time")
                    private Date orderTime;
                    
            /**
             * 订单费用
             */
                    @Column(name = "spend")
                    private BigDecimal spend;
                    
            /**
             * 邮费
             */
                    @Column(name = "postage")
                    private BigDecimal postage;
                    
            /**
             * 邮件单号
             */
                    @Column(name = "trace_code")
                    private String traceCode;
                    
            /**
             * 其他费用
             */
                    @Column(name = "other_cost")
                    private BigDecimal otherCost;
                    
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
         * 获取：品牌
         */
        public String getBrandId() {
            return brandId;
        }

        /**
         * 设置：品牌
         */
        public void setBrandId(String brandId) {
            this.brandId=brandId;
        }
    
        /**
         * 获取：进货数量
         */
        public String getAmount() {
            return amount;
        }

        /**
         * 设置：进货数量
         */
        public void setAmount(String amount) {
            this.amount=amount;
        }
    
        /**
         * 获取：到货日期
         */
        public Date getArrivalTime() {
            return arrivalTime;
        }

        /**
         * 设置：到货日期
         */
        public void setArrivalTime(Date arrivalTime) {
            this.arrivalTime=arrivalTime;
        }
    
        /**
         * 获取：下单日期
         */
        public Date getOrderTime() {
            return orderTime;
        }

        /**
         * 设置：下单日期
         */
        public void setOrderTime(Date orderTime) {
            this.orderTime=orderTime;
        }
    
        /**
         * 获取：订单费用
         */
        public BigDecimal getSpend() {
            return spend;
        }

        /**
         * 设置：订单费用
         */
        public void setSpend(BigDecimal spend) {
            this.spend=spend;
        }
    
        /**
         * 获取：邮费
         */
        public BigDecimal getPostage() {
            return postage;
        }

        /**
         * 设置：邮费
         */
        public void setPostage(BigDecimal postage) {
            this.postage=postage;
        }
    
        /**
         * 获取：邮件单号
         */
        public String getTraceCode() {
            return traceCode;
        }

        /**
         * 设置：邮件单号
         */
        public void setTraceCode(String traceCode) {
            this.traceCode=traceCode;
        }
    
        /**
         * 获取：其他费用
         */
        public BigDecimal getOtherCost() {
            return otherCost;
        }

        /**
         * 设置：其他费用
         */
        public void setOtherCost(BigDecimal otherCost) {
            this.otherCost=otherCost;
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
