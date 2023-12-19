package com.nuoding.wechat.common.service.user.impl;

import com.nuoding.wechat.common.dao.user.UserCommentInfoDao;
import com.nuoding.wechat.common.entity.user.UserCommentInfoEntity;
import com.nuoding.wechat.common.service.user.UserCommentInfoService;
import com.nuoding.wechat.common.utils.JsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (userCommentInfo)表服务实现类
 * 客户信息表
 *
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class UserCommentInfoServiceImpl implements UserCommentInfoService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private UserCommentInfoDao userCommentInfoDao;

    public UserCommentInfoServiceImpl(UserCommentInfoDao userCommentInfoDao) {
        this.userCommentInfoDao = userCommentInfoDao;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UserCommentInfoEntity queryById(Integer id) {
        logger.info("queryById begin.id:{}", id);

        return this.userCommentInfoDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param userCommentInfoEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<UserCommentInfoEntity> queryAllByLimit(UserCommentInfoEntity userCommentInfoEntity) {
        logger.info("queryAllByLimit begin.userCommentInfoEntity:{}", JsonUtil.obj2Json(userCommentInfoEntity));
        return this.userCommentInfoDao.queryAllByLimit(userCommentInfoEntity);
    }

    /**
     * 模糊查询
     *
     * @param userCommentInfoEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<UserCommentInfoEntity> fuzzyQuery(UserCommentInfoEntity userCommentInfoEntity) {
        logger.info("queryAllByLimit begin.userCommentInfoEntity:{}", JsonUtil.obj2Json(userCommentInfoEntity));
        return this.userCommentInfoDao.fuzzyQuery(userCommentInfoEntity);
    }

    /**
     * 单挑查询
     *
     * @param userCommentInfoEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public UserCommentInfoEntity selectOne(UserCommentInfoEntity userCommentInfoEntity) {
        logger.info("queryAllByLimit begin.userCommentInfoEntity:{}", JsonUtil.obj2Json(userCommentInfoEntity));
        return this.userCommentInfoDao.selectOne(userCommentInfoEntity);
    }

    /**
     * 新增数据
     *
     * @param userCommentInfoEntity 实例对象
     * @return 实例对象
     */
    @Override
    public UserCommentInfoEntity insert(UserCommentInfoEntity userCommentInfoEntity) {
        logger.info("insert begin.userCommentInfoEntity:{}", JsonUtil.obj2Json(userCommentInfoEntity));
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
        logger.info("update begin.userCommentInfoEntity:{}", JsonUtil.obj2Json(userCommentInfoEntity));
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
        logger.info("deleteById begin.userCommentInfoEntity:{}", id);
        return this.userCommentInfoDao.deleteById(id) > 0;
    }
}
