package com.nuoding.wechat.common.service.user;

import com.nuoding.wechat.common.entity.user.UserCollectInfoEntity;

import java.util.List;

/**
 * (userCollectInfo)表服务接口
 * 用户收藏表
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface UserCollectInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UserCollectInfoEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param userCollectInfoEntity 筛选条件
     * @return 查询结果
     */
    List<UserCollectInfoEntity> queryAllByLimit(UserCollectInfoEntity userCollectInfoEntity);

    /**
     * 新增数据
     *
     * @param userCollectInfoEntity 实例对象
     * @return 实例对象
     */
    UserCollectInfoEntity insert(UserCollectInfoEntity userCollectInfoEntity);

    /**
     * 修改数据
     *
     * @param userCollectInfoEntity 实例对象
     * @return 实例对象
     */
    UserCollectInfoEntity update(UserCollectInfoEntity userCollectInfoEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
