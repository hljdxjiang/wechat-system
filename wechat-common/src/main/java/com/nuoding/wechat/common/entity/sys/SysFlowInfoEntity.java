package com.nuoding.wechat.common.entity.sys;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;


/**
 * 楼层信息表
 *
 * @Author: hzq
 * @Date: 2023-06-08 17:37:05
 */
@Entity
@Table(name = "sys_flow_info")
public class SysFlowInfoEntity implements Serializable {

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
     * 页面ID
     */
    @Column(name = "flow_id")
    private String flowId;

    /**
     * 页面标题
     */
    @Column(name = "flow_title")
    private String flowTitle;

    /**
     * 页面类型
     */
    @Column(name = "flow_type")
    private String flowType;

    /**
     * 楼层展示样式
     */
    @Column(name = "flow_show_type")
    private String flowShowType;

    /**
     * 控制标识：ALL,LOCAL,OFF
     */
    @Column(name = "control_flag")
    private String controlFlag;

    /**
     * 页面备注
     */
    @Column(name = "flow_remark")
    private String flowRemark;

    /**
     * 创建用户ID
     */
    @Column(name = "userid")
    private String userid;

    /**
     * 最后修改用户ID
     */
    @Column(name = "modify_userid")
    private String modifyUserid;

    /**
     * 楼层数据
     */
    @Column(name = "flow_data")
    private String flowData;

    /**
     * 读取数据数量
     */
    @Column(name = "flow_data_count")
    private Integer flowDataCount;

    /**
     * 楼层图片
     */
    @Column(name = "flow_img")
    private String flowImg;

    /**
     * 楼层跳转链接
     */
    @Column(name = "flow_url")
    private String flowUrl;

    /**
     * 用户状态
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
     * 获取：页面ID
     */
    public String getFlowId() {
        return flowId;
    }

    /**
     * 设置：页面ID
     */
    public void setFlowId(String flowId) {
        this.flowId = flowId;
    }

    /**
     * 获取：页面标题
     */
    public String getFlowTitle() {
        return flowTitle;
    }

    /**
     * 设置：页面标题
     */
    public void setFlowTitle(String flowTitle) {
        this.flowTitle = flowTitle;
    }

    /**
     * 获取：页面类型
     */
    public String getFlowType() {
        return flowType;
    }

    /**
     * 设置：页面类型
     */
    public void setFlowType(String flowType) {
        this.flowType = flowType;
    }

    /**
     * 获取：楼层展示样式
     */
    public String getFlowShowType() {
        return flowShowType;
    }

    /**
     * 设置：楼层展示样式
     */
    public void setFlowShowType(String flowShowType) {
        this.flowShowType = flowShowType;
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

    /**
     * 获取：页面备注
     */
    public String getFlowRemark() {
        return flowRemark;
    }

    /**
     * 设置：页面备注
     */
    public void setFlowRemark(String flowRemark) {
        this.flowRemark = flowRemark;
    }

    /**
     * 获取：创建用户ID
     */
    public String getUserid() {
        return userid;
    }

    /**
     * 设置：创建用户ID
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * 获取：最后修改用户ID
     */
    public String getModifyUserid() {
        return modifyUserid;
    }

    /**
     * 设置：最后修改用户ID
     */
    public void setModifyUserid(String modifyUserid) {
        this.modifyUserid = modifyUserid;
    }

    /**
     * 获取：楼层数据
     */
    public String getFlowData() {
        return flowData;
    }

    /**
     * 设置：楼层数据
     */
    public void setFlowData(String flowData) {
        this.flowData = flowData;
    }

    /**
     * 获取：读取数据数量
     */
    public Integer getFlowDataCount() {
        return flowDataCount;
    }

    /**
     * 设置：读取数据数量
     */
    public void setFlowDataCount(Integer flowDataCount) {
        this.flowDataCount = flowDataCount;
    }

    /**
     * 获取：楼层图片
     */
    public String getFlowImg() {
        return flowImg;
    }

    /**
     * 设置：楼层图片
     */
    public void setFlowImg(String flowImg) {
        this.flowImg = flowImg;
    }

    /**
     * 获取：楼层跳转链接
     */
    public String getFlowUrl() {
        return flowUrl;
    }

    /**
     * 设置：楼层跳转链接
     */
    public void setFlowUrl(String flowUrl) {
        this.flowUrl = flowUrl;
    }

    /**
     * 获取：用户状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置：用户状态
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
