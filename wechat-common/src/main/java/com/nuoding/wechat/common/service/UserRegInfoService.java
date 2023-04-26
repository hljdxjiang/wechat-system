package com.nuoding.wechat.common.service;

import com.nuoding.wechat.common.entity.UserRegInfo;

import java.util.List;

/**
 * 客户信息表(UserRegInfo)表服务接口
 *
 * @author jhc
 * @since 2023-03-07 14:39:14
 */
public interface UserRegInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UserRegInfo queryById(Integer id);

    /**
     * 分页查询
     *
     * @param userRegInfo 筛选条件
     * @return 查询结果
     */
    List<UserRegInfo> queryByPage(UserRegInfo userRegInfo);

    /**
     * 新增数据
     *
     * @param userRegInfo 实例对象
     * @return 实例对象
     */
    UserRegInfo insert(UserRegInfo userRegInfo);

    /**
     * 修改数据
     *
     * @param userRegInfo 实例对象
     * @return 实例对象
     */
    UserRegInfo update(UserRegInfo userRegInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
