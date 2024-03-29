package com.nuoding.wechat.common.dao.back;

import com.nuoding.wechat.common.entity.back.BackSysUserEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 后管用户表
 *
 * @Author: hzq
 * @Date: 2023-12-19 13:50:19
 */
@Repository
public interface BackSysUserDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BackSysUserEntity queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param backSysUserEntity 查询条件
     * @return 对象列表
     */
    List<BackSysUserEntity> queryAllByLimit(BackSysUserEntity backSysUserEntity);

    /**
     * 查询单行数据
     *
     * @param backSysUserEntity 查询条件
     * @return 对象列表
     */
    BackSysUserEntity selectOne(BackSysUserEntity backSysUserEntity);

    /**
     * 模糊查询
     *
     * @param backSysUserEntity 查询条件
     * @return 对象列表
     */
    List<BackSysUserEntity> fuzzyQuery(BackSysUserEntity backSysUserEntity);

    /**
     * 统计总行数
     *
     * @param backSysUserEntity 查询条件
     * @return 总行数
     */
    long count(BackSysUserEntity backSysUserEntity);

    /**
     * 新增数据
     *
     * @param backSysUserEntity 实例对象
     * @return 影响行数
     */
    int insert(BackSysUserEntity backSysUserEntity);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<BackSysUserEntity> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<BackSysUserEntity> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<BackSysUserEntity> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<BackSysUserEntity> entities);

    /**
     * 修改数据
     *
     * @param backSysUserEntity 实例对象
     * @return 影响行数
     */
    int update(BackSysUserEntity backSysUserEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

