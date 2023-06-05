package com.nuoding.wechat.common.dao.mall;

import com.nuoding.wechat.common.entity.mall.MallLotteryPrizeEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 奖品配置表
 *
 * @Author: hzq
 * @Date: 2023-06-05 17:49:46
 */
public interface MallLotteryPrizeDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MallLotteryPrizeEntity queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param mallLotteryPrizeEntity 查询条件
     * @return 对象列表
     */
    List<MallLotteryPrizeEntity> queryAllByLimit(MallLotteryPrizeEntity mallLotteryPrizeEntity);

    /**
     * 统计总行数
     *
     * @param mallLotteryPrizeEntity 查询条件
     * @return 总行数
     */
    long count(MallLotteryPrizeEntity mallLotteryPrizeEntity);

    /**
     * 新增数据
     *
     * @param mallLotteryPrizeEntity 实例对象
     * @return 影响行数
     */
    int insert(MallLotteryPrizeEntity mallLotteryPrizeEntity);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<MallLotteryPrizeEntity> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<MallLotteryPrizeEntity> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<MallLotteryPrizeEntity> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<MallLotteryPrizeEntity> entities);

    /**
     * 修改数据
     *
     * @param mallLotteryPrizeEntity 实例对象
     * @return 影响行数
     */
    int update(MallLotteryPrizeEntity mallLotteryPrizeEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

