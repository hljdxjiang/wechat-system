package com.nuoding.wechat.common.dao;

import com.nuoding.wechat.common.entity.MarketCouponRule;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 优惠券使用规则控制(MarketCouponRule)表数据库访问层
 *
 * @author jhc
 * @since 2023-03-07 14:38:57
 */
public interface MarketCouponRuleDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MarketCouponRule queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param marketCouponRule 查询条件
     * @return 对象列表
     */
    List<MarketCouponRule> queryAllByLimit(MarketCouponRule marketCouponRule);

    /**
     * 统计总行数
     *
     * @param marketCouponRule 查询条件
     * @return 总行数
     */
    long count(MarketCouponRule marketCouponRule);

    /**
     * 新增数据
     *
     * @param marketCouponRule 实例对象
     * @return 影响行数
     */
    int insert(MarketCouponRule marketCouponRule);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<MarketCouponRule> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<MarketCouponRule> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<MarketCouponRule> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<MarketCouponRule> entities);

    /**
     * 修改数据
     *
     * @param marketCouponRule 实例对象
     * @return 影响行数
     */
    int update(MarketCouponRule marketCouponRule);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

