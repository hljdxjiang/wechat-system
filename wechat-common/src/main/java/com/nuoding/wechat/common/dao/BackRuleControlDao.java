package com.nuoding.wechat.common.dao;

import com.nuoding.wechat.common.entity.BackRuleControl;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 开关控制表(BackRuleControl)表数据库访问层
 *
 * @author jhc
 * @since 2023-03-07 14:38:21
 */
public interface BackRuleControlDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BackRuleControl queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param backRuleControl 查询条件
     * @return 对象列表
     */
    List<BackRuleControl> queryAllByLimit(BackRuleControl backRuleControl);

    /**
     * 统计总行数
     *
     * @param backRuleControl 查询条件
     * @return 总行数
     */
    long count(BackRuleControl backRuleControl);

    /**
     * 新增数据
     *
     * @param backRuleControl 实例对象
     * @return 影响行数
     */
    int insert(BackRuleControl backRuleControl);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<BackRuleControl> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<BackRuleControl> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<BackRuleControl> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<BackRuleControl> entities);

    /**
     * 修改数据
     *
     * @param backRuleControl 实例对象
     * @return 影响行数
     */
    int update(BackRuleControl backRuleControl);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

