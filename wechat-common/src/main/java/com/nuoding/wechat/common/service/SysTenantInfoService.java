package com.nuoding.wechat.common.service;

import com.nuoding.wechat.common.entity.SysTenantInfo;

import java.util.List;

/**
 * (SysTenantInfo)表服务接口
 *
 * @author jhc
 * @since 2023-03-07 14:39:01
 */
public interface SysTenantInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysTenantInfo queryById(Integer id);

    /**
     * 分页查询
     *
     * @param sysTenantInfo 筛选条件
     * @return 查询结果
     */
    List<SysTenantInfo> queryByPage(SysTenantInfo sysTenantInfo);

    /**
     * 新增数据
     *
     * @param sysTenantInfo 实例对象
     * @return 实例对象
     */
    SysTenantInfo insert(SysTenantInfo sysTenantInfo);

    /**
     * 修改数据
     *
     * @param sysTenantInfo 实例对象
     * @return 实例对象
     */
    SysTenantInfo update(SysTenantInfo sysTenantInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
