package com.nuoding.wechat.common.service.impl;

import com.nuoding.wechat.common.dao.MarketCouponRuleDao;
import com.nuoding.wechat.common.entity.MarketCouponRule;
import com.nuoding.wechat.common.service.MarketCouponRuleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 优惠券使用规则控制(MarketCouponRule)表服务实现类
 *
 * @author jhc
 * @since 2023-03-07 14:38:58
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
    public MarketCouponRule queryById(Integer id) {
        return this.marketCouponRuleDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param marketCouponRule 筛选条件
     * @return 查询结果
     */
    @Override
    public List<MarketCouponRule> queryByPage(MarketCouponRule marketCouponRule) {
        return this.marketCouponRuleDao.queryAllByLimit(marketCouponRule);
    }

    /**
     * 新增数据
     *
     * @param marketCouponRule 实例对象
     * @return 实例对象
     */
    @Override
    public MarketCouponRule insert(MarketCouponRule marketCouponRule) {
        this.marketCouponRuleDao.insert(marketCouponRule);
        return marketCouponRule;
    }

    /**
     * 修改数据
     *
     * @param marketCouponRule 实例对象
     * @return 实例对象
     */
    @Override
    public MarketCouponRule update(MarketCouponRule marketCouponRule) {
        this.marketCouponRuleDao.update(marketCouponRule);
        return this.queryById(marketCouponRule.getId());
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
