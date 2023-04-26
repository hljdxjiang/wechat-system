package com.nuoding.wechat.common.service.impl;

import com.nuoding.wechat.common.dao.WechatUserDao;
import com.nuoding.wechat.common.entity.WechatUser;
import com.nuoding.wechat.common.service.WechatUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (WechatUser)表服务实现类
 *
 * @author jhc
 * @since 2023-03-07 14:39:21
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
    public WechatUser queryById(Integer id) {
        return this.wechatUserDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param wechatUser 筛选条件
     * @return 查询结果
     */
    @Override
    public List<WechatUser> queryByPage(WechatUser wechatUser) {
        return this.wechatUserDao.queryAllByLimit(wechatUser);
    }

    /**
     * 新增数据
     *
     * @param wechatUser 实例对象
     * @return 实例对象
     */
    @Override
    public WechatUser insert(WechatUser wechatUser) {
        this.wechatUserDao.insert(wechatUser);
        return wechatUser;
    }

    /**
     * 修改数据
     *
     * @param wechatUser 实例对象
     * @return 实例对象
     */
    @Override
    public WechatUser update(WechatUser wechatUser) {
        this.wechatUserDao.update(wechatUser);
        return this.queryById(wechatUser.getId());
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
