package com.nuoding.wechat.common.dao.sys;

import com.nuoding.wechat.common.entity.sys.SysPageFlowInfoEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 页面楼层表
 *
 * @Author: hzq
 * @Date: 2023-12-18 14:57:37
 */
public interface SysPageFlowInfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysPageFlowInfoEntity queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param sysPageFlowInfoEntity 查询条件
     * @return 对象列表
     */
    List<SysPageFlowInfoEntity> queryAllByLimit(SysPageFlowInfoEntity sysPageFlowInfoEntity);

    /**
     * 查询单行数据
     *
     * @param sysPageFlowInfoEntity 查询条件
     * @return 对象列表
     */
    SysPageFlowInfoEntity selectOne(SysPageFlowInfoEntity sysPageFlowInfoEntity);

    /**
     * 模糊查询
     *
     * @param sysPageFlowInfoEntity 查询条件
     * @return 对象列表
     */
    List<SysPageFlowInfoEntity> fuzzyQuery(SysPageFlowInfoEntity sysPageFlowInfoEntity);

    /**
     * 统计总行数
     *
     * @param sysPageFlowInfoEntity 查询条件
     * @return 总行数
     */
    long count(SysPageFlowInfoEntity sysPageFlowInfoEntity);

    /**
     * 新增数据
     *
     * @param sysPageFlowInfoEntity 实例对象
     * @return 影响行数
     */
    int insert(SysPageFlowInfoEntity sysPageFlowInfoEntity);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<SysPageFlowInfoEntity> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<SysPageFlowInfoEntity> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<SysPageFlowInfoEntity> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<SysPageFlowInfoEntity> entities);

    /**
     * 修改数据
     *
     * @param sysPageFlowInfoEntity 实例对象
     * @return 影响行数
     */
    int update(SysPageFlowInfoEntity sysPageFlowInfoEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

