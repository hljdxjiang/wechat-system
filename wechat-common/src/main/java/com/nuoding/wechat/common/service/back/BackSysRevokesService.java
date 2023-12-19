package com.nuoding.wechat.common.service.back;

import com.nuoding.wechat.common.entity.back.BackSysRevokesEntity;

import java.util.List;

/**
 * (backSysRevokes)表服务接口
 * 系统权限表
 *
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface BackSysRevokesService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BackSysRevokesEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param backSysRevokesEntity 筛选条件
     * @return 查询结果
     */
    List<BackSysRevokesEntity> queryAllByLimit(BackSysRevokesEntity backSysRevokesEntity);

    /**
     * 模糊查询
     *
     * @param backSysRevokesEntity 筛选条件
     * @return 查询结果
     */
    List<BackSysRevokesEntity> fuzzyQuery(BackSysRevokesEntity backSysRevokesEntity);

    /**
     * 单挑查询
     *
     * @param backSysRevokesEntity 筛选条件
     * @return 查询结果
     */
    BackSysRevokesEntity selectOne(BackSysRevokesEntity backSysRevokesEntity);

    /**
     * 新增数据
     *
     * @param backSysRevokesEntity 实例对象
     * @return 实例对象
     */
    BackSysRevokesEntity insert(BackSysRevokesEntity backSysRevokesEntity);

    /**
     * 修改数据
     *
     * @param backSysRevokesEntity 实例对象
     * @return 实例对象
     */
    BackSysRevokesEntity update(BackSysRevokesEntity backSysRevokesEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
