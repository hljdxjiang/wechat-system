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
 * 系统图片配置表
 *
 * @Author: hzq
 * @Date: 2023-06-05 17:49:47
 */
@Entity
@Table(name = "back_img_info")
public class BackImgInfoEntity implements Serializable {

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
             * 图片本地路径
             */
                    @Column(name = "img_path")
                    private String imgPath;
                    
            /**
             * 图片描述
             */
                    @Column(name = "img_desc")
                    private String imgDesc;
                    
            /**
             * 排序
             */
                    @Column(name = "img_sort")
                    private Integer imgSort;
                    
            /**
             * 图片类型

             */
                    @Column(name = "img_type")
                    private String imgType;
                    
            /**
             * 链接地址
             */
                    @Column(name = "link_url")
                    private String linkUrl;
                    
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
             * 控制标识
             */
                    @Column(name = "control_flag")
                    private String controlFlag;
                    
            /**
             * 白名单类型
             */
                    @Column(name = "white_type")
                    private String whiteType;
                    
            /**
             * 生效时间
             */
                        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
                    @Column(name = "valid_time")
                    private Date validTime;
                    
            /**
             * 失效时间
             */
                        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
                    @Column(name = "expire_time")
                    private Date expireTime;
                    
            /**
             * 展示渠道
             */
                    @Column(name = "channel_no")
                    private String channelNo;
            
    
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
         * 获取：图片本地路径
         */
        public String getImgPath() {
            return imgPath;
        }

        /**
         * 设置：图片本地路径
         */
        public void setImgPath(String imgPath) {
            this.imgPath=imgPath;
        }
    
        /**
         * 获取：图片描述
         */
        public String getImgDesc() {
            return imgDesc;
        }

        /**
         * 设置：图片描述
         */
        public void setImgDesc(String imgDesc) {
            this.imgDesc=imgDesc;
        }
    
        /**
         * 获取：排序
         */
        public Integer getImgSort() {
            return imgSort;
        }

        /**
         * 设置：排序
         */
        public void setImgSort(Integer imgSort) {
            this.imgSort=imgSort;
        }
    
        /**
         * 获取：图片类型

         */
        public String getImgType() {
            return imgType;
        }

        /**
         * 设置：图片类型

         */
        public void setImgType(String imgType) {
            this.imgType=imgType;
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
         * 获取：控制标识
         */
        public String getControlFlag() {
            return controlFlag;
        }

        /**
         * 设置：控制标识
         */
        public void setControlFlag(String controlFlag) {
            this.controlFlag=controlFlag;
        }
    
        /**
         * 获取：白名单类型
         */
        public String getWhiteType() {
            return whiteType;
        }

        /**
         * 设置：白名单类型
         */
        public void setWhiteType(String whiteType) {
            this.whiteType=whiteType;
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
         * 获取：展示渠道
         */
        public String getChannelNo() {
            return channelNo;
        }

        /**
         * 设置：展示渠道
         */
        public void setChannelNo(String channelNo) {
            this.channelNo=channelNo;
        }
    }
