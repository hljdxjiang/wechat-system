package com.nuoding.wechat.common.service.mall;

import com.nuoding.wechat.common.entity.mall.MallLotteryUserEntity;

import java.util.List;

/**
 * (mallLotteryUser)表服务接口
 * 抽奖用户清单表
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface MallLotteryUserService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MallLotteryUserEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param mallLotteryUserEntity 筛选条件
     * @return 查询结果
     */
    List<MallLotteryUserEntity> queryByPage(MallLotteryUserEntity mallLotteryUserEntity);

    /**
     * 新增数据
     *
     * @param mallLotteryUserEntity 实例对象
     * @return 实例对象
     */
    MallLotteryUserEntity insert(MallLotteryUserEntity mallLotteryUserEntity);

    /**
     * 修改数据
     *
     * @param mallLotteryUserEntity 实例对象
     * @return 实例对象
     */
    MallLotteryUserEntity update(MallLotteryUserEntity mallLotteryUserEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
