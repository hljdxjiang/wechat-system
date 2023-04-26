package com.nuoding.wechat.common.service;

import com.nuoding.wechat.common.entity.SysPageTypeInfo;

import java.util.List;

/**
 * (SysPageTypeInfo)表服务接口
 *
 * @author jhc
 * @since 2023-03-07 14:39:01
 */
public interface SysPageTypeInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysPageTypeInfo queryById(Integer id);

    /**
     * 分页查询
     *
     * @param sysPageTypeInfo 筛选条件
     * @return 查询结果
     */
    List<SysPageTypeInfo> queryByPage(SysPageTypeInfo sysPageTypeInfo);

    /**
     * 新增数据
     *
     * @param sysPageTypeInfo 实例对象
     * @return 实例对象
     */
    SysPageTypeInfo insert(SysPageTypeInfo sysPageTypeInfo);

    /**
     * 修改数据
     *
     * @param sysPageTypeInfo 实例对象
     * @return 实例对象
     */
    SysPageTypeInfo update(SysPageTypeInfo sysPageTypeInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
