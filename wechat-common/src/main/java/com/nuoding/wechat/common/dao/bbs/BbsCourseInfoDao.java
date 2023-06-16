package com.nuoding.wechat.common.dao.bbs;

import com.nuoding.wechat.common.entity.bbs.BbsCourseInfoEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 课程信息表
 *
 * @Author: hzq
 * @Date: 2023-06-08 17:37:04
 */
public interface BbsCourseInfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BbsCourseInfoEntity queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param bbsCourseInfoEntity 查询条件
     * @return 对象列表
     */
    List<BbsCourseInfoEntity> queryAllByLimit(BbsCourseInfoEntity bbsCourseInfoEntity);

    /**
     * 统计总行数
     *
     * @param bbsCourseInfoEntity 查询条件
     * @return 总行数
     */
    long count(BbsCourseInfoEntity bbsCourseInfoEntity);

    /**
     * 新增数据
     *
     * @param bbsCourseInfoEntity 实例对象
     * @return 影响行数
     */
    int insert(BbsCourseInfoEntity bbsCourseInfoEntity);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<BbsCourseInfoEntity> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<BbsCourseInfoEntity> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<BbsCourseInfoEntity> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<BbsCourseInfoEntity> entities);

    /**
     * 修改数据
     *
     * @param bbsCourseInfoEntity 实例对象
     * @return 影响行数
     */
    int update(BbsCourseInfoEntity bbsCourseInfoEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

