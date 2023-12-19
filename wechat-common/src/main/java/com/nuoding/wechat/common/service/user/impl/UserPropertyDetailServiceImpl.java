package com.nuoding.wechat.common.service.user.impl;

import com.nuoding.wechat.common.dao.user.UserPropertyDetailDao;
import com.nuoding.wechat.common.entity.user.UserPropertyDetailEntity;
import com.nuoding.wechat.common.service.user.UserPropertyDetailService;
import com.nuoding.wechat.common.utils.JsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (userPropertyDetail)表服务实现类
 * 用户资产记录表
 *
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class UserPropertyDetailServiceImpl implements UserPropertyDetailService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private UserPropertyDetailDao userPropertyDetailDao;

    public UserPropertyDetailServiceImpl(UserPropertyDetailDao userPropertyDetailDao) {
        this.userPropertyDetailDao = userPropertyDetailDao;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UserPropertyDetailEntity queryById(Integer id) {
        logger.info("queryById begin.id:{}", id);

        return this.userPropertyDetailDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param userPropertyDetailEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<UserPropertyDetailEntity> queryAllByLimit(UserPropertyDetailEntity userPropertyDetailEntity) {
        logger.info("queryAllByLimit begin.userPropertyDetailEntity:{}", JsonUtil.obj2Json(userPropertyDetailEntity));
        return this.userPropertyDetailDao.queryAllByLimit(userPropertyDetailEntity);
    }

    /**
     * 模糊查询
     *
     * @param userPropertyDetailEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<UserPropertyDetailEntity> fuzzyQuery(UserPropertyDetailEntity userPropertyDetailEntity) {
        logger.info("queryAllByLimit begin.userPropertyDetailEntity:{}", JsonUtil.obj2Json(userPropertyDetailEntity));
        return this.userPropertyDetailDao.fuzzyQuery(userPropertyDetailEntity);
    }

    /**
     * 单挑查询
     *
     * @param userPropertyDetailEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public UserPropertyDetailEntity selectOne(UserPropertyDetailEntity userPropertyDetailEntity) {
        logger.info("queryAllByLimit begin.userPropertyDetailEntity:{}", JsonUtil.obj2Json(userPropertyDetailEntity));
        return this.userPropertyDetailDao.selectOne(userPropertyDetailEntity);
    }

    /**
     * 新增数据
     *
     * @param userPropertyDetailEntity 实例对象
     * @return 实例对象
     */
    @Override
    public UserPropertyDetailEntity insert(UserPropertyDetailEntity userPropertyDetailEntity) {
        logger.info("insert begin.userPropertyDetailEntity:{}", JsonUtil.obj2Json(userPropertyDetailEntity));
        this.userPropertyDetailDao.insert(userPropertyDetailEntity);
        return userPropertyDetailEntity;
    }

    /**
     * 修改数据
     *
     * @param userPropertyDetailEntity 实例对象
     * @return 实例对象
     */
    @Override
    public UserPropertyDetailEntity update(UserPropertyDetailEntity userPropertyDetailEntity) {
        logger.info("update begin.userPropertyDetailEntity:{}", JsonUtil.obj2Json(userPropertyDetailEntity));
        this.userPropertyDetailDao.update(userPropertyDetailEntity);
        return this.queryById(userPropertyDetailEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        logger.info("deleteById begin.userPropertyDetailEntity:{}", id);
        return this.userPropertyDetailDao.deleteById(id) > 0;
    }
}
