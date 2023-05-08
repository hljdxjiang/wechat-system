package com.nuoding.wechat.common.dao.sys;

import com.nuoding.wechat.common.entity.sys.SysPageTypeInfoEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 类型配置表
 *
 * @Author: hzq
 * @Date: 2023-05-08 19:32:47
 */
public interface SysPageTypeInfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysPageTypeInfoEntity queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param sysPageTypeInfoEntity 查询条件
     * @return 对象列表
     */
    List<SysPageTypeInfoEntity> queryAllByLimit(SysPageTypeInfoEntity sysPageTypeInfoEntity);

    /**
     * 统计总行数
     *
     * @param sysPageTypeInfoEntity 查询条件
     * @return 总行数
     */
    long count(SysPageTypeInfoEntity sysPageTypeInfoEntity);

    /**
     * 新增数据
     *
     * @param sysPageTypeInfoEntity 实例对象
     * @return 影响行数
     */
    int insert(SysPageTypeInfoEntity sysPageTypeInfoEntity);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<SysPageTypeInfoEntity> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<SysPageTypeInfoEntity> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<SysPageTypeInfoEntity> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<SysPageTypeInfoEntity> entities);

    /**
     * 修改数据
     *
     * @param sysPageTypeInfoEntity 实例对象
     * @return 影响行数
     */
    int update(SysPageTypeInfoEntity sysPageTypeInfoEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

