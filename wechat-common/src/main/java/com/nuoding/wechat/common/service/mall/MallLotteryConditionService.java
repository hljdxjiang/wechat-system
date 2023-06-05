package com.nuoding.wechat.common.service.mall;

import com.nuoding.wechat.common.entity.mall.MallLotteryConditionEntity;

import java.util.List;

/**
 * (mallLotteryCondition)表服务接口
 * 抽奖条件表
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface MallLotteryConditionService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MallLotteryConditionEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param mallLotteryConditionEntity 筛选条件
     * @return 查询结果
     */
    List<MallLotteryConditionEntity> queryByPage(MallLotteryConditionEntity mallLotteryConditionEntity);

    /**
     * 新增数据
     *
     * @param mallLotteryConditionEntity 实例对象
     * @return 实例对象
     */
    MallLotteryConditionEntity insert(MallLotteryConditionEntity mallLotteryConditionEntity);

    /**
     * 修改数据
     *
     * @param mallLotteryConditionEntity 实例对象
     * @return 实例对象
     */
    MallLotteryConditionEntity update(MallLotteryConditionEntity mallLotteryConditionEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
