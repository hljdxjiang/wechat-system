package com.nuoding.wechat.common.dao.back;

import com.nuoding.wechat.common.entity.back.BackOperaRecordEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 后管操作记录表
 *
 * @Author: hzq
 * @Date: 2023-12-18 14:57:38
 */
public interface BackOperaRecordDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BackOperaRecordEntity queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param backOperaRecordEntity 查询条件
     * @return 对象列表
     */
    List<BackOperaRecordEntity> queryAllByLimit(BackOperaRecordEntity backOperaRecordEntity);

    /**
     * 查询单行数据
     *
     * @param backOperaRecordEntity 查询条件
     * @return 对象列表
     */
    BackOperaRecordEntity selectOne(BackOperaRecordEntity backOperaRecordEntity);

    /**
     * 模糊查询
     *
     * @param backOperaRecordEntity 查询条件
     * @return 对象列表
     */
    List<BackOperaRecordEntity> fuzzyQuery(BackOperaRecordEntity backOperaRecordEntity);

    /**
     * 统计总行数
     *
     * @param backOperaRecordEntity 查询条件
     * @return 总行数
     */
    long count(BackOperaRecordEntity backOperaRecordEntity);

    /**
     * 新增数据
     *
     * @param backOperaRecordEntity 实例对象
     * @return 影响行数
     */
    int insert(BackOperaRecordEntity backOperaRecordEntity);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<BackOperaRecordEntity> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<BackOperaRecordEntity> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<BackOperaRecordEntity> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<BackOperaRecordEntity> entities);

    /**
     * 修改数据
     *
     * @param backOperaRecordEntity 实例对象
     * @return 影响行数
     */
    int update(BackOperaRecordEntity backOperaRecordEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

