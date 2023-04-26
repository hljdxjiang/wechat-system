package com.nuoding.wechat.common.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 开关控制表(BackRuleControl)实体类
 *
 * @author jhc
 * @since 2023-03-07 14:38:21
 */
public class BackRuleControl implements Serializable {
    private static final long serialVersionUID = -61335901233979977L;
    /**
     * ID
     */
    private Integer id;
    /**
     * 租户ID
     */
    private String tenantId;
    /**
     * 产品类型
     */
    private String controlType;
    /**
     * 产品描述
     */
    private String controlDesc;
    /**
     * 规则范围
     */
    private String ruleRange;
    /**
     * 控制开关
     */
    private String controlSwitch;
    /**
     * 规则表达式
     */
    private String ruleExpr;
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

    public String getControlType() {
        return controlType;
    }

    public void setControlType(String controlType) {
        this.controlType = controlType;
    }

    public String getControlDesc() {
        return controlDesc;
    }

    public void setControlDesc(String controlDesc) {
        this.controlDesc = controlDesc;
    }

    public String getRuleRange() {
        return ruleRange;
    }

    public void setRuleRange(String ruleRange) {
        this.ruleRange = ruleRange;
    }

    public String getControlSwitch() {
        return controlSwitch;
    }

    public void setControlSwitch(String controlSwitch) {
        this.controlSwitch = controlSwitch;
    }

    public String getRuleExpr() {
        return ruleExpr;
    }

    public void setRuleExpr(String ruleExpr) {
        this.ruleExpr = ruleExpr;
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

