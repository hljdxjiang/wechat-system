package com.nuoding.wechat.common.dao;

import com.nuoding.wechat.common.entity.MarketCouponInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 优惠券信息表(MarketCouponInfo)表数据库访问层
 *
 * @author jhc
 * @since 2023-03-07 14:37:11
 */
public interface MarketCouponInfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MarketCouponInfo queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param marketCouponInfo 查询条件
     * @return 对象列表
     */
    List<MarketCouponInfo> queryAllByLimit(MarketCouponInfo marketCouponInfo);

    /**
     * 统计总行数
     *
     * @param marketCouponInfo 查询条件
     * @return 总行数
     */
    long count(MarketCouponInfo marketCouponInfo);

    /**
     * 新增数据
     *
     * @param marketCouponInfo 实例对象
     * @return 影响行数
     */
    int insert(MarketCouponInfo marketCouponInfo);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<MarketCouponInfo> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<MarketCouponInfo> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<MarketCouponInfo> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<MarketCouponInfo> entities);

    /**
     * 修改数据
     *
     * @param marketCouponInfo 实例对象
     * @return 影响行数
     */
    int update(MarketCouponInfo marketCouponInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

