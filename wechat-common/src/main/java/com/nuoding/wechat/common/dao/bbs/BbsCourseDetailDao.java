package com.nuoding.wechat.common.dao.bbs;

import com.nuoding.wechat.common.entity.bbs.BbsCourseDetailEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 课程详情表
 *
 * @Author: hzq
 * @Date: 2023-12-19 13:50:18
 */
@Repository
public interface BbsCourseDetailDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BbsCourseDetailEntity queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param bbsCourseDetailEntity 查询条件
     * @return 对象列表
     */
    List<BbsCourseDetailEntity> queryAllByLimit(BbsCourseDetailEntity bbsCourseDetailEntity);

    /**
     * 查询单行数据
     *
     * @param bbsCourseDetailEntity 查询条件
     * @return 对象列表
     */
    BbsCourseDetailEntity selectOne(BbsCourseDetailEntity bbsCourseDetailEntity);

    /**
     * 模糊查询
     *
     * @param bbsCourseDetailEntity 查询条件
     * @return 对象列表
     */
    List<BbsCourseDetailEntity> fuzzyQuery(BbsCourseDetailEntity bbsCourseDetailEntity);

    /**
     * 统计总行数
     *
     * @param bbsCourseDetailEntity 查询条件
     * @return 总行数
     */
    long count(BbsCourseDetailEntity bbsCourseDetailEntity);

    /**
     * 新增数据
     *
     * @param bbsCourseDetailEntity 实例对象
     * @return 影响行数
     */
    int insert(BbsCourseDetailEntity bbsCourseDetailEntity);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<BbsCourseDetailEntity> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<BbsCourseDetailEntity> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<BbsCourseDetailEntity> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<BbsCourseDetailEntity> entities);

    /**
     * 修改数据
     *
     * @param bbsCourseDetailEntity 实例对象
     * @return 影响行数
     */
    int update(BbsCourseDetailEntity bbsCourseDetailEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

