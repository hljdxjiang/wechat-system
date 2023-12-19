package com.nuoding.wechat.common.dao.mall;

import com.nuoding.wechat.common.entity.mall.MallActivityEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 活动信息表
 *
 * @Author: hzq
 * @Date: 2023-12-19 13:50:19
 */
@Repository
public interface MallActivityDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MallActivityEntity queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param mallActivityEntity 查询条件
     * @return 对象列表
     */
    List<MallActivityEntity> queryAllByLimit(MallActivityEntity mallActivityEntity);

    /**
     * 查询单行数据
     *
     * @param mallActivityEntity 查询条件
     * @return 对象列表
     */
    MallActivityEntity selectOne(MallActivityEntity mallActivityEntity);

    /**
     * 模糊查询
     *
     * @param mallActivityEntity 查询条件
     * @return 对象列表
     */
    List<MallActivityEntity> fuzzyQuery(MallActivityEntity mallActivityEntity);

    /**
     * 统计总行数
     *
     * @param mallActivityEntity 查询条件
     * @return 总行数
     */
    long count(MallActivityEntity mallActivityEntity);

    /**
     * 新增数据
     *
     * @param mallActivityEntity 实例对象
     * @return 影响行数
     */
    int insert(MallActivityEntity mallActivityEntity);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<MallActivityEntity> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<MallActivityEntity> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<MallActivityEntity> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<MallActivityEntity> entities);

    /**
     * 修改数据
     *
     * @param mallActivityEntity 实例对象
     * @return 影响行数
     */
    int update(MallActivityEntity mallActivityEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

