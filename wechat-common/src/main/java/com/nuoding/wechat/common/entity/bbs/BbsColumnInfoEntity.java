package com.nuoding.wechat.common.entity.bbs;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;


/**
 * 文章栏目信息表
 *
 * @Author: hzq
 * @Date: 2023-06-08 17:37:05
 */
@Entity
@Table(name = "bbs_column_info")
public class BbsColumnInfoEntity implements Serializable {

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
     * 栏目ID
     */
    @Column(name = "column_id")
    private String columnId;

    /**
     * 栏目名称
     */
    @Column(name = "column_name")
    private String columnName;

    /**
     * 栏目描述
     */
    @Column(name = "column_desc")
    private String columnDesc;

    /**
     * 备注
     */
    @Column(name = "remark")
    private String remark;

    /**
     * 状态0有效1失效
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
     * 获取：栏目ID
     */
    public String getColumnId() {
        return columnId;
    }

    /**
     * 设置：栏目ID
     */
    public void setColumnId(String columnId) {
        this.columnId = columnId;
    }

    /**
     * 获取：栏目名称
     */
    public String getColumnName() {
        return columnName;
    }

    /**
     * 设置：栏目名称
     */
    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    /**
     * 获取：栏目描述
     */
    public String getColumnDesc() {
        return columnDesc;
    }

    /**
     * 设置：栏目描述
     */
    public void setColumnDesc(String columnDesc) {
        this.columnDesc = columnDesc;
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
     * 获取：状态0有效1失效
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置：状态0有效1失效
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
