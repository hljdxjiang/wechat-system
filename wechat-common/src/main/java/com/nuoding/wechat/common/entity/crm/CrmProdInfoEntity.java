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
 * 产品信息表
 *
 * @Author: hzq
 * @Date: 2023-12-18 14:57:37
 */
@Entity
@Table(name = "crm_prod_info")
public class CrmProdInfoEntity implements Serializable {

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
             * 产品编号
             */
                    @Column(name = "prod_id")
                    private String prodId;
                    
            /**
             * 品牌编号
             */
                    @Column(name = "brand_id")
                    private String brandId;
                    
            /**
             * 产品名称
             */
                    @Column(name = "prod_name")
                    private String prodName;
                    
            /**
             * 展示标题
             */
                    @Column(name = "prod_title")
                    private String prodTitle;
                    
            /**
             * 产品简介
             */
                    @Column(name = "prod_desc")
                    private String prodDesc;
                    
            /**
             * 产品详细介绍
             */
                    @Column(name = "prod_detail")
                    private String prodDetail;
                    
            /**
             * 产品类型
             */
                    @Column(name = "prod_type_id")
                    private String prodTypeId;
                    
            /**
             * 产品封面
             */
                    @Column(name = "prod_logo")
                    private String prodLogo;
                    
            /**
             * 产品进价
             */
                    @Column(name = "prod_bid")
                    private BigDecimal prodBid;
                    
            /**
             * 产品建议售价
             */
                    @Column(name = "prod_price")
                    private BigDecimal prodPrice;
                    
            /**
             * 产品建议库存
             */
                    @Column(name = "prod_amount")
                    private BigDecimal prodAmount;
                    
            /**
             * 产品最低库存
             */
                    @Column(name = "prod_limit")
                    private BigDecimal prodLimit;
                    
            /**
             * 产品型号
             */
                    @Column(name = "prod_module")
                    private String prodModule;
                    
            /**
             * 产品规格
             */
                    @Column(name = "prod_specs")
                    private String prodSpecs;
                    
            /**
             * 销售渠道
             */
                    @Column(name = "channel_no")
                    private String channelNo;
                    
            /**
             * 用户备注
             */
                    @Column(name = "remark")
                    private String remark;
                    
            /**
             * 状态0有效1失效
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
         * 获取：产品编号
         */
        public String getProdId() {
            return prodId;
        }

        /**
         * 设置：产品编号
         */
        public void setProdId(String prodId) {
            this.prodId=prodId;
        }
    
        /**
         * 获取：品牌编号
         */
        public String getBrandId() {
            return brandId;
        }

        /**
         * 设置：品牌编号
         */
        public void setBrandId(String brandId) {
            this.brandId=brandId;
        }
    
        /**
         * 获取：产品名称
         */
        public String getProdName() {
            return prodName;
        }

        /**
         * 设置：产品名称
         */
        public void setProdName(String prodName) {
            this.prodName=prodName;
        }
    
        /**
         * 获取：展示标题
         */
        public String getProdTitle() {
            return prodTitle;
        }

        /**
         * 设置：展示标题
         */
        public void setProdTitle(String prodTitle) {
            this.prodTitle=prodTitle;
        }
    
        /**
         * 获取：产品简介
         */
        public String getProdDesc() {
            return prodDesc;
        }

        /**
         * 设置：产品简介
         */
        public void setProdDesc(String prodDesc) {
            this.prodDesc=prodDesc;
        }
    
        /**
         * 获取：产品详细介绍
         */
        public String getProdDetail() {
            return prodDetail;
        }

        /**
         * 设置：产品详细介绍
         */
        public void setProdDetail(String prodDetail) {
            this.prodDetail=prodDetail;
        }
    
        /**
         * 获取：产品类型
         */
        public String getProdTypeId() {
            return prodTypeId;
        }

        /**
         * 设置：产品类型
         */
        public void setProdTypeId(String prodTypeId) {
            this.prodTypeId=prodTypeId;
        }
    
        /**
         * 获取：产品封面
         */
        public String getProdLogo() {
            return prodLogo;
        }

        /**
         * 设置：产品封面
         */
        public void setProdLogo(String prodLogo) {
            this.prodLogo=prodLogo;
        }
    
        /**
         * 获取：产品进价
         */
        public BigDecimal getProdBid() {
            return prodBid;
        }

        /**
         * 设置：产品进价
         */
        public void setProdBid(BigDecimal prodBid) {
            this.prodBid=prodBid;
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
         * 获取：产品建议库存
         */
        public BigDecimal getProdAmount() {
            return prodAmount;
        }

        /**
         * 设置：产品建议库存
         */
        public void setProdAmount(BigDecimal prodAmount) {
            this.prodAmount=prodAmount;
        }
    
        /**
         * 获取：产品最低库存
         */
        public BigDecimal getProdLimit() {
            return prodLimit;
        }

        /**
         * 设置：产品最低库存
         */
        public void setProdLimit(BigDecimal prodLimit) {
            this.prodLimit=prodLimit;
        }
    
        /**
         * 获取：产品型号
         */
        public String getProdModule() {
            return prodModule;
        }

        /**
         * 设置：产品型号
         */
        public void setProdModule(String prodModule) {
            this.prodModule=prodModule;
        }
    
        /**
         * 获取：产品规格
         */
        public String getProdSpecs() {
            return prodSpecs;
        }

        /**
         * 设置：产品规格
         */
        public void setProdSpecs(String prodSpecs) {
            this.prodSpecs=prodSpecs;
        }
    
        /**
         * 获取：销售渠道
         */
        public String getChannelNo() {
            return channelNo;
        }

        /**
         * 设置：销售渠道
         */
        public void setChannelNo(String channelNo) {
            this.channelNo=channelNo;
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
         * 获取：状态0有效1失效
         */
        public Integer getStatus() {
            return status;
        }

        /**
         * 设置：状态0有效1失效
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
