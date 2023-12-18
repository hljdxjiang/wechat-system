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
 * 卡券信息表
 *
 * @Author: hzq
 * @Date: 2023-12-18 14:57:37
 */
@Entity
@Table(name = "mall_card_info")
public class MallCardInfoEntity implements Serializable {

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
             * 卡券编号
             */
                    @Column(name = "card_id")
                    private String cardId;
                    
            /**
             * 卡券名称
             */
                    @Column(name = "card_name")
                    private String cardName;
                    
            /**
             * 卡券卡号
             */
                    @Column(name = "card_no")
                    private String cardNo;
                    
            /**
             * 卡券卡密
             */
                    @Column(name = "card_pwd")
                    private String cardPwd;
                    
            /**
             * 卡券详情
             */
                    @Column(name = "card_desc")
                    private String cardDesc;
                    
            /**
             * 卡券类型
             */
                    @Column(name = "card_type")
                    private String cardType;
                    
            /**
             * 生效时间
             */
                        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
                    @Column(name = "vaild_date")
                    private Date vaildDate;
                    
            /**
             * 失效日期
             */
                        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
                    @Column(name = "expire_date")
                    private Date expireDate;
                    
            /**
             * 卡券状态0未领取1已领取9已使用
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
         * 获取：卡券编号
         */
        public String getCardId() {
            return cardId;
        }

        /**
         * 设置：卡券编号
         */
        public void setCardId(String cardId) {
            this.cardId=cardId;
        }
    
        /**
         * 获取：卡券名称
         */
        public String getCardName() {
            return cardName;
        }

        /**
         * 设置：卡券名称
         */
        public void setCardName(String cardName) {
            this.cardName=cardName;
        }
    
        /**
         * 获取：卡券卡号
         */
        public String getCardNo() {
            return cardNo;
        }

        /**
         * 设置：卡券卡号
         */
        public void setCardNo(String cardNo) {
            this.cardNo=cardNo;
        }
    
        /**
         * 获取：卡券卡密
         */
        public String getCardPwd() {
            return cardPwd;
        }

        /**
         * 设置：卡券卡密
         */
        public void setCardPwd(String cardPwd) {
            this.cardPwd=cardPwd;
        }
    
        /**
         * 获取：卡券详情
         */
        public String getCardDesc() {
            return cardDesc;
        }

        /**
         * 设置：卡券详情
         */
        public void setCardDesc(String cardDesc) {
            this.cardDesc=cardDesc;
        }
    
        /**
         * 获取：卡券类型
         */
        public String getCardType() {
            return cardType;
        }

        /**
         * 设置：卡券类型
         */
        public void setCardType(String cardType) {
            this.cardType=cardType;
        }
    
        /**
         * 获取：生效时间
         */
        public Date getVaildDate() {
            return vaildDate;
        }

        /**
         * 设置：生效时间
         */
        public void setVaildDate(Date vaildDate) {
            this.vaildDate=vaildDate;
        }
    
        /**
         * 获取：失效日期
         */
        public Date getExpireDate() {
            return expireDate;
        }

        /**
         * 设置：失效日期
         */
        public void setExpireDate(Date expireDate) {
            this.expireDate=expireDate;
        }
    
        /**
         * 获取：卡券状态0未领取1已领取9已使用
         */
        public Integer getStatus() {
            return status;
        }

        /**
         * 设置：卡券状态0未领取1已领取9已使用
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
    }
