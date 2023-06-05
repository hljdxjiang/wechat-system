package com.nuoding.wechat.common.service.mall.impl;

import com.nuoding.wechat.common.dao.mall.MallCouponInfoDao;
import com.nuoding.wechat.common.entity.mall.MallCouponInfoEntity;
import com.nuoding.wechat.common.service.mall.MallCouponInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (mallCouponInfo)表服务实现类
 * 优惠券信息表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class MallCouponInfoServiceImpl implements MallCouponInfoService {
    @Resource
    private MallCouponInfoDao mallCouponInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public MallCouponInfoEntity queryById(Integer id) {
        return this.mallCouponInfoDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param mallCouponInfoEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<MallCouponInfoEntity> queryByPage(MallCouponInfoEntity mallCouponInfoEntity) {
        return this.mallCouponInfoDao.queryAllByLimit(mallCouponInfoEntity);
    }

    /**
     * 新增数据
     *
     * @param mallCouponInfoEntity 实例对象
     * @return 实例对象
     */
    @Override
    public MallCouponInfoEntity insert(MallCouponInfoEntity mallCouponInfoEntity) {
        this.mallCouponInfoDao.insert(mallCouponInfoEntity);
        return mallCouponInfoEntity;
    }

    /**
     * 修改数据
     *
     * @param mallCouponInfoEntity 实例对象
     * @return 实例对象
     */
    @Override
    public MallCouponInfoEntity update(MallCouponInfoEntity mallCouponInfoEntity) {
        this.mallCouponInfoDao.update(mallCouponInfoEntity);
        return this.queryById(mallCouponInfoEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.mallCouponInfoDao.deleteById(id) > 0;
    }
}
