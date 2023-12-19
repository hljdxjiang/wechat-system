package com.nuoding.wechat.common.entity.user;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;


/**
 * 抽奖获奖记录表
 *
 * @Author: hzq
 * @Date: 2023-12-18 14:57:38
 */
@Entity
@Table(name = "user_winning_record")
public class UserWinningRecordEntity implements Serializable {

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
     * 抽奖ID
     */
    @Column(name = "lottery_id")
    private String lotteryId;

    /**
     * 奖品类型
     */
    @Column(name = "win_type")
    private String winType;

    /**
     * 奖品编号
     */
    @Column(name = "win_prod_code")
    private String winProdCode;

    /**
     * 奖品秘钥
     */
    @Column(name = "win_prod_pass")
    private String winProdPass;


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
     * 获取：奖品类型
     */
    public String getWinType() {
        return winType;
    }

    /**
     * 设置：奖品类型
     */
    public void setWinType(String winType) {
        this.winType = winType;
    }

    /**
     * 获取：奖品编号
     */
    public String getWinProdCode() {
        return winProdCode;
    }

    /**
     * 设置：奖品编号
     */
    public void setWinProdCode(String winProdCode) {
        this.winProdCode = winProdCode;
    }

    /**
     * 获取：奖品秘钥
     */
    public String getWinProdPass() {
        return winProdPass;
    }

    /**
     * 设置：奖品秘钥
     */
    public void setWinProdPass(String winProdPass) {
        this.winProdPass = winProdPass;
    }
}
