package com.nuoding.wechat.common.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (CrmReferrerInfo)实体类
 *
 * @author makejava
 * @since 2023-04-27 11:20:26
 */
public class CrmReferrerInfo implements Serializable {
    private static final long serialVersionUID = -69686624340440785L;
    /**
     * 主键
     */
    private Integer id;
    /**
     * 租户ID
     */
    private String tenantid;
    /**
     * 推荐人编号
     */
    private String referrerId;
    /**
     * 推荐人证件号
     */
    private String referrerCertNo;
    /**
     * 推荐人证件类型
     */
    private String referrerCertType;
    /**
     * 推荐人姓名
     */
    private String referrerName;
    /**
     * 推荐人邮箱
     */
    private String referrerEmail;
    /**
     * 推荐人手机号
     */
    private String mobileNo;
    /**
     * 推荐人卡号
     */
    private String referrerCardNo;
    /**
     * 状态（0正常 1停用）
     */
    private String status;
    /**
     * 推荐人渠道编号
     */
    private String channelNo;
    /**
     * 创建时间
     */
    private Date createtime;
    /**
     * 最后修改时间
     */
    private Date lastmodifiedtime;
    /**
     * 备注
     */
    private String remark;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenantid() {
        return tenantid;
    }

    public void setTenantid(String tenantid) {
        this.tenantid = tenantid;
    }

    public String getReferrerId() {
        return referrerId;
    }

    public void setReferrerId(String referrerId) {
        this.referrerId = referrerId;
    }

    public String getReferrerCertNo() {
        return referrerCertNo;
    }

    public void setReferrerCertNo(String referrerCertNo) {
        this.referrerCertNo = referrerCertNo;
    }

    public String getReferrerCertType() {
        return referrerCertType;
    }

    public void setReferrerCertType(String referrerCertType) {
        this.referrerCertType = referrerCertType;
    }

    public String getReferrerName() {
        return referrerName;
    }

    public void setReferrerName(String referrerName) {
        this.referrerName = referrerName;
    }

    public String getReferrerEmail() {
        return referrerEmail;
    }

    public void setReferrerEmail(String referrerEmail) {
        this.referrerEmail = referrerEmail;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getReferrerCardNo() {
        return referrerCardNo;
    }

    public void setReferrerCardNo(String referrerCardNo) {
        this.referrerCardNo = referrerCardNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getChannelNo() {
        return channelNo;
    }

    public void setChannelNo(String channelNo) {
        this.channelNo = channelNo;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}

