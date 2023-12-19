package com.nuoding.wechat.common.service.back.impl;

import com.nuoding.wechat.common.dao.back.BackSysRoleDetailDao;
import com.nuoding.wechat.common.entity.back.BackSysRoleDetailEntity;
import com.nuoding.wechat.common.service.back.BackSysRoleDetailService;
import org.springframework.stereotype.Service;
import com.nuoding.wechat.common.utils.JsonUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.List;

/**
 * (backSysRoleDetail)表服务实现类
 * 角色详情表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class BackSysRoleDetailServiceImpl implements BackSysRoleDetailService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Resource
    private BackSysRoleDetailDao backSysRoleDetailDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BackSysRoleDetailEntity queryById(Integer id) {
        logger.info("queryById begin.id:{}", id);

        return this.backSysRoleDetailDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param backSysRoleDetailEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<BackSysRoleDetailEntity> queryAllByLimit(BackSysRoleDetailEntity backSysRoleDetailEntity) {
        logger.info("queryAllByLimit begin.backSysRoleDetailEntity:{}", JsonUtil.obj2Json(backSysRoleDetailEntity));
        return this.backSysRoleDetailDao.queryAllByLimit(backSysRoleDetailEntity);
    }

    /**
     * 模糊查询
     *
     * @param backSysRoleDetailEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<BackSysRoleDetailEntity> fuzzyQuery(BackSysRoleDetailEntity backSysRoleDetailEntity) {
        logger.info("queryAllByLimit begin.backSysRoleDetailEntity:{}", JsonUtil.obj2Json(backSysRoleDetailEntity));
        return this.backSysRoleDetailDao.fuzzyQuery(backSysRoleDetailEntity);
    }

    /**
     * 单挑查询
     *
     * @param backSysRoleDetailEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public BackSysRoleDetailEntity selectOne(BackSysRoleDetailEntity backSysRoleDetailEntity) {
        logger.info("queryAllByLimit begin.backSysRoleDetailEntity:{}", JsonUtil.obj2Json(backSysRoleDetailEntity));
        return this.backSysRoleDetailDao.selectOne(backSysRoleDetailEntity);
    }

    /**
     * 新增数据
     *
     * @param backSysRoleDetailEntity 实例对象
     * @return 实例对象
     */
    @Override
    public BackSysRoleDetailEntity insert(BackSysRoleDetailEntity backSysRoleDetailEntity) {
        logger.info("insert begin.backSysRoleDetailEntity:{}", JsonUtil.obj2Json(backSysRoleDetailEntity));
        this.backSysRoleDetailDao.insert(backSysRoleDetailEntity);
        return backSysRoleDetailEntity;
    }

    /**
     * 修改数据
     *
     * @param backSysRoleDetailEntity 实例对象
     * @return 实例对象
     */
    @Override
    public BackSysRoleDetailEntity update(BackSysRoleDetailEntity backSysRoleDetailEntity) {
        logger.info("update begin.backSysRoleDetailEntity:{}", JsonUtil.obj2Json(backSysRoleDetailEntity));
        this.backSysRoleDetailDao.update(backSysRoleDetailEntity);
        return this.queryById(backSysRoleDetailEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        logger.info("deleteById begin.backSysRoleDetailEntity:{}", id);
        return this.backSysRoleDetailDao.deleteById(id) > 0;
    }
}
