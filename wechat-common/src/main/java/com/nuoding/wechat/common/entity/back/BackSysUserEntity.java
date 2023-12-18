package com.nuoding.wechat.common.entity.back;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.math.BigDecimal;


/**
 * 后管用户表
 *
 * @Author: hzq
 * @Date: 2023-12-18 14:57:38
 */
@Entity
@Table(name = "back_sys_user")
public class BackSysUserEntity implements Serializable {

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
             * 密码
             */
                    @Column(name = "passwd")
                    private String passwd;
                    
            /**
             * 用户分组ID
             */
                    @Column(name = "group_id")
                    private String groupId;
                    
            /**
             * 角色ID
             */
                    @Column(name = "role_id")
                    private String roleId;
                    
            /**
             * 姓名
             */
                    @Column(name = "user_name")
                    private String userName;
                    
            /**
             * 手机号
             */
                    @Column(name = "mobile_no")
                    private String mobileNo;
                    
            /**
             * 邮箱地址
             */
                    @Column(name = "email")
                    private String email;
                    
            /**
             * 证件号
             */
                    @Column(name = "id_no")
                    private String idNo;
                    
            /**
             * 证件类型
             */
                    @Column(name = "id_type")
                    private String idType;
                    
            /**
             * 二次认证码
             */
                    @Column(name = "oauth_code")
                    private String oauthCode;
                    
            /**
             * 用户备注
             */
                    @Column(name = "remark")
                    private String remark;
                    
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
         * 获取：用户ID
         */
        public String getUserId() {
            return userId;
        }

        /**
         * 设置：用户ID
         */
        public void setUserId(String userId) {
            this.userId=userId;
        }
    
        /**
         * 获取：密码
         */
        public String getPasswd() {
            return passwd;
        }

        /**
         * 设置：密码
         */
        public void setPasswd(String passwd) {
            this.passwd=passwd;
        }
    
        /**
         * 获取：用户分组ID
         */
        public String getGroupId() {
            return groupId;
        }

        /**
         * 设置：用户分组ID
         */
        public void setGroupId(String groupId) {
            this.groupId=groupId;
        }
    
        /**
         * 获取：角色ID
         */
        public String getRoleId() {
            return roleId;
        }

        /**
         * 设置：角色ID
         */
        public void setRoleId(String roleId) {
            this.roleId=roleId;
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
         * 获取：手机号
         */
        public String getMobileNo() {
            return mobileNo;
        }

        /**
         * 设置：手机号
         */
        public void setMobileNo(String mobileNo) {
            this.mobileNo=mobileNo;
        }
    
        /**
         * 获取：邮箱地址
         */
        public String getEmail() {
            return email;
        }

        /**
         * 设置：邮箱地址
         */
        public void setEmail(String email) {
            this.email=email;
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
         * 获取：二次认证码
         */
        public String getOauthCode() {
            return oauthCode;
        }

        /**
         * 设置：二次认证码
         */
        public void setOauthCode(String oauthCode) {
            this.oauthCode=oauthCode;
        }
    
        /**
         * 获取：用户备注
         */
        public String getRemark() {
            return remark;
        }

        /**
         * 设置：用户备注
         */
        public void setRemark(String remark) {
            this.remark=remark;
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
