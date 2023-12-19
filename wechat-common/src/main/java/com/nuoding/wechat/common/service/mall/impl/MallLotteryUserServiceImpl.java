package com.nuoding.wechat.common.service.mall.impl;

import com.nuoding.wechat.common.dao.mall.MallLotteryUserDao;
import com.nuoding.wechat.common.entity.mall.MallLotteryUserEntity;
import com.nuoding.wechat.common.service.mall.MallLotteryUserService;
import com.nuoding.wechat.common.utils.JsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (mallLotteryUser)表服务实现类
 * 抽奖用户清单表
 *
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class MallLotteryUserServiceImpl implements MallLotteryUserService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private MallLotteryUserDao mallLotteryUserDao;

    public MallLotteryUserServiceImpl(MallLotteryUserDao mallLotteryUserDao) {
        this.mallLotteryUserDao = mallLotteryUserDao;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public MallLotteryUserEntity queryById(Integer id) {
        logger.info("queryById begin.id:{}", id);

        return this.mallLotteryUserDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param mallLotteryUserEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<MallLotteryUserEntity> queryAllByLimit(MallLotteryUserEntity mallLotteryUserEntity) {
        logger.info("queryAllByLimit begin.mallLotteryUserEntity:{}", JsonUtil.obj2Json(mallLotteryUserEntity));
        return this.mallLotteryUserDao.queryAllByLimit(mallLotteryUserEntity);
    }

    /**
     * 模糊查询
     *
     * @param mallLotteryUserEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<MallLotteryUserEntity> fuzzyQuery(MallLotteryUserEntity mallLotteryUserEntity) {
        logger.info("queryAllByLimit begin.mallLotteryUserEntity:{}", JsonUtil.obj2Json(mallLotteryUserEntity));
        return this.mallLotteryUserDao.fuzzyQuery(mallLotteryUserEntity);
    }

    /**
     * 单挑查询
     *
     * @param mallLotteryUserEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public MallLotteryUserEntity selectOne(MallLotteryUserEntity mallLotteryUserEntity) {
        logger.info("queryAllByLimit begin.mallLotteryUserEntity:{}", JsonUtil.obj2Json(mallLotteryUserEntity));
        return this.mallLotteryUserDao.selectOne(mallLotteryUserEntity);
    }

    /**
     * 新增数据
     *
     * @param mallLotteryUserEntity 实例对象
     * @return 实例对象
     */
    @Override
    public MallLotteryUserEntity insert(MallLotteryUserEntity mallLotteryUserEntity) {
        logger.info("insert begin.mallLotteryUserEntity:{}", JsonUtil.obj2Json(mallLotteryUserEntity));
        this.mallLotteryUserDao.insert(mallLotteryUserEntity);
        return mallLotteryUserEntity;
    }

    /**
     * 修改数据
     *
     * @param mallLotteryUserEntity 实例对象
     * @return 实例对象
     */
    @Override
    public MallLotteryUserEntity update(MallLotteryUserEntity mallLotteryUserEntity) {
        logger.info("update begin.mallLotteryUserEntity:{}", JsonUtil.obj2Json(mallLotteryUserEntity));
        this.mallLotteryUserDao.update(mallLotteryUserEntity);
        return this.queryById(mallLotteryUserEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        logger.info("deleteById begin.mallLotteryUserEntity:{}", id);
        return this.mallLotteryUserDao.deleteById(id) > 0;
    }
}
