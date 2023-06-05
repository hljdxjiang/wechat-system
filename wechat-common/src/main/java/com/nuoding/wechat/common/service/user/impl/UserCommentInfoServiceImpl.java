package com.nuoding.wechat.common.service.user.impl;

import com.nuoding.wechat.common.dao.user.UserCommentInfoDao;
import com.nuoding.wechat.common.entity.user.UserCommentInfoEntity;
import com.nuoding.wechat.common.service.user.UserCommentInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (userCommentInfo)表服务实现类
 * 客户信息表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class UserCommentInfoServiceImpl implements UserCommentInfoService {
    @Resource
    private UserCommentInfoDao userCommentInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UserCommentInfoEntity queryById(Integer id) {
        return this.userCommentInfoDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param userCommentInfoEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<UserCommentInfoEntity> queryByPage(UserCommentInfoEntity userCommentInfoEntity) {
        return this.userCommentInfoDao.queryAllByLimit(userCommentInfoEntity);
    }

    /**
     * 新增数据
     *
     * @param userCommentInfoEntity 实例对象
     * @return 实例对象
     */
    @Override
    public UserCommentInfoEntity insert(UserCommentInfoEntity userCommentInfoEntity) {
        this.userCommentInfoDao.insert(userCommentInfoEntity);
        return userCommentInfoEntity;
    }

    /**
     * 修改数据
     *
     * @param userCommentInfoEntity 实例对象
     * @return 实例对象
     */
    @Override
    public UserCommentInfoEntity update(UserCommentInfoEntity userCommentInfoEntity) {
        this.userCommentInfoDao.update(userCommentInfoEntity);
        return this.queryById(userCommentInfoEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.userCommentInfoDao.deleteById(id) > 0;
    }
}
