package com.nuoding.wechat.common.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (UserOperaRecord)实体类
 *
 * @author jhc
 * @since 2023-03-07 14:39:03
 */
public class UserOperaRecord implements Serializable {
    private static final long serialVersionUID = 197951155282775736L;

    private Integer id;
    /**
     * 租户ID
     */
    private String tenantId;
    /**
     * 登录账号
     */
    private String userid;
    /**
     * 操作类型
     */
    private String operationType;
    /**
     * 客户请求url
     */
    private String requestUrl;
    /**
     * 用户ip
     */
    private String userIp;
    /**
     * 创建时间
     */
    private Date createtime;
    /**
     * 最后修改时间
     */
    private Date lastmodifiedtime;
    /**
     * 用户MAC地址
     */
    private String macAddr;
    /**
     * 交易码
     */
    private String transCode;
    /**
     * 版本号
     */
    private String version;
    /**
     * 登录sessionID
     */
    private String sessionid;
    /**
     * 防止重放攻击ID
     */
    private String replayid;
    /**
     * 请求报文
     */
    private String requestBody;
    /**
     * 返回报文状态
     */
    private String responseCode;


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

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public String getRequestUrl() {
        return requestUrl;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    public String getUserIp() {
        return userIp;
    }

    public void setUserIp(String userIp) {
        this.userIp = userIp;
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

    public String getMacAddr() {
        return macAddr;
    }

    public void setMacAddr(String macAddr) {
        this.macAddr = macAddr;
    }

    public String getTransCode() {
        return transCode;
    }

    public void setTransCode(String transCode) {
        this.transCode = transCode;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getSessionid() {
        return sessionid;
    }

    public void setSessionid(String sessionid) {
        this.sessionid = sessionid;
    }

    public String getReplayid() {
        return replayid;
    }

    public void setReplayid(String replayid) {
        this.replayid = replayid;
    }

    public String getRequestBody() {
        return requestBody;
    }

    public void setRequestBody(String requestBody) {
        this.requestBody = requestBody;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

}

