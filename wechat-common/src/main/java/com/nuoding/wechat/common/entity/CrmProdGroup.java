package com.nuoding.wechat.common.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (CrmProdGroup)实体类
 *
 * @author jhc
 * @since 2023-03-07 14:38:37
 */
public class CrmProdGroup implements Serializable {
    private static final long serialVersionUID = -76592904152819117L;

    private Integer id;
    /**
     * 租户ID
     */
    private String tenantId;
    /**
     * 产品编号
     */
    private String prodId;
    /**
     * 分组ID
     */
    private String prodGroupId;
    /**
     * 分组名称
     */
    private String prodGroupName;
    /**
     * 备注
     */
    private String remark;
    /**
     * 状态
     */
    private Object status;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 最后修改时间
     */
    private Date lastModifiedTime;


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

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public String getProdGroupId() {
        return prodGroupId;
    }

    public void setProdGroupId(String prodGroupId) {
        this.prodGroupId = prodGroupId;
    }

    public String getProdGroupName() {
        return prodGroupName;
    }

    public void setProdGroupName(String prodGroupName) {
        this.prodGroupName = prodGroupName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Object getStatus() {
        return status;
    }

    public void setStatus(Object status) {
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

}

