package com.nuoding.wechat.common.dao.back;

import com.nuoding.wechat.common.entity.back.BackRuleControlEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 开关控制表
 *
 * @Author: hzq
 * @Date: 2023-12-19 13:50:20
 */
@Repository
public interface BackRuleControlDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BackRuleControlEntity queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param backRuleControlEntity 查询条件
     * @return 对象列表
     */
    List<BackRuleControlEntity> queryAllByLimit(BackRuleControlEntity backRuleControlEntity);

    /**
     * 查询单行数据
     *
     * @param backRuleControlEntity 查询条件
     * @return 对象列表
     */
    BackRuleControlEntity selectOne(BackRuleControlEntity backRuleControlEntity);

    /**
     * 模糊查询
     *
     * @param backRuleControlEntity 查询条件
     * @return 对象列表
     */
    List<BackRuleControlEntity> fuzzyQuery(BackRuleControlEntity backRuleControlEntity);

    /**
     * 统计总行数
     *
     * @param backRuleControlEntity 查询条件
     * @return 总行数
     */
    long count(BackRuleControlEntity backRuleControlEntity);

    /**
     * 新增数据
     *
     * @param backRuleControlEntity 实例对象
     * @return 影响行数
     */
    int insert(BackRuleControlEntity backRuleControlEntity);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<BackRuleControlEntity> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<BackRuleControlEntity> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<BackRuleControlEntity> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<BackRuleControlEntity> entities);

    /**
     * 修改数据
     *
     * @param backRuleControlEntity 实例对象
     * @return 影响行数
     */
    int update(BackRuleControlEntity backRuleControlEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

