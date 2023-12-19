package com.nuoding.wechat.common.entity.user;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;


/**
 * 用户反馈信息表
 *
 * @Author: hzq
 * @Date: 2023-12-18 14:57:37
 */
@Entity
@Table(name = "user_feedback_info")
public class UserFeedbackInfoEntity implements Serializable {

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
     * 客户手机号
     */
    @Column(name = "mobile_no")
    private String mobileNo;

    /**
     * 用户状态
     */
    @Column(name = "status")
    private String status;

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
     * 反馈类型
     */
    @Column(name = "feed_type")
    private String feedType;

    /**
     * 反馈标题
     */
    @Column(name = "feed_title")
    private String feedTitle;

    /**
     * 反馈详情
     */
    @Column(name = "feed_detail")
    private String feedDetail;

    /**
     * 反馈影像地址
     */
    @Column(name = "feed_img")
    private String feedImg;


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
     * 获取：
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置：
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取：客户手机号
     */
    public String getMobileNo() {
        return mobileNo;
    }

    /**
     * 设置：客户手机号
     */
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
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
     * 获取：反馈类型
     */
    public String getFeedType() {
        return feedType;
    }

    /**
     * 设置：反馈类型
     */
    public void setFeedType(String feedType) {
        this.feedType = feedType;
    }

    /**
     * 获取：反馈标题
     */
    public String getFeedTitle() {
        return feedTitle;
    }

    /**
     * 设置：反馈标题
     */
    public void setFeedTitle(String feedTitle) {
        this.feedTitle = feedTitle;
    }

    /**
     * 获取：反馈详情
     */
    public String getFeedDetail() {
        return feedDetail;
    }

    /**
     * 设置：反馈详情
     */
    public void setFeedDetail(String feedDetail) {
        this.feedDetail = feedDetail;
    }

    /**
     * 获取：反馈影像地址
     */
    public String getFeedImg() {
        return feedImg;
    }

    /**
     * 设置：反馈影像地址
     */
    public void setFeedImg(String feedImg) {
        this.feedImg = feedImg;
    }
}
