package com.nuoding.wechat.common.service;

import com.nuoding.wechat.common.entity.MarketCouponRule;

import java.util.List;

/**
 * 优惠券使用规则控制(MarketCouponRule)表服务接口
 *
 * @author jhc
 * @since 2023-03-07 14:38:58
 */
public interface MarketCouponRuleService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MarketCouponRule queryById(Integer id);

    /**
     * 分页查询
     *
     * @param marketCouponRule 筛选条件
     * @return 查询结果
     */
    List<MarketCouponRule> queryByPage(MarketCouponRule marketCouponRule);

    /**
     * 新增数据
     *
     * @param marketCouponRule 实例对象
     * @return 实例对象
     */
    MarketCouponRule insert(MarketCouponRule marketCouponRule);

    /**
     * 修改数据
     *
     * @param marketCouponRule 实例对象
     * @return 实例对象
     */
    MarketCouponRule update(MarketCouponRule marketCouponRule);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
