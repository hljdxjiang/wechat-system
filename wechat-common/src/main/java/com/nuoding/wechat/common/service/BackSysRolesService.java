package com.nuoding.wechat.common.service;

import com.nuoding.wechat.common.entity.BackSysRoles;

import java.util.List;

/**
 * 角色信息表(BackSysRoles)表服务接口
 *
 * @author jhc
 * @since 2023-03-07 14:38:31
 */
public interface BackSysRolesService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BackSysRoles queryById(Integer id);

    /**
     * 分页查询
     *
     * @param backSysRoles 筛选条件
     * @return 查询结果
     */
    List<BackSysRoles> queryByPage(BackSysRoles backSysRoles);

    /**
     * 新增数据
     *
     * @param backSysRoles 实例对象
     * @return 实例对象
     */
    BackSysRoles insert(BackSysRoles backSysRoles);

    /**
     * 修改数据
     *
     * @param backSysRoles 实例对象
     * @return 实例对象
     */
    BackSysRoles update(BackSysRoles backSysRoles);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
