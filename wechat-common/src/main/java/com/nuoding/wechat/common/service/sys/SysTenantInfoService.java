package com.nuoding.wechat.common.service.sys;

import com.nuoding.wechat.common.entity.sys.SysTenantInfoEntity;

import java.util.List;

/**
 * (sysTenantInfo)表服务接口
 * 租户信息表
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface SysTenantInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysTenantInfoEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param sysTenantInfoEntity 筛选条件
     * @return 查询结果
     */
    List<SysTenantInfoEntity> queryByPage(SysTenantInfoEntity sysTenantInfoEntity);

    /**
     * 新增数据
     *
     * @param sysTenantInfoEntity 实例对象
     * @return 实例对象
     */
    SysTenantInfoEntity insert(SysTenantInfoEntity sysTenantInfoEntity);

    /**
     * 修改数据
     *
     * @param sysTenantInfoEntity 实例对象
     * @return 实例对象
     */
    SysTenantInfoEntity update(SysTenantInfoEntity sysTenantInfoEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
