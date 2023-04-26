package com.nuoding.wechat.common.service.impl;

import com.nuoding.wechat.common.dao.MarketCouponInfoDao;
import com.nuoding.wechat.common.entity.MarketCouponInfo;
import com.nuoding.wechat.common.service.MarketCouponInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 优惠券信息表(MarketCouponInfo)表服务实现类
 *
 * @author jhc
 * @since 2023-03-07 14:38:57
 */
@Service
public class MarketCouponInfoServiceImpl implements MarketCouponInfoService {
    @Resource
    private MarketCouponInfoDao marketCouponInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public MarketCouponInfo queryById(Integer id) {
        return this.marketCouponInfoDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param marketCouponInfo 筛选条件
     * @return 查询结果
     */
    @Override
    public List<MarketCouponInfo> queryByPage(MarketCouponInfo marketCouponInfo) {
        return this.marketCouponInfoDao.queryAllByLimit(marketCouponInfo);
    }

    /**
     * 新增数据
     *
     * @param marketCouponInfo 实例对象
     * @return 实例对象
     */
    @Override
    public MarketCouponInfo insert(MarketCouponInfo marketCouponInfo) {
        this.marketCouponInfoDao.insert(marketCouponInfo);
        return marketCouponInfo;
    }

    /**
     * 修改数据
     *
     * @param marketCouponInfo 实例对象
     * @return 实例对象
     */
    @Override
    public MarketCouponInfo update(MarketCouponInfo marketCouponInfo) {
        this.marketCouponInfoDao.update(marketCouponInfo);
        return this.queryById(marketCouponInfo.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.marketCouponInfoDao.deleteById(id) > 0;
    }
}
