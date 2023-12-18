package com.nuoding.wechat.common.service.back.impl;

import com.nuoding.wechat.common.dao.back.BackRuleDetailDao;
import com.nuoding.wechat.common.entity.back.BackRuleDetailEntity;
import com.nuoding.wechat.common.service.back.BackRuleDetailService;
import org.springframework.stereotype.Service;
import com.nuoding.wechat.common.utils.JsonUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.List;

/**
 * (backRuleDetail)表服务实现类
 * 角色权限详情表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class BackRuleDetailServiceImpl implements BackRuleDetailService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Resource
    private BackRuleDetailDao backRuleDetailDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BackRuleDetailEntity queryById(Integer id) {
        logger.info("queryById begin.id:{}", id);

        return this.backRuleDetailDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param backRuleDetailEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<BackRuleDetailEntity> queryAllByLimit(BackRuleDetailEntity backRuleDetailEntity) {
        logger.info("queryAllByLimit begin.backRuleDetailEntity:{}", JsonUtil.obj2Json(backRuleDetailEntity));
        return this.backRuleDetailDao.queryAllByLimit(backRuleDetailEntity);
    }

    /**
     * 模糊查询
     *
     * @param backRuleDetailEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<BackRuleDetailEntity> fuzzyQuery(BackRuleDetailEntity backRuleDetailEntity) {
        logger.info("queryAllByLimit begin.backRuleDetailEntity:{}", JsonUtil.obj2Json(backRuleDetailEntity));
        return this.backRuleDetailDao.fuzzyQuery(backRuleDetailEntity);
    }

    /**
     * 单挑查询
     *
     * @param backRuleDetailEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public BackRuleDetailEntity selectOne(BackRuleDetailEntity backRuleDetailEntity) {
        logger.info("queryAllByLimit begin.backRuleDetailEntity:{}", JsonUtil.obj2Json(backRuleDetailEntity));
        return this.backRuleDetailDao.selectOne(backRuleDetailEntity);
    }

    /**
     * 新增数据
     *
     * @param backRuleDetailEntity 实例对象
     * @return 实例对象
     */
    @Override
    public BackRuleDetailEntity insert(BackRuleDetailEntity backRuleDetailEntity) {
        logger.info("insert begin.backRuleDetailEntity:{}", JsonUtil.obj2Json(backRuleDetailEntity));
        this.backRuleDetailDao.insert(backRuleDetailEntity);
        return backRuleDetailEntity;
    }

    /**
     * 修改数据
     *
     * @param backRuleDetailEntity 实例对象
     * @return 实例对象
     */
    @Override
    public BackRuleDetailEntity update(BackRuleDetailEntity backRuleDetailEntity) {
        logger.info("update begin.backRuleDetailEntity:{}", JsonUtil.obj2Json(backRuleDetailEntity));
        this.backRuleDetailDao.update(backRuleDetailEntity);
        return this.queryById(backRuleDetailEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        logger.info("deleteById begin.backRuleDetailEntity:{}", id);
        return this.backRuleDetailDao.deleteById(id) > 0;
    }
}
