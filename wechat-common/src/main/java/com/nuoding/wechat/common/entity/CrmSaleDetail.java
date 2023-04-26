package com.nuoding.wechat.common.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 销售记录表(CrmSaleDetail)实体类
 *
 * @author jhc
 * @since 2023-03-07 14:38:42
 */
public class CrmSaleDetail implements Serializable {
    private static final long serialVersionUID = -86455436278249554L;

    private Integer id;
    /**
     * 租户ID
     */
    private String tenantId;
    /**
     * 批次ID
     */
    private Integer batchId;
    /**
     * 销售数量
     */
    private String amount;
    /**
     * 真实销售金额
     */
    private Double realPrice;
    /**
     * 产品ID
     */
    private String prodId;
    /**
     * 产品建议售价
     */
    private Double prodPrice;
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

    public Integer getBatchId() {
        return batchId;
    }

    public void setBatchId(Integer batchId) {
        this.batchId = batchId;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Double getRealPrice() {
        return realPrice;
    }

    public void setRealPrice(Double realPrice) {
        this.realPrice = realPrice;
    }

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public Double getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(Double prodPrice) {
        this.prodPrice = prodPrice;
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

