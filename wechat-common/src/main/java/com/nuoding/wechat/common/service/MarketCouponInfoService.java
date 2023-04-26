package com.nuoding.wechat.common.service;

import com.nuoding.wechat.common.entity.MarketCouponInfo;

import java.util.List;

/**
 * 优惠券信息表(MarketCouponInfo)表服务接口
 *
 * @author jhc
 * @since 2023-03-07 14:38:57
 */
public interface MarketCouponInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MarketCouponInfo queryById(Integer id);

    /**
     * 分页查询
     *
     * @param marketCouponInfo 筛选条件
     * @return 查询结果
     */
    List<MarketCouponInfo> queryByPage(MarketCouponInfo marketCouponInfo);

    /**
     * 新增数据
     *
     * @param marketCouponInfo 实例对象
     * @return 实例对象
     */
    MarketCouponInfo insert(MarketCouponInfo marketCouponInfo);

    /**
     * 修改数据
     *
     * @param marketCouponInfo 实例对象
     * @return 实例对象
     */
    MarketCouponInfo update(MarketCouponInfo marketCouponInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
