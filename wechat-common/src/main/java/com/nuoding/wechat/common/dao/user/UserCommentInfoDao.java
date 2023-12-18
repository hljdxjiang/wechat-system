package com.nuoding.wechat.common.dao.user;

import com.nuoding.wechat.common.entity.user.UserCommentInfoEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 客户信息表
 *
 * @Author: hzq
 * @Date: 2023-12-18 14:57:37
 */
public interface UserCommentInfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UserCommentInfoEntity queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param userCommentInfoEntity 查询条件
     * @return 对象列表
     */
    List<UserCommentInfoEntity> queryAllByLimit(UserCommentInfoEntity userCommentInfoEntity);

    /**
     * 查询单行数据
     *
     * @param userCommentInfoEntity 查询条件
     * @return 对象列表
     */
    UserCommentInfoEntity selectOne(UserCommentInfoEntity userCommentInfoEntity);

    /**
     * 模糊查询
     *
     * @param userCommentInfoEntity 查询条件
     * @return 对象列表
     */
    List<UserCommentInfoEntity> fuzzyQuery(UserCommentInfoEntity userCommentInfoEntity);

    /**
     * 统计总行数
     *
     * @param userCommentInfoEntity 查询条件
     * @return 总行数
     */
    long count(UserCommentInfoEntity userCommentInfoEntity);

    /**
     * 新增数据
     *
     * @param userCommentInfoEntity 实例对象
     * @return 影响行数
     */
    int insert(UserCommentInfoEntity userCommentInfoEntity);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<UserCommentInfoEntity> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<UserCommentInfoEntity> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<UserCommentInfoEntity> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<UserCommentInfoEntity> entities);

    /**
     * 修改数据
     *
     * @param userCommentInfoEntity 实例对象
     * @return 影响行数
     */
    int update(UserCommentInfoEntity userCommentInfoEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

