package com.nuoding.wechat.common.service.sys;

import com.nuoding.wechat.common.entity.sys.SysPageTypeInfoEntity;

import java.util.List;

/**
 * (sysPageTypeInfo)表服务接口
 * 类型配置表
 *
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface SysPageTypeInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysPageTypeInfoEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param sysPageTypeInfoEntity 筛选条件
     * @return 查询结果
     */
    List<SysPageTypeInfoEntity> queryAllByLimit(SysPageTypeInfoEntity sysPageTypeInfoEntity);

    /**
     * 模糊查询
     *
     * @param sysPageTypeInfoEntity 筛选条件
     * @return 查询结果
     */
    List<SysPageTypeInfoEntity> fuzzyQuery(SysPageTypeInfoEntity sysPageTypeInfoEntity);

    /**
     * 单挑查询
     *
     * @param sysPageTypeInfoEntity 筛选条件
     * @return 查询结果
     */
    SysPageTypeInfoEntity selectOne(SysPageTypeInfoEntity sysPageTypeInfoEntity);

    /**
     * 新增数据
     *
     * @param sysPageTypeInfoEntity 实例对象
     * @return 实例对象
     */
    SysPageTypeInfoEntity insert(SysPageTypeInfoEntity sysPageTypeInfoEntity);

    /**
     * 修改数据
     *
     * @param sysPageTypeInfoEntity 实例对象
     * @return 实例对象
     */
    SysPageTypeInfoEntity update(SysPageTypeInfoEntity sysPageTypeInfoEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
