package com.nuoding.wechat.common.entity.bbs;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;


/**
 * 文章记录表
 *
 * @Author: hzq
 * @Date: 2023-06-08 17:37:05
 */
@Entity
@Table(name = "bbs_article_info")
public class BbsArticleInfoEntity implements Serializable {

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
     * 文章ID
     */
    @Column(name = "article_id")
    private String articleId;

    /**
     * 文章类型
     */
    @Column(name = "article_type")
    private String articleType;

    /**
     * 文章名称
     */
    @Column(name = "article_title")
    private String articleTitle;

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
     * 专题标签
     */
    @Column(name = "column_id")
    private String columnId;

    /**
     * 文章标签
     */
    @Column(name = "label_id")
    private String labelId;

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
        this.id = id;
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
        this.tenantId = tenantId;
    }

    /**
     * 获取：文章ID
     */
    public String getArticleId() {
        return articleId;
    }

    /**
     * 设置：文章ID
     */
    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    /**
     * 获取：文章类型
     */
    public String getArticleType() {
        return articleType;
    }

    /**
     * 设置：文章类型
     */
    public void setArticleType(String articleType) {
        this.articleType = articleType;
    }

    /**
     * 获取：文章名称
     */
    public String getArticleTitle() {
        return articleTitle;
    }

    /**
     * 设置：文章名称
     */
    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
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
        this.userId = userId;
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
        this.remark = remark;
    }

    /**
     * 获取：专题标签
     */
    public String getColumnId() {
        return columnId;
    }

    /**
     * 设置：专题标签
     */
    public void setColumnId(String columnId) {
        this.columnId = columnId;
    }

    /**
     * 获取：文章标签
     */
    public String getLabelId() {
        return labelId;
    }

    /**
     * 设置：文章标签
     */
    public void setLabelId(String labelId) {
        this.labelId = labelId;
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
        this.status = status;
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
        this.createTime = createTime;
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
        this.lastModifiedTime = lastModifiedTime;
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
        this.articleContent = articleContent;
    }
}
