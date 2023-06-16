package com.nuoding.wechat.common.service.wechat.impl;

import com.nuoding.wechat.common.dao.wechat.WechatUserDao;
import com.nuoding.wechat.common.entity.wechat.WechatUserEntity;
import com.nuoding.wechat.common.service.wechat.WechatUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (wechatUser)表服务实现类
 * 微信用户信息表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class WechatUserServiceImpl implements WechatUserService {
    @Resource
    private WechatUserDao wechatUserDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public WechatUserEntity queryById(Integer id) {
        return this.wechatUserDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param wechatUserEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<WechatUserEntity> queryAllByLimit(WechatUserEntity wechatUserEntity) {
        return this.wechatUserDao.queryAllByLimit(wechatUserEntity);
    }

    /**
     * 新增数据
     *
     * @param wechatUserEntity 实例对象
     * @return 实例对象
     */
    @Override
    public WechatUserEntity insert(WechatUserEntity wechatUserEntity) {
        this.wechatUserDao.insert(wechatUserEntity);
        return wechatUserEntity;
    }

    /**
     * 修改数据
     *
     * @param wechatUserEntity 实例对象
     * @return 实例对象
     */
    @Override
    public WechatUserEntity update(WechatUserEntity wechatUserEntity) {
        this.wechatUserDao.update(wechatUserEntity);
        return this.queryById(wechatUserEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.wechatUserDao.deleteById(id) > 0;
    }
}
