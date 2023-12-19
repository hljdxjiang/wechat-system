package com.nuoding.wechat.common.dao.back;

import com.nuoding.wechat.common.entity.back.BackRuleDetailEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 角色权限详情表
 *
 * @Author: hzq
 * @Date: 2023-12-19 13:50:20
 */
@Repository
public interface BackRuleDetailDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BackRuleDetailEntity queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param backRuleDetailEntity 查询条件
     * @return 对象列表
     */
    List<BackRuleDetailEntity> queryAllByLimit(BackRuleDetailEntity backRuleDetailEntity);

    /**
     * 查询单行数据
     *
     * @param backRuleDetailEntity 查询条件
     * @return 对象列表
     */
    BackRuleDetailEntity selectOne(BackRuleDetailEntity backRuleDetailEntity);

    /**
     * 模糊查询
     *
     * @param backRuleDetailEntity 查询条件
     * @return 对象列表
     */
    List<BackRuleDetailEntity> fuzzyQuery(BackRuleDetailEntity backRuleDetailEntity);

    /**
     * 统计总行数
     *
     * @param backRuleDetailEntity 查询条件
     * @return 总行数
     */
    long count(BackRuleDetailEntity backRuleDetailEntity);

    /**
     * 新增数据
     *
     * @param backRuleDetailEntity 实例对象
     * @return 影响行数
     */
    int insert(BackRuleDetailEntity backRuleDetailEntity);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<BackRuleDetailEntity> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<BackRuleDetailEntity> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<BackRuleDetailEntity> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<BackRuleDetailEntity> entities);

    /**
     * 修改数据
     *
     * @param backRuleDetailEntity 实例对象
     * @return 影响行数
     */
    int update(BackRuleDetailEntity backRuleDetailEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

