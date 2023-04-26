package com.nuoding.wechat.common.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (WechatMinipUser)实体类
 *
 * @author jhc
 * @since 2023-03-07 14:39:17
 */
public class WechatMinipUser implements Serializable {
    private static final long serialVersionUID = 837299272726823933L;

    private Integer id;

    private String mopenid;

    private String unionid;

    private String nickname;
    /**
     * 性别1为男,2为女,0为未知
     */
    private Integer gender;
    /**
     * 省
     */
    private String province;
    /**
     * 城市
     */
    private String city;
    /**
     * 国家
     */
    private String country;
    /**
     * 头像地址
     */
    private String avatarurl;
    /**
     * 备注
     */
    private String wartermark;
    /**
     * 创建时间
     */
    private Date createtime;
    /**
     * 最后修改时间
     */
    private Date lastmodifiedtime;
    /**
     * 手机号码
     */
    private String mobileNo;
    /**
     * 用户状态
     */
    private String status;
    /**
     * 管理客户ID
     */
    private String userId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMopenid() {
        return mopenid;
    }

    public void setMopenid(String mopenid) {
        this.mopenid = mopenid;
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAvatarurl() {
        return avatarurl;
    }

    public void setAvatarurl(String avatarurl) {
        this.avatarurl = avatarurl;
    }

    public String getWartermark() {
        return wartermark;
    }

    public void setWartermark(String wartermark) {
        this.wartermark = wartermark;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getLastmodifiedtime() {
        return lastmodifiedtime;
    }

    public void setLastmodifiedtime(Date lastmodifiedtime) {
        this.lastmodifiedtime = lastmodifiedtime;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

}

