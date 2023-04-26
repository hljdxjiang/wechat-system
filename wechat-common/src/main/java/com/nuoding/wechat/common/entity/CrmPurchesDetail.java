package com.nuoding.wechat.common.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 进货详情表(CrmPurchesDetail)实体类
 *
 * @author jhc
 * @since 2023-03-07 14:38:40
 */
public class CrmPurchesDetail implements Serializable {
    private static final long serialVersionUID = -38356050638770485L;

    private Integer id;
    /**
     * 租户ID
     */
    private String tenantId;
    /**
     * 品牌
     */
    private String brandId;
    /**
     * 批次ID
     */
    private String batchId;
    /**
     * 产品ID
     */
    private String prodId;
    /**
     * 进货数量
     */
    private Integer amount;
    /**
     * 进货进货单价
     */
    private Integer prodPrice;
    /**
     * 用户备注
     */
    private String remark;
    /**
     * 创建时间
     */
    private Date createTime;


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

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(Integer prodPrice) {
        this.prodPrice = prodPrice;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}

