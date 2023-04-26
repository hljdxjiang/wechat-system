package com.nuoding.wechat.common.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 楼层要素表(SysFlowItems)实体类
 *
 * @author jhc
 * @since 2023-04-21 15:15:11
 */
public class SysFlowItems implements Serializable {
    private static final long serialVersionUID = -61394515368820701L;
    
    private Integer id;
    /**
     * 租户ID
     */
    private String tenantId;
    /**
     * 页面ID
     */
    private String flowId;
    /**
     * 标签ID
     */
    private String itemId;
    /**
     * 排序
     */
    private Integer itemSort;
    /**
     * 用户状态
     */
    private Integer status;
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

    public String getFlowId() {
        return flowId;
    }

    public void setFlowId(String flowId) {
        this.flowId = flowId;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public Integer getItemSort() {
        return itemSort;
    }

    public void setItemSort(Integer itemSort) {
        this.itemSort = itemSort;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
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

