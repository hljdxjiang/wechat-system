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
 * 类型配置表
 *
 * @Author: hzq
 * @Date: 2023-12-18 14:57:38
 */
@Entity
@Table(name = "sys_page_type_info")
public class SysPageTypeInfoEntity implements Serializable {

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
             * 类型ID
             */
                    @Column(name = "type_id")
                    private String typeId;
                    
            /**
             * 类型描述
             */
                    @Column(name = "type_desc")
                    private String typeDesc;
                    
            /**
             * 状态0启用1禁用
             */
                    @Column(name = "status")
                    private Integer status;
                    
            /**
             * 类型备注
             */
                    @Column(name = "type_remark")
                    private String typeRemark;
                    
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
             * 创建用户ID
             */
                    @Column(name = "userid")
                    private String userid;
                    
            /**
             * 最后修改用户ID
             */
                    @Column(name = "modify_userid")
                    private String modifyUserid;
                    
            /**
             * 类型大类
             */
                    @Column(name = "type_kind")
                    private String typeKind;
                    
            /**
             * 排序
             */
                    @Column(name = "type_sort")
                    private Integer typeSort;
            
    
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
         * 获取：类型ID
         */
        public String getTypeId() {
            return typeId;
        }

        /**
         * 设置：类型ID
         */
        public void setTypeId(String typeId) {
            this.typeId=typeId;
        }
    
        /**
         * 获取：类型描述
         */
        public String getTypeDesc() {
            return typeDesc;
        }

        /**
         * 设置：类型描述
         */
        public void setTypeDesc(String typeDesc) {
            this.typeDesc=typeDesc;
        }
    
        /**
         * 获取：状态0启用1禁用
         */
        public Integer getStatus() {
            return status;
        }

        /**
         * 设置：状态0启用1禁用
         */
        public void setStatus(Integer status) {
            this.status=status;
        }
    
        /**
         * 获取：类型备注
         */
        public String getTypeRemark() {
            return typeRemark;
        }

        /**
         * 设置：类型备注
         */
        public void setTypeRemark(String typeRemark) {
            this.typeRemark=typeRemark;
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
         * 获取：创建用户ID
         */
        public String getUserid() {
            return userid;
        }

        /**
         * 设置：创建用户ID
         */
        public void setUserid(String userid) {
            this.userid=userid;
        }
    
        /**
         * 获取：最后修改用户ID
         */
        public String getModifyUserid() {
            return modifyUserid;
        }

        /**
         * 设置：最后修改用户ID
         */
        public void setModifyUserid(String modifyUserid) {
            this.modifyUserid=modifyUserid;
        }
    
        /**
         * 获取：类型大类
         */
        public String getTypeKind() {
            return typeKind;
        }

        /**
         * 设置：类型大类
         */
        public void setTypeKind(String typeKind) {
            this.typeKind=typeKind;
        }
    
        /**
         * 获取：排序
         */
        public Integer getTypeSort() {
            return typeSort;
        }

        /**
         * 设置：排序
         */
        public void setTypeSort(Integer typeSort) {
            this.typeSort=typeSort;
        }
    }
