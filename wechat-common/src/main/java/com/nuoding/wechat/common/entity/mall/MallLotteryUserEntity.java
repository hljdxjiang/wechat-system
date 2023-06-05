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
 * 抽奖用户清单表
 *
 * @Author: hzq
 * @Date: 2023-06-05 17:49:46
 */
@Entity
@Table(name = "mall_lottery_user")
public class MallLotteryUserEntity implements Serializable {

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
             * 参与状态0参与8未中奖9中奖
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
             * 奖品ID
             */
                    @Column(name = "reward_id")
                    private String rewardId;
            
    
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
         * 获取：参与状态0参与8未中奖9中奖
         */
        public String getStatus() {
            return status;
        }

        /**
         * 设置：参与状态0参与8未中奖9中奖
         */
        public void setStatus(String status) {
            this.status=status;
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
            this.userid=userid;
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
         * 获取：完成时间
         */
        public Date getComplateTime() {
            return complateTime;
        }

        /**
         * 设置：完成时间
         */
        public void setComplateTime(Date complateTime) {
            this.complateTime=complateTime;
        }
    
        /**
         * 获取：奖品ID
         */
        public String getRewardId() {
            return rewardId;
        }

        /**
         * 设置：奖品ID
         */
        public void setRewardId(String rewardId) {
            this.rewardId=rewardId;
        }
    }
