package com.nuoding.wechat.common.dao.back;

import com.nuoding.wechat.common.entity.back.BackSysRolesEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 角色信息表
 *
 * @Author: hzq
 * @Date: 2023-06-08 17:37:05
 */
public interface BackSysRolesDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BackSysRolesEntity queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param backSysRolesEntity 查询条件
     * @return 对象列表
     */
    List<BackSysRolesEntity> queryAllByLimit(BackSysRolesEntity backSysRolesEntity);

    /**
     * 统计总行数
     *
     * @param backSysRolesEntity 查询条件
     * @return 总行数
     */
    long count(BackSysRolesEntity backSysRolesEntity);

    /**
     * 新增数据
     *
     * @param backSysRolesEntity 实例对象
     * @return 影响行数
     */
    int insert(BackSysRolesEntity backSysRolesEntity);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<BackSysRolesEntity> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<BackSysRolesEntity> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<BackSysRolesEntity> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<BackSysRolesEntity> entities);

    /**
     * 修改数据
     *
     * @param backSysRolesEntity 实例对象
     * @return 影响行数
     */
    int update(BackSysRolesEntity backSysRolesEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

