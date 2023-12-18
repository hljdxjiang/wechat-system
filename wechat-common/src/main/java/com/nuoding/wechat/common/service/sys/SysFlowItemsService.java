package com.nuoding.wechat.common.service.sys;

import com.nuoding.wechat.common.entity.sys.SysFlowItemsEntity;

import java.util.List;

/**
 * (sysFlowItems)表服务接口
 * 楼层要素表
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface SysFlowItemsService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysFlowItemsEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param sysFlowItemsEntity 筛选条件
     * @return 查询结果
     */
    List<SysFlowItemsEntity> queryAllByLimit(SysFlowItemsEntity sysFlowItemsEntity);

    /**
     * 模糊查询
     *
     * @param sysFlowItemsEntity 筛选条件
     * @return 查询结果
     */
    List<SysFlowItemsEntity> fuzzyQuery(SysFlowItemsEntity sysFlowItemsEntity);

    /**
     * 单挑查询
     *
     * @param sysFlowItemsEntity 筛选条件
     * @return 查询结果
     */
    SysFlowItemsEntity selectOne(SysFlowItemsEntity sysFlowItemsEntity);

    /**
     * 新增数据
     *
     * @param sysFlowItemsEntity 实例对象
     * @return 实例对象
     */
    SysFlowItemsEntity insert(SysFlowItemsEntity sysFlowItemsEntity);

    /**
     * 修改数据
     *
     * @param sysFlowItemsEntity 实例对象
     * @return 实例对象
     */
    SysFlowItemsEntity update(SysFlowItemsEntity sysFlowItemsEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
