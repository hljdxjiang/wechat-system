package com.nuoding.wechat.common.dao.sys;

import com.nuoding.wechat.common.entity.sys.SysUserLabelsEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 客户信息表
 *
 * @Author: hzq
 * @Date: 2023-12-19 13:50:19
 */
@Repository
public interface SysUserLabelsDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysUserLabelsEntity queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param sysUserLabelsEntity 查询条件
     * @return 对象列表
     */
    List<SysUserLabelsEntity> queryAllByLimit(SysUserLabelsEntity sysUserLabelsEntity);

    /**
     * 查询单行数据
     *
     * @param sysUserLabelsEntity 查询条件
     * @return 对象列表
     */
    SysUserLabelsEntity selectOne(SysUserLabelsEntity sysUserLabelsEntity);

    /**
     * 模糊查询
     *
     * @param sysUserLabelsEntity 查询条件
     * @return 对象列表
     */
    List<SysUserLabelsEntity> fuzzyQuery(SysUserLabelsEntity sysUserLabelsEntity);

    /**
     * 统计总行数
     *
     * @param sysUserLabelsEntity 查询条件
     * @return 总行数
     */
    long count(SysUserLabelsEntity sysUserLabelsEntity);

    /**
     * 新增数据
     *
     * @param sysUserLabelsEntity 实例对象
     * @return 影响行数
     */
    int insert(SysUserLabelsEntity sysUserLabelsEntity);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<SysUserLabelsEntity> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<SysUserLabelsEntity> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<SysUserLabelsEntity> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<SysUserLabelsEntity> entities);

    /**
     * 修改数据
     *
     * @param sysUserLabelsEntity 实例对象
     * @return 影响行数
     */
    int update(SysUserLabelsEntity sysUserLabelsEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

