package com.nuoding.wechat.common.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户登录历史表(BackUserLoginRecord)实体类
 *
 * @author jhc
 * @since 2023-04-12 09:29:13
 */
public class BackUserLoginRecord implements Serializable {
    private static final long serialVersionUID = 140396708072872089L;
    /**
     * 主键
     */
    private Integer id;
    /**
     * 租户ID
     */
    private String tenantId;
    /**
     * 用户ID
     */
    private String userId;
    /**
     * 登录Ip
     */
    private String ipAddr;
    /**
     * 国家
     */
    private String country;
    /**
     * 省份
     */
    private String province;
    /**
     * 城市
     */
    private String city;
    /**
     * 县区
     */
    private String county;
    /**
     * 登录时间
     */
    private Date loginTime;
    /**
     * 登录结果描述
     */
    private String loginResult;
    /**
     * 登录结果码值
     */
    private String loginResultCode;
    /**
     * 运营商
     */
    private String isp;


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

    public String getIpAddr() {
        return ipAddr;
    }

    public void setIpAddr(String ipAddr) {
        this.ipAddr = ipAddr;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public String getLoginResult() {
        return loginResult;
    }

    public void setLoginResult(String loginResult) {
        this.loginResult = loginResult;
    }

    public String getLoginResultCode() {
        return loginResultCode;
    }

    public void setLoginResultCode(String loginResultCode) {
        this.loginResultCode = loginResultCode;
    }

    public String getIsp() {
        return isp;
    }

    public void setIsp(String isp) {
        this.isp = isp;
    }
}

