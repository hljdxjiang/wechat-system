package com.nuoding.wechat.common.entity.user;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.math.BigDecimal;


/**
 * 客户信息表
 *
 * @Author: hzq
 * @Date: 2023-06-05 17:49:46
 */
@Entity
@Table(name = "user_reg_info")
public class UserRegInfoEntity implements Serializable {

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
             * 
             */
                    @Column(name = "user_id")
                    private String userId;
                    
            /**
             * 客户手机号
             */
                    @Column(name = "mobile_no")
                    private String mobileNo;
                    
            /**
             * 证件类型
             */
                    @Column(name = "id_type")
                    private String idType;
                    
            /**
             * 证件号
             */
                    @Column(name = "id_no")
                    private String idNo;
                    
            /**
             * 证件生效日期
             */
                    @Column(name = "valid_date")
                    private String validDate;
                    
            /**
             * 证件失效日期
             */
                    @Column(name = "expired_date")
                    private String expiredDate;
                    
            /**
             * 发证机构
             */
                    @Column(name = "issue_authority")
                    private String issueAuthority;
                    
            /**
             * 姓名
             */
                    @Column(name = "user_name")
                    private String userName;
                    
            /**
             * 性别
             */
                    @Column(name = "gender")
                    private String gender;
                    
            /**
             * 生日
             */
                    @Column(name = "birth_date")
                    private String birthDate;
                    
            /**
             * 邮箱
             */
                    @Column(name = "email")
                    private String email;
                    
            /**
             * 密码
             */
                    @Column(name = "tran_pwd")
                    private String tranPwd;
                    
            /**
             * 客户经理
             */
                    @Column(name = "saver_id")
                    private String saverId;
                    
            /**
             * 渠道编号
             */
                    @Column(name = "source_platform")
                    private String sourcePlatform;
                    
            /**
             * 推荐人
             */
                    @Column(name = "referee")
                    private String referee;
                    
            /**
             * 地址
             */
                    @Column(name = "address")
                    private String address;
                    
            /**
             * 职业
             */
                    @Column(name = "occupation")
                    private String occupation;
                    
            /**
             * 注册来源
             */
                    @Column(name = "reg_source")
                    private String regSource;
                    
            /**
             * 证件照片地址正面id
             */
                    @Column(name = "id_path_face")
                    private String idPathFace;
                    
            /**
             * 证件照片地址背面id
             */
                    @Column(name = "id_path_emblem")
                    private String idPathEmblem;
                    
            /**
             * 证件照片地址手持id
             */
                    @Column(name = "id_path_hand")
                    private String idPathHand;
                    
            /**
             * 开户地区编码
             */
                    @Column(name = "dist_code")
                    private String distCode;
                    
            /**
             * 用户IP
             */
                    @Column(name = "user_ip")
                    private String userIp;
                    
            /**
             * 交易密码设置时间 
             */
                        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
                    @Column(name = "set_tran_pwd_time")
                    private Date setTranPwdTime;
                    
            /**
             * 最后登录设备ID
             */
                    @Column(name = "device_id")
                    private String deviceId;
                    
            /**
             * 登录密码
             */
                    @Column(name = "login_pwd")
                    private String loginPwd;
                    
            /**
             * 手势密码
             */
                    @Column(name = "gesture_pwd")
                    private String gesturePwd;
                    
            /**
             * 人脸/指纹密码
             */
                    @Column(name = "face_id_pwd")
                    private String faceIdPwd;
                    
            /**
             * 用户标签ID
             */
                    @Column(name = "user_label")
                    private String userLabel;
                    
