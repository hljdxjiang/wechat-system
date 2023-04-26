package com.nuoding.wechat.common.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (CrmReferrerInfo)实体类
 *
 * @author jhc
 * @since 2023-04-11 16:30:20
 */
public class CrmReferrerInfo implements Serializable {
    private static final long serialVersionUID = 885317873128423210L;
    /**
     * 主键
     */
    private Integer id;
    /**
     * 推荐人编号
     */
    private String referrerId;
    /**
     * 推荐人姓名
     */
    private String referrerName;
    /**
     * 推荐人证件号
     */
    private String referrerCertNo;
    /**
     * 推荐人证件类型
     */
    private String referrerCertType;
    /**
     * 推荐人手机号
     */
    private String mobileNo;
    /**
     * 推荐人邮箱
     */
    private String referrerEmail;
    /**
     * 推荐人渠道编号
     */
    private String channelNo;
    /**
     * 推荐人卡号
     */
    private String referrerCardNo;
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


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReferrerId() {
        return referrerId;
    }

    public void setReferrerId(String referrerId) {
        this.referrerId = referrerId;
    }

    public String getReferrerName() {
        return referrerName;
    }

    public void setReferrerName(String referrerName) {
        this.referrerName = referrerName;
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

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getReferrerEmail() {
        return referrerEmail;
    }

    public void setReferrerEmail(String referrerEmail) {
        this.referrerEmail = referrerEmail;
    }

    public String getChannelNo() {
        return channelNo;
    }

    public void setChannelNo(String channelNo) {
        this.channelNo = channelNo;
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

}

