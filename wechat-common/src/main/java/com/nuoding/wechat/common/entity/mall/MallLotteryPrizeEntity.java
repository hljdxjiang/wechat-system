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
 * 奖品配置表
 *
 * @Author: hzq
 * @Date: 2023-12-18 14:57:38
 */
@Entity
@Table(name = "mall_lottery_prize")
public class MallLotteryPrizeEntity implements Serializable {

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
                    @Column(name = "lottery_id")
                    private String lotteryId;
                    
            /**
             * 奖品ID
             */
                    @Column(name = "tenant_id")
                    private String tenantId;
                    
            /**
             * 奖品ID
             */
                    @Column(name = "prize_id")
                    private String prizeId;
                    
            /**
             * 奖品标题
             */
                    @Column(name = "prize_title")
                    private String prizeTitle;
                    
            /**
             * 奖品详情
             */
                    @Column(name = "prize_detail")
                    private String prizeDetail;
                    
            /**
             * 奖品类别：0实物1积分2金币3银币4优惠券
             */
                    @Column(name = "prize_type")
                    private String prizeType;
                    
            /**
             * 中奖概率
             */
                    @Column(name = "rate")
                    private Float rate;
                    
            /**
             * 奖品数量
             */
                    @Column(name = "amount")
                    private Integer amount;
                    
            /**
             * 奖品排序
             */
                    @Column(name = "sort")
                    private Integer sort;
                    
            /**
             * 奖品状态
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
            this.id=id;
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
         * 获取：奖品ID
         */
        public String getTenantId() {
            return tenantId;
        }

        /**
         * 设置：奖品ID
         */
        public void setTenantId(String tenantId) {
            this.tenantId=tenantId;
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
            this.prizeId=prizeId;
        }
    
        /**
         * 获取：奖品标题
         */
        public String getPrizeTitle() {
            return prizeTitle;
        }

        /**
         * 设置：奖品标题
         */
        public void setPrizeTitle(String prizeTitle) {
            this.prizeTitle=prizeTitle;
        }
    
        /**
         * 获取：奖品详情
         */
        public String getPrizeDetail() {
            return prizeDetail;
        }

        /**
         * 设置：奖品详情
         */
        public void setPrizeDetail(String prizeDetail) {
            this.prizeDetail=prizeDetail;
        }
    
        /**
         * 获取：奖品类别：0实物1积分2金币3银币4优惠券
         */
        public String getPrizeType() {
            return prizeType;
        }

        /**
         * 设置：奖品类别：0实物1积分2金币3银币4优惠券
         */
        public void setPrizeType(String prizeType) {
            this.prizeType=prizeType;
        }
    
        /**
         * 获取：中奖概率
         */
        public Float getRate() {
            return rate;
        }

        /**
         * 设置：中奖概率
         */
        public void setRate(Float rate) {
            this.rate=rate;
        }
    
        /**
         * 获取：奖品数量
         */
        public Integer getAmount() {
            return amount;
        }

        /**
         * 设置：奖品数量
         */
        public void setAmount(Integer amount) {
            this.amount=amount;
        }
    
        /**
         * 获取：奖品排序
         */
        public Integer getSort() {
            return sort;
        }

        /**
         * 设置：奖品排序
         */
        public void setSort(Integer sort) {
            this.sort=sort;
        }
    
        /**
         * 获取：奖品状态
         */
        public String getStatus() {
            return status;
        }

        /**
         * 设置：奖品状态
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
    }
