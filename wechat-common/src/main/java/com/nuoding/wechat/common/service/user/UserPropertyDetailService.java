package com.nuoding.wechat.common.service.user;

import com.nuoding.wechat.common.entity.user.UserPropertyDetailEntity;

import java.util.List;

/**
 * (userPropertyDetail)表服务接口
 * 用户资产记录表
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface UserPropertyDetailService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UserPropertyDetailEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param userPropertyDetailEntity 筛选条件
     * @return 查询结果
     */
    List<UserPropertyDetailEntity> queryAllByLimit(UserPropertyDetailEntity userPropertyDetailEntity);

    /**
     * 新增数据
     *
     * @param userPropertyDetailEntity 实例对象
     * @return 实例对象
     */
    UserPropertyDetailEntity insert(UserPropertyDetailEntity userPropertyDetailEntity);

    /**
     * 修改数据
     *
     * @param userPropertyDetailEntity 实例对象
     * @return 实例对象
     */
    UserPropertyDetailEntity update(UserPropertyDetailEntity userPropertyDetailEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
