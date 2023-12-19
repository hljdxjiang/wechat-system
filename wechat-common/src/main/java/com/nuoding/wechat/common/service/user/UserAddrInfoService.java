package com.nuoding.wechat.common.service.user;

import com.nuoding.wechat.common.entity.user.UserAddrInfoEntity;

import java.util.List;

/**
 * (userAddrInfo)表服务接口
 * 客户信息表
 *
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface UserAddrInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UserAddrInfoEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param userAddrInfoEntity 筛选条件
     * @return 查询结果
     */
    List<UserAddrInfoEntity> queryAllByLimit(UserAddrInfoEntity userAddrInfoEntity);

    /**
     * 模糊查询
     *
     * @param userAddrInfoEntity 筛选条件
     * @return 查询结果
     */
    List<UserAddrInfoEntity> fuzzyQuery(UserAddrInfoEntity userAddrInfoEntity);

    /**
     * 单挑查询
     *
     * @param userAddrInfoEntity 筛选条件
     * @return 查询结果
     */
    UserAddrInfoEntity selectOne(UserAddrInfoEntity userAddrInfoEntity);

    /**
     * 新增数据
     *
     * @param userAddrInfoEntity 实例对象
     * @return 实例对象
     */
    UserAddrInfoEntity insert(UserAddrInfoEntity userAddrInfoEntity);

    /**
     * 修改数据
     *
     * @param userAddrInfoEntity 实例对象
     * @return 实例对象
     */
    UserAddrInfoEntity update(UserAddrInfoEntity userAddrInfoEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
