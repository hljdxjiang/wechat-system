package com.nuoding.wechat.common.entity.user;

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
 * @Date: 2023-12-18 14:57:37
 */
@Entity
@Table(name = "user_comment_info")
public class UserCommentInfoEntity implements Serializable {

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
             * 
             */
                    @Column(name = "user_id")
                    private String userId;
                    
            /**
             * 消息ID
             */
                    @Column(name = "comment_id")
                    private String commentId;
                    
            /**
             * 消息父ID
             */
                    @Column(name = "comment_pid")
                    private String commentPid;
                    
            /**
             * 评论详情
             */
                    @Column(name = "comment_detail")
                    private String commentDetail;
                    
            /**
             * 关联类型
             */
                    @Column(name = "relate_type")
                    private String relateType;
                    
            /**
             * 关联ID
             */
                    @Column(name = "relate_id")
                    private String relateId;
                    
            /**
             * 点踩量
             */
                    @Column(name = "trample_amount")
                    private Integer trampleAmount;
                    
            /**
             * 点顶量
             */
                    @Column(name = "crown_amount")
                    private Integer crownAmount;
                    
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
         * 获取：
         */
        public String getUserId() {
            return userId;
        }

        /**
         * 设置：
         */
        public void setUserId(String userId) {
            this.userId=userId;
        }
    
        /**
         * 获取：消息ID
         */
        public String getCommentId() {
            return commentId;
        }

        /**
         * 设置：消息ID
         */
        public void setCommentId(String commentId) {
            this.commentId=commentId;
        }
    
        /**
         * 获取：消息父ID
         */
        public String getCommentPid() {
            return commentPid;
        }

        /**
         * 设置：消息父ID
         */
        public void setCommentPid(String commentPid) {
            this.commentPid=commentPid;
        }
    
        /**
         * 获取：评论详情
         */
        public String getCommentDetail() {
            return commentDetail;
        }

        /**
         * 设置：评论详情
         */
        public void setCommentDetail(String commentDetail) {
            this.commentDetail=commentDetail;
        }
    
        /**
         * 获取：关联类型
         */
        public String getRelateType() {
            return relateType;
        }

        /**
         * 设置：关联类型
         */
        public void setRelateType(String relateType) {
            this.relateType=relateType;
        }
    
        /**
         * 获取：关联ID
         */
        public String getRelateId() {
            return relateId;
        }

        /**
         * 设置：关联ID
         */
        public void setRelateId(String relateId) {
            this.relateId=relateId;
        }
    
        /**
         * 获取：点踩量
         */
        public Integer getTrampleAmount() {
            return trampleAmount;
        }

        /**
         * 设置：点踩量
         */
        public void setTrampleAmount(Integer trampleAmount) {
            this.trampleAmount=trampleAmount;
        }
    
        /**
         * 获取：点顶量
         */
        public Integer getCrownAmount() {
            return crownAmount;
        }

        /**
         * 设置：点顶量
         */
        public void setCrownAmount(Integer crownAmount) {
            this.crownAmount=crownAmount;
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
