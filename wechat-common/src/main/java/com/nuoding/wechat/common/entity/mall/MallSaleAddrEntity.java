package com.nuoding.wechat.common.entity.mall;

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
 * @Date: 2023-12-18 14:57:37
 */
@Entity
@Table(name = "mall_sale_addr")
public class MallSaleAddrEntity implements Serializable {

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
             * 销售批次ID
             */
                    @Column(name = "batch_id")
                    private String batchId;
                    
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
             * 姓名
             */
                    @Column(name = "name")
                    private String name;
                    
            /**
             * 地址
             */
                    @Column(name = "address")
                    private String address;
                    
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
             * 街道
             */
                    @Column(name = "street")
                    private String street;
                    
            /**
             * 详细地址
             */
                    @Column(name = "detail")
                    private String detail;
            
    
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
         * 获取：销售批次ID
         */
        public String getBatchId() {
            return batchId;
        }

        /**
         * 设置：销售批次ID
         */
        public void setBatchId(String batchId) {
            this.batchId=batchId;
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
         * 获取：姓名
         */
        public String getName() {
            return name;
        }

        /**
         * 设置：姓名
         */
        public void setName(String name) {
            this.name=name;
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
         * 获取：街道
         */
        public String getStreet() {
            return street;
        }

        /**
         * 设置：街道
         */
        public void setStreet(String street) {
            this.street=street;
        }
    
        /**
         * 获取：详细地址
         */
        public String getDetail() {
            return detail;
        }

        /**
         * 设置：详细地址
         */
        public void setDetail(String detail) {
            this.detail=detail;
        }
    }
