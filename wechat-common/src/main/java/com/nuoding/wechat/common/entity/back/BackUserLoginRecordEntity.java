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
 * 用户登录历史表
 *
 * @Author: hzq
 * @Date: 2023-06-05 17:49:47
 */
@Entity
@Table(name = "back_user_login_record")
public class BackUserLoginRecordEntity implements Serializable {

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
                    @Column(name = "tenant_id")
                    private String tenantId;
                    
            /**
             * 用户ID
             */
                    @Column(name = "user_id")
                    private String userId;
                    
            /**
             * 登录Ip
             */
                    @Column(name = "ip_addr")
                    private String ipAddr;
                    
            /**
             * 国家
             */
                    @Column(name = "country")
                    private String country;
                    
            /**
             * 省份
             */
                    @Column(name = "province")
                    private String province;
                    
            /**
             * 城市
             */
                    @Column(name = "city")
                    private String city;
                    
            /**
             * 县区
             */
                    @Column(name = "county")
                    private String county;
                    
            /**
             * 登录时间
             */
                        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
                    @Column(name = "login_time")
                    private Date loginTime;
                    
            /**
             * 登录结果描述
             */
                    @Column(name = "login_result")
                    private String loginResult;
                    
            /**
             * 登录结果码值
             */
                    @Column(name = "login_result_code")
                    private String loginResultCode;
                    
            /**
             * 运营商
             */
                    @Column(name = "isp")
                    private String isp;
            
    
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
         * 获取：登录Ip
         */
        public String getIpAddr() {
            return ipAddr;
        }

        /**
         * 设置：登录Ip
         */
        public void setIpAddr(String ipAddr) {
            this.ipAddr=ipAddr;
        }
    
        /**
         * 获取：国家
         */
        public String getCountry() {
            return country;
        }

        /**
         * 设置：国家
         */
        public void setCountry(String country) {
            this.country=country;
        }
    
        /**
         * 获取：省份
         */
        public String getProvince() {
            return province;
        }

        /**
         * 设置：省份
         */
        public void setProvince(String province) {
            this.province=province;
        }
    
        /**
         * 获取：城市
         */
        public String getCity() {
            return city;
        }

        /**
         * 设置：城市
         */
        public void setCity(String city) {
            this.city=city;
        }
    
        /**
         * 获取：县区
         */
        public String getCounty() {
            return county;
        }

        /**
         * 设置：县区
         */
        public void setCounty(String county) {
            this.county=county;
        }
    
        /**
         * 获取：登录时间
         */
        public Date getLoginTime() {
            return loginTime;
        }

        /**
         * 设置：登录时间
         */
        public void setLoginTime(Date loginTime) {
            this.loginTime=loginTime;
        }
    
        /**
         * 获取：登录结果描述
         */
        public String getLoginResult() {
            return loginResult;
        }

        /**
         * 设置：登录结果描述
         */
        public void setLoginResult(String loginResult) {
            this.loginResult=loginResult;
        }
    
        /**
         * 获取：登录结果码值
         */
        public String getLoginResultCode() {
            return loginResultCode;
        }

        /**
         * 设置：登录结果码值
         */
        public void setLoginResultCode(String loginResultCode) {
            this.loginResultCode=loginResultCode;
        }
    
        /**
         * 获取：运营商
         */
        public String getIsp() {
            return isp;
        }

        /**
         * 设置：运营商
         */
        public void setIsp(String isp) {
            this.isp=isp;
        }
    }
