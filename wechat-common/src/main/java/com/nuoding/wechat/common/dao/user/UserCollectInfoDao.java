package com.nuoding.wechat.common.dao.user;

import com.nuoding.wechat.common.entity.user.UserCollectInfoEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户收藏表
 *
 * @Author: hzq
 * @Date: 2023-12-19 13:50:18
 */
@Repository
public interface UserCollectInfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UserCollectInfoEntity queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param userCollectInfoEntity 查询条件
     * @return 对象列表
     */
    List<UserCollectInfoEntity> queryAllByLimit(UserCollectInfoEntity userCollectInfoEntity);

    /**
     * 查询单行数据
     *
     * @param userCollectInfoEntity 查询条件
     * @return 对象列表
     */
    UserCollectInfoEntity selectOne(UserCollectInfoEntity userCollectInfoEntity);

    /**
     * 模糊查询
     *
     * @param userCollectInfoEntity 查询条件
     * @return 对象列表
     */
    List<UserCollectInfoEntity> fuzzyQuery(UserCollectInfoEntity userCollectInfoEntity);

    /**
     * 统计总行数
     *
     * @param userCollectInfoEntity 查询条件
     * @return 总行数
     */
    long count(UserCollectInfoEntity userCollectInfoEntity);

    /**
     * 新增数据
     *
     * @param userCollectInfoEntity 实例对象
     * @return 影响行数
     */
    int insert(UserCollectInfoEntity userCollectInfoEntity);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<UserCollectInfoEntity> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<UserCollectInfoEntity> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<UserCollectInfoEntity> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<UserCollectInfoEntity> entities);

    /**
     * 修改数据
     *
     * @param userCollectInfoEntity 实例对象
     * @return 影响行数
     */
    int update(UserCollectInfoEntity userCollectInfoEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

