package com.nuoding.wechat.common.service.mall.impl;

import com.nuoding.wechat.common.dao.mall.MallLotteryDao;
import com.nuoding.wechat.common.entity.mall.MallLotteryEntity;
import com.nuoding.wechat.common.service.mall.MallLotteryService;
import org.springframework.stereotype.Service;
import com.nuoding.wechat.common.utils.JsonUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.List;

/**
 * (mallLottery)表服务实现类
 * 抽奖活动信息表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class MallLotteryServiceImpl implements MallLotteryService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Resource
    private MallLotteryDao mallLotteryDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public MallLotteryEntity queryById(Integer id) {
        logger.info("queryById begin.id:{}", id);

        return this.mallLotteryDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param mallLotteryEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<MallLotteryEntity> queryAllByLimit(MallLotteryEntity mallLotteryEntity) {
        logger.info("queryAllByLimit begin.mallLotteryEntity:{}", JsonUtil.obj2Json(mallLotteryEntity));
        return this.mallLotteryDao.queryAllByLimit(mallLotteryEntity);
    }

    /**
     * 模糊查询
     *
     * @param mallLotteryEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<MallLotteryEntity> fuzzyQuery(MallLotteryEntity mallLotteryEntity) {
        logger.info("queryAllByLimit begin.mallLotteryEntity:{}", JsonUtil.obj2Json(mallLotteryEntity));
        return this.mallLotteryDao.fuzzyQuery(mallLotteryEntity);
    }

    /**
     * 单挑查询
     *
     * @param mallLotteryEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public MallLotteryEntity selectOne(MallLotteryEntity mallLotteryEntity) {
        logger.info("queryAllByLimit begin.mallLotteryEntity:{}", JsonUtil.obj2Json(mallLotteryEntity));
        return this.mallLotteryDao.selectOne(mallLotteryEntity);
    }

    /**
     * 新增数据
     *
     * @param mallLotteryEntity 实例对象
     * @return 实例对象
     */
    @Override
    public MallLotteryEntity insert(MallLotteryEntity mallLotteryEntity) {
        logger.info("insert begin.mallLotteryEntity:{}", JsonUtil.obj2Json(mallLotteryEntity));
        this.mallLotteryDao.insert(mallLotteryEntity);
        return mallLotteryEntity;
    }

    /**
     * 修改数据
     *
     * @param mallLotteryEntity 实例对象
     * @return 实例对象
     */
    @Override
    public MallLotteryEntity update(MallLotteryEntity mallLotteryEntity) {
        logger.info("update begin.mallLotteryEntity:{}", JsonUtil.obj2Json(mallLotteryEntity));
        this.mallLotteryDao.update(mallLotteryEntity);
        return this.queryById(mallLotteryEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        logger.info("deleteById begin.mallLotteryEntity:{}", id);
        return this.mallLotteryDao.deleteById(id) > 0;
    }
}
