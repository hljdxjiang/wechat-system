package com.nuoding.wechat.common.dao.market;

import com.nuoding.wechat.common.entity.market.MarketUserCouponInfoEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 优惠券领取信息表
 *
 * @Author: hzq
 * @Date: 2023-05-08 19:32:47
 */
public interface MarketUserCouponInfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MarketUserCouponInfoEntity queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param marketUserCouponInfoEntity 查询条件
     * @return 对象列表
     */
    List<MarketUserCouponInfoEntity> queryAllByLimit(MarketUserCouponInfoEntity marketUserCouponInfoEntity);

    /**
     * 统计总行数
     *
     * @param marketUserCouponInfoEntity 查询条件
     * @return 总行数
     */
    long count(MarketUserCouponInfoEntity marketUserCouponInfoEntity);

    /**
     * 新增数据
     *
     * @param marketUserCouponInfoEntity 实例对象
     * @return 影响行数
     */
    int insert(MarketUserCouponInfoEntity marketUserCouponInfoEntity);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<MarketUserCouponInfoEntity> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<MarketUserCouponInfoEntity> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<MarketUserCouponInfoEntity> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<MarketUserCouponInfoEntity> entities);

    /**
     * 修改数据
     *
     * @param marketUserCouponInfoEntity 实例对象
     * @return 影响行数
     */
    int update(MarketUserCouponInfoEntity marketUserCouponInfoEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

