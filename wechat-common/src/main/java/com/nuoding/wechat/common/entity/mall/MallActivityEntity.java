package com.nuoding.wechat.common.entity.mall;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


/**
 * 活动信息表
 *
 * @Author: hzq
 * @Date: 2023-06-08 17:37:05
 */
@Entity
@Table(name = "mall_activity")
public class MallActivityEntity implements Serializable {

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
     * 活动ID
     */
    @Column(name = "activity_id")
    private String activityId;

    /**
     * 活动标题
     */
    @Column(name = "activity_title")
    private String activityTitle;

    /**
     * 活动详情
     */
    @Column(name = "activity_detail")
    private String activityDetail;

    /**
     * 活动类别
     */
    @Column(name = "activity_type")
    private String activityType;

    /**
     * 奖励类型
     */
    @Column(name = "reward")
    private String reward;

    /**
     * 奖励金额
     */
    @Column(name = "reward_amount")
    private BigDecimal rewardAmount;

    /**
     * 活动生效日
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "vaild_date")
    private Date vaildDate;

    /**
     * 活动失效日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "expire_date")
    private Date expireDate;

    /**
     * 奖励使用开始日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "reward_valid_date")
    private Date rewardValidDate;

    /**
     * 奖励失效日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "reward_expire_date")
    private Date rewardExpireDate;

    /**
     * 最多参与人数
     */
    @Column(name = "numbero")
    private Integer numbero;

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
     * 获取：活动ID
     */
    public String getActivityId() {
        return activityId;
    }

    /**
     * 设置：活动ID
     */
    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    /**
     * 获取：活动标题
     */
    public String getActivityTitle() {
        return activityTitle;
    }

    /**
     * 设置：活动标题
     */
    public void setActivityTitle(String activityTitle) {
        this.activityTitle = activityTitle;
    }

    /**
     * 获取：活动详情
     */
    public String getActivityDetail() {
        return activityDetail;
    }

    /**
     * 设置：活动详情
     */
    public void setActivityDetail(String activityDetail) {
        this.activityDetail = activityDetail;
    }

    /**
     * 获取：活动类别
     */
    public String getActivityType() {
        return activityType;
    }

    /**
     * 设置：活动类别
     */
    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    /**
     * 获取：奖励类型
     */
    public String getReward() {
        return reward;
    }

    /**
     * 设置：奖励类型
     */
    public void setReward(String reward) {
        this.reward = reward;
    }

    /**
     * 获取：奖励金额
     */
    public BigDecimal getRewardAmount() {
        return rewardAmount;
    }

    /**
     * 设置：奖励金额
     */
    public void setRewardAmount(BigDecimal rewardAmount) {
        this.rewardAmount = rewardAmount;
    }

    /**
     * 获取：活动生效日
     */
    public Date getVaildDate() {
        return vaildDate;
    }

    /**
     * 设置：活动生效日
     */
    public void setVaildDate(Date vaildDate) {
        this.vaildDate = vaildDate;
    }

    /**
     * 获取：活动失效日期
     */
    public Date getExpireDate() {
        return expireDate;
    }

    /**
     * 设置：活动失效日期
     */
    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    /**
     * 获取：奖励使用开始日期
     */
    public Date getRewardValidDate() {
        return rewardValidDate;
    }

    /**
     * 设置：奖励使用开始日期
     */
    public void setRewardValidDate(Date rewardValidDate) {
        this.rewardValidDate = rewardValidDate;
    }

    /**
     * 获取：奖励失效日期
     */
    public Date getRewardExpireDate() {
        return rewardExpireDate;
    }

    /**
     * 设置：奖励失效日期
     */
    public void setRewardExpireDate(Date rewardExpireDate) {
        this.rewardExpireDate = rewardExpireDate;
    }

    /**
     * 获取：最多参与人数
     */
    public Integer getNumbero() {
        return numbero;
    }

    /**
     * 设置：最多参与人数
     */
    public void setNumbero(Integer numbero) {
        this.numbero = numbero;
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
}
