package com.nuoding.wechat.common.service.impl;

import com.nuoding.wechat.common.dao.MarketUserCouponInfoDao;
import com.nuoding.wechat.common.entity.MarketUserCouponInfo;
import com.nuoding.wechat.common.service.MarketUserCouponInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 优惠券领取信息表(MarketUserCouponInfo)表服务实现类
 *
 * @author jhc
 * @since 2023-03-07 14:39:00
 */
@Service
public class MarketUserCouponInfoServiceImpl implements MarketUserCouponInfoService {
    @Resource
    private MarketUserCouponInfoDao marketUserCouponInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public MarketUserCouponInfo queryById(Integer id) {
        return this.marketUserCouponInfoDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param marketUserCouponInfo 筛选条件
     * @return 查询结果
     */
    @Override
    public List<MarketUserCouponInfo> queryByPage(MarketUserCouponInfo marketUserCouponInfo) {
        return this.marketUserCouponInfoDao.queryAllByLimit(marketUserCouponInfo);
    }

    /**
     * 新增数据
     *
     * @param marketUserCouponInfo 实例对象
     * @return 实例对象
     */
    @Override
    public MarketUserCouponInfo insert(MarketUserCouponInfo marketUserCouponInfo) {
        this.marketUserCouponInfoDao.insert(marketUserCouponInfo);
        return marketUserCouponInfo;
    }

    /**
     * 修改数据
     *
     * @param marketUserCouponInfo 实例对象
     * @return 实例对象
     */
    @Override
    public MarketUserCouponInfo update(MarketUserCouponInfo marketUserCouponInfo) {
        this.marketUserCouponInfoDao.update(marketUserCouponInfo);
        return this.queryById(marketUserCouponInfo.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.marketUserCouponInfoDao.deleteById(id) > 0;
    }
}
