package com.nuoding.wechat.common.service.back;

import com.nuoding.wechat.common.entity.back.BackSysRoleDetailEntity;

import java.util.List;

/**
 * (backSysRoleDetail)表服务接口
 * 角色详情表
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface BackSysRoleDetailService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BackSysRoleDetailEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param backSysRoleDetailEntity 筛选条件
     * @return 查询结果
     */
    List<BackSysRoleDetailEntity> queryAllByLimit(BackSysRoleDetailEntity backSysRoleDetailEntity);

    /**
     * 模糊查询
     *
     * @param backSysRoleDetailEntity 筛选条件
     * @return 查询结果
     */
    List<BackSysRoleDetailEntity> fuzzyQuery(BackSysRoleDetailEntity backSysRoleDetailEntity);

    /**
     * 单挑查询
     *
     * @param backSysRoleDetailEntity 筛选条件
     * @return 查询结果
     */
    BackSysRoleDetailEntity selectOne(BackSysRoleDetailEntity backSysRoleDetailEntity);

    /**
     * 新增数据
     *
     * @param backSysRoleDetailEntity 实例对象
     * @return 实例对象
     */
    BackSysRoleDetailEntity insert(BackSysRoleDetailEntity backSysRoleDetailEntity);

    /**
     * 修改数据
     *
     * @param backSysRoleDetailEntity 实例对象
     * @return 实例对象
     */
    BackSysRoleDetailEntity update(BackSysRoleDetailEntity backSysRoleDetailEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
