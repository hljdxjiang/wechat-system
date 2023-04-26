package com.nuoding.wechat.common.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 销售记录表(CrmSaleRecord)实体类
 *
 * @author jhc
 * @since 2023-03-07 14:38:46
 */
public class CrmSaleRecord implements Serializable {
    private static final long serialVersionUID = -50793659246929904L;

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
     * 下单日期
     */
    private Double orderTime;
    /**
     * 订单费用
     */
    private Double spend;
    /**
     * 邮费
     */
    private Double postage;
    /**
     * 邮寄成本
     */
    private Double postageCost;
    /**
     * 邮件单号
     */
    private String traceCode;
    /**
     * 发货时间
     */
    private Date postDate;
    /**
     * 真实销售金额
     */
    private Double realPrice;
    /**
     * 用户备注
     */
    private String remark;
    /**
     * 用户状态
     */
    private Object status;
    /**
     * 渠道
     */
    private Object channelNo;
    /**
     * 推荐人编号
     */
    private Object referrerId;
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

    public Double getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Double orderTime) {
        this.orderTime = orderTime;
    }

    public Double getSpend() {
        return spend;
    }

    public void setSpend(Double spend) {
        this.spend = spend;
    }

    public Double getPostage() {
        return postage;
    }

    public void setPostage(Double postage) {
        this.postage = postage;
    }

    public Double getPostageCost() {
        return postageCost;
    }

    public void setPostageCost(Double postageCost) {
        this.postageCost = postageCost;
    }

    public String getTraceCode() {
        return traceCode;
    }

    public void setTraceCode(String traceCode) {
        this.traceCode = traceCode;
    }

    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }

    public Double getRealPrice() {
        return realPrice;
    }

    public void setRealPrice(Double realPrice) {
        this.realPrice = realPrice;
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

    public Object getChannelNo() {
        return channelNo;
    }

    public void setChannelNo(Object channelNo) {
        this.channelNo = channelNo;
    }

    public Object getReferrerId() {
        return referrerId;
    }

    public void setReferrerId(Object referrerId) {
        this.referrerId = referrerId;
    }
}

