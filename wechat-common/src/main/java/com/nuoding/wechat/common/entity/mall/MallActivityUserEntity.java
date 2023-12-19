package com.nuoding.wechat.common.entity.mall;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;


/**
 * 活动参与用户清单表
 *
 * @Author: hzq
 * @Date: 2023-12-18 14:57:38
 */
@Entity
@Table(name = "mall_activity_user")
public class MallActivityUserEntity implements Serializable {

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
     * 参与状态0参与1完成
     */
    @Column(name = "status")
    private String status;

    /**
     * 参与用户ID
     */
    @Column(name = "userid")
    private String userid;

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
     * 完成时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "complate_time")
    private Date complateTime;


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
     * 获取：参与状态0参与1完成
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置：参与状态0参与1完成
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取：参与用户ID
     */
    public String getUserid() {
        return userid;
    }

    /**
     * 设置：参与用户ID
     */
    public void setUserid(String userid) {
        this.userid = userid;
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
     * 获取：完成时间
     */
    public Date getComplateTime() {
        return complateTime;
    }

    /**
     * 设置：完成时间
     */
    public void setComplateTime(Date complateTime) {
        this.complateTime = complateTime;
    }
}
