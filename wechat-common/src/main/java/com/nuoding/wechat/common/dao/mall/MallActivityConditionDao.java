package com.nuoding.wechat.common.dao.mall;

import com.nuoding.wechat.common.entity.mall.MallActivityConditionEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 活动条件表
 *
 * @Author: hzq
 * @Date: 2023-12-19 13:50:19
 */
@Repository
public interface MallActivityConditionDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MallActivityConditionEntity queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param mallActivityConditionEntity 查询条件
     * @return 对象列表
     */
    List<MallActivityConditionEntity> queryAllByLimit(MallActivityConditionEntity mallActivityConditionEntity);

    /**
     * 查询单行数据
     *
     * @param mallActivityConditionEntity 查询条件
     * @return 对象列表
     */
    MallActivityConditionEntity selectOne(MallActivityConditionEntity mallActivityConditionEntity);

    /**
     * 模糊查询
     *
     * @param mallActivityConditionEntity 查询条件
     * @return 对象列表
     */
    List<MallActivityConditionEntity> fuzzyQuery(MallActivityConditionEntity mallActivityConditionEntity);

    /**
     * 统计总行数
     *
     * @param mallActivityConditionEntity 查询条件
     * @return 总行数
     */
    long count(MallActivityConditionEntity mallActivityConditionEntity);

    /**
     * 新增数据
     *
     * @param mallActivityConditionEntity 实例对象
     * @return 影响行数
     */
    int insert(MallActivityConditionEntity mallActivityConditionEntity);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<MallActivityConditionEntity> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<MallActivityConditionEntity> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<MallActivityConditionEntity> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<MallActivityConditionEntity> entities);

    /**
     * 修改数据
     *
     * @param mallActivityConditionEntity 实例对象
     * @return 影响行数
     */
    int update(MallActivityConditionEntity mallActivityConditionEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

