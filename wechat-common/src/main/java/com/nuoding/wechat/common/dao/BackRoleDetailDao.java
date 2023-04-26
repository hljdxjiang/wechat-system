package com.nuoding.wechat.common.dao;

import com.nuoding.wechat.common.entity.BackRoleDetail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 角色权限详情表(BackRoleDetail)表数据库访问层
 *
 * @author jhc
 * @since 2023-03-07 14:38:26
 */
public interface BackRoleDetailDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BackRoleDetail queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param backRoleDetail 查询条件
     * @return 对象列表
     */
    List<BackRoleDetail> queryAllByLimit(BackRoleDetail backRoleDetail);

    /**
     * 统计总行数
     *
     * @param backRoleDetail 查询条件
     * @return 总行数
     */
    long count(BackRoleDetail backRoleDetail);

    /**
     * 新增数据
     *
     * @param backRoleDetail 实例对象
     * @return 影响行数
     */
    int insert(BackRoleDetail backRoleDetail);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<BackRoleDetail> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<BackRoleDetail> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<BackRoleDetail> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<BackRoleDetail> entities);

    /**
     * 修改数据
     *
     * @param backRoleDetail 实例对象
     * @return 影响行数
     */
    int update(BackRoleDetail backRoleDetail);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

