package com.nuoding.wechat.common.service.user.impl;

import com.nuoding.wechat.common.dao.user.UserPropertyDao;
import com.nuoding.wechat.common.entity.user.UserPropertyEntity;
import com.nuoding.wechat.common.service.user.UserPropertyService;
import com.nuoding.wechat.common.utils.JsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (userProperty)表服务实现类
 * 用户资产信息表
 *
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class UserPropertyServiceImpl implements UserPropertyService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private UserPropertyDao userPropertyDao;

    public UserPropertyServiceImpl(UserPropertyDao userPropertyDao) {
        this.userPropertyDao = userPropertyDao;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UserPropertyEntity queryById(Integer id) {
        logger.info("queryById begin.id:{}", id);

        return this.userPropertyDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param userPropertyEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<UserPropertyEntity> queryAllByLimit(UserPropertyEntity userPropertyEntity) {
        logger.info("queryAllByLimit begin.userPropertyEntity:{}", JsonUtil.obj2Json(userPropertyEntity));
        return this.userPropertyDao.queryAllByLimit(userPropertyEntity);
    }

    /**
     * 模糊查询
     *
     * @param userPropertyEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<UserPropertyEntity> fuzzyQuery(UserPropertyEntity userPropertyEntity) {
        logger.info("queryAllByLimit begin.userPropertyEntity:{}", JsonUtil.obj2Json(userPropertyEntity));
        return this.userPropertyDao.fuzzyQuery(userPropertyEntity);
    }

    /**
     * 单挑查询
     *
     * @param userPropertyEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public UserPropertyEntity selectOne(UserPropertyEntity userPropertyEntity) {
        logger.info("queryAllByLimit begin.userPropertyEntity:{}", JsonUtil.obj2Json(userPropertyEntity));
        return this.userPropertyDao.selectOne(userPropertyEntity);
    }

    /**
     * 新增数据
     *
     * @param userPropertyEntity 实例对象
     * @return 实例对象
     */
    @Override
    public UserPropertyEntity insert(UserPropertyEntity userPropertyEntity) {
        logger.info("insert begin.userPropertyEntity:{}", JsonUtil.obj2Json(userPropertyEntity));
        this.userPropertyDao.insert(userPropertyEntity);
        return userPropertyEntity;
    }

    /**
     * 修改数据
     *
     * @param userPropertyEntity 实例对象
     * @return 实例对象
     */
    @Override
    public UserPropertyEntity update(UserPropertyEntity userPropertyEntity) {
        logger.info("update begin.userPropertyEntity:{}", JsonUtil.obj2Json(userPropertyEntity));
        this.userPropertyDao.update(userPropertyEntity);
        return this.queryById(userPropertyEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        logger.info("deleteById begin.userPropertyEntity:{}", id);
        return this.userPropertyDao.deleteById(id) > 0;
    }
}
