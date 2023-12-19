package com.nuoding.wechat.common.entity.back;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


/**
 * 角色详情表
 *
 * @Author: hzq
 * @Date: 2023-12-19 11:12:08
 */
@Entity
@Table(name = "back_sys_role_detail")
public class BackSysRoleDetailEntity implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
     *
     */
    @Id
    @Column(length = 32)
    private Integer id;

    /**
     * 角色ID
     */
    @Column(name = "roleid")
    private String roleid;

    /**
     * 权限路径
     */
    @Column(name = "path")
    private String path;

    /**
     * 权限描述
     */
    @Column(name = "title")
    private String title;

    /**
     * 权限类型
     */
    @Column(name = "type")
    private String type;

    /**
     * 父ID
     */
    @Column(name = "parent_path")
    private String parentPath;


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
     * 获取：角色ID
     */
    public String getRoleid() {
        return roleid;
    }

    /**
     * 设置：角色ID
     */
    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }

    /**
     * 获取：权限路径
     */
    public String getPath() {
        return path;
    }

    /**
     * 设置：权限路径
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * 获取：权限描述
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置：权限描述
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取：权限类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置：权限类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取：父ID
     */
    public String getParentPath() {
        return parentPath;
    }

    /**
     * 设置：父ID
     */
    public void setParentPath(String parentPath) {
        this.parentPath = parentPath;
    }
}
