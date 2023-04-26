package com.nuoding.wechat.common.service;

import com.nuoding.wechat.common.entity.BackSysRevokes;

import java.util.List;

/**
 * 系统权限表(BackSysRevokes)表服务接口
 *
 * @author jhc
 * @since 2023-03-07 14:38:30
 */
public interface BackSysRevokesService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BackSysRevokes queryById(Integer id);

    /**
     * 分页查询
     *
     * @param backSysRevokes 筛选条件
     * @return 查询结果
     */
    List<BackSysRevokes> queryByPage(BackSysRevokes backSysRevokes);

    /**
     * 新增数据
     *
     * @param backSysRevokes 实例对象
     * @return 实例对象
     */
    BackSysRevokes insert(BackSysRevokes backSysRevokes);

    /**
     * 修改数据
     *
     * @param backSysRevokes 实例对象
     * @return 实例对象
     */
    BackSysRevokes update(BackSysRevokes backSysRevokes);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
