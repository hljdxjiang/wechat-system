package com.nuoding.wechat.common.dao.sys;

import com.nuoding.wechat.common.entity.sys.SysResourceInfoEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 资源信息表
 *
 * @Author: hzq
 * @Date: 2023-12-18 14:57:37
 */
public interface SysResourceInfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysResourceInfoEntity queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param sysResourceInfoEntity 查询条件
     * @return 对象列表
     */
    List<SysResourceInfoEntity> queryAllByLimit(SysResourceInfoEntity sysResourceInfoEntity);

    /**
     * 查询单行数据
     *
     * @param sysResourceInfoEntity 查询条件
     * @return 对象列表
     */
    SysResourceInfoEntity selectOne(SysResourceInfoEntity sysResourceInfoEntity);

    /**
     * 模糊查询
     *
     * @param sysResourceInfoEntity 查询条件
     * @return 对象列表
     */
    List<SysResourceInfoEntity> fuzzyQuery(SysResourceInfoEntity sysResourceInfoEntity);

    /**
     * 统计总行数
     *
     * @param sysResourceInfoEntity 查询条件
     * @return 总行数
     */
    long count(SysResourceInfoEntity sysResourceInfoEntity);

    /**
     * 新增数据
     *
     * @param sysResourceInfoEntity 实例对象
     * @return 影响行数
     */
    int insert(SysResourceInfoEntity sysResourceInfoEntity);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<SysResourceInfoEntity> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<SysResourceInfoEntity> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<SysResourceInfoEntity> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<SysResourceInfoEntity> entities);

    /**
     * 修改数据
     *
     * @param sysResourceInfoEntity 实例对象
     * @return 影响行数
     */
    int update(SysResourceInfoEntity sysResourceInfoEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

