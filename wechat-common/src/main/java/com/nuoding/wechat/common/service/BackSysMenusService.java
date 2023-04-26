package com.nuoding.wechat.common.service;

import com.nuoding.wechat.common.entity.BackSysMenus;

import java.util.List;

/**
 * 系统菜单表(BackSysMenus)表服务接口
 *
 * @author jhc
 * @since 2023-03-07 14:38:29
 */
public interface BackSysMenusService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BackSysMenus queryById(Integer id);

    /**
     * 分页查询
     *
     * @param backSysMenus 筛选条件
     * @return 查询结果
     */
    List<BackSysMenus> queryByPage(BackSysMenus backSysMenus);

    /**
     * 新增数据
     *
     * @param backSysMenus 实例对象
     * @return 实例对象
     */
    BackSysMenus insert(BackSysMenus backSysMenus);

    /**
     * 修改数据
     *
     * @param backSysMenus 实例对象
     * @return 实例对象
     */
    BackSysMenus update(BackSysMenus backSysMenus);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
