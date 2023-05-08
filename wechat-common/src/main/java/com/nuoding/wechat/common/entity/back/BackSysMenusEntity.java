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
 * 系统菜单表
 *
 * @Author: hzq
 * @Date: 2023-05-08 19:32:47
 */
@Entity
@Table(name = "back_sys_menus")
public class BackSysMenusEntity implements Serializable {

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
                    @Column(name = "menu_id")
                    private String menuId;
                    
            /**
             * 菜单权限标题
             */
                    @Column(name = "menus_title")
                    private String menusTitle;
                    
            /**
             * 菜单类型
             */
                    @Column(name = "menu_type")
                    private String menuType;
                    
            /**
             * 权限父ID
             */
                    @Column(name = "parent_id")
                    private String parentId;
                    
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
             * 跳转路径
             */
                    @Column(name = "menu_path")
                    private String menuPath;
            
    
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
        public String getMenuId() {
            return menuId;
        }

        /**
         * 设置：权限ID
         */
        public void setMenuId(String menuId) {
            this.menuId=menuId;
        }
    
        /**
         * 获取：菜单权限标题
         */
        public String getMenusTitle() {
            return menusTitle;
        }

        /**
         * 设置：菜单权限标题
         */
        public void setMenusTitle(String menusTitle) {
            this.menusTitle=menusTitle;
        }
    
        /**
         * 获取：菜单类型
         */
        public String getMenuType() {
            return menuType;
        }

        /**
         * 设置：菜单类型
         */
        public void setMenuType(String menuType) {
            this.menuType=menuType;
        }
    
        /**
         * 获取：权限父ID
         */
        public String getParentId() {
            return parentId;
        }

        /**
         * 设置：权限父ID
         */
        public void setParentId(String parentId) {
            this.parentId=parentId;
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
    
        /**
         * 获取：跳转路径
         */
        public String getMenuPath() {
            return menuPath;
        }

        /**
         * 设置：跳转路径
         */
        public void setMenuPath(String menuPath) {
            this.menuPath=menuPath;
        }
    }
