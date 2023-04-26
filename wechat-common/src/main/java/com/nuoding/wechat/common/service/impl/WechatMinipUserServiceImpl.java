package com.nuoding.wechat.common.service.impl;

import com.nuoding.wechat.common.dao.WechatMinipUserDao;
import com.nuoding.wechat.common.entity.WechatMinipUser;
import com.nuoding.wechat.common.service.WechatMinipUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (WechatMinipUser)表服务实现类
 *
 * @author jhc
 * @since 2023-03-07 14:39:17
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
    public WechatMinipUser queryById(Integer id) {
        return this.wechatMinipUserDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param wechatMinipUser 筛选条件
     * @return 查询结果
     */
    @Override
    public List<WechatMinipUser> queryByPage(WechatMinipUser wechatMinipUser) {
        return this.wechatMinipUserDao.queryAllByLimit(wechatMinipUser);
    }

    /**
     * 新增数据
     *
     * @param wechatMinipUser 实例对象
     * @return 实例对象
     */
    @Override
    public WechatMinipUser insert(WechatMinipUser wechatMinipUser) {
        this.wechatMinipUserDao.insert(wechatMinipUser);
        return wechatMinipUser;
    }

    /**
     * 修改数据
     *
     * @param wechatMinipUser 实例对象
     * @return 实例对象
     */
    @Override
    public WechatMinipUser update(WechatMinipUser wechatMinipUser) {
        this.wechatMinipUserDao.update(wechatMinipUser);
        return this.queryById(wechatMinipUser.getId());
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
