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
 * 系统权限表
 *
 * @Author: hzq
 * @Date: 2023-12-18 14:57:39
 */
@Entity
@Table(name = "back_sys_revokes")
public class BackSysRevokesEntity implements Serializable {

    private static final long serialVersionUID = 1L;

            
            /**
             * 主键ID
             */
            @Id
            @Column(length = 32)
            private Integer id;
                    
            /**
             * 权限ID
             */
                    @Column(name = "revoke_id")
                    private String revokeId;
                    
            /**
             * 菜单权限标题
             */
                    @Column(name = "revoke_title")
                    private String revokeTitle;
                    
            /**
             * 权限类型
             */
                    @Column(name = "revoke_type")
                    private String revokeType;
                    
            /**
             * 权限父ID
             */
                    @Column(name = "revoke_parentid")
                    private String revokeParentid;
                    
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
             * 备注信息
             */
                    @Column(name = "remark")
                    private String remark;
            
    
        /**
         * 获取：主键ID
         */
        public Integer getId() {
            return id;
        }

        /**
         * 设置：主键ID
         */
        public void setId(Integer id) {
            this.id=id;
        }
    
        /**
         * 获取：权限ID
         */
        public String getRevokeId() {
            return revokeId;
        }

        /**
         * 设置：权限ID
         */
        public void setRevokeId(String revokeId) {
            this.revokeId=revokeId;
        }
    
        /**
         * 获取：菜单权限标题
         */
        public String getRevokeTitle() {
            return revokeTitle;
        }

        /**
         * 设置：菜单权限标题
         */
        public void setRevokeTitle(String revokeTitle) {
            this.revokeTitle=revokeTitle;
        }
    
        /**
         * 获取：权限类型
         */
        public String getRevokeType() {
            return revokeType;
        }

        /**
         * 设置：权限类型
         */
        public void setRevokeType(String revokeType) {
            this.revokeType=revokeType;
        }
    
        /**
         * 获取：权限父ID
         */
        public String getRevokeParentid() {
            return revokeParentid;
        }

        /**
         * 设置：权限父ID
         */
        public void setRevokeParentid(String revokeParentid) {
            this.revokeParentid=revokeParentid;
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
    
        /**
         * 获取：备注信息
         */
        public String getRemark() {
            return remark;
        }

        /**
         * 设置：备注信息
         */
        public void setRemark(String remark) {
            this.remark=remark;
        }
    }
