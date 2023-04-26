package com.nuoding.wechat.common.service;

import com.nuoding.wechat.common.entity.SysPageFlowInfo;

import java.util.List;

/**
 * (SysPageFlowInfo)表服务接口
 *
 * @author jhc
 * @since 2023-03-07 14:39:01
 */
public interface SysPageFlowInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysPageFlowInfo queryById(Integer id);

    /**
     * 分页查询
     *
     * @param sysPageFlowInfo 筛选条件
     * @return 查询结果
     */
    List<SysPageFlowInfo> queryByPage(SysPageFlowInfo sysPageFlowInfo);

    /**
     * 新增数据
     *
     * @param sysPageFlowInfo 实例对象
     * @return 实例对象
     */
    SysPageFlowInfo insert(SysPageFlowInfo sysPageFlowInfo);

    /**
     * 修改数据
     *
     * @param sysPageFlowInfo 实例对象
     * @return 实例对象
     */
    SysPageFlowInfo update(SysPageFlowInfo sysPageFlowInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
