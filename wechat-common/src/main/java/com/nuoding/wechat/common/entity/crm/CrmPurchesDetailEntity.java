package com.nuoding.wechat.common.entity.crm;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;


/**
 * 进货详情表
 *
 * @Author: hzq
 * @Date: 2023-06-08 17:37:05
 */
@Entity
@Table(name = "crm_purches_detail")
public class CrmPurchesDetailEntity implements Serializable {

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
     * 品牌
     */
    @Column(name = "brand_id")
    private String brandId;

    /**
     * 批次ID
     */
    @Column(name = "batch_id")
    private String batchId;

    /**
     * 产品ID
     */
    @Column(name = "prod_id")
    private String prodId;

    /**
     * 进货数量
     */
    @Column(name = "amount")
    private Integer amount;

    /**
     * 进货进货单价
     */
    @Column(name = "prod_price")
    private Integer prodPrice;

    /**
     * 用户备注
     */
    @Column(name = "remark")
    private String remark;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "create_time")
    private Date createTime;


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
        this.id = id;
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
        this.tenantId = tenantId;
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
        this.brandId = brandId;
    }

    /**
     * 获取：批次ID
     */
    public String getBatchId() {
        return batchId;
    }

    /**
     * 设置：批次ID
     */
    public void setBatchId(String batchId) {
        this.batchId = batchId;
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
        this.prodId = prodId;
    }

    /**
     * 获取：进货数量
     */
    public Integer getAmount() {
        return amount;
    }

    /**
     * 设置：进货数量
     */
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * 获取：进货进货单价
     */
    public Integer getProdPrice() {
        return prodPrice;
    }

    /**
     * 设置：进货进货单价
     */
    public void setProdPrice(Integer prodPrice) {
        this.prodPrice = prodPrice;
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
        this.remark = remark;
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
        this.createTime = createTime;
    }
}
