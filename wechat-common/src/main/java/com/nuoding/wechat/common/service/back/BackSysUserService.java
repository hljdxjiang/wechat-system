package com.nuoding.wechat.common.service.back;

import com.nuoding.wechat.common.entity.back.BackSysUserEntity;

import java.util.List;

/**
 * (backSysUser)表服务接口
 * 后管用户表
 *
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface BackSysUserService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BackSysUserEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param backSysUserEntity 筛选条件
     * @return 查询结果
     */
    List<BackSysUserEntity> queryAllByLimit(BackSysUserEntity backSysUserEntity);

    /**
     * 模糊查询
     *
     * @param backSysUserEntity 筛选条件
     * @return 查询结果
     */
    List<BackSysUserEntity> fuzzyQuery(BackSysUserEntity backSysUserEntity);

    /**
     * 单挑查询
     *
     * @param backSysUserEntity 筛选条件
     * @return 查询结果
     */
    BackSysUserEntity selectOne(BackSysUserEntity backSysUserEntity);

    /**
     * 新增数据
     *
     * @param backSysUserEntity 实例对象
     * @return 实例对象
     */
    BackSysUserEntity insert(BackSysUserEntity backSysUserEntity);

    /**
     * 修改数据
     *
     * @param backSysUserEntity 实例对象
     * @return 实例对象
     */
    BackSysUserEntity update(BackSysUserEntity backSysUserEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
