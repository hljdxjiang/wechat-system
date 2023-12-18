package com.nuoding.wechat.common.entity.crm;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.math.BigDecimal;


/**
 * 产品类型配置表
 *
 * @Author: hzq
 * @Date: 2023-12-18 14:57:38
 */
@Entity
@Table(name = "crm_prod_type")
public class CrmProdTypeEntity implements Serializable {

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
             * 分类ID
             */
                    @Column(name = "prod_type_id")
                    private String prodTypeId;
                    
            /**
             * 分类标识
             */
                    @Column(name = "prod_type_name")
                    private String prodTypeName;
                    
            /**
             * 父ID
             */
                    @Column(name = "parent_id")
                    private String parentId;
                    
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
             * 用户状态
             */
                    @Column(name = "status")
                    private String status;
            
    
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
         * 获取：分类ID
         */
        public String getProdTypeId() {
            return prodTypeId;
        }

        /**
         * 设置：分类ID
         */
        public void setProdTypeId(String prodTypeId) {
            this.prodTypeId=prodTypeId;
        }
    
        /**
         * 获取：分类标识
         */
        public String getProdTypeName() {
            return prodTypeName;
        }

        /**
         * 设置：分类标识
         */
        public void setProdTypeName(String prodTypeName) {
            this.prodTypeName=prodTypeName;
        }
    
        /**
         * 获取：父ID
         */
        public String getParentId() {
            return parentId;
        }

        /**
         * 设置：父ID
         */
        public void setParentId(String parentId) {
            this.parentId=parentId;
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
    }
