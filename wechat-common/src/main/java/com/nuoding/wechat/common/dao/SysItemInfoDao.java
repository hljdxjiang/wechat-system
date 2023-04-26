package com.nuoding.wechat.common.dao;

import com.nuoding.wechat.common.entity.SysItemInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (SysItemInfo)表数据库访问层
 *
 * @author jhc
 * @since 2023-03-07 14:39:00
 */
public interface SysItemInfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysItemInfo queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param sysItemInfo 查询条件
     * @return 对象列表
     */
    List<SysItemInfo> queryAllByLimit(SysItemInfo sysItemInfo);

    /**
     * 统计总行数
     *
     * @param sysItemInfo 查询条件
     * @return 总行数
     */
    long count(SysItemInfo sysItemInfo);

    /**
     * 新增数据
     *
     * @param sysItemInfo 实例对象
     * @return 影响行数
     */
    int insert(SysItemInfo sysItemInfo);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<SysItemInfo> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<SysItemInfo> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<SysItemInfo> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<SysItemInfo> entities);

    /**
     * 修改数据
     *
     * @param sysItemInfo 实例对象
     * @return 影响行数
     */
    int update(SysItemInfo sysItemInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

