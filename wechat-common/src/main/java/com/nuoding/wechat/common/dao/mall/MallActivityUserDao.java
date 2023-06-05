package com.nuoding.wechat.common.dao.mall;

import com.nuoding.wechat.common.entity.mall.MallActivityUserEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 活动参与用户清单表
 *
 * @Author: hzq
 * @Date: 2023-06-05 17:49:46
 */
public interface MallActivityUserDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MallActivityUserEntity queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param mallActivityUserEntity 查询条件
     * @return 对象列表
     */
    List<MallActivityUserEntity> queryAllByLimit(MallActivityUserEntity mallActivityUserEntity);

    /**
     * 统计总行数
     *
     * @param mallActivityUserEntity 查询条件
     * @return 总行数
     */
    long count(MallActivityUserEntity mallActivityUserEntity);

    /**
     * 新增数据
     *
     * @param mallActivityUserEntity 实例对象
     * @return 影响行数
     */
    int insert(MallActivityUserEntity mallActivityUserEntity);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<MallActivityUserEntity> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<MallActivityUserEntity> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<MallActivityUserEntity> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<MallActivityUserEntity> entities);

    /**
     * 修改数据
     *
     * @param mallActivityUserEntity 实例对象
     * @return 影响行数
     */
    int update(MallActivityUserEntity mallActivityUserEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

