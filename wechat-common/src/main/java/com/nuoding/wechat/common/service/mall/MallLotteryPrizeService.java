package com.nuoding.wechat.common.service.mall;

import com.nuoding.wechat.common.entity.mall.MallLotteryPrizeEntity;

import java.util.List;

/**
 * (mallLotteryPrize)表服务接口
 * 奖品配置表
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface MallLotteryPrizeService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MallLotteryPrizeEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param mallLotteryPrizeEntity 筛选条件
     * @return 查询结果
     */
    List<MallLotteryPrizeEntity> queryByPage(MallLotteryPrizeEntity mallLotteryPrizeEntity);

    /**
     * 新增数据
     *
     * @param mallLotteryPrizeEntity 实例对象
     * @return 实例对象
     */
    MallLotteryPrizeEntity insert(MallLotteryPrizeEntity mallLotteryPrizeEntity);

    /**
     * 修改数据
     *
     * @param mallLotteryPrizeEntity 实例对象
     * @return 实例对象
     */
    MallLotteryPrizeEntity update(MallLotteryPrizeEntity mallLotteryPrizeEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
