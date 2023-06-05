package com.nuoding.wechat.common.service.mall.impl;

import com.nuoding.wechat.common.dao.mall.MallCouponRuleDao;
import com.nuoding.wechat.common.entity.mall.MallCouponRuleEntity;
import com.nuoding.wechat.common.service.mall.MallCouponRuleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (mallCouponRule)表服务实现类
 * 优惠券使用规则控制
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class MallCouponRuleServiceImpl implements MallCouponRuleService {
    @Resource
    private MallCouponRuleDao mallCouponRuleDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public MallCouponRuleEntity queryById(Integer id) {
        return this.mallCouponRuleDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param mallCouponRuleEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<MallCouponRuleEntity> queryByPage(MallCouponRuleEntity mallCouponRuleEntity) {
        return this.mallCouponRuleDao.queryAllByLimit(mallCouponRuleEntity);
    }

    /**
     * 新增数据
     *
     * @param mallCouponRuleEntity 实例对象
     * @return 实例对象
     */
    @Override
    public MallCouponRuleEntity insert(MallCouponRuleEntity mallCouponRuleEntity) {
        this.mallCouponRuleDao.insert(mallCouponRuleEntity);
        return mallCouponRuleEntity;
    }

    /**
     * 修改数据
     *
     * @param mallCouponRuleEntity 实例对象
     * @return 实例对象
     */
    @Override
    public MallCouponRuleEntity update(MallCouponRuleEntity mallCouponRuleEntity) {
        this.mallCouponRuleDao.update(mallCouponRuleEntity);
        return this.queryById(mallCouponRuleEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.mallCouponRuleDao.deleteById(id) > 0;
    }
}
