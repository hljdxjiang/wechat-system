package com.nuoding.wechat.common.service;

import com.nuoding.wechat.common.entity.BackSysDict;

import java.util.List;

/**
 * 字典表(BackSysDict)表服务接口
 *
 * @author jhc
 * @since 2023-03-07 14:38:28
 */
public interface BackSysDictService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BackSysDict queryById(Object id);

    /**
     * 分页查询
     *
     * @param backSysDict 筛选条件
     * @return 查询结果
     */
    List<BackSysDict> queryByPage(BackSysDict backSysDict);

    /**
     * 新增数据
     *
     * @param backSysDict 实例对象
     * @return 实例对象
     */
    BackSysDict insert(BackSysDict backSysDict);

    /**
     * 修改数据
     *
     * @param backSysDict 实例对象
     * @return 实例对象
     */
    BackSysDict update(BackSysDict backSysDict);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Object id);

}
