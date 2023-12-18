package com.nuoding.wechat.common.service.sys;

import com.nuoding.wechat.common.entity.sys.SysParamConfigEntity;

import java.util.List;

/**
 * (sysParamConfig)表服务接口
 * 系统参数配置表
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface SysParamConfigService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysParamConfigEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param sysParamConfigEntity 筛选条件
     * @return 查询结果
     */
    List<SysParamConfigEntity> queryAllByLimit(SysParamConfigEntity sysParamConfigEntity);

    /**
     * 模糊查询
     *
     * @param sysParamConfigEntity 筛选条件
     * @return 查询结果
     */
    List<SysParamConfigEntity> fuzzyQuery(SysParamConfigEntity sysParamConfigEntity);

    /**
     * 单挑查询
     *
     * @param sysParamConfigEntity 筛选条件
     * @return 查询结果
     */
    SysParamConfigEntity selectOne(SysParamConfigEntity sysParamConfigEntity);

    /**
     * 新增数据
     *
     * @param sysParamConfigEntity 实例对象
     * @return 实例对象
     */
    SysParamConfigEntity insert(SysParamConfigEntity sysParamConfigEntity);

    /**
     * 修改数据
     *
     * @param sysParamConfigEntity 实例对象
     * @return 实例对象
     */
    SysParamConfigEntity update(SysParamConfigEntity sysParamConfigEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
