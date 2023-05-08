package com.nuoding.wechat.common.service.market;

import com.nuoding.wechat.common.entity.market.MarketCouponInfoEntity;

import java.util.List;

/**
 * (marketCouponInfo)表服务接口
 * 优惠券信息表
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface MarketCouponInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MarketCouponInfoEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param marketCouponInfoEntity 筛选条件
     * @return 查询结果
     */
    List<MarketCouponInfoEntity> queryByPage(MarketCouponInfoEntity marketCouponInfoEntity);

    /**
     * 新增数据
     *
     * @param marketCouponInfoEntity 实例对象
     * @return 实例对象
     */
    MarketCouponInfoEntity insert(MarketCouponInfoEntity marketCouponInfoEntity);

    /**
     * 修改数据
     *
     * @param marketCouponInfoEntity 实例对象
     * @return 实例对象
     */
    MarketCouponInfoEntity update(MarketCouponInfoEntity marketCouponInfoEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
