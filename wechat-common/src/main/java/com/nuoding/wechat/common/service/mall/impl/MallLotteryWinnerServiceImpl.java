package com.nuoding.wechat.common.service.mall.impl;

import com.nuoding.wechat.common.dao.mall.MallLotteryWinnerDao;
import com.nuoding.wechat.common.entity.mall.MallLotteryWinnerEntity;
import com.nuoding.wechat.common.service.mall.MallLotteryWinnerService;
import org.springframework.stereotype.Service;
import com.nuoding.wechat.common.utils.JsonUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    
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
        logger.info("queryAllByLimit begin.mallLotteryWinnerEntity:{}", JsonUtil.obj2Json(mallLotteryWinnerEntity));
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
        logger.info("insert begin.mallLotteryWinnerEntity:{}", JsonUtil.obj2Json(mallLotteryWinnerEntity));
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
        logger.info("update begin.mallLotteryWinnerEntity:{}", JsonUtil.obj2Json(mallLotteryWinnerEntity));
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
        logger.info("deleteById begin.mallLotteryWinnerEntity:{}", id);
        return this.mallLotteryWinnerDao.deleteById(id) > 0;
    }
}
