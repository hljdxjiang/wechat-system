package com.nuoding.wechat.common.service.user;

import com.nuoding.wechat.common.entity.user.UserPropertyEntity;

import java.util.List;

/**
 * (userProperty)表服务接口
 * 用户资产信息表
 *
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface UserPropertyService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UserPropertyEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param userPropertyEntity 筛选条件
     * @return 查询结果
     */
    List<UserPropertyEntity> queryAllByLimit(UserPropertyEntity userPropertyEntity);

    /**
     * 模糊查询
     *
     * @param userPropertyEntity 筛选条件
     * @return 查询结果
     */
    List<UserPropertyEntity> fuzzyQuery(UserPropertyEntity userPropertyEntity);

    /**
     * 单挑查询
     *
     * @param userPropertyEntity 筛选条件
     * @return 查询结果
     */
    UserPropertyEntity selectOne(UserPropertyEntity userPropertyEntity);

    /**
     * 新增数据
     *
     * @param userPropertyEntity 实例对象
     * @return 实例对象
     */
    UserPropertyEntity insert(UserPropertyEntity userPropertyEntity);

    /**
     * 修改数据
     *
     * @param userPropertyEntity 实例对象
     * @return 实例对象
     */
    UserPropertyEntity update(UserPropertyEntity userPropertyEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
