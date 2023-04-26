package com.nuoding.wechat.common.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 页面信息表(SysPageInfo)实体类
 *
 * @author jhc
 * @since 2023-04-21 15:15:11
 */
public class SysPageInfo implements Serializable {
    private static final long serialVersionUID = 599023760674539749L;
    
    private Integer id;
    /**
     * 租户ID
     */
    private String tenantId;
    /**
     * 页面ID
     */
    private String pageId;
    /**
     * 页面标题
     */
    private String pageTitle;
    /**
     * 页面类型
     */
    private String pageType;
    /**
     * 控制标识：ALL,LOCAL,OFF
     */
    private String controlFlag;
    /**
     * 是否需要登录0需要1不需要
     */
    private Integer needLogin;
    /**
     * 页面备注
     */
    private String pageRemark;
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
    /**
     * 创建用户ID
     */
    private String userid;
    /**
     * 最后修改用户ID
     */
    private String modifyUserid;


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

    public String getPageId() {
        return pageId;
    }

    public void setPageId(String pageId) {
        this.pageId = pageId;
    }

    public String getPageTitle() {
        return pageTitle;
    }

    public void setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle;
    }

    public String getPageType() {
        return pageType;
    }

    public void setPageType(String pageType) {
        this.pageType = pageType;
    }

    public String getControlFlag() {
        return controlFlag;
    }

    public void setControlFlag(String controlFlag) {
        this.controlFlag = controlFlag;
    }

    public Integer getNeedLogin() {
        return needLogin;
    }

    public void setNeedLogin(Integer needLogin) {
        this.needLogin = needLogin;
    }

    public String getPageRemark() {
        return pageRemark;
    }

    public void setPageRemark(String pageRemark) {
        this.pageRemark = pageRemark;
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

}

