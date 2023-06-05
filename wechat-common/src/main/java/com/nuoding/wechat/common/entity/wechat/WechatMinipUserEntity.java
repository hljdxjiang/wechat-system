package com.nuoding.wechat.common.entity.wechat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.math.BigDecimal;


/**
 * 小程序用户信息表
 *
 * @Author: hzq
 * @Date: 2023-06-05 17:49:46
 */
@Entity
@Table(name = "wechat_minip_user")
public class WechatMinipUserEntity implements Serializable {

    private static final long serialVersionUID = 1L;

            
            /**
             * 
             */
            @Id
            @Column(length = 32)
            private Integer id;
                    
            /**
             * 
             */
                    @Column(name = "mopenid")
                    private String mopenid;
                    
            /**
             * 
             */
                    @Column(name = "unionid")
                    private String unionid;
                    
            /**
             * 
             */
                    @Column(name = "nickname")
                    private String nickname;
                    
            /**
             * 性别1为男,2为女,0为未知
             */
                    @Column(name = "gender")
                    private Integer gender;
                    
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
                    @Column(name = "avatarurl")
                    private String avatarurl;
                    
            /**
             * 备注
             */
                    @Column(name = "wartermark")
                    private String wartermark;
                    
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
             * 管理客户ID
             */
                    @Column(name = "user_id")
                    private String userId;
            
    
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
         * 获取：
         */
        public String getMopenid() {
            return mopenid;
        }

        /**
         * 设置：
         */
        public void setMopenid(String mopenid) {
            this.mopenid=mopenid;
        }
    
        /**
         * 获取：
         */
        public String getUnionid() {
            return unionid;
        }

        /**
         * 设置：
         */
        public void setUnionid(String unionid) {
            this.unionid=unionid;
        }
    
        /**
         * 获取：
         */
        public String getNickname() {
            return nickname;
        }

        /**
         * 设置：
         */
        public void setNickname(String nickname) {
            this.nickname=nickname;
        }
    
        /**
         * 获取：性别1为男,2为女,0为未知
         */
        public Integer getGender() {
            return gender;
        }

        /**
         * 设置：性别1为男,2为女,0为未知
         */
        public void setGender(Integer gender) {
            this.gender=gender;
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
            this.province=province;
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
            this.city=city;
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
            this.country=country;
        }
    
        /**
         * 获取：头像地址
         */
        public String getAvatarurl() {
            return avatarurl;
        }

        /**
         * 设置：头像地址
         */
        public void setAvatarurl(String avatarurl) {
            this.avatarurl=avatarurl;
        }
    
        /**
         * 获取：备注
         */
        public String getWartermark() {
            return wartermark;
        }

        /**
         * 设置：备注
         */
        public void setWartermark(String wartermark) {
            this.wartermark=wartermark;
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
            this.createtime=createtime;
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
            this.lastmodifiedtime=lastmodifiedtime;
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
            this.mobileNo=mobileNo;
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
         * 获取：管理客户ID
         */
        public String getUserId() {
            return userId;
        }

        /**
         * 设置：管理客户ID
         */
        public void setUserId(String userId) {
            this.userId=userId;
        }
    }
