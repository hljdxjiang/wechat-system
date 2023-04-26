package com.nuoding.wechat.common.service.impl;

import com.nuoding.wechat.common.dao.UserOperaRecordDao;
import com.nuoding.wechat.common.entity.UserOperaRecord;
import com.nuoding.wechat.common.service.UserOperaRecordService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (UserOperaRecord)表服务实现类
 *
 * @author jhc
 * @since 2023-03-07 14:39:07
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
    public UserOperaRecord queryById(Integer id) {
        return this.userOperaRecordDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param userOperaRecord 筛选条件
     * @return 查询结果
     */
    @Override
    public List<UserOperaRecord> queryByPage(UserOperaRecord userOperaRecord) {
        return this.userOperaRecordDao.queryAllByLimit(userOperaRecord);
    }

    /**
     * 新增数据
     *
     * @param userOperaRecord 实例对象
     * @return 实例对象
     */
    @Override
    public UserOperaRecord insert(UserOperaRecord userOperaRecord) {
        this.userOperaRecordDao.insert(userOperaRecord);
        return userOperaRecord;
    }

    /**
     * 异步新增数据
     *
     * @param userOperaRecord 实例对象
     * @return 实例对象
     */
    @Async
    @Override
    public UserOperaRecord asyncInsert(UserOperaRecord userOperaRecord) {
        this.userOperaRecordDao.insert(userOperaRecord);
        return userOperaRecord;
    }

    /**
     * 修改数据
     *
     * @param userOperaRecord 实例对象
     * @return 实例对象
     */
    @Override
    public UserOperaRecord update(UserOperaRecord userOperaRecord) {
        this.userOperaRecordDao.update(userOperaRecord);
        return this.queryById(userOperaRecord.getId());
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