            /**
             * 用户状态
             */
                    @Column(name = "status")
                    private String status;
                    
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
            this.id=id;
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
            this.tenantId=tenantId;
        }
    
        /**
         * 获取：
         */
        public String getUserId() {
            return userId;
        }

        /**
         * 设置：
         */
        public void setUserId(String userId) {
            this.userId=userId;
        }
    
        /**
         * 获取：客户手机号
         */
        public String getMobileNo() {
            return mobileNo;
        }

        /**
         * 设置：客户手机号
         */
        public void setMobileNo(String mobileNo) {
            this.mobileNo=mobileNo;
        }
    
        /**
         * 获取：证件类型
         */
        public String getIdType() {
            return idType;
        }

        /**
         * 设置：证件类型
         */
        public void setIdType(String idType) {
            this.idType=idType;
        }
    
        /**
         * 获取：证件号
         */
        public String getIdNo() {
            return idNo;
        }

        /**
         * 设置：证件号
         */
        public void setIdNo(String idNo) {
            this.idNo=idNo;
        }
    
        /**
         * 获取：证件生效日期
         */
        public String getValidDate() {
            return validDate;
        }

        /**
         * 设置：证件生效日期
         */
        public void setValidDate(String validDate) {
            this.validDate=validDate;
        }
    
        /**
         * 获取：证件失效日期
         */
        public String getExpiredDate() {
            return expiredDate;
        }

        /**
         * 设置：证件失效日期
         */
        public void setExpiredDate(String expiredDate) {
            this.expiredDate=expiredDate;
        }
    
        /**
         * 获取：发证机构
         */
        public String getIssueAuthority() {
            return issueAuthority;
        }

        /**
         * 设置：发证机构
         */
        public void setIssueAuthority(String issueAuthority) {
            this.issueAuthority=issueAuthority;
        }
    
        /**
         * 获取：姓名
         */
        public String getUserName() {
            return userName;
        }

        /**
         * 设置：姓名
         */
        public void setUserName(String userName) {
            this.userName=userName;
        }
    
        /**
         * 获取：性别
         */
        public String getGender() {
            return gender;
        }

        /**
         * 设置：性别
         */
        public void setGender(String gender) {
            this.gender=gender;
        }
    
        /**
         * 获取：生日
         */
        public String getBirthDate() {
            return birthDate;
        }

        /**
         * 设置：生日
         */
        public void setBirthDate(String birthDate) {
            this.birthDate=birthDate;
        }
    
        /**
         * 获取：邮箱
         */
        public String getEmail() {
            return email;
        }

        /**
         * 设置：邮箱
         */
        public void setEmail(String email) {
            this.email=email;
        }
    
        /**
         * 获取：密码
         */
        public String getTranPwd() {
            return tranPwd;
        }

        /**
         * 设置：密码
         */
        public void setTranPwd(String tranPwd) {
            this.tranPwd=tranPwd;
        }
    
        /**
         * 获取：客户经理
         */
        public String getSaverId() {
            return saverId;
        }

        /**
         * 设置：客户经理
         */
        public void setSaverId(String saverId) {
            this.saverId=saverId;
        }
    
        /**
         * 获取：渠道编号
         */
        public String getSourcePlatform() {
            return sourcePlatform;
        }

        /**
         * 设置：渠道编号
         */
        public void setSourcePlatform(String sourcePlatform) {
            this.sourcePlatform=sourcePlatform;
        }
    
        /**
         * 获取：推荐人
         */
        public String getReferee() {
            return referee;
        }

        /**
         * 设置：推荐人
         */
        public void setReferee(String referee) {
            this.referee=referee;
        }
    
        /**
         * 获取：地址
         */
        public String getAddress() {
            return address;
        }

        /**
         * 设置：地址
         */
        public void setAddress(String address) {
            this.address=address;
        }
    
        /**
         * 获取：职业
         */
        public String getOccupation() {
            return occupation;
        }

        /**
         * 设置：职业
         */
        public void setOccupation(String occupation) {
            this.occupation=occupation;
        }
    
        /**
         * 获取：注册来源
         */
        public String getRegSource() {
            return regSource;
        }

        /**
         * 设置：注册来源
         */
        public void setRegSource(String regSource) {
            this.regSource=regSource;
        }
    
        /**
         * 获取：证件照片地址正面id
         */
        public String getIdPathFace() {
            return idPathFace;
        }

        /**
         * 设置：证件照片地址正面id
         */
        public void setIdPathFace(String idPathFace) {
            this.idPathFace=idPathFace;
        }
    
        /**
         * 获取：证件照片地址背面id
         */
        public String getIdPathEmblem() {
            return idPathEmblem;
        }

        /**
         * 设置：证件照片地址背面id
         */
        public void setIdPathEmblem(String idPathEmblem) {
            this.idPathEmblem=idPathEmblem;
        }
    
        /**
         * 获取：证件照片地址手持id
         */
        public String getIdPathHand() {
            return idPathHand;
        }

        /**
         * 设置：证件照片地址手持id
         */
        public void setIdPathHand(String idPathHand) {
            this.idPathHand=idPathHand;
        }
    
        /**
         * 获取：开户地区编码
         */
        public String getDistCode() {
            return distCode;
        }

        /**
         * 设置：开户地区编码
         */
        public void setDistCode(String distCode) {
            this.distCode=distCode;
        }
    
        /**
         * 获取：用户IP
         */
        public String getUserIp() {
            return userIp;
        }

        /**
         * 设置：用户IP
         */
        public void setUserIp(String userIp) {
            this.userIp=userIp;
        }
    
        /**
         * 获取：交易密码设置时间 
         */
        public Date getSetTranPwdTime() {
            return setTranPwdTime;
        }

        /**
         * 设置：交易密码设置时间 
         */
        public void setSetTranPwdTime(Date setTranPwdTime) {
            this.setTranPwdTime=setTranPwdTime;
        }
    
        /**
         * 获取：最后登录设备ID
         */
        public String getDeviceId() {
            return deviceId;
        }

        /**
         * 设置：最后登录设备ID
         */
        public void setDeviceId(String deviceId) {
            this.deviceId=deviceId;
        }
    
        /**
         * 获取：登录密码
         */
        public String getLoginPwd() {
            return loginPwd;
        }

        /**
         * 设置：登录密码
         */
        public void setLoginPwd(String loginPwd) {
            this.loginPwd=loginPwd;
        }
    
        /**
         * 获取：手势密码
         */
        public String getGesturePwd() {
            return gesturePwd;
        }

        /**
         * 设置：手势密码
         */
        public void setGesturePwd(String gesturePwd) {
            this.gesturePwd=gesturePwd;
        }
    
        /**
         * 获取：人脸/指纹密码
         */
        public String getFaceIdPwd() {
            return faceIdPwd;
        }

        /**
         * 设置：人脸/指纹密码
         */
        public void setFaceIdPwd(String faceIdPwd) {
            this.faceIdPwd=faceIdPwd;
        }
    
        /**
         * 获取：用户标签ID
         */
        public String getUserLabel() {
            return userLabel;
        }

        /**
         * 设置：用户标签ID
         */
        public void setUserLabel(String userLabel) {
            this.userLabel=userLabel;
        }
    
        /**
         * 获取：用户状态
         */
        public String getStatus() {
            return status;
        }

        /**
         * 设置：用户状态
         */
        public void setStatus(String status) {
            this.status=status;
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
            this.createTime=createTime;
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
            this.lastModifiedTime=lastModifiedTime;
        }
    }
