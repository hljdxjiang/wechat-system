package com.nuoding.wechat.common.service.market.impl;

import com.nuoding.wechat.common.dao.market.MarketCouponRuleDao;
import com.nuoding.wechat.common.entity.market.MarketCouponRuleEntity;
import com.nuoding.wechat.common.service.market.MarketCouponRuleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (marketCouponRule)表服务实现类
 * 优惠券使用规则控制
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class MarketCouponRuleServiceImpl implements MarketCouponRuleService {
    @Resource
    private MarketCouponRuleDao marketCouponRuleDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public MarketCouponRuleEntity queryById(Integer id) {
        return this.marketCouponRuleDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param marketCouponRuleEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<MarketCouponRuleEntity> queryByPage(MarketCouponRuleEntity marketCouponRuleEntity) {
        return this.marketCouponRuleDao.queryAllByLimit(marketCouponRuleEntity);
    }

    /**
     * 新增数据
     *
     * @param marketCouponRuleEntity 实例对象
     * @return 实例对象
     */
    @Override
    public MarketCouponRuleEntity insert(MarketCouponRuleEntity marketCouponRuleEntity) {
        this.marketCouponRuleDao.insert(marketCouponRuleEntity);
        return marketCouponRuleEntity;
    }

    /**
     * 修改数据
     *
     * @param marketCouponRuleEntity 实例对象
     * @return 实例对象
     */
    @Override
    public MarketCouponRuleEntity update(MarketCouponRuleEntity marketCouponRuleEntity) {
        this.marketCouponRuleDao.update(marketCouponRuleEntity);
        return this.queryById(marketCouponRuleEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.marketCouponRuleDao.deleteById(id) > 0;
    }
}
