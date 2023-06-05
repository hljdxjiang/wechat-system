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
 * 页面信息表
 *
 * @Author: hzq
 * @Date: 2023-06-05 17:49:47
 */
@Entity
@Table(name = "sys_page_info")
public class SysPageInfoEntity implements Serializable {

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
             * 页面ID
             */
                    @Column(name = "page_id")
                    private String pageId;
                    
            /**
             * 页面标题
             */
                    @Column(name = "page_title")
                    private String pageTitle;
                    
            /**
             * 页面类型
             */
                    @Column(name = "page_type")
                    private String pageType;
                    
            /**
             * 控制标识：ALL,LOCAL,OFF
             */
                    @Column(name = "control_flag")
                    private String controlFlag;
                    
            /**
             * 是否需要登录0需要1不需要
             */
                    @Column(name = "need_login")
                    private Integer needLogin;
                    
            /**
             * 页面备注
             */
                    @Column(name = "page_remark")
                    private String pageRemark;
                    
            /**
             * 用户状态
             */
                    @Column(name = "status")
                    private Integer status;
                    
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
         * 获取：页面ID
         */
        public String getPageId() {
            return pageId;
        }

        /**
         * 设置：页面ID
         */
        public void setPageId(String pageId) {
            this.pageId=pageId;
        }
    
        /**
         * 获取：页面标题
         */
        public String getPageTitle() {
            return pageTitle;
        }

        /**
         * 设置：页面标题
         */
        public void setPageTitle(String pageTitle) {
            this.pageTitle=pageTitle;
        }
    
        /**
         * 获取：页面类型
         */
        public String getPageType() {
            return pageType;
        }

        /**
         * 设置：页面类型
         */
        public void setPageType(String pageType) {
            this.pageType=pageType;
        }
    
        /**
         * 获取：控制标识：ALL,LOCAL,OFF
         */
        public String getControlFlag() {
            return controlFlag;
        }

        /**
         * 设置：控制标识：ALL,LOCAL,OFF
         */
        public void setControlFlag(String controlFlag) {
            this.controlFlag=controlFlag;
        }
    
        /**
         * 获取：是否需要登录0需要1不需要
         */
        public Integer getNeedLogin() {
            return needLogin;
        }

        /**
         * 设置：是否需要登录0需要1不需要
         */
        public void setNeedLogin(Integer needLogin) {
            this.needLogin=needLogin;
        }
    
        /**
         * 获取：页面备注
         */
        public String getPageRemark() {
            return pageRemark;
        }

        /**
         * 设置：页面备注
         */
        public void setPageRemark(String pageRemark) {
            this.pageRemark=pageRemark;
        }
    
        /**
         * 获取：用户状态
         */
        public Integer getStatus() {
            return status;
        }

        /**
         * 设置：用户状态
         */
        public void setStatus(Integer status) {
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
    }
