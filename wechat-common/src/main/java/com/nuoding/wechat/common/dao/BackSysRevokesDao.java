package com.nuoding.wechat.common.dao;

import com.nuoding.wechat.common.entity.BackSysRevokes;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 系统权限表(BackSysRevokes)表数据库访问层
 *
 * @author jhc
 * @since 2023-03-07 14:38:30
 */
public interface BackSysRevokesDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BackSysRevokes queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param backSysRevokes 查询条件
     * @return 对象列表
     */
    List<BackSysRevokes> queryAllByLimit(BackSysRevokes backSysRevokes);

    /**
     * 统计总行数
     *
     * @param backSysRevokes 查询条件
     * @return 总行数
     */
    long count(BackSysRevokes backSysRevokes);

    /**
     * 新增数据
     *
     * @param backSysRevokes 实例对象
     * @return 影响行数
     */
    int insert(BackSysRevokes backSysRevokes);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<BackSysRevokes> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<BackSysRevokes> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<BackSysRevokes> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<BackSysRevokes> entities);

    /**
     * 修改数据
     *
     * @param backSysRevokes 实例对象
     * @return 影响行数
     */
    int update(BackSysRevokes backSysRevokes);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

