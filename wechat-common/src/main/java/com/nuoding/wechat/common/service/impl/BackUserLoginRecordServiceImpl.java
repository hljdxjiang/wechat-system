package com.nuoding.wechat.common.service.impl;

import com.nuoding.wechat.common.dao.BackUserLoginRecordDao;
import com.nuoding.wechat.common.entity.BackUserLoginRecord;
import com.nuoding.wechat.common.service.BackUserLoginRecordService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


/**
 * (BackUserLoginRecord)表服务实现类
 *
 * @author jhc
 * @since 2023-03-07 14:38:32
 */
@Service
public class BackUserLoginRecordServiceImpl implements BackUserLoginRecordService {
    @Resource
    private BackUserLoginRecordDao backUserLoginRecordDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BackUserLoginRecord queryById(Integer id) {
        return this.backUserLoginRecordDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param backUserLoginRecord 筛选条件
     * @return 查询结果
     */
    @Override
    public List<BackUserLoginRecord> queryByPage(BackUserLoginRecord backUserLoginRecord) {
        return this.backUserLoginRecordDao.queryAllByLimit(backUserLoginRecord);
    }

    /**
     * 新增数据
     *
     * @param backUserLoginRecord 实例对象
     * @return 实例对象
     */
    @Override
    public BackUserLoginRecord insert(BackUserLoginRecord backUserLoginRecord) {
        this.backUserLoginRecordDao.insert(backUserLoginRecord);
        return backUserLoginRecord;
    }

    /**
     * 修改数据
     *
     * @param backUserLoginRecord 实例对象
     * @return 实例对象
     */
    @Override
    public BackUserLoginRecord update(BackUserLoginRecord backUserLoginRecord) {
        this.backUserLoginRecordDao.update(backUserLoginRecord);
        return this.queryById(backUserLoginRecord.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.backUserLoginRecordDao.deleteById(id) > 0;
    }

    /**
     * 异步新增数据
     *
     * @param backUserLoginRecord 实例对象
     * @return 实例对象
     */
    @Async
    @Override
    public BackUserLoginRecord asyncInsert(BackUserLoginRecord backUserLoginRecord) {
        this.backUserLoginRecordDao.insert(backUserLoginRecord);
        return backUserLoginRecord;
    }
}
