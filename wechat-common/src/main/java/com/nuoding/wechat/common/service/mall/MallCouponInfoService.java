package com.nuoding.wechat.common.service.mall;

import com.nuoding.wechat.common.entity.mall.MallCouponInfoEntity;

import java.util.List;

/**
 * (mallCouponInfo)表服务接口
 * 优惠券信息表
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface MallCouponInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MallCouponInfoEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param mallCouponInfoEntity 筛选条件
     * @return 查询结果
     */
    List<MallCouponInfoEntity> queryAllByLimit(MallCouponInfoEntity mallCouponInfoEntity);

    /**
     * 新增数据
     *
     * @param mallCouponInfoEntity 实例对象
     * @return 实例对象
     */
    MallCouponInfoEntity insert(MallCouponInfoEntity mallCouponInfoEntity);

    /**
     * 修改数据
     *
     * @param mallCouponInfoEntity 实例对象
     * @return 实例对象
     */
    MallCouponInfoEntity update(MallCouponInfoEntity mallCouponInfoEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
