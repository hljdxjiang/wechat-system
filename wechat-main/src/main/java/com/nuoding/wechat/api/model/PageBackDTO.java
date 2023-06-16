package com.nuoding.wechat.api.model;

import com.nuoding.wechat.common.entity.sys.SysPageFlowInfoEntity;
import com.nuoding.wechat.common.entity.sys.SysPageInfoEntity;

import javax.persistence.Column;
import java.util.List;

public class PageBackDTO {

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
     * 是否需要登录0需要1不需要
     */
    private Integer needLogin;

    private List<SysPageFlowInfoEntity> list;

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

    public Integer getNeedLogin() {
        return needLogin;
    }

    public void setNeedLogin(Integer needLogin) {
        this.needLogin = needLogin;
    }

    public List<SysPageFlowInfoEntity> getList() {
        return list;
    }

    public void setList(List<SysPageFlowInfoEntity> list) {
        this.list = list;
    }
}
