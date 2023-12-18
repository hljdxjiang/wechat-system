package com.nuoding.wechat.common.service.sys;

import com.nuoding.wechat.common.entity.sys.SysPageInfoEntity;

import java.util.List;

/**
 * (sysPageInfo)表服务接口
 * 页面信息表
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface SysPageInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysPageInfoEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param sysPageInfoEntity 筛选条件
     * @return 查询结果
     */
    List<SysPageInfoEntity> queryAllByLimit(SysPageInfoEntity sysPageInfoEntity);

    /**
     * 模糊查询
     *
     * @param sysPageInfoEntity 筛选条件
     * @return 查询结果
     */
    List<SysPageInfoEntity> fuzzyQuery(SysPageInfoEntity sysPageInfoEntity);

    /**
     * 单挑查询
     *
     * @param sysPageInfoEntity 筛选条件
     * @return 查询结果
     */
    SysPageInfoEntity selectOne(SysPageInfoEntity sysPageInfoEntity);

    /**
     * 新增数据
     *
     * @param sysPageInfoEntity 实例对象
     * @return 实例对象
     */
    SysPageInfoEntity insert(SysPageInfoEntity sysPageInfoEntity);

    /**
     * 修改数据
     *
     * @param sysPageInfoEntity 实例对象
     * @return 实例对象
     */
    SysPageInfoEntity update(SysPageInfoEntity sysPageInfoEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
