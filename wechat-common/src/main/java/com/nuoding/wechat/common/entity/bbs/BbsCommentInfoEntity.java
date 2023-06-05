package com.nuoding.wechat.common.entity.bbs;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.math.BigDecimal;


/**
 * 评论记录表
 *
 * @Author: hzq
 * @Date: 2023-06-05 17:49:47
 */
@Entity
@Table(name = "bbs_comment_info")
public class BbsCommentInfoEntity implements Serializable {

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
             * 消息父ID
             */
                    @Column(name = "comment_pid")
                    private String commentPid;
                    
            /**
             * 消息ID
             */
                    @Column(name = "comment_id")
                    private String commentId;
                    
            /**
             * 消息类型
             */
                    @Column(name = "comment_type")
                    private String commentType;
                    
            /**
             * 文章名称
             */
                    @Column(name = "comment_desc")
                    private String commentDesc;
                    
            /**
             * 作者ID
             */
                    @Column(name = "user_id")
                    private String userId;
                    
            /**
             * 状态0草稿1审核中8审核拒绝9审核通过
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
             * 文章详情
             */
                    @Column(name = "article_content")
                    private String articleContent;
            
    
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
         * 获取：消息类型
         */
        public String getCommentType() {
            return commentType;
        }

        /**
         * 设置：消息类型
         */
        public void setCommentType(String commentType) {
            this.commentType=commentType;
        }
    
        /**
         * 获取：文章名称
         */
        public String getCommentDesc() {
            return commentDesc;
        }

        /**
         * 设置：文章名称
         */
        public void setCommentDesc(String commentDesc) {
            this.commentDesc=commentDesc;
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
         * 获取：状态0草稿1审核中8审核拒绝9审核通过
         */
        public Integer getStatus() {
            return status;
        }

        /**
         * 设置：状态0草稿1审核中8审核拒绝9审核通过
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
         * 获取：文章详情
         */
        public String getArticleContent() {
            return articleContent;
        }

        /**
         * 设置：文章详情
         */
        public void setArticleContent(String articleContent) {
            this.articleContent=articleContent;
        }
    }
