package com.nuoding.wechat.common.service.user.impl;

import com.nuoding.wechat.common.dao.user.UserWinningRecordDao;
import com.nuoding.wechat.common.entity.user.UserWinningRecordEntity;
import com.nuoding.wechat.common.service.user.UserWinningRecordService;
import org.springframework.stereotype.Service;
import com.nuoding.wechat.common.utils.JsonUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.List;

/**
 * (userWinningRecord)表服务实现类
 * 抽奖获奖记录表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class UserWinningRecordServiceImpl implements UserWinningRecordService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Resource
    private UserWinningRecordDao userWinningRecordDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UserWinningRecordEntity queryById(Integer id) {
        logger.info("queryById begin.id:{}", id);

        return this.userWinningRecordDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param userWinningRecordEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<UserWinningRecordEntity> queryAllByLimit(UserWinningRecordEntity userWinningRecordEntity) {
        logger.info("queryAllByLimit begin.userWinningRecordEntity:{}", JsonUtil.obj2Json(userWinningRecordEntity));
        return this.userWinningRecordDao.queryAllByLimit(userWinningRecordEntity);
    }

    /**
     * 模糊查询
     *
     * @param userWinningRecordEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<UserWinningRecordEntity> fuzzyQuery(UserWinningRecordEntity userWinningRecordEntity) {
        logger.info("queryAllByLimit begin.userWinningRecordEntity:{}", JsonUtil.obj2Json(userWinningRecordEntity));
        return this.userWinningRecordDao.fuzzyQuery(userWinningRecordEntity);
    }

    /**
     * 单挑查询
     *
     * @param userWinningRecordEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public UserWinningRecordEntity selectOne(UserWinningRecordEntity userWinningRecordEntity) {
        logger.info("queryAllByLimit begin.userWinningRecordEntity:{}", JsonUtil.obj2Json(userWinningRecordEntity));
        return this.userWinningRecordDao.selectOne(userWinningRecordEntity);
    }

    /**
     * 新增数据
     *
     * @param userWinningRecordEntity 实例对象
     * @return 实例对象
     */
    @Override
    public UserWinningRecordEntity insert(UserWinningRecordEntity userWinningRecordEntity) {
        logger.info("insert begin.userWinningRecordEntity:{}", JsonUtil.obj2Json(userWinningRecordEntity));
        this.userWinningRecordDao.insert(userWinningRecordEntity);
        return userWinningRecordEntity;
    }

    /**
     * 修改数据
     *
     * @param userWinningRecordEntity 实例对象
     * @return 实例对象
     */
    @Override
    public UserWinningRecordEntity update(UserWinningRecordEntity userWinningRecordEntity) {
        logger.info("update begin.userWinningRecordEntity:{}", JsonUtil.obj2Json(userWinningRecordEntity));
        this.userWinningRecordDao.update(userWinningRecordEntity);
        return this.queryById(userWinningRecordEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        logger.info("deleteById begin.userWinningRecordEntity:{}", id);
        return this.userWinningRecordDao.deleteById(id) > 0;
    }
}
