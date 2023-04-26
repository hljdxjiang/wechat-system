package com.nuoding.wechat.common.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 优惠券信息表(MarketCouponInfo)实体类
 *
 * @author jhc
 * @since 2023-03-07 14:38:54
 */
public class MarketCouponInfo implements Serializable {
    private static final long serialVersionUID = 968948382071476962L;

    private Integer id;
    /**
     * 租户ID
     */
    private String tenantId;
    /**
     * 优惠券编号
     */
    private String couponId;
    /**
     * 优惠券名称
     */
    private String couponName;
    /**
     * 优惠券详情
     */
    private String couponDesc;
    /**
     * 优惠券类型
     */
    private String couponType;
    /**
     * 优惠方式
     */
    private String couponMethod;
    /**
     * 优惠比例
     */
    private String couponAmount;
    /**
     * 优惠券控制类型：白名单LOCAL，全部ALL
     */
    private String controlType;
    /**
     * 发放方式：手动,自动,人工
     */
    private String grantType;
    /**
     * 发放范围：ALL,VIP,白名单(LOCAL)
     */
    private String grantScope;
    /**
     * 开始领取时间
     */
    private Date vaildDate;
    /**
     * 领取失效日期
     */
    private Date expireDate;
    /**
     * 有效时间范围
     */
    private String vaildDays;
    /**
     * 开始使用时间
     */
    private Date useVaildDate;
    /**
     * 使用时效时间
     */
    private Date useExpireDate;
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

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }

    public String getCouponDesc() {
        return couponDesc;
    }

    public void setCouponDesc(String couponDesc) {
        this.couponDesc = couponDesc;
    }

    public String getCouponType() {
        return couponType;
    }

    public void setCouponType(String couponType) {
        this.couponType = couponType;
    }

    public String getCouponMethod() {
        return couponMethod;
    }

    public void setCouponMethod(String couponMethod) {
        this.couponMethod = couponMethod;
    }

    public String getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(String couponAmount) {
        this.couponAmount = couponAmount;
    }

    public String getControlType() {
        return controlType;
    }

    public void setControlType(String controlType) {
        this.controlType = controlType;
    }

    public String getGrantType() {
        return grantType;
    }

    public void setGrantType(String grantType) {
        this.grantType = grantType;
    }

    public String getGrantScope() {
        return grantScope;
    }

    public void setGrantScope(String grantScope) {
        this.grantScope = grantScope;
    }

    public Date getVaildDate() {
        return vaildDate;
    }

    public void setVaildDate(Date vaildDate) {
        this.vaildDate = vaildDate;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public String getVaildDays() {
        return vaildDays;
    }

    public void setVaildDays(String vaildDays) {
        this.vaildDays = vaildDays;
    }

    public Date getUseVaildDate() {
        return useVaildDate;
    }

    public void setUseVaildDate(Date useVaildDate) {
        this.useVaildDate = useVaildDate;
    }

    public Date getUseExpireDate() {
        return useExpireDate;
    }

    public void setUseExpireDate(Date useExpireDate) {
        this.useExpireDate = useExpireDate;
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

