package com.nuoding.wechat.common.service.user.impl;

import com.nuoding.wechat.common.dao.user.UserOperaRecordDao;
import com.nuoding.wechat.common.entity.user.UserOperaRecordEntity;
import com.nuoding.wechat.common.service.user.UserOperaRecordService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (userOperaRecord)表服务实现类
 * 用户操作历史表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class UserOperaRecordServiceImpl implements UserOperaRecordService {
    @Resource
    private UserOperaRecordDao userOperaRecordDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UserOperaRecordEntity queryById(Integer id) {
        return this.userOperaRecordDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param userOperaRecordEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<UserOperaRecordEntity> queryByPage(UserOperaRecordEntity userOperaRecordEntity) {
        return this.userOperaRecordDao.queryAllByLimit(userOperaRecordEntity);
    }

    /**
     * 新增数据
     *
     * @param userOperaRecordEntity 实例对象
     * @return 实例对象
     */
    @Override
    public UserOperaRecordEntity insert(UserOperaRecordEntity userOperaRecordEntity) {
        this.userOperaRecordDao.insert(userOperaRecordEntity);
        return userOperaRecordEntity;
    }


    @Async
    @Override
    public UserOperaRecordEntity asyncInsert(UserOperaRecordEntity userOperaRecordEntity) {
        return asyncInsert(userOperaRecordEntity);
    }

    /**
     * 修改数据
     *
     * @param userOperaRecordEntity 实例对象
     * @return 实例对象
     */
    @Override
    public UserOperaRecordEntity update(UserOperaRecordEntity userOperaRecordEntity) {
        this.userOperaRecordDao.update(userOperaRecordEntity);
        return this.queryById(userOperaRecordEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.userOperaRecordDao.deleteById(id) > 0;
    }
}
