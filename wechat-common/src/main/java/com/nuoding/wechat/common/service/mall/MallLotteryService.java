package com.nuoding.wechat.common.service.mall;

import com.nuoding.wechat.common.entity.mall.MallLotteryEntity;

import java.util.List;

/**
 * (mallLottery)表服务接口
 * 抽奖活动信息表
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface MallLotteryService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MallLotteryEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param mallLotteryEntity 筛选条件
     * @return 查询结果
     */
    List<MallLotteryEntity> queryAllByLimit(MallLotteryEntity mallLotteryEntity);

    /**
     * 模糊查询
     *
     * @param mallLotteryEntity 筛选条件
     * @return 查询结果
     */
    List<MallLotteryEntity> fuzzyQuery(MallLotteryEntity mallLotteryEntity);

    /**
     * 单挑查询
     *
     * @param mallLotteryEntity 筛选条件
     * @return 查询结果
     */
    MallLotteryEntity selectOne(MallLotteryEntity mallLotteryEntity);

    /**
     * 新增数据
     *
     * @param mallLotteryEntity 实例对象
     * @return 实例对象
     */
    MallLotteryEntity insert(MallLotteryEntity mallLotteryEntity);

    /**
     * 修改数据
     *
     * @param mallLotteryEntity 实例对象
     * @return 实例对象
     */
    MallLotteryEntity update(MallLotteryEntity mallLotteryEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
