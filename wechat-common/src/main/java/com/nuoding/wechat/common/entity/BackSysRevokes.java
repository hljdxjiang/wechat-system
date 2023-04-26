package com.nuoding.wechat.common.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 系统权限表(BackSysRevokes)实体类
 *
 * @author jhc
 * @since 2023-03-07 14:38:30
 */
public class BackSysRevokes implements Serializable {
    private static final long serialVersionUID = -52254680860608428L;
    /**
     * 主键ID
     */
    private Integer id;
    /**
     * 权限ID
     */
    private String revokeId;
    /**
     * 菜单权限标题
     */
    private String revokeTitle;
    /**
     * 权限类型
     */
    private String revokeType;
    /**
     * 权限父ID
     */
    private String revokeParentid;

    private Date createTime;

    private Date lastModifiedTime;
    /**
     * 备注信息
     */
    private String remark;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRevokeId() {
        return revokeId;
    }

    public void setRevokeId(String revokeId) {
        this.revokeId = revokeId;
    }

    public String getRevokeTitle() {
        return revokeTitle;
    }

    public void setRevokeTitle(String revokeTitle) {
        this.revokeTitle = revokeTitle;
    }

    public String getRevokeType() {
        return revokeType;
    }

    public void setRevokeType(String revokeType) {
        this.revokeType = revokeType;
    }

    public String getRevokeParentid() {
        return revokeParentid;
    }

    public void setRevokeParentid(String revokeParentid) {
        this.revokeParentid = revokeParentid;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}

