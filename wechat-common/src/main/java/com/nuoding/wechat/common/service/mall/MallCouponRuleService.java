package com.nuoding.wechat.common.service.mall;

import com.nuoding.wechat.common.entity.mall.MallCouponRuleEntity;

import java.util.List;

/**
 * (mallCouponRule)表服务接口
 * 优惠券使用规则控制
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface MallCouponRuleService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MallCouponRuleEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param mallCouponRuleEntity 筛选条件
     * @return 查询结果
     */
    List<MallCouponRuleEntity> queryByPage(MallCouponRuleEntity mallCouponRuleEntity);

    /**
     * 新增数据
     *
     * @param mallCouponRuleEntity 实例对象
     * @return 实例对象
     */
    MallCouponRuleEntity insert(MallCouponRuleEntity mallCouponRuleEntity);

    /**
     * 修改数据
     *
     * @param mallCouponRuleEntity 实例对象
     * @return 实例对象
     */
    MallCouponRuleEntity update(MallCouponRuleEntity mallCouponRuleEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
