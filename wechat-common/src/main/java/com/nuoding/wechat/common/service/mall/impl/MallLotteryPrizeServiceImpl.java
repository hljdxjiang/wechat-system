package com.nuoding.wechat.common.service.mall.impl;

import com.nuoding.wechat.common.dao.mall.MallLotteryPrizeDao;
import com.nuoding.wechat.common.entity.mall.MallLotteryPrizeEntity;
import com.nuoding.wechat.common.service.mall.MallLotteryPrizeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (mallLotteryPrize)表服务实现类
 * 奖品配置表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class MallLotteryPrizeServiceImpl implements MallLotteryPrizeService {
    @Resource
    private MallLotteryPrizeDao mallLotteryPrizeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public MallLotteryPrizeEntity queryById(Integer id) {
        return this.mallLotteryPrizeDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param mallLotteryPrizeEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<MallLotteryPrizeEntity> queryByPage(MallLotteryPrizeEntity mallLotteryPrizeEntity) {
        return this.mallLotteryPrizeDao.queryAllByLimit(mallLotteryPrizeEntity);
    }

    /**
     * 新增数据
     *
     * @param mallLotteryPrizeEntity 实例对象
     * @return 实例对象
     */
    @Override
    public MallLotteryPrizeEntity insert(MallLotteryPrizeEntity mallLotteryPrizeEntity) {
        this.mallLotteryPrizeDao.insert(mallLotteryPrizeEntity);
        return mallLotteryPrizeEntity;
    }

    /**
     * 修改数据
     *
     * @param mallLotteryPrizeEntity 实例对象
     * @return 实例对象
     */
    @Override
    public MallLotteryPrizeEntity update(MallLotteryPrizeEntity mallLotteryPrizeEntity) {
        this.mallLotteryPrizeDao.update(mallLotteryPrizeEntity);
        return this.queryById(mallLotteryPrizeEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.mallLotteryPrizeDao.deleteById(id) > 0;
    }
}
