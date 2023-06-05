package com.nuoding.wechat.common.dao.user;

import com.nuoding.wechat.common.entity.user.UserRegInfoEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 客户信息表
 *
 * @Author: hzq
 * @Date: 2023-06-05 17:49:46
 */
public interface UserRegInfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UserRegInfoEntity queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param userRegInfoEntity 查询条件
     * @return 对象列表
     */
    List<UserRegInfoEntity> queryAllByLimit(UserRegInfoEntity userRegInfoEntity);

    /**
     * 统计总行数
     *
     * @param userRegInfoEntity 查询条件
     * @return 总行数
     */
    long count(UserRegInfoEntity userRegInfoEntity);

    /**
     * 新增数据
     *
     * @param userRegInfoEntity 实例对象
     * @return 影响行数
     */
    int insert(UserRegInfoEntity userRegInfoEntity);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<UserRegInfoEntity> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<UserRegInfoEntity> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<UserRegInfoEntity> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<UserRegInfoEntity> entities);

    /**
     * 修改数据
     *
     * @param userRegInfoEntity 实例对象
     * @return 影响行数
     */
    int update(UserRegInfoEntity userRegInfoEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

