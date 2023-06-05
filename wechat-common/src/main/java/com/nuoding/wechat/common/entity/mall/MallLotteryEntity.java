package com.nuoding.wechat.common.entity.mall;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.math.BigDecimal;


/**
 * 抽奖活动信息表
 *
 * @Author: hzq
 * @Date: 2023-06-05 17:49:46
 */
@Entity
@Table(name = "mall_lottery")
public class MallLotteryEntity implements Serializable {

    private static final long serialVersionUID = 1L;

            
            /**
             * 
             */
            @Id
            @Column(length = 32)
            private Integer id;
                    
            /**
             * 抽奖ID
             */
                    @Column(name = "tenant_id")
                    private String tenantId;
                    
            /**
             * 抽奖ID
             */
                    @Column(name = "lottery_id")
                    private String lotteryId;
                    
            /**
             * 抽奖标题
             */
                    @Column(name = "lottery_title")
                    private String lotteryTitle;
                    
            /**
             * 抽奖详情
             */
                    @Column(name = "lottery_detail")
                    private String lotteryDetail;
                    
            /**
             * 抽奖类别：0抽取参与者1参与者抽取奖品
             */
                    @Column(name = "lottery_type")
                    private String lotteryType;
                    
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
             * 抽奖生效日
             */
                        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
                    @Column(name = "vaild_date")
                    private Date vaildDate;
                    
            /**
             * 抽奖失效日期
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
             * 抽奖消费
             */
                    @Column(name = "cost")
                    private BigDecimal cost;
                    
            /**
             * 抽奖消费类型
             */
                    @Column(name = "cost_type")
                    private String costType;
                    
            /**
             * 奖品类型
             */
                    @Column(name = "reward_type")
                    private String rewardType;
                    
            /**
             * 循环期数
             */
                    @Column(name = "cycle_amount")
                    private Integer cycleAmount;
                    
            /**
             * 间隔天数
             */
                    @Column(name = "cycle_period")
                    private Integer cyclePeriod;
                    
            /**
             * 循环类型0按周期1开奖后次日2开奖后即开
             */
                    @Column(name = "cycle_type")
                    private Integer cycleType;
            
    
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
         * 获取：抽奖ID
         */
        public String getTenantId() {
            return tenantId;
        }

        /**
         * 设置：抽奖ID
         */
        public void setTenantId(String tenantId) {
            this.tenantId=tenantId;
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
            this.lotteryId=lotteryId;
        }
    
        /**
         * 获取：抽奖标题
         */
        public String getLotteryTitle() {
            return lotteryTitle;
        }

        /**
         * 设置：抽奖标题
         */
        public void setLotteryTitle(String lotteryTitle) {
            this.lotteryTitle=lotteryTitle;
        }
    
        /**
         * 获取：抽奖详情
         */
        public String getLotteryDetail() {
            return lotteryDetail;
        }

        /**
         * 设置：抽奖详情
         */
        public void setLotteryDetail(String lotteryDetail) {
            this.lotteryDetail=lotteryDetail;
        }
    
        /**
         * 获取：抽奖类别：0抽取参与者1参与者抽取奖品
         */
        public String getLotteryType() {
            return lotteryType;
        }

        /**
         * 设置：抽奖类别：0抽取参与者1参与者抽取奖品
         */
        public void setLotteryType(String lotteryType) {
            this.lotteryType=lotteryType;
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
            this.reward=reward;
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
            this.rewardAmount=rewardAmount;
        }
    
        /**
         * 获取：抽奖生效日
         */
        public Date getVaildDate() {
            return vaildDate;
        }

        /**
         * 设置：抽奖生效日
         */
        public void setVaildDate(Date vaildDate) {
            this.vaildDate=vaildDate;
        }
    
        /**
         * 获取：抽奖失效日期
         */
        public Date getExpireDate() {
            return expireDate;
        }

        /**
         * 设置：抽奖失效日期
         */
        public void setExpireDate(Date expireDate) {
            this.expireDate=expireDate;
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
            this.rewardValidDate=rewardValidDate;
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
            this.rewardExpireDate=rewardExpireDate;
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
            this.numbero=numbero;
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
         * 获取：抽奖消费
         */
        public BigDecimal getCost() {
            return cost;
        }

        /**
         * 设置：抽奖消费
         */
        public void setCost(BigDecimal cost) {
            this.cost=cost;
        }
    
        /**
         * 获取：抽奖消费类型
         */
        public String getCostType() {
            return costType;
        }

        /**
         * 设置：抽奖消费类型
         */
        public void setCostType(String costType) {
            this.costType=costType;
        }
    
        /**
         * 获取：奖品类型
         */
        public String getRewardType() {
            return rewardType;
        }

        /**
         * 设置：奖品类型
         */
        public void setRewardType(String rewardType) {
            this.rewardType=rewardType;
        }
    
        /**
         * 获取：循环期数
         */
        public Integer getCycleAmount() {
            return cycleAmount;
        }

        /**
         * 设置：循环期数
         */
        public void setCycleAmount(Integer cycleAmount) {
            this.cycleAmount=cycleAmount;
        }
    
        /**
         * 获取：间隔天数
         */
        public Integer getCyclePeriod() {
            return cyclePeriod;
        }

        /**
         * 设置：间隔天数
         */
        public void setCyclePeriod(Integer cyclePeriod) {
            this.cyclePeriod=cyclePeriod;
        }
    
        /**
         * 获取：循环类型0按周期1开奖后次日2开奖后即开
         */
        public Integer getCycleType() {
            return cycleType;
        }

        /**
         * 设置：循环类型0按周期1开奖后次日2开奖后即开
         */
        public void setCycleType(Integer cycleType) {
            this.cycleType=cycleType;
        }
    }
