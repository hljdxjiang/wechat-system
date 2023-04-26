package com.nuoding.wechat.common.service.impl;

import com.nuoding.wechat.common.dao.WechatSubscribeInfoDao;
import com.nuoding.wechat.common.entity.WechatSubscribeInfo;
import com.nuoding.wechat.common.service.WechatSubscribeInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户订阅信息表(WechatSubscribeInfo)表服务实现类
 *
 * @author jhc
 * @since 2023-03-07 14:39:18
 */
@Service
public class WechatSubscribeInfoServiceImpl implements WechatSubscribeInfoService {
    @Resource
    private WechatSubscribeInfoDao wechatSubscribeInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public WechatSubscribeInfo queryById(Integer id) {
        return this.wechatSubscribeInfoDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param wechatSubscribeInfo 筛选条件
     * @return 查询结果
     */
    @Override
    public List<WechatSubscribeInfo> queryByPage(WechatSubscribeInfo wechatSubscribeInfo) {
        return this.wechatSubscribeInfoDao.queryAllByLimit(wechatSubscribeInfo);
    }

    /**
     * 新增数据
     *
     * @param wechatSubscribeInfo 实例对象
     * @return 实例对象
     */
    @Override
    public WechatSubscribeInfo insert(WechatSubscribeInfo wechatSubscribeInfo) {
        this.wechatSubscribeInfoDao.insert(wechatSubscribeInfo);
        return wechatSubscribeInfo;
    }

    /**
     * 修改数据
     *
     * @param wechatSubscribeInfo 实例对象
     * @return 实例对象
     */
    @Override
    public WechatSubscribeInfo update(WechatSubscribeInfo wechatSubscribeInfo) {
        this.wechatSubscribeInfoDao.update(wechatSubscribeInfo);
        return this.queryById(wechatSubscribeInfo.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.wechatSubscribeInfoDao.deleteById(id) > 0;
    }
}
