package com.nuoding.wechat.common.entity.crm;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;


/**
 * 产品分组表
 *
 * @Author: hzq
 * @Date: 2023-12-18 14:57:38
 */
@Entity
@Table(name = "crm_prod_group")
public class CrmProdGroupEntity implements Serializable {

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
     * 产品编号
     */
    @Column(name = "prod_id")
    private String prodId;

    /**
     * 分组ID
     */
    @Column(name = "prod_group_id")
    private String prodGroupId;

    /**
     * 分组名称
     */
    @Column(name = "prod_group_name")
    private String prodGroupName;

    /**
     * 备注
     */
    @Column(name = "remark")
    private String remark;

    /**
     * 状态
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
     * 获取：产品编号
     */
    public String getProdId() {
        return prodId;
    }

    /**
     * 设置：产品编号
     */
    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    /**
     * 获取：分组ID
     */
    public String getProdGroupId() {
        return prodGroupId;
    }

    /**
     * 设置：分组ID
     */
    public void setProdGroupId(String prodGroupId) {
        this.prodGroupId = prodGroupId;
    }

    /**
     * 获取：分组名称
     */
    public String getProdGroupName() {
        return prodGroupName;
    }

    /**
     * 设置：分组名称
     */
    public void setProdGroupName(String prodGroupName) {
        this.prodGroupName = prodGroupName;
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
        this.remark = remark;
    }

    /**
     * 获取：状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置：状态
     */
    public void setStatus(Integer status) {
        this.status = status;
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
