package com.nuoding.wechat.common.service.wechat.impl;

import com.nuoding.wechat.common.dao.wechat.WechatMenusDao;
import com.nuoding.wechat.common.entity.wechat.WechatMenusEntity;
import com.nuoding.wechat.common.service.wechat.WechatMenusService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (wechatMenus)表服务实现类
 * 微信菜单表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class WechatMenusServiceImpl implements WechatMenusService {
    @Resource
    private WechatMenusDao wechatMenusDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public WechatMenusEntity queryById(Integer id) {
        return this.wechatMenusDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param wechatMenusEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<WechatMenusEntity> queryAllByLimit(WechatMenusEntity wechatMenusEntity) {
        return this.wechatMenusDao.queryAllByLimit(wechatMenusEntity);
    }

    /**
     * 新增数据
     *
     * @param wechatMenusEntity 实例对象
     * @return 实例对象
     */
    @Override
    public WechatMenusEntity insert(WechatMenusEntity wechatMenusEntity) {
        this.wechatMenusDao.insert(wechatMenusEntity);
        return wechatMenusEntity;
    }

    /**
     * 修改数据
     *
     * @param wechatMenusEntity 实例对象
     * @return 实例对象
     */
    @Override
    public WechatMenusEntity update(WechatMenusEntity wechatMenusEntity) {
        this.wechatMenusDao.update(wechatMenusEntity);
        return this.queryById(wechatMenusEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.wechatMenusDao.deleteById(id) > 0;
    }
}
