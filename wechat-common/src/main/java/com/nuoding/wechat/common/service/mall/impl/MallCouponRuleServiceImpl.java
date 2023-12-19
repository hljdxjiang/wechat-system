package com.nuoding.wechat.common.service.mall.impl;

import com.nuoding.wechat.common.dao.mall.MallCouponRuleDao;
import com.nuoding.wechat.common.entity.mall.MallCouponRuleEntity;
import com.nuoding.wechat.common.service.mall.MallCouponRuleService;
import com.nuoding.wechat.common.utils.JsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (mallCouponRule)表服务实现类
 * 优惠券使用规则控制
 *
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class MallCouponRuleServiceImpl implements MallCouponRuleService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private MallCouponRuleDao mallCouponRuleDao;

    public MallCouponRuleServiceImpl(MallCouponRuleDao mallCouponRuleDao) {
        this.mallCouponRuleDao = mallCouponRuleDao;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public MallCouponRuleEntity queryById(Integer id) {
        logger.info("queryById begin.id:{}", id);

        return this.mallCouponRuleDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param mallCouponRuleEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<MallCouponRuleEntity> queryAllByLimit(MallCouponRuleEntity mallCouponRuleEntity) {
        logger.info("queryAllByLimit begin.mallCouponRuleEntity:{}", JsonUtil.obj2Json(mallCouponRuleEntity));
        return this.mallCouponRuleDao.queryAllByLimit(mallCouponRuleEntity);
    }

    /**
     * 模糊查询
     *
     * @param mallCouponRuleEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<MallCouponRuleEntity> fuzzyQuery(MallCouponRuleEntity mallCouponRuleEntity) {
        logger.info("queryAllByLimit begin.mallCouponRuleEntity:{}", JsonUtil.obj2Json(mallCouponRuleEntity));
        return this.mallCouponRuleDao.fuzzyQuery(mallCouponRuleEntity);
    }

    /**
     * 单挑查询
     *
     * @param mallCouponRuleEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public MallCouponRuleEntity selectOne(MallCouponRuleEntity mallCouponRuleEntity) {
        logger.info("queryAllByLimit begin.mallCouponRuleEntity:{}", JsonUtil.obj2Json(mallCouponRuleEntity));
        return this.mallCouponRuleDao.selectOne(mallCouponRuleEntity);
    }

    /**
     * 新增数据
     *
     * @param mallCouponRuleEntity 实例对象
     * @return 实例对象
     */
    @Override
    public MallCouponRuleEntity insert(MallCouponRuleEntity mallCouponRuleEntity) {
        logger.info("insert begin.mallCouponRuleEntity:{}", JsonUtil.obj2Json(mallCouponRuleEntity));
        this.mallCouponRuleDao.insert(mallCouponRuleEntity);
        return mallCouponRuleEntity;
    }

    /**
     * 修改数据
     *
     * @param mallCouponRuleEntity 实例对象
     * @return 实例对象
     */
    @Override
    public MallCouponRuleEntity update(MallCouponRuleEntity mallCouponRuleEntity) {
        logger.info("update begin.mallCouponRuleEntity:{}", JsonUtil.obj2Json(mallCouponRuleEntity));
        this.mallCouponRuleDao.update(mallCouponRuleEntity);
        return this.queryById(mallCouponRuleEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        logger.info("deleteById begin.mallCouponRuleEntity:{}", id);
        return this.mallCouponRuleDao.deleteById(id) > 0;
    }
}
