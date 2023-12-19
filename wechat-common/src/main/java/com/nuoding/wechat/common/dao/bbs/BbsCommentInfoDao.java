package com.nuoding.wechat.common.dao.bbs;

import com.nuoding.wechat.common.entity.bbs.BbsCommentInfoEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 评论记录表
 *
 * @Author: hzq
 * @Date: 2023-12-19 13:50:20
 */
@Repository
public interface BbsCommentInfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BbsCommentInfoEntity queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param bbsCommentInfoEntity 查询条件
     * @return 对象列表
     */
    List<BbsCommentInfoEntity> queryAllByLimit(BbsCommentInfoEntity bbsCommentInfoEntity);

    /**
     * 查询单行数据
     *
     * @param bbsCommentInfoEntity 查询条件
     * @return 对象列表
     */
    BbsCommentInfoEntity selectOne(BbsCommentInfoEntity bbsCommentInfoEntity);

    /**
     * 模糊查询
     *
     * @param bbsCommentInfoEntity 查询条件
     * @return 对象列表
     */
    List<BbsCommentInfoEntity> fuzzyQuery(BbsCommentInfoEntity bbsCommentInfoEntity);

    /**
     * 统计总行数
     *
     * @param bbsCommentInfoEntity 查询条件
     * @return 总行数
     */
    long count(BbsCommentInfoEntity bbsCommentInfoEntity);

    /**
     * 新增数据
     *
     * @param bbsCommentInfoEntity 实例对象
     * @return 影响行数
     */
    int insert(BbsCommentInfoEntity bbsCommentInfoEntity);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<BbsCommentInfoEntity> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<BbsCommentInfoEntity> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<BbsCommentInfoEntity> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<BbsCommentInfoEntity> entities);

    /**
     * 修改数据
     *
     * @param bbsCommentInfoEntity 实例对象
     * @return 影响行数
     */
    int update(BbsCommentInfoEntity bbsCommentInfoEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

