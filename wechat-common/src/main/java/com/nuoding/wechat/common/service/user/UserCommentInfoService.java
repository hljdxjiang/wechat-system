package com.nuoding.wechat.common.service.user;

import com.nuoding.wechat.common.entity.user.UserCommentInfoEntity;

import java.util.List;

/**
 * (userCommentInfo)表服务接口
 * 客户信息表
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface UserCommentInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UserCommentInfoEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param userCommentInfoEntity 筛选条件
     * @return 查询结果
     */
    List<UserCommentInfoEntity> queryByPage(UserCommentInfoEntity userCommentInfoEntity);

    /**
     * 新增数据
     *
     * @param userCommentInfoEntity 实例对象
     * @return 实例对象
     */
    UserCommentInfoEntity insert(UserCommentInfoEntity userCommentInfoEntity);

    /**
     * 修改数据
     *
     * @param userCommentInfoEntity 实例对象
     * @return 实例对象
     */
    UserCommentInfoEntity update(UserCommentInfoEntity userCommentInfoEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
