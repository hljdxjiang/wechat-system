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
 * 资源信息表
 *
 * @Author: hzq
 * @Date: 2023-12-18 14:57:37
 */
@Entity
@Table(name = "sys_resource_info")
public class SysResourceInfoEntity implements Serializable {

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
             * 资源ID
             */
                    @Column(name = "resource_id")
                    private String resourceId;
                    
            /**
             * 资源类型:图片，视频，文档
             */
                    @Column(name = "resource_type")
                    private String resourceType;
                    
            /**
             * 链接地址
             */
                    @Column(name = "link_url")
                    private String linkUrl;
                    
            /**
             * 资源状态
             */
                    @Column(name = "status")
                    private Integer status;
                    
            /**
             * 作者ID
             */
                    @Column(name = "user_id")
                    private String userId;
                    
            /**
             * 备注
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
             * 最后修改时间
             */
                        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
                    @Column(name = "last_modified_time")
                    private Date lastModifiedTime;
                    
            /**
             * 失效时间
             */
                        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
                    @Column(name = "expire_time")
                    private Date expireTime;
                    
            /**
             * 生效时间
             */
                        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
                    @Column(name = "valid_time")
                    private Date validTime;
            
    
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
         * 获取：资源ID
         */
        public String getResourceId() {
            return resourceId;
        }

        /**
         * 设置：资源ID
         */
        public void setResourceId(String resourceId) {
            this.resourceId=resourceId;
        }
    
        /**
         * 获取：资源类型:图片，视频，文档
         */
        public String getResourceType() {
            return resourceType;
        }

        /**
         * 设置：资源类型:图片，视频，文档
         */
        public void setResourceType(String resourceType) {
            this.resourceType=resourceType;
        }
    
        /**
         * 获取：链接地址
         */
        public String getLinkUrl() {
            return linkUrl;
        }

        /**
         * 设置：链接地址
         */
        public void setLinkUrl(String linkUrl) {
            this.linkUrl=linkUrl;
        }
    
        /**
         * 获取：资源状态
         */
        public Integer getStatus() {
            return status;
        }

        /**
         * 设置：资源状态
         */
        public void setStatus(Integer status) {
            this.status=status;
        }
    
        /**
         * 获取：作者ID
         */
        public String getUserId() {
            return userId;
        }

        /**
         * 设置：作者ID
         */
        public void setUserId(String userId) {
            this.userId=userId;
        }
    
        /**
         * 获取：备注
         */
        public String getRemark() {
            return remark;
        }

        /**
         * 设置：备注
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
         * 获取：失效时间
         */
        public Date getExpireTime() {
            return expireTime;
        }

        /**
         * 设置：失效时间
         */
        public void setExpireTime(Date expireTime) {
            this.expireTime=expireTime;
        }
    
        /**
         * 获取：生效时间
         */
        public Date getValidTime() {
            return validTime;
        }

        /**
         * 设置：生效时间
         */
        public void setValidTime(Date validTime) {
            this.validTime=validTime;
        }
    }
