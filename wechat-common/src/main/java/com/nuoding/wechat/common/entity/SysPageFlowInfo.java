package com.nuoding.wechat.common.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 页面楼层表(SysPageFlowInfo)实体类
 *
 * @author jhc
 * @since 2023-04-21 15:15:11
 */
public class SysPageFlowInfo implements Serializable {
    private static final long serialVersionUID = 447171309020206461L;
    
    private Integer id;
    /**
     * 页面ID
     */
    private String pageId;
    /**
     * 租户ID
     */
    private String tenantId;
    /**
     * 楼层ID
     */
    private String flowId;
    /**
     * 楼层排序
     */
    private String flowSort;
    /**
     * 状态0启用1关闭
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

    public String getPageId() {
        return pageId;
    }

    public void setPageId(String pageId) {
        this.pageId = pageId;
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

    public String getFlowSort() {
        return flowSort;
    }

    public void setFlowSort(String flowSort) {
        this.flowSort = flowSort;
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

