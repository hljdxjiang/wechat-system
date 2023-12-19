package com.nuoding.wechat.common.entity.sys;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;


/**
 * 页面楼层表
 *
 * @Author: hzq
 * @Date: 2023-12-18 14:57:37
 */
@Entity
@Table(name = "sys_page_flow_info")
public class SysPageFlowInfoEntity implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
     *
     */
    @Id
    @Column(length = 32)
    private Integer id;

    /**
     * 页面ID
     */
    @Column(name = "page_id")
    private String pageId;

    /**
     * 租户ID
     */
    @Column(name = "tenant_id")
    private String tenantId;

    /**
     * 楼层ID
     */
    @Column(name = "flow_id")
    private String flowId;

    /**
     * 楼层排序
     */
    @Column(name = "flow_sort")
    private String flowSort;

    /**
     * 状态0启用1关闭
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
     * 展示渠道
     */
    @Column(name = "channel")
    private String channel;

    /**
     * 控制标识：ALL,LOCAL,OFF
     */
    @Column(name = "control_flag")
    private String controlFlag;


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
     * 获取：页面ID
     */
    public String getPageId() {
        return pageId;
    }

    /**
     * 设置：页面ID
     */
    public void setPageId(String pageId) {
        this.pageId = pageId;
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
     * 获取：楼层ID
     */
    public String getFlowId() {
        return flowId;
    }

    /**
     * 设置：楼层ID
     */
    public void setFlowId(String flowId) {
        this.flowId = flowId;
    }

    /**
     * 获取：楼层排序
     */
    public String getFlowSort() {
        return flowSort;
    }

    /**
     * 设置：楼层排序
     */
    public void setFlowSort(String flowSort) {
        this.flowSort = flowSort;
    }

    /**
     * 获取：状态0启用1关闭
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置：状态0启用1关闭
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

    /**
     * 获取：展示渠道
     */
    public String getChannel() {
        return channel;
    }

    /**
     * 设置：展示渠道
     */
    public void setChannel(String channel) {
        this.channel = channel;
    }

    /**
     * 获取：控制标识：ALL,LOCAL,OFF
     */
    public String getControlFlag() {
        return controlFlag;
    }

    /**
     * 设置：控制标识：ALL,LOCAL,OFF
     */
    public void setControlFlag(String controlFlag) {
        this.controlFlag = controlFlag;
    }
}
