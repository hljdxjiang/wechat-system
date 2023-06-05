package com.nuoding.wechat.common.service.user.impl;

import com.nuoding.wechat.common.dao.user.UserFeedbackInfoDao;
import com.nuoding.wechat.common.entity.user.UserFeedbackInfoEntity;
import com.nuoding.wechat.common.service.user.UserFeedbackInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (userFeedbackInfo)表服务实现类
 * 用户反馈信息表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class UserFeedbackInfoServiceImpl implements UserFeedbackInfoService {
    @Resource
    private UserFeedbackInfoDao userFeedbackInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UserFeedbackInfoEntity queryById(Integer id) {
        return this.userFeedbackInfoDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param userFeedbackInfoEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<UserFeedbackInfoEntity> queryByPage(UserFeedbackInfoEntity userFeedbackInfoEntity) {
        return this.userFeedbackInfoDao.queryAllByLimit(userFeedbackInfoEntity);
    }

    /**
     * 新增数据
     *
     * @param userFeedbackInfoEntity 实例对象
     * @return 实例对象
     */
    @Override
    public UserFeedbackInfoEntity insert(UserFeedbackInfoEntity userFeedbackInfoEntity) {
        this.userFeedbackInfoDao.insert(userFeedbackInfoEntity);
        return userFeedbackInfoEntity;
    }

    /**
     * 修改数据
     *
     * @param userFeedbackInfoEntity 实例对象
     * @return 实例对象
     */
    @Override
    public UserFeedbackInfoEntity update(UserFeedbackInfoEntity userFeedbackInfoEntity) {
        this.userFeedbackInfoDao.update(userFeedbackInfoEntity);
        return this.queryById(userFeedbackInfoEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.userFeedbackInfoDao.deleteById(id) > 0;
    }
}
