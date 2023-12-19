package com.nuoding.wechat.common.entity.crm;

import java.io.Serializable;
import java.math.BigDecimal;


/**
 * 产品信息 输出实体
 *
 * @Author: hzq
 * @Date: 2023-06-08 17:37:05
 */
public class CrmProdInfoOutEntity implements Serializable {

    private static final long serialVersionUID = 1L;

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
     * 产品封面
     */
    private String prodLogo;

    /**
     * 产品建议售价
     */
    private BigDecimal prodPrice;
    /**
     * 产品型号
     */
    private String prodModule;

    /**
     * 产品规格
     */
    private String prodSpecs;

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
        this.prodId = prodId;
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
        this.brandId = brandId;
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
        this.prodName = prodName;
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
        this.prodTitle = prodTitle;
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
        this.prodDesc = prodDesc;
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
        this.prodDetail = prodDetail;
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
        this.prodLogo = prodLogo;
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
        this.prodPrice = prodPrice;
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
        this.prodModule = prodModule;
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
        this.prodSpecs = prodSpecs;
    }
}
