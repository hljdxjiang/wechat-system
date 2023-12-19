package com.nuoding.wechat.common.service.user;

import com.nuoding.wechat.common.entity.user.UserRegInfoEntity;

import java.util.List;

/**
 * (userRegInfo)表服务接口
 * 客户信息表
 *
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface UserRegInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UserRegInfoEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param userRegInfoEntity 筛选条件
     * @return 查询结果
     */
    List<UserRegInfoEntity> queryAllByLimit(UserRegInfoEntity userRegInfoEntity);

    /**
     * 模糊查询
     *
     * @param userRegInfoEntity 筛选条件
     * @return 查询结果
     */
    List<UserRegInfoEntity> fuzzyQuery(UserRegInfoEntity userRegInfoEntity);

    /**
     * 单挑查询
     *
     * @param userRegInfoEntity 筛选条件
     * @return 查询结果
     */
    UserRegInfoEntity selectOne(UserRegInfoEntity userRegInfoEntity);

    /**
     * 新增数据
     *
     * @param userRegInfoEntity 实例对象
     * @return 实例对象
     */
    UserRegInfoEntity insert(UserRegInfoEntity userRegInfoEntity);

    /**
     * 修改数据
     *
     * @param userRegInfoEntity 实例对象
     * @return 实例对象
     */
    UserRegInfoEntity update(UserRegInfoEntity userRegInfoEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
