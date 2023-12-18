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
 * 客户信息表
 *
 * @Author: hzq
 * @Date: 2023-12-18 14:57:38
 */
@Entity
@Table(name = "sys_user_labels")
public class SysUserLabelsEntity implements Serializable {

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
             * 用户标签ID
             */
                    @Column(name = "label_id")
                    private String labelId;
                    
            /**
             * 标签key
             */
                    @Column(name = "label_key")
                    private String labelKey;
                    
            /**
             * 标签中文描述
             */
                    @Column(name = "label_desc")
                    private String labelDesc;
            
    
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
         * 获取：用户标签ID
         */
        public String getLabelId() {
            return labelId;
        }

        /**
         * 设置：用户标签ID
         */
        public void setLabelId(String labelId) {
            this.labelId=labelId;
        }
    
        /**
         * 获取：标签key
         */
        public String getLabelKey() {
            return labelKey;
        }

        /**
         * 设置：标签key
         */
        public void setLabelKey(String labelKey) {
            this.labelKey=labelKey;
        }
    
        /**
         * 获取：标签中文描述
         */
        public String getLabelDesc() {
            return labelDesc;
        }

        /**
         * 设置：标签中文描述
         */
        public void setLabelDesc(String labelDesc) {
            this.labelDesc=labelDesc;
        }
    }
