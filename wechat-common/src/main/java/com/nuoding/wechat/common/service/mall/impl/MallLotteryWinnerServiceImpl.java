package com.nuoding.wechat.common.service.mall.impl;

import com.nuoding.wechat.common.dao.mall.MallLotteryWinnerDao;
import com.nuoding.wechat.common.entity.mall.MallLotteryWinnerEntity;
import com.nuoding.wechat.common.service.mall.MallLotteryWinnerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (mallLotteryWinner)表服务实现类
 * 抽奖中奖记录表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class MallLotteryWinnerServiceImpl implements MallLotteryWinnerService {
    @Resource
    private MallLotteryWinnerDao mallLotteryWinnerDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public MallLotteryWinnerEntity queryById(Integer id) {
        return this.mallLotteryWinnerDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param mallLotteryWinnerEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<MallLotteryWinnerEntity> queryAllByLimit(MallLotteryWinnerEntity mallLotteryWinnerEntity) {
        return this.mallLotteryWinnerDao.queryAllByLimit(mallLotteryWinnerEntity);
    }

    /**
     * 新增数据
     *
     * @param mallLotteryWinnerEntity 实例对象
     * @return 实例对象
     */
    @Override
    public MallLotteryWinnerEntity insert(MallLotteryWinnerEntity mallLotteryWinnerEntity) {
        this.mallLotteryWinnerDao.insert(mallLotteryWinnerEntity);
        return mallLotteryWinnerEntity;
    }

    /**
     * 修改数据
     *
     * @param mallLotteryWinnerEntity 实例对象
     * @return 实例对象
     */
    @Override
    public MallLotteryWinnerEntity update(MallLotteryWinnerEntity mallLotteryWinnerEntity) {
        this.mallLotteryWinnerDao.update(mallLotteryWinnerEntity);
        return this.queryById(mallLotteryWinnerEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.mallLotteryWinnerDao.deleteById(id) > 0;
    }
}
