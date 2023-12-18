package com.nuoding.wechat.common.service.mall.impl;

import com.nuoding.wechat.common.dao.mall.MallUserCouponInfoDao;
import com.nuoding.wechat.common.entity.mall.MallUserCouponInfoEntity;
import com.nuoding.wechat.common.service.mall.MallUserCouponInfoService;
import org.springframework.stereotype.Service;
import com.nuoding.wechat.common.utils.JsonUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.List;

/**
 * (mallUserCouponInfo)表服务实现类
 * 优惠券领取信息表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class MallUserCouponInfoServiceImpl implements MallUserCouponInfoService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Resource
    private MallUserCouponInfoDao mallUserCouponInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public MallUserCouponInfoEntity queryById(Integer id) {
        logger.info("queryById begin.id:{}", id);

        return this.mallUserCouponInfoDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param mallUserCouponInfoEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<MallUserCouponInfoEntity> queryAllByLimit(MallUserCouponInfoEntity mallUserCouponInfoEntity) {
        logger.info("queryAllByLimit begin.mallUserCouponInfoEntity:{}", JsonUtil.obj2Json(mallUserCouponInfoEntity));
        return this.mallUserCouponInfoDao.queryAllByLimit(mallUserCouponInfoEntity);
    }

    /**
     * 模糊查询
     *
     * @param mallUserCouponInfoEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<MallUserCouponInfoEntity> fuzzyQuery(MallUserCouponInfoEntity mallUserCouponInfoEntity) {
        logger.info("queryAllByLimit begin.mallUserCouponInfoEntity:{}", JsonUtil.obj2Json(mallUserCouponInfoEntity));
        return this.mallUserCouponInfoDao.fuzzyQuery(mallUserCouponInfoEntity);
    }

    /**
     * 单挑查询
     *
     * @param mallUserCouponInfoEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public MallUserCouponInfoEntity selectOne(MallUserCouponInfoEntity mallUserCouponInfoEntity) {
        logger.info("queryAllByLimit begin.mallUserCouponInfoEntity:{}", JsonUtil.obj2Json(mallUserCouponInfoEntity));
        return this.mallUserCouponInfoDao.selectOne(mallUserCouponInfoEntity);
    }

    /**
     * 新增数据
     *
     * @param mallUserCouponInfoEntity 实例对象
     * @return 实例对象
     */
    @Override
    public MallUserCouponInfoEntity insert(MallUserCouponInfoEntity mallUserCouponInfoEntity) {
        logger.info("insert begin.mallUserCouponInfoEntity:{}", JsonUtil.obj2Json(mallUserCouponInfoEntity));
        this.mallUserCouponInfoDao.insert(mallUserCouponInfoEntity);
        return mallUserCouponInfoEntity;
    }

    /**
     * 修改数据
     *
     * @param mallUserCouponInfoEntity 实例对象
     * @return 实例对象
     */
    @Override
    public MallUserCouponInfoEntity update(MallUserCouponInfoEntity mallUserCouponInfoEntity) {
        logger.info("update begin.mallUserCouponInfoEntity:{}", JsonUtil.obj2Json(mallUserCouponInfoEntity));
        this.mallUserCouponInfoDao.update(mallUserCouponInfoEntity);
        return this.queryById(mallUserCouponInfoEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        logger.info("deleteById begin.mallUserCouponInfoEntity:{}", id);
        return this.mallUserCouponInfoDao.deleteById(id) > 0;
    }
}
