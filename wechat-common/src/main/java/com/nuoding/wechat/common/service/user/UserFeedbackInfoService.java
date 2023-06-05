package com.nuoding.wechat.common.service.user;

import com.nuoding.wechat.common.entity.user.UserFeedbackInfoEntity;

import java.util.List;

/**
 * (userFeedbackInfo)表服务接口
 * 用户反馈信息表
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface UserFeedbackInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UserFeedbackInfoEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param userFeedbackInfoEntity 筛选条件
     * @return 查询结果
     */
    List<UserFeedbackInfoEntity> queryByPage(UserFeedbackInfoEntity userFeedbackInfoEntity);

    /**
     * 新增数据
     *
     * @param userFeedbackInfoEntity 实例对象
     * @return 实例对象
     */
    UserFeedbackInfoEntity insert(UserFeedbackInfoEntity userFeedbackInfoEntity);

    /**
     * 修改数据
     *
     * @param userFeedbackInfoEntity 实例对象
     * @return 实例对象
     */
    UserFeedbackInfoEntity update(UserFeedbackInfoEntity userFeedbackInfoEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
