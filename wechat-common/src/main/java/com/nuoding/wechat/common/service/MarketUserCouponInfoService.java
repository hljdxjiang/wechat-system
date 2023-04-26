package com.nuoding.wechat.common.service;

import com.nuoding.wechat.common.entity.MarketUserCouponInfo;

import java.util.List;

/**
 * 优惠券领取信息表(MarketUserCouponInfo)表服务接口
 *
 * @author jhc
 * @since 2023-03-07 14:38:59
 */
public interface MarketUserCouponInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MarketUserCouponInfo queryById(Integer id);

    /**
     * 分页查询
     *
     * @param marketUserCouponInfo 筛选条件
     * @return 查询结果
     */
    List<MarketUserCouponInfo> queryByPage(MarketUserCouponInfo marketUserCouponInfo);

    /**
     * 新增数据
     *
     * @param marketUserCouponInfo 实例对象
     * @return 实例对象
     */
    MarketUserCouponInfo insert(MarketUserCouponInfo marketUserCouponInfo);

    /**
     * 修改数据
     *
     * @param marketUserCouponInfo 实例对象
     * @return 实例对象
     */
    MarketUserCouponInfo update(MarketUserCouponInfo marketUserCouponInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
