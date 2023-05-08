package com.nuoding.wechat.common.entity.sys;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.math.BigDecimal;


/**
 * 租户信息表
 *
 * @Author: hzq
 * @Date: 2023-05-08 19:32:47
 */
@Entity
@Table(name = "sys_tenant_info")
public class SysTenantInfoEntity implements Serializable {

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
             * 租户名称
             */
                    @Column(name = "tenant_name")
                    private String tenantName;
                    
            /**
             * 租户描述
             */
                    @Column(name = "tenant_desc")
                    private String tenantDesc;
                    
            /**
             * 注册日期
             */
                        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
                    @Column(name = "register_time")
                    private Date registerTime;
                    
            /**
             * 注册手机号
             */
                    @Column(name = "mobile_no")
                    private String mobileNo;
                    
            /**
             * 会员等级
             */
                    @Column(name = "vip_level")
                    private String vipLevel;
                    
            /**
             * 会员过期日期
             */
                        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
                    @Column(name = "vip_expire_day")
                    private Date vipExpireDay;
                    
            /**
             * 绑定卡号
             */
                    @Column(name = "tenant_card_no")
                    private String tenantCardNo;
                    
            /**
             * 状态（0正常 1停用）
             */
                    @Column(name = "status")
                    private String status;
                    
            /**
             * 备注
             */
                    @Column(name = "remark")
                    private String remark;
                    
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
             * 页面角标图片
             */
                    @Column(name = "tenant_favicon")
                    private String tenantFavicon;
                    
            /**
             * 租户logo
             */
                    @Column(name = "tenant_logo")
                    private String tenantLogo;
                    
            /**
             * 租户邮箱
             */
                    @Column(name = "email")
                    private String email;
            
    
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
         * 获取：租户名称
         */
        public String getTenantName() {
            return tenantName;
        }

        /**
         * 设置：租户名称
         */
        public void setTenantName(String tenantName) {
            this.tenantName=tenantName;
        }
    
        /**
         * 获取：租户描述
         */
        public String getTenantDesc() {
            return tenantDesc;
        }

        /**
         * 设置：租户描述
         */
        public void setTenantDesc(String tenantDesc) {
            this.tenantDesc=tenantDesc;
        }
    
        /**
         * 获取：注册日期
         */
        public Date getRegisterTime() {
            return registerTime;
        }

        /**
         * 设置：注册日期
         */
        public void setRegisterTime(Date registerTime) {
            this.registerTime=registerTime;
        }
    
        /**
         * 获取：注册手机号
         */
        public String getMobileNo() {
            return mobileNo;
        }

        /**
         * 设置：注册手机号
         */
        public void setMobileNo(String mobileNo) {
            this.mobileNo=mobileNo;
        }
    
        /**
         * 获取：会员等级
         */
        public String getVipLevel() {
            return vipLevel;
        }

        /**
         * 设置：会员等级
         */
        public void setVipLevel(String vipLevel) {
            this.vipLevel=vipLevel;
        }
    
        /**
         * 获取：会员过期日期
         */
        public Date getVipExpireDay() {
            return vipExpireDay;
        }

        /**
         * 设置：会员过期日期
         */
        public void setVipExpireDay(Date vipExpireDay) {
            this.vipExpireDay=vipExpireDay;
        }
    
        /**
         * 获取：绑定卡号
         */
        public String getTenantCardNo() {
            return tenantCardNo;
        }

        /**
         * 设置：绑定卡号
         */
        public void setTenantCardNo(String tenantCardNo) {
            this.tenantCardNo=tenantCardNo;
        }
    
        /**
         * 获取：状态（0正常 1停用）
         */
        public String getStatus() {
            return status;
        }

        /**
         * 设置：状态（0正常 1停用）
         */
        public void setStatus(String status) {
            this.status=status;
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
            this.remark=remark;
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
            this.createtime=createtime;
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
            this.lastmodifiedtime=lastmodifiedtime;
        }
    
        /**
         * 获取：页面角标图片
         */
        public String getTenantFavicon() {
            return tenantFavicon;
        }

        /**
         * 设置：页面角标图片
         */
        public void setTenantFavicon(String tenantFavicon) {
            this.tenantFavicon=tenantFavicon;
        }
    
        /**
         * 获取：租户logo
         */
        public String getTenantLogo() {
            return tenantLogo;
        }

        /**
         * 设置：租户logo
         */
        public void setTenantLogo(String tenantLogo) {
            this.tenantLogo=tenantLogo;
        }
    
        /**
         * 获取：租户邮箱
         */
        public String getEmail() {
            return email;
        }

        /**
         * 设置：租户邮箱
         */
        public void setEmail(String email) {
            this.email=email;
        }
    }
