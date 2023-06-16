package com.nuoding.wechat.common.service.user.impl;

import com.nuoding.wechat.common.dao.user.UserPropertyDetailDao;
import com.nuoding.wechat.common.entity.user.UserPropertyDetailEntity;
import com.nuoding.wechat.common.service.user.UserPropertyDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (userPropertyDetail)表服务实现类
 * 用户资产记录表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class UserPropertyDetailServiceImpl implements UserPropertyDetailService {
    @Resource
    private UserPropertyDetailDao userPropertyDetailDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UserPropertyDetailEntity queryById(Integer id) {
        return this.userPropertyDetailDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param userPropertyDetailEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<UserPropertyDetailEntity> queryAllByLimit(UserPropertyDetailEntity userPropertyDetailEntity) {
        return this.userPropertyDetailDao.queryAllByLimit(userPropertyDetailEntity);
    }

    /**
     * 新增数据
     *
     * @param userPropertyDetailEntity 实例对象
     * @return 实例对象
     */
    @Override
    public UserPropertyDetailEntity insert(UserPropertyDetailEntity userPropertyDetailEntity) {
        this.userPropertyDetailDao.insert(userPropertyDetailEntity);
        return userPropertyDetailEntity;
    }

    /**
     * 修改数据
     *
     * @param userPropertyDetailEntity 实例对象
     * @return 实例对象
     */
    @Override
    public UserPropertyDetailEntity update(UserPropertyDetailEntity userPropertyDetailEntity) {
        this.userPropertyDetailDao.update(userPropertyDetailEntity);
        return this.queryById(userPropertyDetailEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.userPropertyDetailDao.deleteById(id) > 0;
    }
}
