package com.nuoding.wechat.common.dao.user;

import com.nuoding.wechat.common.entity.user.UserPropertyDetailEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 用户资产记录表
 *
 * @Author: hzq
 * @Date: 2023-06-05 17:49:46
 */
public interface UserPropertyDetailDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UserPropertyDetailEntity queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param userPropertyDetailEntity 查询条件
     * @return 对象列表
     */
    List<UserPropertyDetailEntity> queryAllByLimit(UserPropertyDetailEntity userPropertyDetailEntity);

    /**
     * 统计总行数
     *
     * @param userPropertyDetailEntity 查询条件
     * @return 总行数
     */
    long count(UserPropertyDetailEntity userPropertyDetailEntity);

    /**
     * 新增数据
     *
     * @param userPropertyDetailEntity 实例对象
     * @return 影响行数
     */
    int insert(UserPropertyDetailEntity userPropertyDetailEntity);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<UserPropertyDetailEntity> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<UserPropertyDetailEntity> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<UserPropertyDetailEntity> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<UserPropertyDetailEntity> entities);

    /**
     * 修改数据
     *
     * @param userPropertyDetailEntity 实例对象
     * @return 影响行数
     */
    int update(UserPropertyDetailEntity userPropertyDetailEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

