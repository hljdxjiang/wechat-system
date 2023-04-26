package com.nuoding.wechat.common.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 客户信息表(UserRegInfo)实体类
 *
 * @author jhc
 * @since 2023-03-07 14:39:13
 */
public class UserRegInfo implements Serializable {
    private static final long serialVersionUID = -60461567319067756L;

    private Integer id;
    /**
     * 租户ID
     */
    private String tenantId;

    private String userId;
    /**
     * 客户手机号
     */
    private String mobileNo;
    /**
     * 证件类型
     */
    private String idType;
    /**
     * 证件号
     */
    private String idNo;
    /**
     * 证件生效日期
     */
    private String validDate;
    /**
     * 证件失效日期
     */
    private String expiredDate;
    /**
     * 发证机构
     */
    private String issueAuthority;
    /**
     * 姓名
     */
    private String userName;
    /**
     * 性别
     */
    private String gender;
    /**
     * 生日
     */
    private String birthDate;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 密码
     */
    private String tranPwd;
    /**
     * 客户经理
     */
    private String saverId;
    /**
     * 渠道编号
     */
    private String sourcePlatform;
    /**
     * 推荐人
     */
    private String referee;
    /**
     * 地址
     */
    private String address;
    /**
     * 职业
     */
    private String occupation;
    /**
     * 注册来源
     */
    private String regSource;
    /**
     * 证件照片地址正面id
     */
    private String idPathFace;
    /**
     * 证件照片地址背面id
     */
    private String idPathEmblem;
    /**
     * 证件照片地址手持id
     */
    private String idPathHand;
    /**
     * 开户地区编码
     */
    private String distCode;
    /**
     * 用户IP
     */
    private String userIp;
    /**
     * 交易密码设置时间
     */
    private Date setTranPwdTime;
    /**
     * 最后登录设备ID
     */
    private String deviceId;
    /**
     * 登录密码
     */
    private String loginPwd;
    /**
     * 手势密码
     */
    private String gesturePwd;
    /**
     * 人脸/指纹密码
     */
    private String faceIdPwd;
    /**
     * 用户状态
     */
    private String status;
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

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getValidDate() {
        return validDate;
    }

    public void setValidDate(String validDate) {
        this.validDate = validDate;
    }

    public String getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(String expiredDate) {
        this.expiredDate = expiredDate;
    }

    public String getIssueAuthority() {
        return issueAuthority;
    }

    public void setIssueAuthority(String issueAuthority) {
        this.issueAuthority = issueAuthority;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTranPwd() {
        return tranPwd;
    }

    public void setTranPwd(String tranPwd) {
        this.tranPwd = tranPwd;
    }

    public String getSaverId() {
        return saverId;
    }

    public void setSaverId(String saverId) {
        this.saverId = saverId;
    }

    public String getSourcePlatform() {
        return sourcePlatform;
    }

    public void setSourcePlatform(String sourcePlatform) {
        this.sourcePlatform = sourcePlatform;
    }

    public String getReferee() {
        return referee;
    }

    public void setReferee(String referee) {
        this.referee = referee;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getRegSource() {
        return regSource;
    }

    public void setRegSource(String regSource) {
        this.regSource = regSource;
    }

    public String getIdPathFace() {
        return idPathFace;
    }

    public void setIdPathFace(String idPathFace) {
        this.idPathFace = idPathFace;
    }

    public String getIdPathEmblem() {
        return idPathEmblem;
    }

    public void setIdPathEmblem(String idPathEmblem) {
        this.idPathEmblem = idPathEmblem;
    }

    public String getIdPathHand() {
        return idPathHand;
    }

    public void setIdPathHand(String idPathHand) {
        this.idPathHand = idPathHand;
    }

    public String getDistCode() {
        return distCode;
    }

    public void setDistCode(String distCode) {
        this.distCode = distCode;
    }

    public String getUserIp() {
        return userIp;
    }

    public void setUserIp(String userIp) {
        this.userIp = userIp;
    }

    public Date getSetTranPwdTime() {
        return setTranPwdTime;
    }

    public void setSetTranPwdTime(Date setTranPwdTime) {
        this.setTranPwdTime = setTranPwdTime;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public String getGesturePwd() {
        return gesturePwd;
    }

    public void setGesturePwd(String gesturePwd) {
        this.gesturePwd = gesturePwd;
    }

    public String getFaceIdPwd() {
        return faceIdPwd;
    }

    public void setFaceIdPwd(String faceIdPwd) {
        this.faceIdPwd = faceIdPwd;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
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

