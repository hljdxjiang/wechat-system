package com.nuoding.wechat.common.service.back;

import com.nuoding.wechat.common.entity.back.BackSysRolesEntity;

import java.util.List;

/**
 * (backSysRoles)表服务接口
 * 角色信息表
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface BackSysRolesService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BackSysRolesEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param backSysRolesEntity 筛选条件
     * @return 查询结果
     */
    List<BackSysRolesEntity> queryAllByLimit(BackSysRolesEntity backSysRolesEntity);

    /**
     * 新增数据
     *
     * @param backSysRolesEntity 实例对象
     * @return 实例对象
     */
    BackSysRolesEntity insert(BackSysRolesEntity backSysRolesEntity);

    /**
     * 修改数据
     *
     * @param backSysRolesEntity 实例对象
     * @return 实例对象
     */
    BackSysRolesEntity update(BackSysRolesEntity backSysRolesEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
