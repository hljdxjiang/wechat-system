package com.nuoding.wechat.common.dao;

import com.nuoding.wechat.common.entity.BackSysMenus;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 系统菜单表(BackSysMenus)表数据库访问层
 *
 * @author jhc
 * @since 2023-03-07 14:38:29
 */
public interface BackSysMenusDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BackSysMenus queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param backSysMenus 查询条件
     * @return 对象列表
     */
    List<BackSysMenus> queryAllByLimit(BackSysMenus backSysMenus);

    /**
     * 统计总行数
     *
     * @param backSysMenus 查询条件
     * @return 总行数
     */
    long count(BackSysMenus backSysMenus);

    /**
     * 新增数据
     *
     * @param backSysMenus 实例对象
     * @return 影响行数
     */
    int insert(BackSysMenus backSysMenus);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<BackSysMenus> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<BackSysMenus> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<BackSysMenus> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<BackSysMenus> entities);

    /**
     * 修改数据
     *
     * @param backSysMenus 实例对象
     * @return 影响行数
     */
    int update(BackSysMenus backSysMenus);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

