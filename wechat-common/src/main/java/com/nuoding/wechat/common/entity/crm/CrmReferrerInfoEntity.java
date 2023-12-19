package com.nuoding.wechat.common.entity.crm;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;


/**
 * 推荐人信息表
 *
 * @Author: hzq
 * @Date: 2023-12-18 14:57:38
 */
@Entity
@Table(name = "crm_referrer_info")
public class CrmReferrerInfoEntity implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */
    @Id
    @Column(length = 32)
    private Integer id;

    /**
     * 租户ID
     */
    @Column(name = "tenantid")
    private String tenantid;

    /**
     * 推荐人编号
     */
    @Column(name = "referrer_id")
    private String referrerId;

    /**
     * 推荐人证件号
     */
    @Column(name = "referrer_cert_no")
    private String referrerCertNo;

    /**
     * 推荐人证件类型
     */
    @Column(name = "referrer_cert_type")
    private String referrerCertType;

    /**
     * 推荐人姓名
     */
    @Column(name = "referrer_name")
    private String referrerName;

    /**
     * 推荐人邮箱
     */
    @Column(name = "referrer_email")
    private String referrerEmail;

    /**
     * 推荐人手机号
     */
    @Column(name = "mobile_no")
    private String mobileNo;

    /**
     * 推荐人卡号
     */
    @Column(name = "referrer_card_no")
    private String referrerCardNo;

    /**
     * 状态（0正常1停用）
     */
    @Column(name = "status")
    private String status;

    /**
     * 推荐人渠道编号
     */
    @Column(name = "channel_no")
    private String channelNo;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "createtime")
    private Date createtime;

    /**
     * 最后修改时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "lastmodifiedtime")
    private Date lastmodifiedtime;

    /**
     * 备注
     */
    @Column(name = "remark")
    private String remark;


    /**
     * 获取：主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置：主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取：租户ID
     */
    public String getTenantid() {
        return tenantid;
    }

    /**
     * 设置：租户ID
     */
    public void setTenantid(String tenantid) {
        this.tenantid = tenantid;
    }

    /**
     * 获取：推荐人编号
     */
    public String getReferrerId() {
        return referrerId;
    }

    /**
     * 设置：推荐人编号
     */
    public void setReferrerId(String referrerId) {
        this.referrerId = referrerId;
    }

    /**
     * 获取：推荐人证件号
     */
    public String getReferrerCertNo() {
        return referrerCertNo;
    }

    /**
     * 设置：推荐人证件号
     */
    public void setReferrerCertNo(String referrerCertNo) {
        this.referrerCertNo = referrerCertNo;
    }

    /**
     * 获取：推荐人证件类型
     */
    public String getReferrerCertType() {
        return referrerCertType;
    }

    /**
     * 设置：推荐人证件类型
     */
    public void setReferrerCertType(String referrerCertType) {
        this.referrerCertType = referrerCertType;
    }

    /**
     * 获取：推荐人姓名
     */
    public String getReferrerName() {
        return referrerName;
    }

    /**
     * 设置：推荐人姓名
     */
    public void setReferrerName(String referrerName) {
        this.referrerName = referrerName;
    }

    /**
     * 获取：推荐人邮箱
     */
    public String getReferrerEmail() {
        return referrerEmail;
    }

    /**
     * 设置：推荐人邮箱
     */
    public void setReferrerEmail(String referrerEmail) {
        this.referrerEmail = referrerEmail;
    }

    /**
     * 获取：推荐人手机号
     */
    public String getMobileNo() {
        return mobileNo;
    }

    /**
     * 设置：推荐人手机号
     */
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    /**
     * 获取：推荐人卡号
     */
    public String getReferrerCardNo() {
        return referrerCardNo;
    }

    /**
     * 设置：推荐人卡号
     */
    public void setReferrerCardNo(String referrerCardNo) {
        this.referrerCardNo = referrerCardNo;
    }

    /**
     * 获取：状态（0正常1停用）
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置：状态（0正常1停用）
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取：推荐人渠道编号
     */
    public String getChannelNo() {
        return channelNo;
    }

    /**
     * 设置：推荐人渠道编号
     */
    public void setChannelNo(String channelNo) {
        this.channelNo = channelNo;
    }

    /**
     * 获取：创建时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置：创建时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 获取：最后修改时间
     */
    public Date getLastmodifiedtime() {
        return lastmodifiedtime;
    }

    /**
     * 设置：最后修改时间
     */
    public void setLastmodifiedtime(Date lastmodifiedtime) {
        this.lastmodifiedtime = lastmodifiedtime;
    }

    /**
     * 获取：备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置：备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}
