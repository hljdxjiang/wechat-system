package com.nuoding.wechat.common.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (CrmBrandInfo)实体类
 *
 * @author jhc
 * @since 2023-03-07 14:38:34
 */
public class CrmBrandInfo implements Serializable {
    private static final long serialVersionUID = 555543545508414589L;

    private Integer id;
    /**
     * 租户ID
     */
    private String tenantId;
    /**
     * 品牌编号
     */
    private String brandId;
    /**
     * 品牌名称
     */
    private String brandName;
    /**
     * 品牌logo路径
     */
    private String brandLogo;
    /**
     * 企业名称
     */
    private String companyName;
    /**
     * 企业社会信用代码
     */
    private String brandUscc;
    /**
     * 联系人姓名
     */
    private String connectUname;
    /**
     * 联系人电话
     */
    private String connectMobileNo;
    /**
     * 联系人微信ID
     */
    private String connectWechatId;
    /**
     * 品牌简介
     */
    private String brandDesc;
    /**
     * 企业简介
     */
    private String companyDesc;
    /**
     * 品牌详情
     */
    private String brandDetail;
    /**
     * 企业详情
     */
    private String companyDetail;
    /**
     * 合约生效日
     */
    private Date vaildDate;
    /**
     * 合约失效日期
     */
    private Date expiredDate;
    /**
     * 品牌加盟费
     */
    private Object brandFee;
    /**
     * 押金/保证金
     */
    private Object brandMargin;
    /**
     * 备注
     */
    private String remark;
    /**
     * 用户状态
     */
    private String status;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 最后修改时间
     */
    private Date lastModifiedTime;
    /**
     * 产品公共展示信息
     */
    private String brandCommonDesc;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandLogo() {
        return brandLogo;
    }

    public void setBrandLogo(String brandLogo) {
        this.brandLogo = brandLogo;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getBrandUscc() {
        return brandUscc;
    }

    public void setBrandUscc(String brandUscc) {
        this.brandUscc = brandUscc;
    }

    public String getConnectUname() {
        return connectUname;
    }

    public void setConnectUname(String connectUname) {
        this.connectUname = connectUname;
    }

    public String getConnectMobileNo() {
        return connectMobileNo;
    }

    public void setConnectMobileNo(String connectMobileNo) {
        this.connectMobileNo = connectMobileNo;
    }

    public String getConnectWechatId() {
        return connectWechatId;
    }

    public void setConnectWechatId(String connectWechatId) {
        this.connectWechatId = connectWechatId;
    }

    public String getBrandDesc() {
        return brandDesc;
    }

    public void setBrandDesc(String brandDesc) {
        this.brandDesc = brandDesc;
    }

    public String getCompanyDesc() {
        return companyDesc;
    }

    public void setCompanyDesc(String companyDesc) {
        this.companyDesc = companyDesc;
    }

    public String getBrandDetail() {
        return brandDetail;
    }

    public void setBrandDetail(String brandDetail) {
        this.brandDetail = brandDetail;
    }

    public String getCompanyDetail() {
        return companyDetail;
    }

    public void setCompanyDetail(String companyDetail) {
        this.companyDetail = companyDetail;
    }

    public Date getVaildDate() {
        return vaildDate;
    }

    public void setVaildDate(Date vaildDate) {
        this.vaildDate = vaildDate;
    }

    public Date getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(Date expiredDate) {
        this.expiredDate = expiredDate;
    }

    public Object getBrandFee() {
        return brandFee;
    }

    public void setBrandFee(Object brandFee) {
        this.brandFee = brandFee;
    }

    public Object getBrandMargin() {
        return brandMargin;
    }

    public void setBrandMargin(Object brandMargin) {
        this.brandMargin = brandMargin;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    public String getBrandCommonDesc() {
        return brandCommonDesc;
    }

    public void setBrandCommonDesc(String brandCommonDesc) {
        this.brandCommonDesc = brandCommonDesc;
    }

}

