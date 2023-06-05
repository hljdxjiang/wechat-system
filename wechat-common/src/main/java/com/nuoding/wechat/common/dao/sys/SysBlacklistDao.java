package com.nuoding.wechat.common.dao.sys;

import com.nuoding.wechat.common.entity.sys.SysBlacklistEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 黑名单表
 *
 * @Author: hzq
 * @Date: 2023-06-05 17:49:46
 */
public interface SysBlacklistDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysBlacklistEntity queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param sysBlacklistEntity 查询条件
     * @return 对象列表
     */
    List<SysBlacklistEntity> queryAllByLimit(SysBlacklistEntity sysBlacklistEntity);

    /**
     * 统计总行数
     *
     * @param sysBlacklistEntity 查询条件
     * @return 总行数
     */
    long count(SysBlacklistEntity sysBlacklistEntity);

    /**
     * 新增数据
     *
     * @param sysBlacklistEntity 实例对象
     * @return 影响行数
     */
    int insert(SysBlacklistEntity sysBlacklistEntity);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<SysBlacklistEntity> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<SysBlacklistEntity> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<SysBlacklistEntity> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<SysBlacklistEntity> entities);

    /**
     * 修改数据
     *
     * @param sysBlacklistEntity 实例对象
     * @return 影响行数
     */
    int update(SysBlacklistEntity sysBlacklistEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

