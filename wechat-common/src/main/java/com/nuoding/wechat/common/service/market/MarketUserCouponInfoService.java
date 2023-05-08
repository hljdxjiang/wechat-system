package com.nuoding.wechat.common.service.market;

import com.nuoding.wechat.common.entity.market.MarketUserCouponInfoEntity;

import java.util.List;

/**
 * (marketUserCouponInfo)表服务接口
 * 优惠券领取信息表
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface MarketUserCouponInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MarketUserCouponInfoEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param marketUserCouponInfoEntity 筛选条件
     * @return 查询结果
     */
    List<MarketUserCouponInfoEntity> queryByPage(MarketUserCouponInfoEntity marketUserCouponInfoEntity);

    /**
     * 新增数据
     *
     * @param marketUserCouponInfoEntity 实例对象
     * @return 实例对象
     */
    MarketUserCouponInfoEntity insert(MarketUserCouponInfoEntity marketUserCouponInfoEntity);

    /**
     * 修改数据
     *
     * @param marketUserCouponInfoEntity 实例对象
     * @return 实例对象
     */
    MarketUserCouponInfoEntity update(MarketUserCouponInfoEntity marketUserCouponInfoEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
