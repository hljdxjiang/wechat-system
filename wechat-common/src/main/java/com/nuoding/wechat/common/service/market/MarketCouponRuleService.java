package com.nuoding.wechat.common.service.market;

import com.nuoding.wechat.common.entity.market.MarketCouponRuleEntity;

import java.util.List;

/**
 * (marketCouponRule)表服务接口
 * 优惠券使用规则控制
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface MarketCouponRuleService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MarketCouponRuleEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param marketCouponRuleEntity 筛选条件
     * @return 查询结果
     */
    List<MarketCouponRuleEntity> queryByPage(MarketCouponRuleEntity marketCouponRuleEntity);

    /**
     * 新增数据
     *
     * @param marketCouponRuleEntity 实例对象
     * @return 实例对象
     */
    MarketCouponRuleEntity insert(MarketCouponRuleEntity marketCouponRuleEntity);

    /**
     * 修改数据
     *
     * @param marketCouponRuleEntity 实例对象
     * @return 实例对象
     */
    MarketCouponRuleEntity update(MarketCouponRuleEntity marketCouponRuleEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
