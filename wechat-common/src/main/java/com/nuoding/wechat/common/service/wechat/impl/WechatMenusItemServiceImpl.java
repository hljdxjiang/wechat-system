package com.nuoding.wechat.common.service.wechat.impl;

import com.nuoding.wechat.common.dao.wechat.WechatMenusItemDao;
import com.nuoding.wechat.common.entity.wechat.WechatMenusItemEntity;
import com.nuoding.wechat.common.service.wechat.WechatMenusItemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (wechatMenusItem)表服务实现类
 * 微信菜单要素表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class WechatMenusItemServiceImpl implements WechatMenusItemService {
    @Resource
    private WechatMenusItemDao wechatMenusItemDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public WechatMenusItemEntity queryById(Integer id) {
        return this.wechatMenusItemDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param wechatMenusItemEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<WechatMenusItemEntity> queryByPage(WechatMenusItemEntity wechatMenusItemEntity) {
        return this.wechatMenusItemDao.queryAllByLimit(wechatMenusItemEntity);
    }

    /**
     * 新增数据
     *
     * @param wechatMenusItemEntity 实例对象
     * @return 实例对象
     */
    @Override
    public WechatMenusItemEntity insert(WechatMenusItemEntity wechatMenusItemEntity) {
        this.wechatMenusItemDao.insert(wechatMenusItemEntity);
        return wechatMenusItemEntity;
    }

    /**
     * 修改数据
     *
     * @param wechatMenusItemEntity 实例对象
     * @return 实例对象
     */
    @Override
    public WechatMenusItemEntity update(WechatMenusItemEntity wechatMenusItemEntity) {
        this.wechatMenusItemDao.update(wechatMenusItemEntity);
        return this.queryById(wechatMenusItemEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.wechatMenusItemDao.deleteById(id) > 0;
    }
}
