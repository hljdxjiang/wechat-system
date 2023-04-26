package com.nuoding.wechat.common.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (CrmProdInfo)实体类
 *
 * @author jhc
 * @since 2023-03-07 14:38:38
 */
public class CrmProdInfo implements Serializable {
    private static final long serialVersionUID = 366664873101989308L;

    private Integer id;
    /**
     * 租户ID
     */
    private String tenantId;
    /**
     * 产品编号
     */
    private String prodId;
    /**
     * 品牌编号
     */
    private String brandId;
    /**
     * 产品名称
     */
    private String prodName;
    /**
     * 展示标题
     */
    private String prodTitle;
    /**
     * 产品简介
     */
    private String prodDesc;
    /**
     * 产品详细介绍
     */
    private String prodDetail;
    /**
     * 产品类型
     */
    private String prodTypeId;
    /**
     * 产品封面
     */
    private String prodLogo;
    /**
     * 产品进价
     */
    private Double prodBid;
    /**
     * 产品建议售价
     */
    private Double prodPrice;
    /**
     * 产品建议库存
     */
    private Double prodAmount;
    /**
     * 产品最低库存
     */
    private Double prodLimit;
    /**
     * 产品型号
     */
    private String prodModule;
    /**
     * 产品规格
     */
    private String prodSpecs;
    /**
     * 用户备注
     */
    private String remark;
    /**
     * 用户状态
     */
    private Object status;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 最后修改时间
     */
    private Date lastModifiedTime;


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

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getProdTitle() {
        return prodTitle;
    }

    public void setProdTitle(String prodTitle) {
        this.prodTitle = prodTitle;
    }

    public String getProdDesc() {
        return prodDesc;
    }

    public void setProdDesc(String prodDesc) {
        this.prodDesc = prodDesc;
    }

    public String getProdDetail() {
        return prodDetail;
    }

    public void setProdDetail(String prodDetail) {
        this.prodDetail = prodDetail;
    }

    public String getProdTypeId() {
        return prodTypeId;
    }

    public void setProdTypeId(String prodTypeId) {
        this.prodTypeId = prodTypeId;
    }

    public String getProdLogo() {
        return prodLogo;
    }

    public void setProdLogo(String prodLogo) {
        this.prodLogo = prodLogo;
    }

    public Double getProdBid() {
        return prodBid;
    }

    public void setProdBid(Double prodBid) {
        this.prodBid = prodBid;
    }

    public Double getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(Double prodPrice) {
        this.prodPrice = prodPrice;
    }

    public Double getProdAmount() {
        return prodAmount;
    }

    public void setProdAmount(Double prodAmount) {
        this.prodAmount = prodAmount;
    }

    public Double getProdLimit() {
        return prodLimit;
    }

    public void setProdLimit(Double prodLimit) {
        this.prodLimit = prodLimit;
    }

    public String getProdModule() {
        return prodModule;
    }

    public void setProdModule(String prodModule) {
        this.prodModule = prodModule;
    }

    public String getProdSpecs() {
        return prodSpecs;
    }

    public void setProdSpecs(String prodSpecs) {
        this.prodSpecs = prodSpecs;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Object getStatus() {
        return status;
    }

    public void setStatus(Object status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

}

