package com.nuoding.wechat.common.dao.mall;

import com.nuoding.wechat.common.entity.mall.MallUserCouponInfoEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 优惠券领取信息表
 *
 * @Author: hzq
 * @Date: 2023-12-19 13:50:19
 */
@Repository
public interface MallUserCouponInfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MallUserCouponInfoEntity queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param mallUserCouponInfoEntity 查询条件
     * @return 对象列表
     */
    List<MallUserCouponInfoEntity> queryAllByLimit(MallUserCouponInfoEntity mallUserCouponInfoEntity);

    /**
     * 查询单行数据
     *
     * @param mallUserCouponInfoEntity 查询条件
     * @return 对象列表
     */
    MallUserCouponInfoEntity selectOne(MallUserCouponInfoEntity mallUserCouponInfoEntity);

    /**
     * 模糊查询
     *
     * @param mallUserCouponInfoEntity 查询条件
     * @return 对象列表
     */
    List<MallUserCouponInfoEntity> fuzzyQuery(MallUserCouponInfoEntity mallUserCouponInfoEntity);

    /**
     * 统计总行数
     *
     * @param mallUserCouponInfoEntity 查询条件
     * @return 总行数
     */
    long count(MallUserCouponInfoEntity mallUserCouponInfoEntity);

    /**
     * 新增数据
     *
     * @param mallUserCouponInfoEntity 实例对象
     * @return 影响行数
     */
    int insert(MallUserCouponInfoEntity mallUserCouponInfoEntity);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<MallUserCouponInfoEntity> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<MallUserCouponInfoEntity> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<MallUserCouponInfoEntity> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<MallUserCouponInfoEntity> entities);

    /**
     * 修改数据
     *
     * @param mallUserCouponInfoEntity 实例对象
     * @return 影响行数
     */
    int update(MallUserCouponInfoEntity mallUserCouponInfoEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

