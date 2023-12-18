package com.nuoding.wechat.common.dao.bbs;

import com.nuoding.wechat.common.entity.bbs.BbsColumnInfoEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 文章栏目信息表
 *
 * @Author: hzq
 * @Date: 2023-12-18 14:57:38
 */
public interface BbsColumnInfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BbsColumnInfoEntity queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param bbsColumnInfoEntity 查询条件
     * @return 对象列表
     */
    List<BbsColumnInfoEntity> queryAllByLimit(BbsColumnInfoEntity bbsColumnInfoEntity);

    /**
     * 查询单行数据
     *
     * @param bbsColumnInfoEntity 查询条件
     * @return 对象列表
     */
    BbsColumnInfoEntity selectOne(BbsColumnInfoEntity bbsColumnInfoEntity);

    /**
     * 模糊查询
     *
     * @param bbsColumnInfoEntity 查询条件
     * @return 对象列表
     */
    List<BbsColumnInfoEntity> fuzzyQuery(BbsColumnInfoEntity bbsColumnInfoEntity);

    /**
     * 统计总行数
     *
     * @param bbsColumnInfoEntity 查询条件
     * @return 总行数
     */
    long count(BbsColumnInfoEntity bbsColumnInfoEntity);

    /**
     * 新增数据
     *
     * @param bbsColumnInfoEntity 实例对象
     * @return 影响行数
     */
    int insert(BbsColumnInfoEntity bbsColumnInfoEntity);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<BbsColumnInfoEntity> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<BbsColumnInfoEntity> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<BbsColumnInfoEntity> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<BbsColumnInfoEntity> entities);

    /**
     * 修改数据
     *
     * @param bbsColumnInfoEntity 实例对象
     * @return 影响行数
     */
    int update(BbsColumnInfoEntity bbsColumnInfoEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

