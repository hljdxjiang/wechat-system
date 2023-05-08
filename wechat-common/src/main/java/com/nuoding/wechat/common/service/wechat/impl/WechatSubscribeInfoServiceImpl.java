package com.nuoding.wechat.common.service.wechat.impl;

import com.nuoding.wechat.common.dao.wechat.WechatSubscribeInfoDao;
import com.nuoding.wechat.common.entity.wechat.WechatSubscribeInfoEntity;
import com.nuoding.wechat.common.service.wechat.WechatSubscribeInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (wechatSubscribeInfo)表服务实现类
 * 用户订阅信息表
 * @author jhc
 * @since 2023-03-07 14:38:19
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
    public WechatSubscribeInfoEntity queryById(Integer id) {
        return this.wechatSubscribeInfoDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param wechatSubscribeInfoEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<WechatSubscribeInfoEntity> queryByPage(WechatSubscribeInfoEntity wechatSubscribeInfoEntity) {
        return this.wechatSubscribeInfoDao.queryAllByLimit(wechatSubscribeInfoEntity);
    }

    /**
     * 新增数据
     *
     * @param wechatSubscribeInfoEntity 实例对象
     * @return 实例对象
     */
    @Override
    public WechatSubscribeInfoEntity insert(WechatSubscribeInfoEntity wechatSubscribeInfoEntity) {
        this.wechatSubscribeInfoDao.insert(wechatSubscribeInfoEntity);
        return wechatSubscribeInfoEntity;
    }

    /**
     * 修改数据
     *
     * @param wechatSubscribeInfoEntity 实例对象
     * @return 实例对象
     */
    @Override
    public WechatSubscribeInfoEntity update(WechatSubscribeInfoEntity wechatSubscribeInfoEntity) {
        this.wechatSubscribeInfoDao.update(wechatSubscribeInfoEntity);
        return this.queryById(wechatSubscribeInfoEntity.getId());
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
