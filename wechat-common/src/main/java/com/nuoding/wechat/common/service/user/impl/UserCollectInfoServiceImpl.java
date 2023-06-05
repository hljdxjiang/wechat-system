package com.nuoding.wechat.common.service.user.impl;

import com.nuoding.wechat.common.dao.user.UserCollectInfoDao;
import com.nuoding.wechat.common.entity.user.UserCollectInfoEntity;
import com.nuoding.wechat.common.service.user.UserCollectInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (userCollectInfo)表服务实现类
 * 用户收藏表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class UserCollectInfoServiceImpl implements UserCollectInfoService {
    @Resource
    private UserCollectInfoDao userCollectInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UserCollectInfoEntity queryById(Integer id) {
        return this.userCollectInfoDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param userCollectInfoEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<UserCollectInfoEntity> queryByPage(UserCollectInfoEntity userCollectInfoEntity) {
        return this.userCollectInfoDao.queryAllByLimit(userCollectInfoEntity);
    }

    /**
     * 新增数据
     *
     * @param userCollectInfoEntity 实例对象
     * @return 实例对象
     */
    @Override
    public UserCollectInfoEntity insert(UserCollectInfoEntity userCollectInfoEntity) {
        this.userCollectInfoDao.insert(userCollectInfoEntity);
        return userCollectInfoEntity;
    }

    /**
     * 修改数据
     *
     * @param userCollectInfoEntity 实例对象
     * @return 实例对象
     */
    @Override
    public UserCollectInfoEntity update(UserCollectInfoEntity userCollectInfoEntity) {
        this.userCollectInfoDao.update(userCollectInfoEntity);
        return this.queryById(userCollectInfoEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.userCollectInfoDao.deleteById(id) > 0;
    }
}
