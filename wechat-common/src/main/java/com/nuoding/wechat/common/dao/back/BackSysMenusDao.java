package com.nuoding.wechat.common.dao.back;

import com.nuoding.wechat.common.entity.back.BackSysMenusEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 系统菜单表
 *
 * @Author: hzq
 * @Date: 2023-05-08 19:32:47
 */
public interface BackSysMenusDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BackSysMenusEntity queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param backSysMenusEntity 查询条件
     * @return 对象列表
     */
    List<BackSysMenusEntity> queryAllByLimit(BackSysMenusEntity backSysMenusEntity);

    /**
     * 统计总行数
     *
     * @param backSysMenusEntity 查询条件
     * @return 总行数
     */
    long count(BackSysMenusEntity backSysMenusEntity);

    /**
     * 新增数据
     *
     * @param backSysMenusEntity 实例对象
     * @return 影响行数
     */
    int insert(BackSysMenusEntity backSysMenusEntity);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<BackSysMenusEntity> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<BackSysMenusEntity> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<BackSysMenusEntity> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<BackSysMenusEntity> entities);

    /**
     * 修改数据
     *
     * @param backSysMenusEntity 实例对象
     * @return 影响行数
     */
    int update(BackSysMenusEntity backSysMenusEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

