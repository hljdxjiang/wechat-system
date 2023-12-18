package com.nuoding.wechat.common.service.back.impl;

import com.nuoding.wechat.common.dao.back.BackSysUserDao;
import com.nuoding.wechat.common.entity.back.BackSysUserEntity;
import com.nuoding.wechat.common.service.back.BackSysUserService;
import org.springframework.stereotype.Service;
import com.nuoding.wechat.common.utils.JsonUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.List;

/**
 * (backSysUser)表服务实现类
 * 后管用户表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class BackSysUserServiceImpl implements BackSysUserService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Resource
    private BackSysUserDao backSysUserDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BackSysUserEntity queryById(Integer id) {
        logger.info("queryById begin.id:{}", id);

        return this.backSysUserDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param backSysUserEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<BackSysUserEntity> queryAllByLimit(BackSysUserEntity backSysUserEntity) {
        logger.info("queryAllByLimit begin.backSysUserEntity:{}", JsonUtil.obj2Json(backSysUserEntity));
        return this.backSysUserDao.queryAllByLimit(backSysUserEntity);
    }

    /**
     * 模糊查询
     *
     * @param backSysUserEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<BackSysUserEntity> fuzzyQuery(BackSysUserEntity backSysUserEntity) {
        logger.info("queryAllByLimit begin.backSysUserEntity:{}", JsonUtil.obj2Json(backSysUserEntity));
        return this.backSysUserDao.fuzzyQuery(backSysUserEntity);
    }

    /**
     * 单挑查询
     *
     * @param backSysUserEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public BackSysUserEntity selectOne(BackSysUserEntity backSysUserEntity) {
        logger.info("queryAllByLimit begin.backSysUserEntity:{}", JsonUtil.obj2Json(backSysUserEntity));
        return this.backSysUserDao.selectOne(backSysUserEntity);
    }

    /**
     * 新增数据
     *
     * @param backSysUserEntity 实例对象
     * @return 实例对象
     */
    @Override
    public BackSysUserEntity insert(BackSysUserEntity backSysUserEntity) {
        logger.info("insert begin.backSysUserEntity:{}", JsonUtil.obj2Json(backSysUserEntity));
        this.backSysUserDao.insert(backSysUserEntity);
        return backSysUserEntity;
    }

    /**
     * 修改数据
     *
     * @param backSysUserEntity 实例对象
     * @return 实例对象
     */
    @Override
    public BackSysUserEntity update(BackSysUserEntity backSysUserEntity) {
        logger.info("update begin.backSysUserEntity:{}", JsonUtil.obj2Json(backSysUserEntity));
        this.backSysUserDao.update(backSysUserEntity);
        return this.queryById(backSysUserEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        logger.info("deleteById begin.backSysUserEntity:{}", id);
        return this.backSysUserDao.deleteById(id) > 0;
    }
}
