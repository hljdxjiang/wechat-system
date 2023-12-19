package com.nuoding.wechat.common.service.user.impl;

import com.nuoding.wechat.common.dao.user.UserFeedbackInfoDao;
import com.nuoding.wechat.common.entity.user.UserFeedbackInfoEntity;
import com.nuoding.wechat.common.service.user.UserFeedbackInfoService;
import com.nuoding.wechat.common.utils.JsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (userFeedbackInfo)表服务实现类
 * 用户反馈信息表
 *
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class UserFeedbackInfoServiceImpl implements UserFeedbackInfoService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private UserFeedbackInfoDao userFeedbackInfoDao;

    public UserFeedbackInfoServiceImpl(UserFeedbackInfoDao userFeedbackInfoDao) {
        this.userFeedbackInfoDao = userFeedbackInfoDao;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UserFeedbackInfoEntity queryById(Integer id) {
        logger.info("queryById begin.id:{}", id);

        return this.userFeedbackInfoDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param userFeedbackInfoEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<UserFeedbackInfoEntity> queryAllByLimit(UserFeedbackInfoEntity userFeedbackInfoEntity) {
        logger.info("queryAllByLimit begin.userFeedbackInfoEntity:{}", JsonUtil.obj2Json(userFeedbackInfoEntity));
        return this.userFeedbackInfoDao.queryAllByLimit(userFeedbackInfoEntity);
    }

    /**
     * 模糊查询
     *
     * @param userFeedbackInfoEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<UserFeedbackInfoEntity> fuzzyQuery(UserFeedbackInfoEntity userFeedbackInfoEntity) {
        logger.info("queryAllByLimit begin.userFeedbackInfoEntity:{}", JsonUtil.obj2Json(userFeedbackInfoEntity));
        return this.userFeedbackInfoDao.fuzzyQuery(userFeedbackInfoEntity);
    }

    /**
     * 单挑查询
     *
     * @param userFeedbackInfoEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public UserFeedbackInfoEntity selectOne(UserFeedbackInfoEntity userFeedbackInfoEntity) {
        logger.info("queryAllByLimit begin.userFeedbackInfoEntity:{}", JsonUtil.obj2Json(userFeedbackInfoEntity));
        return this.userFeedbackInfoDao.selectOne(userFeedbackInfoEntity);
    }

    /**
     * 新增数据
     *
     * @param userFeedbackInfoEntity 实例对象
     * @return 实例对象
     */
    @Override
    public UserFeedbackInfoEntity insert(UserFeedbackInfoEntity userFeedbackInfoEntity) {
        logger.info("insert begin.userFeedbackInfoEntity:{}", JsonUtil.obj2Json(userFeedbackInfoEntity));
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
        logger.info("update begin.userFeedbackInfoEntity:{}", JsonUtil.obj2Json(userFeedbackInfoEntity));
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
        logger.info("deleteById begin.userFeedbackInfoEntity:{}", id);
        return this.userFeedbackInfoDao.deleteById(id) > 0;
    }
}
