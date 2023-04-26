package com.nuoding.wechat.common.service.impl;

import com.nuoding.wechat.common.dao.BackOperaRecordDao;
import com.nuoding.wechat.common.entity.BackOperaRecord;
import com.nuoding.wechat.common.service.BackOperaRecordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (BackOperaRecord)表服务实现类
 *
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class BackOperaRecordServiceImpl implements BackOperaRecordService {
    @Resource
    private BackOperaRecordDao backOperaRecordDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BackOperaRecord queryById(Integer id) {
        return this.backOperaRecordDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param backOperaRecord 筛选条件
     * @return 查询结果
     */
    @Override
    public List<BackOperaRecord> queryByPage(BackOperaRecord backOperaRecord) {
        return this.backOperaRecordDao.queryAllByLimit(backOperaRecord);
    }

    /**
     * 新增数据
     *
     * @param backOperaRecord 实例对象
     * @return 实例对象
     */
    @Override
    public BackOperaRecord insert(BackOperaRecord backOperaRecord) {
        this.backOperaRecordDao.insert(backOperaRecord);
        return backOperaRecord;
    }

    /**
     * 修改数据
     *
     * @param backOperaRecord 实例对象
     * @return 实例对象
     */
    @Override
    public BackOperaRecord update(BackOperaRecord backOperaRecord) {
        this.backOperaRecordDao.update(backOperaRecord);
        return this.queryById(backOperaRecord.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.backOperaRecordDao.deleteById(id) > 0;
    }
}
