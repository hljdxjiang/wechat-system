package com.nuoding.wechat.common.dao.sys;

import com.nuoding.wechat.common.entity.sys.SysTenantTokenEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 企业token信息表
 *
 * @Author: hzq
 * @Date: 2023-12-18 14:57:37
 */
public interface SysTenantTokenDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysTenantTokenEntity queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param sysTenantTokenEntity 查询条件
     * @return 对象列表
     */
    List<SysTenantTokenEntity> queryAllByLimit(SysTenantTokenEntity sysTenantTokenEntity);

    /**
     * 查询单行数据
     *
     * @param sysTenantTokenEntity 查询条件
     * @return 对象列表
     */
    SysTenantTokenEntity selectOne(SysTenantTokenEntity sysTenantTokenEntity);

    /**
     * 模糊查询
     *
     * @param sysTenantTokenEntity 查询条件
     * @return 对象列表
     */
    List<SysTenantTokenEntity> fuzzyQuery(SysTenantTokenEntity sysTenantTokenEntity);

    /**
     * 统计总行数
     *
     * @param sysTenantTokenEntity 查询条件
     * @return 总行数
     */
    long count(SysTenantTokenEntity sysTenantTokenEntity);

    /**
     * 新增数据
     *
     * @param sysTenantTokenEntity 实例对象
     * @return 影响行数
     */
    int insert(SysTenantTokenEntity sysTenantTokenEntity);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<SysTenantTokenEntity> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<SysTenantTokenEntity> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<SysTenantTokenEntity> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<SysTenantTokenEntity> entities);

    /**
     * 修改数据
     *
     * @param sysTenantTokenEntity 实例对象
     * @return 影响行数
     */
    int update(SysTenantTokenEntity sysTenantTokenEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

