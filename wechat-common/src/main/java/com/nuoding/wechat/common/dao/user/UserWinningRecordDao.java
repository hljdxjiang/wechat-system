package com.nuoding.wechat.common.dao.user;

import com.nuoding.wechat.common.entity.user.UserWinningRecordEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 抽奖获奖记录表
 *
 * @Author: hzq
 * @Date: 2023-12-19 13:50:19
 */
@Repository
public interface UserWinningRecordDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UserWinningRecordEntity queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param userWinningRecordEntity 查询条件
     * @return 对象列表
     */
    List<UserWinningRecordEntity> queryAllByLimit(UserWinningRecordEntity userWinningRecordEntity);

    /**
     * 查询单行数据
     *
     * @param userWinningRecordEntity 查询条件
     * @return 对象列表
     */
    UserWinningRecordEntity selectOne(UserWinningRecordEntity userWinningRecordEntity);

    /**
     * 模糊查询
     *
     * @param userWinningRecordEntity 查询条件
     * @return 对象列表
     */
    List<UserWinningRecordEntity> fuzzyQuery(UserWinningRecordEntity userWinningRecordEntity);

    /**
     * 统计总行数
     *
     * @param userWinningRecordEntity 查询条件
     * @return 总行数
     */
    long count(UserWinningRecordEntity userWinningRecordEntity);

    /**
     * 新增数据
     *
     * @param userWinningRecordEntity 实例对象
     * @return 影响行数
     */
    int insert(UserWinningRecordEntity userWinningRecordEntity);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<UserWinningRecordEntity> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<UserWinningRecordEntity> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<UserWinningRecordEntity> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<UserWinningRecordEntity> entities);

    /**
     * 修改数据
     *
     * @param userWinningRecordEntity 实例对象
     * @return 影响行数
     */
    int update(UserWinningRecordEntity userWinningRecordEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

