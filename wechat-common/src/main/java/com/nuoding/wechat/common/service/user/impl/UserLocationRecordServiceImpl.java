package com.nuoding.wechat.common.service.user.impl;

import com.nuoding.wechat.common.dao.user.UserLocationRecordDao;
import com.nuoding.wechat.common.entity.user.UserLocationRecordEntity;
import com.nuoding.wechat.common.service.user.UserLocationRecordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (userLocationRecord)表服务实现类
 * 用户地理位置记录表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class UserLocationRecordServiceImpl implements UserLocationRecordService {
    @Resource
    private UserLocationRecordDao userLocationRecordDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UserLocationRecordEntity queryById(Integer id) {
        return this.userLocationRecordDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param userLocationRecordEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<UserLocationRecordEntity> queryByPage(UserLocationRecordEntity userLocationRecordEntity) {
        return this.userLocationRecordDao.queryAllByLimit(userLocationRecordEntity);
    }

    /**
     * 新增数据
     *
     * @param userLocationRecordEntity 实例对象
     * @return 实例对象
     */
    @Override
    public UserLocationRecordEntity insert(UserLocationRecordEntity userLocationRecordEntity) {
        this.userLocationRecordDao.insert(userLocationRecordEntity);
        return userLocationRecordEntity;
    }

    /**
     * 修改数据
     *
     * @param userLocationRecordEntity 实例对象
     * @return 实例对象
     */
    @Override
    public UserLocationRecordEntity update(UserLocationRecordEntity userLocationRecordEntity) {
        this.userLocationRecordDao.update(userLocationRecordEntity);
        return this.queryById(userLocationRecordEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.userLocationRecordDao.deleteById(id) > 0;
    }
}
