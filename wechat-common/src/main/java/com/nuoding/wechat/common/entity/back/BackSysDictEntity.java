package com.nuoding.wechat.common.entity.back;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;


/**
 * 字典表
 *
 * @Author: hzq
 * @Date: 2023-12-18 14:57:39
 */
@Entity
@Table(name = "back_sys_dict")
public class BackSysDictEntity implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
     * 字典id
     */
    @Id
    @Column(length = 32)
    private Integer id;

    /**
     * 字典键值
     */
    @Column(name = "dict_value")
    private String dictValue;

    /**
     * 字典标签
     */
    @Column(name = "dict_title")
    private String dictTitle;

    /**
     * 字典类型
     */
    @Column(name = "dict_type")
    private String dictType;

    /**
     * 字典排序
     */
    @Column(name = "dict_sort")
    private Integer dictSort;

    /**
     * 状态（0正常1停用）
     */
    @Column(name = "status")
    private String status;

    /**
     * 备注
     */
    @Column(name = "remark")
    private String remark;

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
     * 获取：字典id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置：字典id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取：字典键值
     */
    public String getDictValue() {
        return dictValue;
    }

    /**
     * 设置：字典键值
     */
    public void setDictValue(String dictValue) {
        this.dictValue = dictValue;
    }

    /**
     * 获取：字典标签
     */
    public String getDictTitle() {
        return dictTitle;
    }

    /**
     * 设置：字典标签
     */
    public void setDictTitle(String dictTitle) {
        this.dictTitle = dictTitle;
    }

    /**
     * 获取：字典类型
     */
    public String getDictType() {
        return dictType;
    }

    /**
     * 设置：字典类型
     */
    public void setDictType(String dictType) {
        this.dictType = dictType;
    }

    /**
     * 获取：字典排序
     */
    public Integer getDictSort() {
        return dictSort;
    }

    /**
     * 设置：字典排序
     */
    public void setDictSort(Integer dictSort) {
        this.dictSort = dictSort;
    }

    /**
     * 获取：状态（0正常1停用）
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置：状态（0正常1停用）
     */
    public void setStatus(String status) {
        this.status = status;
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
