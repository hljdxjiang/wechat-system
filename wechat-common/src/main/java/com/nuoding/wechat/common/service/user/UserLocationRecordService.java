package com.nuoding.wechat.common.service.user;

import com.nuoding.wechat.common.entity.user.UserLocationRecordEntity;

import java.util.List;

/**
 * (userLocationRecord)表服务接口
 * 用户地理位置记录表
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface UserLocationRecordService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UserLocationRecordEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param userLocationRecordEntity 筛选条件
     * @return 查询结果
     */
    List<UserLocationRecordEntity> queryAllByLimit(UserLocationRecordEntity userLocationRecordEntity);

    /**
     * 新增数据
     *
     * @param userLocationRecordEntity 实例对象
     * @return 实例对象
     */
    UserLocationRecordEntity insert(UserLocationRecordEntity userLocationRecordEntity);

    /**
     * 修改数据
     *
     * @param userLocationRecordEntity 实例对象
     * @return 实例对象
     */
    UserLocationRecordEntity update(UserLocationRecordEntity userLocationRecordEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
