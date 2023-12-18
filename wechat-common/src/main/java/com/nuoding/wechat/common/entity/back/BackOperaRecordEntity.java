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
 * 后管操作记录表
 *
 * @Author: hzq
 * @Date: 2023-12-18 14:57:38
 */
@Entity
@Table(name = "back_opera_record")
public class BackOperaRecordEntity implements Serializable {

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
             * 登录账号
             */
                    @Column(name = "userid")
                    private String userid;
                    
            /**
             * 操作类型
             */
                    @Column(name = "operation_type")
                    private String operationType;
                    
            /**
             * 客户请求url
             */
                    @Column(name = "request_url")
                    private String requestUrl;
                    
            /**
             * 用户ip
             */
                    @Column(name = "user_ip")
                    private String userIp;
                    
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
             * 用户MAC地址
             */
                    @Column(name = "mac_addr")
                    private String macAddr;
                    
            /**
             * 交易码
             */
                    @Column(name = "trans_code")
                    private String transCode;
                    
            /**
             * 版本号
             */
                    @Column(name = "version")
                    private String version;
                    
            /**
             * 登录sessionID
             */
                    @Column(name = "sessionid")
                    private String sessionid;
                    
            /**
             * 防止重放攻击ID
             */
                    @Column(name = "replayid")
                    private String replayid;
                    
            /**
             * 请求报文
             */
                    @Column(name = "request_body")
                    private String requestBody;
                    
            /**
             * 返回报文状态
             */
                    @Column(name = "response_code")
                    private String responseCode;
            
    
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
         * 获取：登录账号
         */
        public String getUserid() {
            return userid;
        }

        /**
         * 设置：登录账号
         */
        public void setUserid(String userid) {
            this.userid=userid;
        }
    
        /**
         * 获取：操作类型
         */
        public String getOperationType() {
            return operationType;
        }

        /**
         * 设置：操作类型
         */
        public void setOperationType(String operationType) {
            this.operationType=operationType;
        }
    
        /**
         * 获取：客户请求url
         */
        public String getRequestUrl() {
            return requestUrl;
        }

        /**
         * 设置：客户请求url
         */
        public void setRequestUrl(String requestUrl) {
            this.requestUrl=requestUrl;
        }
    
        /**
         * 获取：用户ip
         */
        public String getUserIp() {
            return userIp;
        }

        /**
         * 设置：用户ip
         */
        public void setUserIp(String userIp) {
            this.userIp=userIp;
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
         * 获取：用户MAC地址
         */
        public String getMacAddr() {
            return macAddr;
        }

        /**
         * 设置：用户MAC地址
         */
        public void setMacAddr(String macAddr) {
            this.macAddr=macAddr;
        }
    
        /**
         * 获取：交易码
         */
        public String getTransCode() {
            return transCode;
        }

        /**
         * 设置：交易码
         */
        public void setTransCode(String transCode) {
            this.transCode=transCode;
        }
    
        /**
         * 获取：版本号
         */
        public String getVersion() {
            return version;
        }

        /**
         * 设置：版本号
         */
        public void setVersion(String version) {
            this.version=version;
        }
    
        /**
         * 获取：登录sessionID
         */
        public String getSessionid() {
            return sessionid;
        }

        /**
         * 设置：登录sessionID
         */
        public void setSessionid(String sessionid) {
            this.sessionid=sessionid;
        }
    
        /**
         * 获取：防止重放攻击ID
         */
        public String getReplayid() {
            return replayid;
        }

        /**
         * 设置：防止重放攻击ID
         */
        public void setReplayid(String replayid) {
            this.replayid=replayid;
        }
    
        /**
         * 获取：请求报文
         */
        public String getRequestBody() {
            return requestBody;
        }

        /**
         * 设置：请求报文
         */
        public void setRequestBody(String requestBody) {
            this.requestBody=requestBody;
        }
    
        /**
         * 获取：返回报文状态
         */
        public String getResponseCode() {
            return responseCode;
        }

        /**
         * 设置：返回报文状态
         */
        public void setResponseCode(String responseCode) {
            this.responseCode=responseCode;
        }
    }
