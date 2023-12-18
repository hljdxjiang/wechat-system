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
 * 用户资产记录表
 *
 * @Author: hzq
 * @Date: 2023-12-18 14:57:38
 */
@Entity
@Table(name = "user_property_detail")
public class UserPropertyDetailEntity implements Serializable {

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
             * 资产类型
             */
                    @Column(name = "property_type")
                    private String propertyType;
                    
            /**
             * 消费类型obtain获取cost消费
             */
                    @Column(name = "opera_type")
                    private String operaType;
                    
            /**
             * 金额
             */
                    @Column(name = "amount")
                    private BigDecimal amount;
                    
            /**
             * 关联类型
             */
                    @Column(name = "relate_type")
                    private String relateType;
                    
            /**
             * 关联活动ID
             */
                    @Column(name = "relate_id")
                    private String relateId;
                    
            /**
             * 失效日期
             */
                        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
                    @Column(name = "expire_date")
                    private Date expireDate;
                    
            /**
             * 创建时间
             */
                        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
                    @Column(name = "create_time")
                    private Date createTime;
                    
            /**
             * 有效期类型0永久1定期
             */
                    @Column(name = "vaild_type")
                    private Integer vaildType;
            
    
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
         * 获取：资产类型
         */
        public String getPropertyType() {
            return propertyType;
        }

        /**
         * 设置：资产类型
         */
        public void setPropertyType(String propertyType) {
            this.propertyType=propertyType;
        }
    
        /**
         * 获取：消费类型obtain获取cost消费
         */
        public String getOperaType() {
            return operaType;
        }

        /**
         * 设置：消费类型obtain获取cost消费
         */
        public void setOperaType(String operaType) {
            this.operaType=operaType;
        }
    
        /**
         * 获取：金额
         */
        public BigDecimal getAmount() {
            return amount;
        }

        /**
         * 设置：金额
         */
        public void setAmount(BigDecimal amount) {
            this.amount=amount;
        }
    
        /**
         * 获取：关联类型
         */
        public String getRelateType() {
            return relateType;
        }

        /**
         * 设置：关联类型
         */
        public void setRelateType(String relateType) {
            this.relateType=relateType;
        }
    
        /**
         * 获取：关联活动ID
         */
        public String getRelateId() {
            return relateId;
        }

        /**
         * 设置：关联活动ID
         */
        public void setRelateId(String relateId) {
            this.relateId=relateId;
        }
    
        /**
         * 获取：失效日期
         */
        public Date getExpireDate() {
            return expireDate;
        }

        /**
         * 设置：失效日期
         */
        public void setExpireDate(Date expireDate) {
            this.expireDate=expireDate;
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
         * 获取：有效期类型0永久1定期
         */
        public Integer getVaildType() {
            return vaildType;
        }

        /**
         * 设置：有效期类型0永久1定期
         */
        public void setVaildType(Integer vaildType) {
            this.vaildType=vaildType;
        }
    }
