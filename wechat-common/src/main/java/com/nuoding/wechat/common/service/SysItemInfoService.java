package com.nuoding.wechat.common.service;

import com.nuoding.wechat.common.entity.SysItemInfo;

import java.util.List;

/**
 * (SysItemInfo)表服务接口
 *
 * @author jhc
 * @since 2023-03-07 14:39:01
 */
public interface SysItemInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysItemInfo queryById(Integer id);

    /**
     * 分页查询
     *
     * @param sysItemInfo 筛选条件
     * @return 查询结果
     */
    List<SysItemInfo> queryByPage(SysItemInfo sysItemInfo);

    /**
     * 新增数据
     *
     * @param sysItemInfo 实例对象
     * @return 实例对象
     */
    SysItemInfo insert(SysItemInfo sysItemInfo);

    /**
     * 修改数据
     *
     * @param sysItemInfo 实例对象
     * @return 实例对象
     */
    SysItemInfo update(SysItemInfo sysItemInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
