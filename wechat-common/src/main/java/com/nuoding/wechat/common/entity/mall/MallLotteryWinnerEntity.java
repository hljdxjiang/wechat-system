package com.nuoding.wechat.common.entity.mall;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;


/**
 * 抽奖中奖记录表
 *
 * @Author: hzq
 * @Date: 2023-12-18 14:57:37
 */
@Entity
@Table(name = "mall_lottery_winner")
public class MallLotteryWinnerEntity implements Serializable {

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
     * 抽奖ID
     */
    @Column(name = "lottery_id")
    private String lotteryId;

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
     * 奖品类别：0实物1积分2金币3银币4优惠券5卡券
     */
    @Column(name = "prize_type")
    private String prizeType;

    /**
     * 奖品ID
     */
    @Column(name = "prize_id")
    private String prizeId;

    /**
     * 奖品数量
     */
    @Column(name = "prize_amount")
    private Integer prizeAmount;

    /**
     * 领取状态0未领取9已领取
     */
    @Column(name = "status")
    private String status;

    /**
     * 实体订单ID
     */
    @Column(name = "relate_id")
    private String relateId;


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
     * 获取：抽奖ID
     */
    public String getLotteryId() {
        return lotteryId;
    }

    /**
     * 设置：抽奖ID
     */
    public void setLotteryId(String lotteryId) {
        this.lotteryId = lotteryId;
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
     * 获取：奖品类别：0实物1积分2金币3银币4优惠券5卡券
     */
    public String getPrizeType() {
        return prizeType;
    }

    /**
     * 设置：奖品类别：0实物1积分2金币3银币4优惠券5卡券
     */
    public void setPrizeType(String prizeType) {
        this.prizeType = prizeType;
    }

    /**
     * 获取：奖品ID
     */
    public String getPrizeId() {
        return prizeId;
    }

    /**
     * 设置：奖品ID
     */
    public void setPrizeId(String prizeId) {
        this.prizeId = prizeId;
    }

    /**
     * 获取：奖品数量
     */
    public Integer getPrizeAmount() {
        return prizeAmount;
    }

    /**
     * 设置：奖品数量
     */
    public void setPrizeAmount(Integer prizeAmount) {
        this.prizeAmount = prizeAmount;
    }

    /**
     * 获取：领取状态0未领取9已领取
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置：领取状态0未领取9已领取
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取：实体订单ID
     */
    public String getRelateId() {
        return relateId;
    }

    /**
     * 设置：实体订单ID
     */
    public void setRelateId(String relateId) {
        this.relateId = relateId;
    }
}
