package com.nuoding.wechat.common.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 优惠券领取信息表(MarketUserCouponInfo)实体类
 *
 * @author jhc
 * @since 2023-03-07 14:38:59
 */
public class MarketUserCouponInfo implements Serializable {
    private static final long serialVersionUID = 577739870064666272L;

    private Integer id;
    /**
     * 租户ID
     */
    private String tenantId;
    /**
     * 用户ID
     */
    private String userId;
    /**
     * 用户优惠券ID
     */
    private String userCouponId;
    /**
     * 优惠券编号
     */
    private String couponId;
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
     * 开始使用时间
     */
    private Date useVaildDate;
    /**
     * 使用时效时间
     */
    private Date useExpireDate;
    /**
     * 状态0可用1过期9使用
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserCouponId() {
        return userCouponId;
    }

    public void setUserCouponId(String userCouponId) {
        this.userCouponId = userCouponId;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
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

