package com.nuoding.wechat.common.service.impl;

import com.nuoding.wechat.common.dao.CrmSaleRecordDao;
import com.nuoding.wechat.common.entity.CrmSaleRecord;
import com.nuoding.wechat.common.service.CrmSaleRecordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 销售记录表(CrmSaleRecord)表服务实现类
 *
 * @author jhc
 * @since 2023-03-07 14:37:11
 */
@Service
public class CrmSaleRecordServiceImpl implements CrmSaleRecordService {
    @Resource
    private CrmSaleRecordDao crmSaleRecordDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public CrmSaleRecord queryById(Integer id) {
        return this.crmSaleRecordDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param crmSaleRecord 筛选条件
     * @return 查询结果
     */
    @Override
    public List<CrmSaleRecord> queryByPage(CrmSaleRecord crmSaleRecord) {
        return this.crmSaleRecordDao.queryAllByLimit(crmSaleRecord);
    }

    /**
     * 新增数据
     *
     * @param crmSaleRecord 实例对象
     * @return 实例对象
     */
    @Override
    public CrmSaleRecord insert(CrmSaleRecord crmSaleRecord) {
        this.crmSaleRecordDao.insert(crmSaleRecord);
        return crmSaleRecord;
    }

    /**
     * 修改数据
     *
     * @param crmSaleRecord 实例对象
     * @return 实例对象
     */
    @Override
    public CrmSaleRecord update(CrmSaleRecord crmSaleRecord) {
        this.crmSaleRecordDao.update(crmSaleRecord);
        return this.queryById(crmSaleRecord.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.crmSaleRecordDao.deleteById(id) > 0;
    }
}
