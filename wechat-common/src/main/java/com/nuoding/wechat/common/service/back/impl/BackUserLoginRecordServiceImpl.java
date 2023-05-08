package com.nuoding.wechat.common.service.back.impl;

import com.nuoding.wechat.common.dao.back.BackUserLoginRecordDao;
import com.nuoding.wechat.common.entity.back.BackUserLoginRecordEntity;
import com.nuoding.wechat.common.service.back.BackUserLoginRecordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (backUserLoginRecord)表服务实现类
 * 用户登录历史表
 * @author jhc
 * @since 2023-03-07 14:38:19
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
    public BackUserLoginRecordEntity queryById(Integer id) {
        return this.backUserLoginRecordDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param backUserLoginRecordEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<BackUserLoginRecordEntity> queryByPage(BackUserLoginRecordEntity backUserLoginRecordEntity) {
        return this.backUserLoginRecordDao.queryAllByLimit(backUserLoginRecordEntity);
    }

    /**
     * 新增数据
     *
     * @param backUserLoginRecordEntity 实例对象
     * @return 实例对象
     */
    @Override
    public BackUserLoginRecordEntity insert(BackUserLoginRecordEntity backUserLoginRecordEntity) {
        this.backUserLoginRecordDao.insert(backUserLoginRecordEntity);
        return backUserLoginRecordEntity;
    }

    /**
     * 修改数据
     *
     * @param backUserLoginRecordEntity 实例对象
     * @return 实例对象
     */
    @Override
    public BackUserLoginRecordEntity update(BackUserLoginRecordEntity backUserLoginRecordEntity) {
        this.backUserLoginRecordDao.update(backUserLoginRecordEntity);
        return this.queryById(backUserLoginRecordEntity.getId());
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
}
