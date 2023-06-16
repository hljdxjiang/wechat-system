package com.nuoding.wechat.common.service.wechat.impl;

import com.nuoding.wechat.common.dao.wechat.WechatMenusOptionDao;
import com.nuoding.wechat.common.entity.wechat.WechatMenusOptionEntity;
import com.nuoding.wechat.common.service.wechat.WechatMenusOptionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (wechatMenusOption)表服务实现类
 * 微信菜单要素表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class WechatMenusOptionServiceImpl implements WechatMenusOptionService {
    @Resource
    private WechatMenusOptionDao wechatMenusOptionDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public WechatMenusOptionEntity queryById(Integer id) {
        return this.wechatMenusOptionDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param wechatMenusOptionEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<WechatMenusOptionEntity> queryAllByLimit(WechatMenusOptionEntity wechatMenusOptionEntity) {
        return this.wechatMenusOptionDao.queryAllByLimit(wechatMenusOptionEntity);
    }

    /**
     * 新增数据
     *
     * @param wechatMenusOptionEntity 实例对象
     * @return 实例对象
     */
    @Override
    public WechatMenusOptionEntity insert(WechatMenusOptionEntity wechatMenusOptionEntity) {
        this.wechatMenusOptionDao.insert(wechatMenusOptionEntity);
        return wechatMenusOptionEntity;
    }

    /**
     * 修改数据
     *
     * @param wechatMenusOptionEntity 实例对象
     * @return 实例对象
     */
    @Override
    public WechatMenusOptionEntity update(WechatMenusOptionEntity wechatMenusOptionEntity) {
        this.wechatMenusOptionDao.update(wechatMenusOptionEntity);
        return this.queryById(wechatMenusOptionEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.wechatMenusOptionDao.deleteById(id) > 0;
    }
}
