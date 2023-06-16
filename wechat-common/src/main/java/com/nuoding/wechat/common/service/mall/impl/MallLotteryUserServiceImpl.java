package com.nuoding.wechat.common.service.mall.impl;

import com.nuoding.wechat.common.dao.mall.MallLotteryUserDao;
import com.nuoding.wechat.common.entity.mall.MallLotteryUserEntity;
import com.nuoding.wechat.common.service.mall.MallLotteryUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (mallLotteryUser)表服务实现类
 * 抽奖用户清单表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class MallLotteryUserServiceImpl implements MallLotteryUserService {
    @Resource
    private MallLotteryUserDao mallLotteryUserDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public MallLotteryUserEntity queryById(Integer id) {
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
        return this.mallLotteryUserDao.queryAllByLimit(mallLotteryUserEntity);
    }

    /**
     * 新增数据
     *
     * @param mallLotteryUserEntity 实例对象
     * @return 实例对象
     */
    @Override
    public MallLotteryUserEntity insert(MallLotteryUserEntity mallLotteryUserEntity) {
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
        return this.mallLotteryUserDao.deleteById(id) > 0;
    }
}
