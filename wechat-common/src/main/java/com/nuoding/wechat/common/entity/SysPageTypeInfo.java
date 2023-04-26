package com.nuoding.wechat.common.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 类型配置表(SysPageTypeInfo)实体类
 *
 * @author jhc
 * @since 2023-04-21 15:15:10
 */
public class SysPageTypeInfo implements Serializable {
    private static final long serialVersionUID = -41406572729004408L;
    
    private Integer id;
    /**
     * 租户ID
     */
    private String tenantId;
    /**
     * 类型ID
     */
    private String typeId;
    /**
     * 类型描述
     */
    private String typeDesc;
    /**
     * 状态0启用1禁用
     */
    private Integer status;
    /**
     * 类型备注
     */
    private String typeRemark;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 最后修改时间
     */
    private Date lastModifiedTime;
    /**
     * 创建用户ID
     */
    private String userid;
    /**
     * 最后修改用户ID
     */
    private String modifyUserid;
    /**
     * 类型大类
     */
    private String typeKind;
    /**
     * 排序
     */
    private Integer typeSort;


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

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getTypeRemark() {
        return typeRemark;
    }

    public void setTypeRemark(String typeRemark) {
        this.typeRemark = typeRemark;
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

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getModifyUserid() {
        return modifyUserid;
    }

    public void setModifyUserid(String modifyUserid) {
        this.modifyUserid = modifyUserid;
    }

    public String getTypeKind() {
        return typeKind;
    }

    public void setTypeKind(String typeKind) {
        this.typeKind = typeKind;
    }

    public Integer getTypeSort() {
        return typeSort;
    }

    public void setTypeSort(Integer typeSort) {
        this.typeSort = typeSort;
    }

}

