package com.nuoding.wechat.common.service.wechat.impl;

import com.nuoding.wechat.common.dao.wechat.WechatMenusDetailDao;
import com.nuoding.wechat.common.entity.wechat.WechatMenusDetailEntity;
import com.nuoding.wechat.common.service.wechat.WechatMenusDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (wechatMenusDetail)表服务实现类
 * 微信菜单要素表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class WechatMenusDetailServiceImpl implements WechatMenusDetailService {
    @Resource
    private WechatMenusDetailDao wechatMenusDetailDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public WechatMenusDetailEntity queryById(Integer id) {
        return this.wechatMenusDetailDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param wechatMenusDetailEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<WechatMenusDetailEntity> queryByPage(WechatMenusDetailEntity wechatMenusDetailEntity) {
        return this.wechatMenusDetailDao.queryAllByLimit(wechatMenusDetailEntity);
    }

    /**
     * 新增数据
     *
     * @param wechatMenusDetailEntity 实例对象
     * @return 实例对象
     */
    @Override
    public WechatMenusDetailEntity insert(WechatMenusDetailEntity wechatMenusDetailEntity) {
        this.wechatMenusDetailDao.insert(wechatMenusDetailEntity);
        return wechatMenusDetailEntity;
    }

    /**
     * 修改数据
     *
     * @param wechatMenusDetailEntity 实例对象
     * @return 实例对象
     */
    @Override
    public WechatMenusDetailEntity update(WechatMenusDetailEntity wechatMenusDetailEntity) {
        this.wechatMenusDetailDao.update(wechatMenusDetailEntity);
        return this.queryById(wechatMenusDetailEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.wechatMenusDetailDao.deleteById(id) > 0;
    }
}