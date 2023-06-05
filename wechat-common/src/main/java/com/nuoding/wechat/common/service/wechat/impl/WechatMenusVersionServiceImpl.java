package com.nuoding.wechat.common.service.wechat.impl;

import com.nuoding.wechat.common.dao.wechat.WechatMenusVersionDao;
import com.nuoding.wechat.common.entity.wechat.WechatMenusVersionEntity;
import com.nuoding.wechat.common.service.wechat.WechatMenusVersionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (wechatMenusVersion)表服务实现类
 * 微信菜单版本表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class WechatMenusVersionServiceImpl implements WechatMenusVersionService {
    @Resource
    private WechatMenusVersionDao wechatMenusVersionDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public WechatMenusVersionEntity queryById(Integer id) {
        return this.wechatMenusVersionDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param wechatMenusVersionEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<WechatMenusVersionEntity> queryByPage(WechatMenusVersionEntity wechatMenusVersionEntity) {
        return this.wechatMenusVersionDao.queryAllByLimit(wechatMenusVersionEntity);
    }

    /**
     * 新增数据
     *
     * @param wechatMenusVersionEntity 实例对象
     * @return 实例对象
     */
    @Override
    public WechatMenusVersionEntity insert(WechatMenusVersionEntity wechatMenusVersionEntity) {
        this.wechatMenusVersionDao.insert(wechatMenusVersionEntity);
        return wechatMenusVersionEntity;
    }

    /**
     * 修改数据
     *
     * @param wechatMenusVersionEntity 实例对象
     * @return 实例对象
     */
    @Override
    public WechatMenusVersionEntity update(WechatMenusVersionEntity wechatMenusVersionEntity) {
        this.wechatMenusVersionDao.update(wechatMenusVersionEntity);
        return this.queryById(wechatMenusVersionEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.wechatMenusVersionDao.deleteById(id) > 0;
    }
}