package com.nuoding.wechat.common.service;

import com.nuoding.wechat.common.constant.SysParamConfigKey;
import com.nuoding.wechat.common.entity.SysParamConfig;

import java.util.List;

/**
 * (SysParamConfig)表服务接口
 *
 * @author jhc
 * @since 2023-03-07 14:39:00
 */
public interface SysParamConfigService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysParamConfig queryById(Integer id);

    /**
     * 分页查询
     *
     * @param sysParamConfig 筛选条件
     * @return 查询结果
     */
    List<SysParamConfig> queryByPage(SysParamConfig sysParamConfig);

    /**
     * 新增数据
     *
     * @param sysParamConfig 实例对象
     * @return 实例对象
     */
    SysParamConfig insert(SysParamConfig sysParamConfig);

    /**
     * 修改数据
     *
     * @param sysParamConfig 实例对象
     * @return 实例对象
     */
    SysParamConfig update(SysParamConfig sysParamConfig);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

    String getConfigByCatch(String tenantId, SysParamConfigKey configKey);


}
