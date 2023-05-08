package com.nuoding.wechat.common.service.market.impl;

import com.nuoding.wechat.common.dao.market.MarketUserCouponInfoDao;
import com.nuoding.wechat.common.entity.market.MarketUserCouponInfoEntity;
import com.nuoding.wechat.common.service.market.MarketUserCouponInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (marketUserCouponInfo)表服务实现类
 * 优惠券领取信息表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class MarketUserCouponInfoServiceImpl implements MarketUserCouponInfoService {
    @Resource
    private MarketUserCouponInfoDao marketUserCouponInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public MarketUserCouponInfoEntity queryById(Integer id) {
        return this.marketUserCouponInfoDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param marketUserCouponInfoEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<MarketUserCouponInfoEntity> queryByPage(MarketUserCouponInfoEntity marketUserCouponInfoEntity) {
        return this.marketUserCouponInfoDao.queryAllByLimit(marketUserCouponInfoEntity);
    }

    /**
     * 新增数据
     *
     * @param marketUserCouponInfoEntity 实例对象
     * @return 实例对象
     */
    @Override
    public MarketUserCouponInfoEntity insert(MarketUserCouponInfoEntity marketUserCouponInfoEntity) {
        this.marketUserCouponInfoDao.insert(marketUserCouponInfoEntity);
        return marketUserCouponInfoEntity;
    }

    /**
     * 修改数据
     *
     * @param marketUserCouponInfoEntity 实例对象
     * @return 实例对象
     */
    @Override
    public MarketUserCouponInfoEntity update(MarketUserCouponInfoEntity marketUserCouponInfoEntity) {
        this.marketUserCouponInfoDao.update(marketUserCouponInfoEntity);
        return this.queryById(marketUserCouponInfoEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.marketUserCouponInfoDao.deleteById(id) > 0;
    }
}
