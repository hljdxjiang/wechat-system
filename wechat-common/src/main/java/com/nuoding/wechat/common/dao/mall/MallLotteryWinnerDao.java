package com.nuoding.wechat.common.dao.mall;

import com.nuoding.wechat.common.entity.mall.MallLotteryWinnerEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 抽奖中奖记录表
 *
 * @Author: hzq
 * @Date: 2023-06-08 17:37:05
 */
public interface MallLotteryWinnerDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MallLotteryWinnerEntity queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param mallLotteryWinnerEntity 查询条件
     * @return 对象列表
     */
    List<MallLotteryWinnerEntity> queryAllByLimit(MallLotteryWinnerEntity mallLotteryWinnerEntity);

    /**
     * 统计总行数
     *
     * @param mallLotteryWinnerEntity 查询条件
     * @return 总行数
     */
    long count(MallLotteryWinnerEntity mallLotteryWinnerEntity);

    /**
     * 新增数据
     *
     * @param mallLotteryWinnerEntity 实例对象
     * @return 影响行数
     */
    int insert(MallLotteryWinnerEntity mallLotteryWinnerEntity);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<MallLotteryWinnerEntity> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<MallLotteryWinnerEntity> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<MallLotteryWinnerEntity> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<MallLotteryWinnerEntity> entities);

    /**
     * 修改数据
     *
     * @param mallLotteryWinnerEntity 实例对象
     * @return 影响行数
     */
    int update(MallLotteryWinnerEntity mallLotteryWinnerEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

