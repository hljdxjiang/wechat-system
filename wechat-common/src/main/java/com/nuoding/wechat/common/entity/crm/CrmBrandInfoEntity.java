package com.nuoding.wechat.common.entity.crm;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.math.BigDecimal;


/**
 * 品牌信息表
 *
 * @Author: hzq
 * @Date: 2023-06-05 17:49:47
 */
@Entity
@Table(name = "crm_brand_info")
public class CrmBrandInfoEntity implements Serializable {

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
             * 品牌编号
             */
                    @Column(name = "brand_id")
                    private String brandId;
                    
            /**
             * 品牌名称
             */
                    @Column(name = "brand_name")
                    private String brandName;
                    
            /**
             * 品牌logo路径
             */
                    @Column(name = "brand_logo")
                    private String brandLogo;
                    
            /**
             * 企业名称
             */
                    @Column(name = "company_name")
                    private String companyName;
                    
            /**
             * 企业社会信用代码
             */
                    @Column(name = "brand_uscc")
                    private String brandUscc;
                    
            /**
             * 联系人姓名
             */
                    @Column(name = "connect_uname")
                    private String connectUname;
                    
            /**
             * 联系人电话
             */
                    @Column(name = "connect_mobile_no")
                    private String connectMobileNo;
                    
            /**
             * 联系人微信ID
             */
                    @Column(name = "connect_wechat_id")
                    private String connectWechatId;
                    
            /**
             * 品牌简介
             */
                    @Column(name = "brand_desc")
                    private String brandDesc;
                    
            /**
             * 企业简介
             */
                    @Column(name = "company_desc")
                    private String companyDesc;
                    
            /**
             * 品牌详情
             */
                    @Column(name = "brand_detail")
                    private String brandDetail;
                    
            /**
             * 企业详情
             */
                    @Column(name = "company_detail")
                    private String companyDetail;
                    
            /**
             * 合约生效日
             */
                        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
                    @Column(name = "vaild_date")
                    private Date vaildDate;
                    
            /**
             * 合约失效日期
             */
                        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
                    @Column(name = "expired_date")
                    private Date expiredDate;
                    
            /**
             * 品牌加盟费

             */
                    @Column(name = "brand_fee")
                    private Double brandFee;
                    
            /**
             * 押金/保证金
             */
                    @Column(name = "brand_margin")
                    private Double brandMargin;
                    
            /**
             * 备注
             */
                    @Column(name = "remark")
                    private String remark;
                    
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
             * 产品公共展示信息
             */
                    @Column(name = "brand_common_desc")
                    private String brandCommonDesc;
            
    
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
         * 获取：品牌编号
         */
        public String getBrandId() {
            return brandId;
        }

        /**
         * 设置：品牌编号
         */
        public void setBrandId(String brandId) {
            this.brandId=brandId;
        }
    
        /**
         * 获取：品牌名称
         */
        public String getBrandName() {
            return brandName;
        }

        /**
         * 设置：品牌名称
         */
        public void setBrandName(String brandName) {
            this.brandName=brandName;
        }
    
        /**
         * 获取：品牌logo路径
         */
        public String getBrandLogo() {
            return brandLogo;
        }

        /**
         * 设置：品牌logo路径
         */
        public void setBrandLogo(String brandLogo) {
            this.brandLogo=brandLogo;
        }
    
        /**
         * 获取：企业名称
         */
        public String getCompanyName() {
            return companyName;
        }

        /**
         * 设置：企业名称
         */
        public void setCompanyName(String companyName) {
            this.companyName=companyName;
        }
    
        /**
         * 获取：企业社会信用代码
         */
        public String getBrandUscc() {
            return brandUscc;
        }

        /**
         * 设置：企业社会信用代码
         */
        public void setBrandUscc(String brandUscc) {
            this.brandUscc=brandUscc;
        }
    
        /**
         * 获取：联系人姓名
         */
        public String getConnectUname() {
            return connectUname;
        }

        /**
         * 设置：联系人姓名
         */
        public void setConnectUname(String connectUname) {
            this.connectUname=connectUname;
        }
    
        /**
         * 获取：联系人电话
         */
        public String getConnectMobileNo() {
            return connectMobileNo;
        }

        /**
         * 设置：联系人电话
         */
        public void setConnectMobileNo(String connectMobileNo) {
            this.connectMobileNo=connectMobileNo;
        }
    
        /**
         * 获取：联系人微信ID
         */
        public String getConnectWechatId() {
            return connectWechatId;
        }

        /**
         * 设置：联系人微信ID
         */
        public void setConnectWechatId(String connectWechatId) {
            this.connectWechatId=connectWechatId;
        }
    
        /**
         * 获取：品牌简介
         */
        public String getBrandDesc() {
            return brandDesc;
        }

        /**
         * 设置：品牌简介
         */
        public void setBrandDesc(String brandDesc) {
            this.brandDesc=brandDesc;
        }
    
        /**
         * 获取：企业简介
         */
        public String getCompanyDesc() {
            return companyDesc;
        }

        /**
         * 设置：企业简介
         */
        public void setCompanyDesc(String companyDesc) {
            this.companyDesc=companyDesc;
        }
    
        /**
         * 获取：品牌详情
         */
        public String getBrandDetail() {
            return brandDetail;
        }

        /**
         * 设置：品牌详情
         */
        public void setBrandDetail(String brandDetail) {
            this.brandDetail=brandDetail;
        }
    
        /**
         * 获取：企业详情
         */
        public String getCompanyDetail() {
            return companyDetail;
        }

        /**
         * 设置：企业详情
         */
        public void setCompanyDetail(String companyDetail) {
            this.companyDetail=companyDetail;
        }
    
        /**
         * 获取：合约生效日
         */
        public Date getVaildDate() {
            return vaildDate;
        }

        /**
         * 设置：合约生效日
         */
        public void setVaildDate(Date vaildDate) {
            this.vaildDate=vaildDate;
        }
    
        /**
         * 获取：合约失效日期
         */
        public Date getExpiredDate() {
            return expiredDate;
        }

        /**
         * 设置：合约失效日期
         */
        public void setExpiredDate(Date expiredDate) {
            this.expiredDate=expiredDate;
        }
    
        /**
         * 获取：品牌加盟费

         */
        public Double getBrandFee() {
            return brandFee;
        }

        /**
         * 设置：品牌加盟费

         */
        public void setBrandFee(Double brandFee) {
            this.brandFee=brandFee;
        }
    
        /**
         * 获取：押金/保证金
         */
        public Double getBrandMargin() {
            return brandMargin;
        }

        /**
         * 设置：押金/保证金
         */
        public void setBrandMargin(Double brandMargin) {
            this.brandMargin=brandMargin;
        }
    
        /**
         * 获取：备注
         */
        public String getRemark() {
            return remark;
        }

        /**
         * 设置：备注
         */
        public void setRemark(String remark) {
            this.remark=remark;
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
         * 获取：产品公共展示信息
         */
        public String getBrandCommonDesc() {
            return brandCommonDesc;
        }

        /**
         * 设置：产品公共展示信息
         */
        public void setBrandCommonDesc(String brandCommonDesc) {
            this.brandCommonDesc=brandCommonDesc;
        }
    }
