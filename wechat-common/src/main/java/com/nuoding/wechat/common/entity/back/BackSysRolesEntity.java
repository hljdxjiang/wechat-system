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
 * 角色信息表
 *
 * @Author: hzq
 * @Date: 2023-05-08 19:32:48
 */
@Entity
@Table(name = "back_sys_roles")
public class BackSysRolesEntity implements Serializable {

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
             * 角色编号
             */
                    @Column(name = "role_id")
                    private String roleId;
                    
            /**
             * 角色名称
             */
                    @Column(name = "role_name")
                    private String roleName;
                    
            /**
             * 角色描述
             */
                    @Column(name = "role_remark")
                    private String roleRemark;
                    
            /**
             * 
             */
                        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
                    @Column(name = "create_time")
                    private Date createTime;
                    
            /**
             * 
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
         * 获取：角色编号
         */
        public String getRoleId() {
            return roleId;
        }

        /**
         * 设置：角色编号
         */
        public void setRoleId(String roleId) {
            this.roleId=roleId;
        }
    
        /**
         * 获取：角色名称
         */
        public String getRoleName() {
            return roleName;
        }

        /**
         * 设置：角色名称
         */
        public void setRoleName(String roleName) {
            this.roleName=roleName;
        }
    
        /**
         * 获取：角色描述
         */
        public String getRoleRemark() {
            return roleRemark;
        }

        /**
         * 设置：角色描述
         */
        public void setRoleRemark(String roleRemark) {
            this.roleRemark=roleRemark;
        }
    
        /**
         * 获取：
         */
        public Date getCreateTime() {
            return createTime;
        }

        /**
         * 设置：
         */
        public void setCreateTime(Date createTime) {
            this.createTime=createTime;
        }
    
        /**
         * 获取：
         */
        public Date getLastModifiedTime() {
            return lastModifiedTime;
        }

        /**
         * 设置：
         */
        public void setLastModifiedTime(Date lastModifiedTime) {
            this.lastModifiedTime=lastModifiedTime;
        }
    }
