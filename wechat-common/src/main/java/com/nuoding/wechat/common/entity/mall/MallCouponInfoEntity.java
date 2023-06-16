package com.nuoding.wechat.common.entity.mall;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;


/**
 * 优惠券信息表
 *
 * @Author: hzq
 * @Date: 2023-06-08 17:37:05
 */
@Entity
@Table(name = "mall_coupon_info")
public class MallCouponInfoEntity implements Serializable {

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
     * 优惠券编号
     */
    @Column(name = "coupon_id")
    private String couponId;

    /**
     * 优惠券名称
     */
    @Column(name = "coupon_name")
    private String couponName;

    /**
     * 优惠券详情
     */
    @Column(name = "coupon_desc")
    private String couponDesc;

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
     * 优惠券控制类型：白名单LOCAL，全部ALL
     */
    @Column(name = "control_type")
    private String controlType;

    /**
     * 发放方式：手动,自动,人工
     */
    @Column(name = "grant_type")
    private String grantType;

    /**
     * 发放范围：ALL,VIP,白名单(LOCAL)
     */
    @Column(name = "grant_scope")
    private String grantScope;

    /**
     * 开始领取时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "vaild_date")
    private Date vaildDate;

    /**
     * 领取失效日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "expire_date")
    private Date expireDate;

    /**
     * 有效时间范围
     */
    @Column(name = "vaild_days")
    private String vaildDays;

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
     * 用户状态
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
     * 获取：优惠券名称
     */
    public String getCouponName() {
        return couponName;
    }

    /**
     * 设置：优惠券名称
     */
    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }

    /**
     * 获取：优惠券详情
     */
    public String getCouponDesc() {
        return couponDesc;
    }

    /**
     * 设置：优惠券详情
     */
    public void setCouponDesc(String couponDesc) {
        this.couponDesc = couponDesc;
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
     * 获取：优惠券控制类型：白名单LOCAL，全部ALL
     */
    public String getControlType() {
        return controlType;
    }

    /**
     * 设置：优惠券控制类型：白名单LOCAL，全部ALL
     */
    public void setControlType(String controlType) {
        this.controlType = controlType;
    }

    /**
     * 获取：发放方式：手动,自动,人工
     */
    public String getGrantType() {
        return grantType;
    }

    /**
     * 设置：发放方式：手动,自动,人工
     */
    public void setGrantType(String grantType) {
        this.grantType = grantType;
    }

    /**
     * 获取：发放范围：ALL,VIP,白名单(LOCAL)
     */
    public String getGrantScope() {
        return grantScope;
    }

    /**
     * 设置：发放范围：ALL,VIP,白名单(LOCAL)
     */
    public void setGrantScope(String grantScope) {
        this.grantScope = grantScope;
    }

    /**
     * 获取：开始领取时间
     */
    public Date getVaildDate() {
        return vaildDate;
    }

    /**
     * 设置：开始领取时间
     */
    public void setVaildDate(Date vaildDate) {
        this.vaildDate = vaildDate;
    }

    /**
     * 获取：领取失效日期
     */
    public Date getExpireDate() {
        return expireDate;
    }

    /**
     * 设置：领取失效日期
     */
    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    /**
     * 获取：有效时间范围
     */
    public String getVaildDays() {
        return vaildDays;
    }

    /**
     * 设置：有效时间范围
     */
    public void setVaildDays(String vaildDays) {
        this.vaildDays = vaildDays;
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
     * 获取：用户状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置：用户状态
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
}
