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
 * 用户地理位置记录表
 *
 * @Author: hzq
 * @Date: 2023-12-18 14:57:38
 */
@Entity
@Table(name = "user_location_record")
public class UserLocationRecordEntity implements Serializable {

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
             * 地理位置纬度
             */
                    @Column(name = "latitude")
                    private String latitude;
                    
            /**
             * 地理位置经度
             */
                    @Column(name = "longitude")
                    private String longitude;
                    
            /**
             * 地理位置精度
             */
                    @Column(name = "precision")
                    private String precision;
                    
            /**
             * 渠道
             */
                    @Column(name = "channel")
                    private String channel;
                    
            /**
             * 生效日期
             */
                        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
                    @Column(name = "valid_date")
                    private Date validDate;
            
    
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
         * 获取：地理位置纬度
         */
        public String getLatitude() {
            return latitude;
        }

        /**
         * 设置：地理位置纬度
         */
        public void setLatitude(String latitude) {
            this.latitude=latitude;
        }
    
        /**
         * 获取：地理位置经度
         */
        public String getLongitude() {
            return longitude;
        }

        /**
         * 设置：地理位置经度
         */
        public void setLongitude(String longitude) {
            this.longitude=longitude;
        }
    
        /**
         * 获取：地理位置精度
         */
        public String getPrecision() {
            return precision;
        }

        /**
         * 设置：地理位置精度
         */
        public void setPrecision(String precision) {
            this.precision=precision;
        }
    
        /**
         * 获取：渠道
         */
        public String getChannel() {
            return channel;
        }

        /**
         * 设置：渠道
         */
        public void setChannel(String channel) {
            this.channel=channel;
        }
    
        /**
         * 获取：生效日期
         */
        public Date getValidDate() {
            return validDate;
        }

        /**
         * 设置：生效日期
         */
        public void setValidDate(Date validDate) {
            this.validDate=validDate;
        }
    }
