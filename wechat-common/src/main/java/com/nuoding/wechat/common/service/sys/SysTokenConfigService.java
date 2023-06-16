package com.nuoding.wechat.common.service.sys;

import com.nuoding.wechat.common.entity.sys.SysTokenConfigEntity;

import java.util.List;

/**
 * (sysTokenConfig)表服务接口
 * token信息表
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface SysTokenConfigService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysTokenConfigEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param sysTokenConfigEntity 筛选条件
     * @return 查询结果
     */
    List<SysTokenConfigEntity> queryAllByLimit(SysTokenConfigEntity sysTokenConfigEntity);

    /**
     * 新增数据
     *
     * @param sysTokenConfigEntity 实例对象
     * @return 实例对象
     */
    SysTokenConfigEntity insert(SysTokenConfigEntity sysTokenConfigEntity);

    /**
     * 修改数据
     *
     * @param sysTokenConfigEntity 实例对象
     * @return 实例对象
     */
    SysTokenConfigEntity update(SysTokenConfigEntity sysTokenConfigEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
