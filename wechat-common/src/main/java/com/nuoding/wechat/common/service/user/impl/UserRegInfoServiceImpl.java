package com.nuoding.wechat.common.service.user.impl;

import com.nuoding.wechat.common.dao.user.UserRegInfoDao;
import com.nuoding.wechat.common.entity.user.UserRegInfoEntity;
import com.nuoding.wechat.common.service.user.UserRegInfoService;
import org.springframework.stereotype.Service;
import com.nuoding.wechat.common.utils.JsonUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.List;

/**
 * (userRegInfo)表服务实现类
 * 客户信息表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class UserRegInfoServiceImpl implements UserRegInfoService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Resource
    private UserRegInfoDao userRegInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UserRegInfoEntity queryById(Integer id) {
        logger.info("queryById begin.id:{}", id);

        return this.userRegInfoDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param userRegInfoEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<UserRegInfoEntity> queryAllByLimit(UserRegInfoEntity userRegInfoEntity) {
        logger.info("queryAllByLimit begin.userRegInfoEntity:{}", JsonUtil.obj2Json(userRegInfoEntity));
        return this.userRegInfoDao.queryAllByLimit(userRegInfoEntity);
    }

    /**
     * 模糊查询
     *
     * @param userRegInfoEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<UserRegInfoEntity> fuzzyQuery(UserRegInfoEntity userRegInfoEntity) {
        logger.info("queryAllByLimit begin.userRegInfoEntity:{}", JsonUtil.obj2Json(userRegInfoEntity));
        return this.userRegInfoDao.fuzzyQuery(userRegInfoEntity);
    }

    /**
     * 单挑查询
     *
     * @param userRegInfoEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public UserRegInfoEntity selectOne(UserRegInfoEntity userRegInfoEntity) {
        logger.info("queryAllByLimit begin.userRegInfoEntity:{}", JsonUtil.obj2Json(userRegInfoEntity));
        return this.userRegInfoDao.selectOne(userRegInfoEntity);
    }

    /**
     * 新增数据
     *
     * @param userRegInfoEntity 实例对象
     * @return 实例对象
     */
    @Override
    public UserRegInfoEntity insert(UserRegInfoEntity userRegInfoEntity) {
        logger.info("insert begin.userRegInfoEntity:{}", JsonUtil.obj2Json(userRegInfoEntity));
        this.userRegInfoDao.insert(userRegInfoEntity);
        return userRegInfoEntity;
    }

    /**
     * 修改数据
     *
     * @param userRegInfoEntity 实例对象
     * @return 实例对象
     */
    @Override
    public UserRegInfoEntity update(UserRegInfoEntity userRegInfoEntity) {
        logger.info("update begin.userRegInfoEntity:{}", JsonUtil.obj2Json(userRegInfoEntity));
        this.userRegInfoDao.update(userRegInfoEntity);
        return this.queryById(userRegInfoEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        logger.info("deleteById begin.userRegInfoEntity:{}", id);
        return this.userRegInfoDao.deleteById(id) > 0;
    }
}
