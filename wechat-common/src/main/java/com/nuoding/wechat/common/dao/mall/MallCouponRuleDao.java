package com.nuoding.wechat.common.dao.mall;

import com.nuoding.wechat.common.entity.mall.MallCouponRuleEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 优惠券使用规则控制
 *
 * @Author: hzq
 * @Date: 2023-12-19 13:50:20
 */
@Repository
public interface MallCouponRuleDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MallCouponRuleEntity queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param mallCouponRuleEntity 查询条件
     * @return 对象列表
     */
    List<MallCouponRuleEntity> queryAllByLimit(MallCouponRuleEntity mallCouponRuleEntity);

    /**
     * 查询单行数据
     *
     * @param mallCouponRuleEntity 查询条件
     * @return 对象列表
     */
    MallCouponRuleEntity selectOne(MallCouponRuleEntity mallCouponRuleEntity);

    /**
     * 模糊查询
     *
     * @param mallCouponRuleEntity 查询条件
     * @return 对象列表
     */
    List<MallCouponRuleEntity> fuzzyQuery(MallCouponRuleEntity mallCouponRuleEntity);

    /**
     * 统计总行数
     *
     * @param mallCouponRuleEntity 查询条件
     * @return 总行数
     */
    long count(MallCouponRuleEntity mallCouponRuleEntity);

    /**
     * 新增数据
     *
     * @param mallCouponRuleEntity 实例对象
     * @return 影响行数
     */
    int insert(MallCouponRuleEntity mallCouponRuleEntity);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<MallCouponRuleEntity> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<MallCouponRuleEntity> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<MallCouponRuleEntity> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<MallCouponRuleEntity> entities);

    /**
     * 修改数据
     *
     * @param mallCouponRuleEntity 实例对象
     * @return 影响行数
     */
    int update(MallCouponRuleEntity mallCouponRuleEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

