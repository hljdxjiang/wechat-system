package com.nuoding.wechat.common.dao.bbs;

import com.nuoding.wechat.common.entity.bbs.BbsArticleInfoEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 文章记录表
 *
 * @Author: hzq
 * @Date: 2023-06-08 17:37:05
 */
public interface BbsArticleInfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BbsArticleInfoEntity queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param bbsArticleInfoEntity 查询条件
     * @return 对象列表
     */
    List<BbsArticleInfoEntity> queryAllByLimit(BbsArticleInfoEntity bbsArticleInfoEntity);

    /**
     * 统计总行数
     *
     * @param bbsArticleInfoEntity 查询条件
     * @return 总行数
     */
    long count(BbsArticleInfoEntity bbsArticleInfoEntity);

    /**
     * 新增数据
     *
     * @param bbsArticleInfoEntity 实例对象
     * @return 影响行数
     */
    int insert(BbsArticleInfoEntity bbsArticleInfoEntity);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<BbsArticleInfoEntity> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<BbsArticleInfoEntity> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<BbsArticleInfoEntity> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<BbsArticleInfoEntity> entities);

    /**
     * 修改数据
     *
     * @param bbsArticleInfoEntity 实例对象
     * @return 影响行数
     */
    int update(BbsArticleInfoEntity bbsArticleInfoEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

