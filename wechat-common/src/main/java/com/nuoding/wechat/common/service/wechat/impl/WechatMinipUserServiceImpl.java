package com.nuoding.wechat.common.service.wechat.impl;

import com.nuoding.wechat.common.dao.wechat.WechatMinipUserDao;
import com.nuoding.wechat.common.entity.wechat.WechatMinipUserEntity;
import com.nuoding.wechat.common.service.wechat.WechatMinipUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (wechatMinipUser)表服务实现类
 * 小程序用户信息表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class WechatMinipUserServiceImpl implements WechatMinipUserService {
    @Resource
    private WechatMinipUserDao wechatMinipUserDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public WechatMinipUserEntity queryById(Integer id) {
        return this.wechatMinipUserDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param wechatMinipUserEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<WechatMinipUserEntity> queryAllByLimit(WechatMinipUserEntity wechatMinipUserEntity) {
        return this.wechatMinipUserDao.queryAllByLimit(wechatMinipUserEntity);
    }

    /**
     * 新增数据
     *
     * @param wechatMinipUserEntity 实例对象
     * @return 实例对象
     */
    @Override
    public WechatMinipUserEntity insert(WechatMinipUserEntity wechatMinipUserEntity) {
        this.wechatMinipUserDao.insert(wechatMinipUserEntity);
        return wechatMinipUserEntity;
    }

    /**
     * 修改数据
     *
     * @param wechatMinipUserEntity 实例对象
     * @return 实例对象
     */
    @Override
    public WechatMinipUserEntity update(WechatMinipUserEntity wechatMinipUserEntity) {
        this.wechatMinipUserDao.update(wechatMinipUserEntity);
        return this.queryById(wechatMinipUserEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.wechatMinipUserDao.deleteById(id) > 0;
    }
}
