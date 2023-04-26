package com.nuoding.wechat.common.service;

import com.nuoding.wechat.common.entity.SysTokenConfig;

import java.util.List;

/**
 * (SysTokenConfig)表服务接口
 *
 * @author jhc
 * @since 2023-03-07 14:39:02
 */
public interface SysTokenConfigService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysTokenConfig queryById(Integer id);

    /**
     * 分页查询
     *
     * @param sysTokenConfig 筛选条件
     * @return 查询结果
     */
    List<SysTokenConfig> queryByPage(SysTokenConfig sysTokenConfig);

    /**
     * 新增数据
     *
     * @param sysTokenConfig 实例对象
     * @return 实例对象
     */
    SysTokenConfig insert(SysTokenConfig sysTokenConfig);

    /**
     * 修改数据
     *
     * @param sysTokenConfig 实例对象
     * @return 实例对象
     */
    SysTokenConfig update(SysTokenConfig sysTokenConfig);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
