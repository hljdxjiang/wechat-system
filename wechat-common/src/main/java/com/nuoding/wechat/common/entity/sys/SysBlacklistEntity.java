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
 * 黑名单表
 *
 * @Author: hzq
 * @Date: 2023-06-05 17:49:46
 */
@Entity
@Table(name = "sys_blacklist")
public class SysBlacklistEntity implements Serializable {

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
             * 用户编号
             */
                    @Column(name = "user_id")
                    private String userId;
                    
            /**
             * 操作渠道
             */
                    @Column(name = "channel")
                    private String channel;
                    
            /**
             * 黑名单原因
             */
                    @Column(name = "remark")
                    private String remark;
                    
            /**
             * 创建时间
             */
                        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
                    @Column(name = "create_time")
                    private Date createTime;
            
    
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
         * 获取：用户编号
         */
        public String getUserId() {
            return userId;
        }

        /**
         * 设置：用户编号
         */
        public void setUserId(String userId) {
            this.userId=userId;
        }
    
        /**
         * 获取：操作渠道
         */
        public String getChannel() {
            return channel;
        }

        /**
         * 设置：操作渠道
         */
        public void setChannel(String channel) {
            this.channel=channel;
        }
    
        /**
         * 获取：黑名单原因
         */
        public String getRemark() {
            return remark;
        }

        /**
         * 设置：黑名单原因
         */
        public void setRemark(String remark) {
            this.remark=remark;
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
    }
