package com.nuoding.wechat.common.service.crm.impl;

import com.nuoding.wechat.common.dao.crm.CrmSaleRecordDao;
import com.nuoding.wechat.common.entity.crm.CrmSaleRecordEntity;
import com.nuoding.wechat.common.service.crm.CrmSaleRecordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (crmSaleRecord)表服务实现类
 * 销售记录表
 * @author jhc
 * @since 2023-03-07 14:38:19
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
    public CrmSaleRecordEntity queryById(Integer id) {
        return this.crmSaleRecordDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param crmSaleRecordEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<CrmSaleRecordEntity> queryAllByLimit(CrmSaleRecordEntity crmSaleRecordEntity) {
        return this.crmSaleRecordDao.queryAllByLimit(crmSaleRecordEntity);
    }

    /**
     * 新增数据
     *
     * @param crmSaleRecordEntity 实例对象
     * @return 实例对象
     */
    @Override
    public CrmSaleRecordEntity insert(CrmSaleRecordEntity crmSaleRecordEntity) {
        this.crmSaleRecordDao.insert(crmSaleRecordEntity);
        return crmSaleRecordEntity;
    }

    /**
     * 修改数据
     *
     * @param crmSaleRecordEntity 实例对象
     * @return 实例对象
     */
    @Override
    public CrmSaleRecordEntity update(CrmSaleRecordEntity crmSaleRecordEntity) {
        this.crmSaleRecordDao.update(crmSaleRecordEntity);
        return this.queryById(crmSaleRecordEntity.getId());
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
