package com.nuoding.wechat.common.service.mall;

import com.nuoding.wechat.common.entity.mall.MallLotteryWinnerEntity;

import java.util.List;

/**
 * (mallLotteryWinner)表服务接口
 * 抽奖中奖记录表
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface MallLotteryWinnerService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MallLotteryWinnerEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param mallLotteryWinnerEntity 筛选条件
     * @return 查询结果
     */
    List<MallLotteryWinnerEntity> queryAllByLimit(MallLotteryWinnerEntity mallLotteryWinnerEntity);

    /**
     * 新增数据
     *
     * @param mallLotteryWinnerEntity 实例对象
     * @return 实例对象
     */
    MallLotteryWinnerEntity insert(MallLotteryWinnerEntity mallLotteryWinnerEntity);

    /**
     * 修改数据
     *
     * @param mallLotteryWinnerEntity 实例对象
     * @return 实例对象
     */
    MallLotteryWinnerEntity update(MallLotteryWinnerEntity mallLotteryWinnerEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
