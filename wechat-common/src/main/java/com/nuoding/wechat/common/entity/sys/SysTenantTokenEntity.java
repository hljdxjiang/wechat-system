package com.nuoding.wechat.common.entity.sys;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;


/**
 * 企业token信息表
 *
 * @Author: hzq
 * @Date: 2023-12-18 14:57:37
 */
@Entity
@Table(name = "sys_tenant_token")
public class SysTenantTokenEntity implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
     * id
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
     * 用户状态
     */
    @Column(name = "status")
    private Integer status;

    /**
     * 认证方式0直接认证1授权认证
     */
    @Column(name = "auth_type")
    private String authType;

    /**
     * 微信ID
     */
    @Column(name = "appid")
    private String appid;

    /**
     * 微信秘钥
     */
    @Column(name = "app_secret")
    private String appSecret;

    /**
     * token渠道WX,MINIP,JD
     */
    @Column(name = "channel")
    private String channel;

    /**
     * token值
     */
    @Column(name = "token")
    private String token;

    /**
     * 刷新token
     */
    @Column(name = "refresh_token")
    private String refreshToken;

    /**
     * 微信配置Key
     */
    @Column(name = "echostr")
    private String echostr;

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
     * 获取：id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置：id
     */
    public void setId(Integer id) {
        this.id = id;
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
        this.tenantId = tenantId;
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
        this.status = status;
    }

    /**
     * 获取：认证方式0直接认证1授权认证
     */
    public String getAuthType() {
        return authType;
    }

    /**
     * 设置：认证方式0直接认证1授权认证
     */
    public void setAuthType(String authType) {
        this.authType = authType;
    }

    /**
     * 获取：微信ID
     */
    public String getAppid() {
        return appid;
    }

    /**
     * 设置：微信ID
     */
    public void setAppid(String appid) {
        this.appid = appid;
    }

    /**
     * 获取：微信秘钥
     */
    public String getAppSecret() {
        return appSecret;
    }

    /**
     * 设置：微信秘钥
     */
    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    /**
     * 获取：token渠道WX,MINIP,JD
     */
    public String getChannel() {
        return channel;
    }

    /**
     * 设置：token渠道WX,MINIP,JD
     */
    public void setChannel(String channel) {
        this.channel = channel;
    }

    /**
     * 获取：token值
     */
    public String getToken() {
        return token;
    }

    /**
     * 设置：token值
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * 获取：刷新token
     */
    public String getRefreshToken() {
        return refreshToken;
    }

    /**
     * 设置：刷新token
     */
    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    /**
     * 获取：微信配置Key
     */
    public String getEchostr() {
        return echostr;
    }

    /**
     * 设置：微信配置Key
     */
    public void setEchostr(String echostr) {
        this.echostr = echostr;
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
        this.createTime = createTime;
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
        this.lastModifiedTime = lastModifiedTime;
    }
}
