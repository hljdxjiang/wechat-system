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
 * 活动条件表
 *
 * @Author: hzq
 * @Date: 2023-06-05 17:49:46
 */
@Entity
@Table(name = "mall_activity_condition")
public class MallActivityConditionEntity implements Serializable {

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
             * 活动ID
             */
                    @Column(name = "activity_id")
                    private String activityId;
                    
            /**
             * 条件ID
             */
                    @Column(name = "condition_id")
                    private String conditionId;
                    
            /**
             * 条件值
             */
                    @Column(name = "condition_value")
                    private String conditionValue;
                    
            /**
             * 条件类别
             */
                    @Column(name = "condition_type")
                    private String conditionType;
                    
            /**
             * 条件方式：大于，小于，等于，包含
             */
                    @Column(name = "condition_way")
                    private String conditionWay;
                    
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
         * 获取：活动ID
         */
        public String getActivityId() {
            return activityId;
        }

        /**
         * 设置：活动ID
         */
        public void setActivityId(String activityId) {
            this.activityId=activityId;
        }
    
        /**
         * 获取：条件ID
         */
        public String getConditionId() {
            return conditionId;
        }

        /**
         * 设置：条件ID
         */
        public void setConditionId(String conditionId) {
            this.conditionId=conditionId;
        }
    
        /**
         * 获取：条件值
         */
        public String getConditionValue() {
            return conditionValue;
        }

        /**
         * 设置：条件值
         */
        public void setConditionValue(String conditionValue) {
            this.conditionValue=conditionValue;
        }
    
        /**
         * 获取：条件类别
         */
        public String getConditionType() {
            return conditionType;
        }

        /**
         * 设置：条件类别
         */
        public void setConditionType(String conditionType) {
            this.conditionType=conditionType;
        }
    
        /**
         * 获取：条件方式：大于，小于，等于，包含
         */
        public String getConditionWay() {
            return conditionWay;
        }

        /**
         * 设置：条件方式：大于，小于，等于，包含
         */
        public void setConditionWay(String conditionWay) {
            this.conditionWay=conditionWay;
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
    }
