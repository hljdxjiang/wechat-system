package com.nuoding.wechat.common.service.impl;

import com.nuoding.wechat.common.dao.UserRegInfoDao;
import com.nuoding.wechat.common.entity.UserRegInfo;
import com.nuoding.wechat.common.service.UserRegInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 客户信息表(UserRegInfo)表服务实现类
 *
 * @author jhc
 * @since 2023-03-07 14:39:15
 */
@Service
public class UserRegInfoServiceImpl implements UserRegInfoService {
    @Resource
    private UserRegInfoDao userRegInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UserRegInfo queryById(Integer id) {
        return this.userRegInfoDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param userRegInfo 筛选条件
     * @return 查询结果
     */
    @Override
    public List<UserRegInfo> queryByPage(UserRegInfo userRegInfo) {
        return this.userRegInfoDao.queryAllByLimit(userRegInfo);
    }

    /**
     * 新增数据
     *
     * @param userRegInfo 实例对象
     * @return 实例对象
     */
    @Override
    public UserRegInfo insert(UserRegInfo userRegInfo) {
        this.userRegInfoDao.insert(userRegInfo);
        return userRegInfo;
    }

    /**
     * 修改数据
     *
     * @param userRegInfo 实例对象
     * @return 实例对象
     */
    @Override
    public UserRegInfo update(UserRegInfo userRegInfo) {
        this.userRegInfoDao.update(userRegInfo);
        return this.queryById(userRegInfo.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.userRegInfoDao.deleteById(id) > 0;
    }
}
