package com.nuoding.wechat.common.dao.user;

import com.nuoding.wechat.common.entity.user.UserPropertyEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户资产信息表
 *
 * @Author: hzq
 * @Date: 2023-12-19 13:50:19
 */
@Repository
public interface UserPropertyDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UserPropertyEntity queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param userPropertyEntity 查询条件
     * @return 对象列表
     */
    List<UserPropertyEntity> queryAllByLimit(UserPropertyEntity userPropertyEntity);

    /**
     * 查询单行数据
     *
     * @param userPropertyEntity 查询条件
     * @return 对象列表
     */
    UserPropertyEntity selectOne(UserPropertyEntity userPropertyEntity);

    /**
     * 模糊查询
     *
     * @param userPropertyEntity 查询条件
     * @return 对象列表
     */
    List<UserPropertyEntity> fuzzyQuery(UserPropertyEntity userPropertyEntity);

    /**
     * 统计总行数
     *
     * @param userPropertyEntity 查询条件
     * @return 总行数
     */
    long count(UserPropertyEntity userPropertyEntity);

    /**
     * 新增数据
     *
     * @param userPropertyEntity 实例对象
     * @return 影响行数
     */
    int insert(UserPropertyEntity userPropertyEntity);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<UserPropertyEntity> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<UserPropertyEntity> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<UserPropertyEntity> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<UserPropertyEntity> entities);

    /**
     * 修改数据
     *
     * @param userPropertyEntity 实例对象
     * @return 影响行数
     */
    int update(UserPropertyEntity userPropertyEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

