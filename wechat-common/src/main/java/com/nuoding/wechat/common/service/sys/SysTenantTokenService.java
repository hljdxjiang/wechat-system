package com.nuoding.wechat.common.service.sys;

import com.nuoding.wechat.common.entity.sys.SysTenantTokenEntity;

import java.util.List;

/**
 * (sysTenantToken)表服务接口
 * 企业token信息表
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface SysTenantTokenService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysTenantTokenEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param sysTenantTokenEntity 筛选条件
     * @return 查询结果
     */
    List<SysTenantTokenEntity> queryByPage(SysTenantTokenEntity sysTenantTokenEntity);

    /**
     * 新增数据
     *
     * @param sysTenantTokenEntity 实例对象
     * @return 实例对象
     */
    SysTenantTokenEntity insert(SysTenantTokenEntity sysTenantTokenEntity);

    /**
     * 修改数据
     *
     * @param sysTenantTokenEntity 实例对象
     * @return 实例对象
     */
    SysTenantTokenEntity update(SysTenantTokenEntity sysTenantTokenEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
