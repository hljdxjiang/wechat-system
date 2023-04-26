package com.nuoding.wechat.common.service;

import com.nuoding.wechat.common.entity.SysFlowInfo;

import java.util.List;

/**
 * (SysFlowInfo)表服务接口
 *
 * @author jhc
 * @since 2023-03-07 14:39:00
 */
public interface SysFlowInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysFlowInfo queryById(Integer id);

    /**
     * 分页查询
     *
     * @param sysFlowInfo 筛选条件
     * @return 查询结果
     */
    List<SysFlowInfo> queryByPage(SysFlowInfo sysFlowInfo);

    /**
     * 新增数据
     *
     * @param sysFlowInfo 实例对象
     * @return 实例对象
     */
    SysFlowInfo insert(SysFlowInfo sysFlowInfo);

    /**
     * 修改数据
     *
     * @param sysFlowInfo 实例对象
     * @return 实例对象
     */
    SysFlowInfo update(SysFlowInfo sysFlowInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);
}
