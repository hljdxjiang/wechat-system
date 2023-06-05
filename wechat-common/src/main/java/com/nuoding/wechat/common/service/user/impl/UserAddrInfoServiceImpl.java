package com.nuoding.wechat.common.service.user.impl;

import com.nuoding.wechat.common.dao.user.UserAddrInfoDao;
import com.nuoding.wechat.common.entity.user.UserAddrInfoEntity;
import com.nuoding.wechat.common.service.user.UserAddrInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (userAddrInfo)表服务实现类
 * 客户信息表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class UserAddrInfoServiceImpl implements UserAddrInfoService {
    @Resource
    private UserAddrInfoDao userAddrInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UserAddrInfoEntity queryById(Integer id) {
        return this.userAddrInfoDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param userAddrInfoEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<UserAddrInfoEntity> queryByPage(UserAddrInfoEntity userAddrInfoEntity) {
        return this.userAddrInfoDao.queryAllByLimit(userAddrInfoEntity);
    }

    /**
     * 新增数据
     *
     * @param userAddrInfoEntity 实例对象
     * @return 实例对象
     */
    @Override
    public UserAddrInfoEntity insert(UserAddrInfoEntity userAddrInfoEntity) {
        this.userAddrInfoDao.insert(userAddrInfoEntity);
        return userAddrInfoEntity;
    }

    /**
     * 修改数据
     *
     * @param userAddrInfoEntity 实例对象
     * @return 实例对象
     */
    @Override
    public UserAddrInfoEntity update(UserAddrInfoEntity userAddrInfoEntity) {
        this.userAddrInfoDao.update(userAddrInfoEntity);
        return this.queryById(userAddrInfoEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.userAddrInfoDao.deleteById(id) > 0;
    }
}
