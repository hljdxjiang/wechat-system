package com.nuoding.wechat.common.dao.market;

import com.nuoding.wechat.common.entity.market.MarketCouponRuleEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 优惠券使用规则控制
 *
 * @Author: hzq
 * @Date: 2023-05-08 19:32:48
 */
public interface MarketCouponRuleDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MarketCouponRuleEntity queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param marketCouponRuleEntity 查询条件
     * @return 对象列表
     */
    List<MarketCouponRuleEntity> queryAllByLimit(MarketCouponRuleEntity marketCouponRuleEntity);

    /**
     * 统计总行数
     *
     * @param marketCouponRuleEntity 查询条件
     * @return 总行数
     */
    long count(MarketCouponRuleEntity marketCouponRuleEntity);

    /**
     * 新增数据
     *
     * @param marketCouponRuleEntity 实例对象
     * @return 影响行数
     */
    int insert(MarketCouponRuleEntity marketCouponRuleEntity);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<MarketCouponRuleEntity> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<MarketCouponRuleEntity> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<MarketCouponRuleEntity> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<MarketCouponRuleEntity> entities);

    /**
     * 修改数据
     *
     * @param marketCouponRuleEntity 实例对象
     * @return 影响行数
     */
    int update(MarketCouponRuleEntity marketCouponRuleEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

