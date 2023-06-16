package com.nuoding.wechat.common.entity.mall;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;


/**
 * 优惠券领取信息表
 *
 * @Author: hzq
 * @Date: 2023-06-08 17:37:05
 */
@Entity
@Table(name = "mall_user_coupon_info")
public class MallUserCouponInfoEntity implements Serializable {

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
     * 用户ID
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 用户优惠券ID
     */
    @Column(name = "user_coupon_id")
    private String userCouponId;

    /**
     * 优惠券编号
     */
    @Column(name = "coupon_id")
    private String couponId;

    /**
     * 优惠券类型
     */
    @Column(name = "coupon_type")
    private String couponType;

    /**
     * 优惠方式
     */
    @Column(name = "coupon_method")
    private String couponMethod;

    /**
     * 优惠比例
     */
    @Column(name = "coupon_amount")
    private String couponAmount;

    /**
     * 开始使用时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "use_vaild_date")
    private Date useVaildDate;

    /**
     * 使用时效时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "use_expire_date")
    private Date useExpireDate;

    /**
     * 状态0可用1过期9使用
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
     * 使用关联类型
     */
    @Column(name = "relate_type")
    private String relateType;

    /**
     * 关联订单ID
     */
    @Column(name = "relate_id")
    private String relateId;

    /**
     * 优惠券获取途径
     */
    @Column(name = "access")
    private String access;


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
     * 获取：用户ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置：用户ID
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取：用户优惠券ID
     */
    public String getUserCouponId() {
        return userCouponId;
    }

    /**
     * 设置：用户优惠券ID
     */
    public void setUserCouponId(String userCouponId) {
        this.userCouponId = userCouponId;
    }

    /**
     * 获取：优惠券编号
     */
    public String getCouponId() {
        return couponId;
    }

    /**
     * 设置：优惠券编号
     */
    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    /**
     * 获取：优惠券类型
     */
    public String getCouponType() {
        return couponType;
    }

    /**
     * 设置：优惠券类型
     */
    public void setCouponType(String couponType) {
        this.couponType = couponType;
    }

    /**
     * 获取：优惠方式
     */
    public String getCouponMethod() {
        return couponMethod;
    }

    /**
     * 设置：优惠方式
     */
    public void setCouponMethod(String couponMethod) {
        this.couponMethod = couponMethod;
    }

    /**
     * 获取：优惠比例
     */
    public String getCouponAmount() {
        return couponAmount;
    }

    /**
     * 设置：优惠比例
     */
    public void setCouponAmount(String couponAmount) {
        this.couponAmount = couponAmount;
    }

    /**
     * 获取：开始使用时间
     */
    public Date getUseVaildDate() {
        return useVaildDate;
    }

    /**
     * 设置：开始使用时间
     */
    public void setUseVaildDate(Date useVaildDate) {
        this.useVaildDate = useVaildDate;
    }

    /**
     * 获取：使用时效时间
     */
    public Date getUseExpireDate() {
        return useExpireDate;
    }

    /**
     * 设置：使用时效时间
     */
    public void setUseExpireDate(Date useExpireDate) {
        this.useExpireDate = useExpireDate;
    }

    /**
     * 获取：状态0可用1过期9使用
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置：状态0可用1过期9使用
     */
    public void setStatus(Integer status) {
        this.status = status;
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
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * 获取：使用关联类型
     */
    public String getRelateType() {
        return relateType;
    }

    /**
     * 设置：使用关联类型
     */
    public void setRelateType(String relateType) {
        this.relateType = relateType;
    }

    /**
     * 获取：关联订单ID
     */
    public String getRelateId() {
        return relateId;
    }

    /**
     * 设置：关联订单ID
     */
    public void setRelateId(String relateId) {
        this.relateId = relateId;
    }

    /**
     * 获取：优惠券获取途径
     */
    public String getAccess() {
        return access;
    }

    /**
     * 设置：优惠券获取途径
     */
    public void setAccess(String access) {
        this.access = access;
    }
}
