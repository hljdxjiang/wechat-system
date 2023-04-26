package com.nuoding.wechat.common.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 楼层信息表(SysFlowInfo)实体类
 *
 * @author jhc
 * @since 2023-04-21 15:15:08
 */
public class SysFlowInfo implements Serializable {
    private static final long serialVersionUID = -74841402452050986L;
    
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
     * 页面标题
     */
    private String flowTitle;
    /**
     * 页面类型
     */
    private String flowType;
    /**
     * 楼层展示样式
     */
    private String flowShowType;
    /**
     * 控制标识：ALL,LOCAL,OFF
     */
    private String controlFlag;
    /**
     * 页面备注
     */
    private String flowRemark;
    /**
     * 创建用户ID
     */
    private String userid;
    /**
     * 最后修改用户ID
     */
    private String modifyUserid;
    /**
     * 楼层数据
     */
    private String flowData;
    /**
     * 读取数据数量
     */
    private Integer flowDataCount;
    /**
     * 楼层图片
     */
    private String flowImg;
    /**
     * 楼层跳转链接
     */
    private String flowUrl;
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

    public String getFlowTitle() {
        return flowTitle;
    }

    public void setFlowTitle(String flowTitle) {
        this.flowTitle = flowTitle;
    }

    public String getFlowType() {
        return flowType;
    }

    public void setFlowType(String flowType) {
        this.flowType = flowType;
    }

    public String getFlowShowType() {
        return flowShowType;
    }

    public void setFlowShowType(String flowShowType) {
        this.flowShowType = flowShowType;
    }

    public String getControlFlag() {
        return controlFlag;
    }

    public void setControlFlag(String controlFlag) {
        this.controlFlag = controlFlag;
    }

    public String getFlowRemark() {
        return flowRemark;
    }

    public void setFlowRemark(String flowRemark) {
        this.flowRemark = flowRemark;
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

    public String getFlowData() {
        return flowData;
    }

    public void setFlowData(String flowData) {
        this.flowData = flowData;
    }

    public Integer getFlowDataCount() {
        return flowDataCount;
    }

    public void setFlowDataCount(Integer flowDataCount) {
        this.flowDataCount = flowDataCount;
    }

    public String getFlowImg() {
        return flowImg;
    }

    public void setFlowImg(String flowImg) {
        this.flowImg = flowImg;
    }

    public String getFlowUrl() {
        return flowUrl;
    }

    public void setFlowUrl(String flowUrl) {
        this.flowUrl = flowUrl;
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

