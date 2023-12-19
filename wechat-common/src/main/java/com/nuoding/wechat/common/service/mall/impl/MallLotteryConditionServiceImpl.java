package com.nuoding.wechat.common.service.mall.impl;

import com.nuoding.wechat.common.dao.mall.MallLotteryConditionDao;
import com.nuoding.wechat.common.entity.mall.MallLotteryConditionEntity;
import com.nuoding.wechat.common.service.mall.MallLotteryConditionService;
import com.nuoding.wechat.common.utils.JsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (mallLotteryCondition)表服务实现类
 * 抽奖条件表
 *
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class MallLotteryConditionServiceImpl implements MallLotteryConditionService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private MallLotteryConditionDao mallLotteryConditionDao;

    public MallLotteryConditionServiceImpl(MallLotteryConditionDao mallLotteryConditionDao) {
        this.mallLotteryConditionDao = mallLotteryConditionDao;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public MallLotteryConditionEntity queryById(Integer id) {
        logger.info("queryById begin.id:{}", id);

        return this.mallLotteryConditionDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param mallLotteryConditionEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<MallLotteryConditionEntity> queryAllByLimit(MallLotteryConditionEntity mallLotteryConditionEntity) {
        logger.info("queryAllByLimit begin.mallLotteryConditionEntity:{}", JsonUtil.obj2Json(mallLotteryConditionEntity));
        return this.mallLotteryConditionDao.queryAllByLimit(mallLotteryConditionEntity);
    }

    /**
     * 模糊查询
     *
     * @param mallLotteryConditionEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<MallLotteryConditionEntity> fuzzyQuery(MallLotteryConditionEntity mallLotteryConditionEntity) {
        logger.info("queryAllByLimit begin.mallLotteryConditionEntity:{}", JsonUtil.obj2Json(mallLotteryConditionEntity));
        return this.mallLotteryConditionDao.fuzzyQuery(mallLotteryConditionEntity);
    }

    /**
     * 单挑查询
     *
     * @param mallLotteryConditionEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public MallLotteryConditionEntity selectOne(MallLotteryConditionEntity mallLotteryConditionEntity) {
        logger.info("queryAllByLimit begin.mallLotteryConditionEntity:{}", JsonUtil.obj2Json(mallLotteryConditionEntity));
        return this.mallLotteryConditionDao.selectOne(mallLotteryConditionEntity);
    }

    /**
     * 新增数据
     *
     * @param mallLotteryConditionEntity 实例对象
     * @return 实例对象
     */
    @Override
    public MallLotteryConditionEntity insert(MallLotteryConditionEntity mallLotteryConditionEntity) {
        logger.info("insert begin.mallLotteryConditionEntity:{}", JsonUtil.obj2Json(mallLotteryConditionEntity));
        this.mallLotteryConditionDao.insert(mallLotteryConditionEntity);
        return mallLotteryConditionEntity;
    }

    /**
     * 修改数据
     *
     * @param mallLotteryConditionEntity 实例对象
     * @return 实例对象
     */
    @Override
    public MallLotteryConditionEntity update(MallLotteryConditionEntity mallLotteryConditionEntity) {
        logger.info("update begin.mallLotteryConditionEntity:{}", JsonUtil.obj2Json(mallLotteryConditionEntity));
        this.mallLotteryConditionDao.update(mallLotteryConditionEntity);
        return this.queryById(mallLotteryConditionEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        logger.info("deleteById begin.mallLotteryConditionEntity:{}", id);
        return this.mallLotteryConditionDao.deleteById(id) > 0;
    }
}
