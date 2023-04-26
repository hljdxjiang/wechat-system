package com.nuoding.wechat.common.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (SysTenantInfo)实体类
 *
 * @author jhc
 * @since 2023-04-21 15:15:10
 */
public class SysTenantInfo implements Serializable {
    private static final long serialVersionUID = -51256338504372190L;

    private Integer id;
    /**
     * 租户ID
     */
    private String tenantId;
    /**
     * 租户名称
     */
    private String tenantName;
    /**
     * 租户描述
     */
    private String tenantDesc;
    /**
     * 注册日期
     */
    private Date registerTime;
    /**
     * 注册手机号
     */
    private String mobileNo;
    /**
     * 会员等级
     */
    private String vipLevel;
    /**
     * 会员过期日期
     */
    private Date vipExpireDay;
    /**
     * 绑定卡号
     */
    private String tenantCardNo;
    /**
     * 状态（0正常 1停用）
     */
    private String status;
    /**
     * 备注
     */
    private String remark;
    /**
     * 创建时间
     */
    private Date createtime;
    /**
     * 最后修改时间
     */
    private Date lastmodifiedtime;
    /**
     * 页面角标图片
     */
    private String tenantFavicon;
    /**
     * 租户logo
     */
    private String tenantLogo;
    /**
     * 租户邮箱
     */
    private String email;


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

    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public String getTenantDesc() {
        return tenantDesc;
    }

    public void setTenantDesc(String tenantDesc) {
        this.tenantDesc = tenantDesc;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getVipLevel() {
        return vipLevel;
    }

    public void setVipLevel(String vipLevel) {
        this.vipLevel = vipLevel;
    }

    public Date getVipExpireDay() {
        return vipExpireDay;
    }

    public void setVipExpireDay(Date vipExpireDay) {
        this.vipExpireDay = vipExpireDay;
    }

    public String getTenantCardNo() {
        return tenantCardNo;
    }

    public void setTenantCardNo(String tenantCardNo) {
        this.tenantCardNo = tenantCardNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getLastmodifiedtime() {
        return lastmodifiedtime;
    }

    public void setLastmodifiedtime(Date lastmodifiedtime) {
        this.lastmodifiedtime = lastmodifiedtime;
    }

    public String getTenantFavicon() {
        return tenantFavicon;
    }

    public void setTenantFavicon(String tenantFavicon) {
        this.tenantFavicon = tenantFavicon;
    }

    public String getTenantLogo() {
        return tenantLogo;
    }

    public void setTenantLogo(String tenantLogo) {
        this.tenantLogo = tenantLogo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}

