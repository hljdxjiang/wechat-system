package com.nuoding.wechat.common.service.mall.impl;

import com.nuoding.wechat.common.dao.mall.MallActivityConditionDao;
import com.nuoding.wechat.common.entity.mall.MallActivityConditionEntity;
import com.nuoding.wechat.common.service.mall.MallActivityConditionService;
import org.springframework.stereotype.Service;
import com.nuoding.wechat.common.utils.JsonUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.List;

/**
 * (mallActivityCondition)表服务实现类
 * 活动条件表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class MallActivityConditionServiceImpl implements MallActivityConditionService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Resource
    private MallActivityConditionDao mallActivityConditionDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public MallActivityConditionEntity queryById(Integer id) {
        logger.info("queryById begin.id:{}", id);

        return this.mallActivityConditionDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param mallActivityConditionEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<MallActivityConditionEntity> queryAllByLimit(MallActivityConditionEntity mallActivityConditionEntity) {
        logger.info("queryAllByLimit begin.mallActivityConditionEntity:{}", JsonUtil.obj2Json(mallActivityConditionEntity));
        return this.mallActivityConditionDao.queryAllByLimit(mallActivityConditionEntity);
    }

    /**
     * 模糊查询
     *
     * @param mallActivityConditionEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<MallActivityConditionEntity> fuzzyQuery(MallActivityConditionEntity mallActivityConditionEntity) {
        logger.info("queryAllByLimit begin.mallActivityConditionEntity:{}", JsonUtil.obj2Json(mallActivityConditionEntity));
        return this.mallActivityConditionDao.fuzzyQuery(mallActivityConditionEntity);
    }

    /**
     * 单挑查询
     *
     * @param mallActivityConditionEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public MallActivityConditionEntity selectOne(MallActivityConditionEntity mallActivityConditionEntity) {
        logger.info("queryAllByLimit begin.mallActivityConditionEntity:{}", JsonUtil.obj2Json(mallActivityConditionEntity));
        return this.mallActivityConditionDao.selectOne(mallActivityConditionEntity);
    }

    /**
     * 新增数据
     *
     * @param mallActivityConditionEntity 实例对象
     * @return 实例对象
     */
    @Override
    public MallActivityConditionEntity insert(MallActivityConditionEntity mallActivityConditionEntity) {
        logger.info("insert begin.mallActivityConditionEntity:{}", JsonUtil.obj2Json(mallActivityConditionEntity));
        this.mallActivityConditionDao.insert(mallActivityConditionEntity);
        return mallActivityConditionEntity;
    }

    /**
     * 修改数据
     *
     * @param mallActivityConditionEntity 实例对象
     * @return 实例对象
     */
    @Override
    public MallActivityConditionEntity update(MallActivityConditionEntity mallActivityConditionEntity) {
        logger.info("update begin.mallActivityConditionEntity:{}", JsonUtil.obj2Json(mallActivityConditionEntity));
        this.mallActivityConditionDao.update(mallActivityConditionEntity);
        return this.queryById(mallActivityConditionEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        logger.info("deleteById begin.mallActivityConditionEntity:{}", id);
        return this.mallActivityConditionDao.deleteById(id) > 0;
    }
}
