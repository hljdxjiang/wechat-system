package com.nuoding.wechat.common.dao;

import com.nuoding.wechat.common.entity.BackOperaRecord;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (BackOperaRecord)表数据库访问层
 *
 * @author jhc
 * @since 2023-03-07 14:38:13
 */
public interface BackOperaRecordDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BackOperaRecord queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param backOperaRecord 查询条件
     * @return 对象列表
     */
    List<BackOperaRecord> queryAllByLimit(BackOperaRecord backOperaRecord);

    /**
     * 统计总行数
     *
     * @param backOperaRecord 查询条件
     * @return 总行数
     */
    long count(BackOperaRecord backOperaRecord);

    /**
     * 新增数据
     *
     * @param backOperaRecord 实例对象
     * @return 影响行数
     */
    int insert(BackOperaRecord backOperaRecord);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<BackOperaRecord> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<BackOperaRecord> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<BackOperaRecord> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<BackOperaRecord> entities);

    /**
     * 修改数据
     *
     * @param backOperaRecord 实例对象
     * @return 影响行数
     */
    int update(BackOperaRecord backOperaRecord);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

