package com.nuoding.wechat.common.service.user;

import com.nuoding.wechat.common.entity.user.UserWinningRecordEntity;

import java.util.List;

/**
 * (userWinningRecord)表服务接口
 * 抽奖获奖记录表
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface UserWinningRecordService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UserWinningRecordEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param userWinningRecordEntity 筛选条件
     * @return 查询结果
     */
    List<UserWinningRecordEntity> queryByPage(UserWinningRecordEntity userWinningRecordEntity);

    /**
     * 新增数据
     *
     * @param userWinningRecordEntity 实例对象
     * @return 实例对象
     */
    UserWinningRecordEntity insert(UserWinningRecordEntity userWinningRecordEntity);

    /**
     * 修改数据
     *
     * @param userWinningRecordEntity 实例对象
     * @return 实例对象
     */
    UserWinningRecordEntity update(UserWinningRecordEntity userWinningRecordEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
