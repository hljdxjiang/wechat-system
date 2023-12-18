package com.nuoding.wechat.common.service.sys;

import com.nuoding.wechat.common.entity.sys.SysUserLabelsEntity;

import java.util.List;

/**
 * (sysUserLabels)表服务接口
 * 客户信息表
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface SysUserLabelsService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysUserLabelsEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param sysUserLabelsEntity 筛选条件
     * @return 查询结果
     */
    List<SysUserLabelsEntity> queryAllByLimit(SysUserLabelsEntity sysUserLabelsEntity);

    /**
     * 模糊查询
     *
     * @param sysUserLabelsEntity 筛选条件
     * @return 查询结果
     */
    List<SysUserLabelsEntity> fuzzyQuery(SysUserLabelsEntity sysUserLabelsEntity);

    /**
     * 单挑查询
     *
     * @param sysUserLabelsEntity 筛选条件
     * @return 查询结果
     */
    SysUserLabelsEntity selectOne(SysUserLabelsEntity sysUserLabelsEntity);

    /**
     * 新增数据
     *
     * @param sysUserLabelsEntity 实例对象
     * @return 实例对象
     */
    SysUserLabelsEntity insert(SysUserLabelsEntity sysUserLabelsEntity);

    /**
     * 修改数据
     *
     * @param sysUserLabelsEntity 实例对象
     * @return 实例对象
     */
    SysUserLabelsEntity update(SysUserLabelsEntity sysUserLabelsEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
