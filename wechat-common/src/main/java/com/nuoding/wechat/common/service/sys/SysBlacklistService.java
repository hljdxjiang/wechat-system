package com.nuoding.wechat.common.service.sys;

import com.nuoding.wechat.common.entity.sys.SysBlacklistEntity;

import java.util.List;

/**
 * (sysBlacklist)表服务接口
 * 黑名单表
 *
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface SysBlacklistService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysBlacklistEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param sysBlacklistEntity 筛选条件
     * @return 查询结果
     */
    List<SysBlacklistEntity> queryAllByLimit(SysBlacklistEntity sysBlacklistEntity);

    /**
     * 模糊查询
     *
     * @param sysBlacklistEntity 筛选条件
     * @return 查询结果
     */
    List<SysBlacklistEntity> fuzzyQuery(SysBlacklistEntity sysBlacklistEntity);

    /**
     * 单挑查询
     *
     * @param sysBlacklistEntity 筛选条件
     * @return 查询结果
     */
    SysBlacklistEntity selectOne(SysBlacklistEntity sysBlacklistEntity);

    /**
     * 新增数据
     *
     * @param sysBlacklistEntity 实例对象
     * @return 实例对象
     */
    SysBlacklistEntity insert(SysBlacklistEntity sysBlacklistEntity);

    /**
     * 修改数据
     *
     * @param sysBlacklistEntity 实例对象
     * @return 实例对象
     */
    SysBlacklistEntity update(SysBlacklistEntity sysBlacklistEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
