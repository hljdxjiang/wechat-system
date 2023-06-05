package com.nuoding.wechat.common.dao.user;

import com.nuoding.wechat.common.entity.user.UserOperaRecordEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 用户操作历史表
 *
 * @Author: hzq
 * @Date: 2023-06-05 17:49:46
 */
public interface UserOperaRecordDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UserOperaRecordEntity queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param userOperaRecordEntity 查询条件
     * @return 对象列表
     */
    List<UserOperaRecordEntity> queryAllByLimit(UserOperaRecordEntity userOperaRecordEntity);

    /**
     * 统计总行数
     *
     * @param userOperaRecordEntity 查询条件
     * @return 总行数
     */
    long count(UserOperaRecordEntity userOperaRecordEntity);

    /**
     * 新增数据
     *
     * @param userOperaRecordEntity 实例对象
     * @return 影响行数
     */
    int insert(UserOperaRecordEntity userOperaRecordEntity);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<UserOperaRecordEntity> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<UserOperaRecordEntity> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<UserOperaRecordEntity> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<UserOperaRecordEntity> entities);

    /**
     * 修改数据
     *
     * @param userOperaRecordEntity 实例对象
     * @return 影响行数
     */
    int update(UserOperaRecordEntity userOperaRecordEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

