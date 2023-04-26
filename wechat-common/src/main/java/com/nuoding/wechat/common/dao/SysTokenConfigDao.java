package com.nuoding.wechat.common.dao;

import com.nuoding.wechat.common.entity.SysTokenConfig;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (SysTokenConfig)表数据库访问层
 *
 * @author jhc
 * @since 2023-03-07 14:39:02
 */
public interface SysTokenConfigDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysTokenConfig queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param sysTokenConfig 查询条件
     * @return 对象列表
     */
    List<SysTokenConfig> queryAllByLimit(SysTokenConfig sysTokenConfig);

    /**
     * 统计总行数
     *
     * @param sysTokenConfig 查询条件
     * @return 总行数
     */
    long count(SysTokenConfig sysTokenConfig);

    /**
     * 新增数据
     *
     * @param sysTokenConfig 实例对象
     * @return 影响行数
     */
    int insert(SysTokenConfig sysTokenConfig);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<SysTokenConfig> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<SysTokenConfig> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<SysTokenConfig> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<SysTokenConfig> entities);

    /**
     * 修改数据
     *
     * @param sysTokenConfig 实例对象
     * @return 影响行数
     */
    int update(SysTokenConfig sysTokenConfig);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

