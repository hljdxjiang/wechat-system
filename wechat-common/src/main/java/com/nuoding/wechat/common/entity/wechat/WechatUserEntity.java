package com.nuoding.wechat.common.entity.wechat;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;


/**
 * 微信用户信息表
 *
 * @Author: hzq
 * @Date: 2023-12-18 14:57:38
 */
@Entity
@Table(name = "wechat_user")
public class WechatUserEntity implements Serializable {

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
     * 开放平台下统一ID
     */
    @Column(name = "unionid")
    private String unionid;

    /**
     * 微信公众号openId
     */
    @Column(name = "wxopenid")
    private String wxopenid;

    /**
     * 微信昵称
     */
    @Column(name = "nickname")
    private String nickname;

    /**
     * 性别1为男,2为女,0为未知
     */
    @Column(name = "sex")
    private Integer sex;

    /**
     * 省
     */
    @Column(name = "province")
    private String province;

    /**
     * 城市
     */
    @Column(name = "city")
    private String city;

    /**
     * 国家
     */
    @Column(name = "country")
    private String country;

    /**
     * 头像地址
     */
    @Column(name = "headimgurl")
    private String headimgurl;

    /**
     * 用户特权信息
     */
    @Column(name = "privilege")
    private String privilege;

    /**
     * 手机号码
     */
    @Column(name = "mobile_no")
    private String mobileNo;

    /**
     * 用户状态
     */
    @Column(name = "status")
    private String status;

    /**
     * 客户ID
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 用户备注
     */
    @Column(name = "remark")
    private String remark;

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
     * 获取：开放平台下统一ID
     */
    public String getUnionid() {
        return unionid;
    }

    /**
     * 设置：开放平台下统一ID
     */
    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }

    /**
     * 获取：微信公众号openId
     */
    public String getWxopenid() {
        return wxopenid;
    }

    /**
     * 设置：微信公众号openId
     */
    public void setWxopenid(String wxopenid) {
        this.wxopenid = wxopenid;
    }

    /**
     * 获取：微信昵称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 设置：微信昵称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * 获取：性别1为男,2为女,0为未知
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * 设置：性别1为男,2为女,0为未知
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * 获取：省
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置：省
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * 获取：城市
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置：城市
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 获取：国家
     */
    public String getCountry() {
        return country;
    }

    /**
     * 设置：国家
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 获取：头像地址
     */
    public String getHeadimgurl() {
        return headimgurl;
    }

    /**
     * 设置：头像地址
     */
    public void setHeadimgurl(String headimgurl) {
        this.headimgurl = headimgurl;
    }

    /**
     * 获取：用户特权信息
     */
    public String getPrivilege() {
        return privilege;
    }

    /**
     * 设置：用户特权信息
     */
    public void setPrivilege(String privilege) {
        this.privilege = privilege;
    }

    /**
     * 获取：手机号码
     */
    public String getMobileNo() {
        return mobileNo;
    }

    /**
     * 设置：手机号码
     */
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
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
     * 获取：客户ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置：客户ID
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取：用户备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置：用户备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
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
