package com.nuoding.wechat.common.dao.user;

import com.nuoding.wechat.common.entity.user.UserLocationRecordEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 用户地理位置记录表
 *
 * @Author: hzq
 * @Date: 2023-06-05 17:49:46
 */
public interface UserLocationRecordDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UserLocationRecordEntity queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param userLocationRecordEntity 查询条件
     * @return 对象列表
     */
    List<UserLocationRecordEntity> queryAllByLimit(UserLocationRecordEntity userLocationRecordEntity);

    /**
     * 统计总行数
     *
     * @param userLocationRecordEntity 查询条件
     * @return 总行数
     */
    long count(UserLocationRecordEntity userLocationRecordEntity);

    /**
     * 新增数据
     *
     * @param userLocationRecordEntity 实例对象
     * @return 影响行数
     */
    int insert(UserLocationRecordEntity userLocationRecordEntity);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<UserLocationRecordEntity> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<UserLocationRecordEntity> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<UserLocationRecordEntity> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<UserLocationRecordEntity> entities);

    /**
     * 修改数据
     *
     * @param userLocationRecordEntity 实例对象
     * @return 影响行数
     */
    int update(UserLocationRecordEntity userLocationRecordEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

