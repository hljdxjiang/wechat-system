package com.nuoding.wechat.common.service.back;

import com.nuoding.wechat.common.entity.back.BackSysMenusEntity;

import java.util.List;

/**
 * (backSysMenus)表服务接口
 * 系统菜单表
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface BackSysMenusService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BackSysMenusEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param backSysMenusEntity 筛选条件
     * @return 查询结果
     */
    List<BackSysMenusEntity> queryAllByLimit(BackSysMenusEntity backSysMenusEntity);

    /**
     * 模糊查询
     *
     * @param backSysMenusEntity 筛选条件
     * @return 查询结果
     */
    List<BackSysMenusEntity> fuzzyQuery(BackSysMenusEntity backSysMenusEntity);

    /**
     * 单挑查询
     *
     * @param backSysMenusEntity 筛选条件
     * @return 查询结果
     */
    BackSysMenusEntity selectOne(BackSysMenusEntity backSysMenusEntity);

    /**
     * 新增数据
     *
     * @param backSysMenusEntity 实例对象
     * @return 实例对象
     */
    BackSysMenusEntity insert(BackSysMenusEntity backSysMenusEntity);

    /**
     * 修改数据
     *
     * @param backSysMenusEntity 实例对象
     * @return 实例对象
     */
    BackSysMenusEntity update(BackSysMenusEntity backSysMenusEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
