package com.nuoding.wechat.common.service;

import com.nuoding.wechat.common.entity.SysPageInfo;

import java.util.List;

/**
 * (SysPageInfo)表服务接口
 *
 * @author jhc
 * @since 2023-03-07 14:39:01
 */
public interface SysPageInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysPageInfo queryById(Integer id);

    /**
     * 分页查询
     *
     * @param sysPageInfo 筛选条件
     * @return 查询结果
     */
    List<SysPageInfo> queryByPage(SysPageInfo sysPageInfo);

    /**
     * 新增数据
     *
     * @param sysPageInfo 实例对象
     * @return 实例对象
     */
    SysPageInfo insert(SysPageInfo sysPageInfo);

    /**
     * 修改数据
     *
     * @param sysPageInfo 实例对象
     * @return 实例对象
     */
    SysPageInfo update(SysPageInfo sysPageInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
