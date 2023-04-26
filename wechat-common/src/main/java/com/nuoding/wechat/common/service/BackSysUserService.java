package com.nuoding.wechat.common.service;

import com.nuoding.wechat.common.entity.BackSysUser;

import java.util.List;

/**
 * (BackSysUser)表服务接口
 *
 * @author jhc
 * @since 2023-03-07 14:38:32
 */
public interface BackSysUserService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BackSysUser queryById(Integer id);

    /**
     * 分页查询
     *
     * @param backSysUser 筛选条件
     * @return 查询结果
     */
    List<BackSysUser> queryByPage(BackSysUser backSysUser);

    /**
     * 新增数据
     *
     * @param backSysUser 实例对象
     * @return 实例对象
     */
    BackSysUser insert(BackSysUser backSysUser);

    /**
     * 修改数据
     *
     * @param backSysUser 实例对象
     * @return 实例对象
     */
    BackSysUser update(BackSysUser backSysUser);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
