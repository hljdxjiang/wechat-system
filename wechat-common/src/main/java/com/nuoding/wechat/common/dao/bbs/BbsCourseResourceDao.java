package com.nuoding.wechat.common.dao.bbs;

import com.nuoding.wechat.common.entity.bbs.BbsCourseResourceEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 课程资源信息表
 *
 * @Author: hzq
 * @Date: 2023-12-19 13:50:18
 */
@Repository
public interface BbsCourseResourceDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BbsCourseResourceEntity queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param bbsCourseResourceEntity 查询条件
     * @return 对象列表
     */
    List<BbsCourseResourceEntity> queryAllByLimit(BbsCourseResourceEntity bbsCourseResourceEntity);

    /**
     * 查询单行数据
     *
     * @param bbsCourseResourceEntity 查询条件
     * @return 对象列表
     */
    BbsCourseResourceEntity selectOne(BbsCourseResourceEntity bbsCourseResourceEntity);

    /**
     * 模糊查询
     *
     * @param bbsCourseResourceEntity 查询条件
     * @return 对象列表
     */
    List<BbsCourseResourceEntity> fuzzyQuery(BbsCourseResourceEntity bbsCourseResourceEntity);

    /**
     * 统计总行数
     *
     * @param bbsCourseResourceEntity 查询条件
     * @return 总行数
     */
    long count(BbsCourseResourceEntity bbsCourseResourceEntity);

    /**
     * 新增数据
     *
     * @param bbsCourseResourceEntity 实例对象
     * @return 影响行数
     */
    int insert(BbsCourseResourceEntity bbsCourseResourceEntity);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<BbsCourseResourceEntity> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<BbsCourseResourceEntity> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<BbsCourseResourceEntity> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<BbsCourseResourceEntity> entities);

    /**
     * 修改数据
     *
     * @param bbsCourseResourceEntity 实例对象
     * @return 影响行数
     */
    int update(BbsCourseResourceEntity bbsCourseResourceEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

