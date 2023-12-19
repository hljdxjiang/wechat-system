package com.nuoding.wechat.common.service.mall;

import com.nuoding.wechat.common.entity.mall.MallUserCouponInfoEntity;

import java.util.List;

/**
 * (mallUserCouponInfo)表服务接口
 * 优惠券领取信息表
 *
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface MallUserCouponInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MallUserCouponInfoEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param mallUserCouponInfoEntity 筛选条件
     * @return 查询结果
     */
    List<MallUserCouponInfoEntity> queryAllByLimit(MallUserCouponInfoEntity mallUserCouponInfoEntity);

    /**
     * 模糊查询
     *
     * @param mallUserCouponInfoEntity 筛选条件
     * @return 查询结果
     */
    List<MallUserCouponInfoEntity> fuzzyQuery(MallUserCouponInfoEntity mallUserCouponInfoEntity);

    /**
     * 单挑查询
     *
     * @param mallUserCouponInfoEntity 筛选条件
     * @return 查询结果
     */
    MallUserCouponInfoEntity selectOne(MallUserCouponInfoEntity mallUserCouponInfoEntity);

    /**
     * 新增数据
     *
     * @param mallUserCouponInfoEntity 实例对象
     * @return 实例对象
     */
    MallUserCouponInfoEntity insert(MallUserCouponInfoEntity mallUserCouponInfoEntity);

    /**
     * 修改数据
     *
     * @param mallUserCouponInfoEntity 实例对象
     * @return 实例对象
     */
    MallUserCouponInfoEntity update(MallUserCouponInfoEntity mallUserCouponInfoEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
