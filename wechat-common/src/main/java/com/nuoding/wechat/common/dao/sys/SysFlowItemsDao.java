package com.nuoding.wechat.common.dao.sys;

import com.nuoding.wechat.common.entity.sys.SysFlowItemsEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 楼层要素表
 *
 * @Author: hzq
 * @Date: 2023-12-18 14:57:37
 */
public interface SysFlowItemsDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysFlowItemsEntity queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param sysFlowItemsEntity 查询条件
     * @return 对象列表
     */
    List<SysFlowItemsEntity> queryAllByLimit(SysFlowItemsEntity sysFlowItemsEntity);

    /**
     * 查询单行数据
     *
     * @param sysFlowItemsEntity 查询条件
     * @return 对象列表
     */
    SysFlowItemsEntity selectOne(SysFlowItemsEntity sysFlowItemsEntity);

    /**
     * 模糊查询
     *
     * @param sysFlowItemsEntity 查询条件
     * @return 对象列表
     */
    List<SysFlowItemsEntity> fuzzyQuery(SysFlowItemsEntity sysFlowItemsEntity);

    /**
     * 统计总行数
     *
     * @param sysFlowItemsEntity 查询条件
     * @return 总行数
     */
    long count(SysFlowItemsEntity sysFlowItemsEntity);

    /**
     * 新增数据
     *
     * @param sysFlowItemsEntity 实例对象
     * @return 影响行数
     */
    int insert(SysFlowItemsEntity sysFlowItemsEntity);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<SysFlowItemsEntity> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<SysFlowItemsEntity> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<SysFlowItemsEntity> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<SysFlowItemsEntity> entities);

    /**
     * 修改数据
     *
     * @param sysFlowItemsEntity 实例对象
     * @return 影响行数
     */
    int update(SysFlowItemsEntity sysFlowItemsEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

