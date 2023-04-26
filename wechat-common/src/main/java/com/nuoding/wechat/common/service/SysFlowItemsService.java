package com.nuoding.wechat.common.service;

import com.nuoding.wechat.common.entity.SysFlowItems;

import java.util.List;

/**
 * (SysFlowItems)表服务接口
 *
 * @author jhc
 * @since 2023-03-07 14:39:01
 */
public interface SysFlowItemsService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysFlowItems queryById(Integer id);

    /**
     * 分页查询
     *
     * @param sysFlowItems 筛选条件
     * @return 查询结果
     */
    List<SysFlowItems> queryByPage(SysFlowItems sysFlowItems);

    /**
     * 新增数据
     *
     * @param sysFlowItems 实例对象
     * @return 实例对象
     */
    SysFlowItems insert(SysFlowItems sysFlowItems);

    /**
     * 修改数据
     *
     * @param sysFlowItems 实例对象
     * @return 实例对象
     */
    SysFlowItems update(SysFlowItems sysFlowItems);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
