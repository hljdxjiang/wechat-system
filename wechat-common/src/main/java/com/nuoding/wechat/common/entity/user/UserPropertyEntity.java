package com.nuoding.wechat.common.entity.user;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


/**
 * 用户资产信息表
 *
 * @Author: hzq
 * @Date: 2023-12-18 14:57:38
 */
@Entity
@Table(name = "user_property")
public class UserPropertyEntity implements Serializable {

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
     * 登录账号
     */
    @Column(name = "userid")
    private String userid;

    /**
     * 积分
     */
    @Column(name = "integral")
    private String integral;

    /**
     * 金币
     */
    @Column(name = "species")
    private String species;

    /**
     * 银币
     */
    @Column(name = "silver_icon")
    private String silverIcon;

    /**
     * 余额
     */
    @Column(name = "balance")
    private BigDecimal balance;

    /**
     * 赠送金额余额
     */
    @Column(name = "gift_amount")
    private BigDecimal giftAmount;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "createtime")
    private Date createtime;

    /**
     * 最后修改时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "lastmodifiedtime")
    private Date lastmodifiedtime;


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
     * 获取：登录账号
     */
    public String getUserid() {
        return userid;
    }

    /**
     * 设置：登录账号
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * 获取：积分
     */
    public String getIntegral() {
        return integral;
    }

    /**
     * 设置：积分
     */
    public void setIntegral(String integral) {
        this.integral = integral;
    }

    /**
     * 获取：金币
     */
    public String getSpecies() {
        return species;
    }

    /**
     * 设置：金币
     */
    public void setSpecies(String species) {
        this.species = species;
    }

    /**
     * 获取：银币
     */
    public String getSilverIcon() {
        return silverIcon;
    }

    /**
     * 设置：银币
     */
    public void setSilverIcon(String silverIcon) {
        this.silverIcon = silverIcon;
    }

    /**
     * 获取：余额
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * 设置：余额
     */
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    /**
     * 获取：赠送金额余额
     */
    public BigDecimal getGiftAmount() {
        return giftAmount;
    }

    /**
     * 设置：赠送金额余额
     */
    public void setGiftAmount(BigDecimal giftAmount) {
        this.giftAmount = giftAmount;
    }

    /**
     * 获取：创建时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置：创建时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 获取：最后修改时间
     */
    public Date getLastmodifiedtime() {
        return lastmodifiedtime;
    }

    /**
     * 设置：最后修改时间
     */
    public void setLastmodifiedtime(Date lastmodifiedtime) {
        this.lastmodifiedtime = lastmodifiedtime;
    }
}
