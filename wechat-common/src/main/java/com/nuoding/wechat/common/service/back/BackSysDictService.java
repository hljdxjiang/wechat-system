package com.nuoding.wechat.common.service.back;

import com.nuoding.wechat.common.entity.back.BackSysDictEntity;

import java.util.List;

/**
 * (backSysDict)表服务接口
 * 字典表
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface BackSysDictService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BackSysDictEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param backSysDictEntity 筛选条件
     * @return 查询结果
     */
    List<BackSysDictEntity> queryByPage(BackSysDictEntity backSysDictEntity);

    /**
     * 新增数据
     *
     * @param backSysDictEntity 实例对象
     * @return 实例对象
     */
    BackSysDictEntity insert(BackSysDictEntity backSysDictEntity);

    /**
     * 修改数据
     *
     * @param backSysDictEntity 实例对象
     * @return 实例对象
     */
    BackSysDictEntity update(BackSysDictEntity backSysDictEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
