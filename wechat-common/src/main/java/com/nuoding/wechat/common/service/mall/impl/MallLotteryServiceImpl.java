package com.nuoding.wechat.common.service.mall.impl;

import com.nuoding.wechat.common.dao.mall.MallLotteryDao;
import com.nuoding.wechat.common.entity.mall.MallLotteryEntity;
import com.nuoding.wechat.common.service.mall.MallLotteryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (mallLottery)表服务实现类
 * 抽奖活动信息表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class MallLotteryServiceImpl implements MallLotteryService {
    @Resource
    private MallLotteryDao mallLotteryDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public MallLotteryEntity queryById(Integer id) {
        return this.mallLotteryDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param mallLotteryEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<MallLotteryEntity> queryAllByLimit(MallLotteryEntity mallLotteryEntity) {
        return this.mallLotteryDao.queryAllByLimit(mallLotteryEntity);
    }

    /**
     * 新增数据
     *
     * @param mallLotteryEntity 实例对象
     * @return 实例对象
     */
    @Override
    public MallLotteryEntity insert(MallLotteryEntity mallLotteryEntity) {
        this.mallLotteryDao.insert(mallLotteryEntity);
        return mallLotteryEntity;
    }

    /**
     * 修改数据
     *
     * @param mallLotteryEntity 实例对象
     * @return 实例对象
     */
    @Override
    public MallLotteryEntity update(MallLotteryEntity mallLotteryEntity) {
        this.mallLotteryDao.update(mallLotteryEntity);
        return this.queryById(mallLotteryEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.mallLotteryDao.deleteById(id) > 0;
    }
}
