package com.nuoding.wechat.common.service.impl;

import com.nuoding.wechat.common.dao.CrmPurchesRecordDao;
import com.nuoding.wechat.common.entity.CrmPurchesRecord;
import com.nuoding.wechat.common.service.CrmPurchesRecordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 进货记录表(CrmPurchesRecord)表服务实现类
 *
 * @author jhc
 * @since 2023-03-07 14:38:41
 */
@Service
public class CrmPurchesRecordServiceImpl implements CrmPurchesRecordService {
    @Resource
    private CrmPurchesRecordDao crmPurchesRecordDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public CrmPurchesRecord queryById(Integer id) {
        return this.crmPurchesRecordDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param crmPurchesRecord 筛选条件
     * @return 查询结果
     */
    @Override
    public List<CrmPurchesRecord> queryByPage(CrmPurchesRecord crmPurchesRecord) {
        return this.crmPurchesRecordDao.queryAllByLimit(crmPurchesRecord);
    }

    /**
     * 新增数据
     *
     * @param crmPurchesRecord 实例对象
     * @return 实例对象
     */
    @Override
    public CrmPurchesRecord insert(CrmPurchesRecord crmPurchesRecord) {
        this.crmPurchesRecordDao.insert(crmPurchesRecord);
        return crmPurchesRecord;
    }

    /**
     * 修改数据
     *
     * @param crmPurchesRecord 实例对象
     * @return 实例对象
     */
    @Override
    public CrmPurchesRecord update(CrmPurchesRecord crmPurchesRecord) {
        this.crmPurchesRecordDao.update(crmPurchesRecord);
        return this.queryById(crmPurchesRecord.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.crmPurchesRecordDao.deleteById(id) > 0;
    }
}
