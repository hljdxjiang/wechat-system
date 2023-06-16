package com.nuoding.wechat.common.service.crm.impl;

import com.nuoding.wechat.common.dao.crm.CrmSalePayInfoDao;
import com.nuoding.wechat.common.entity.crm.CrmSalePayInfoEntity;
import com.nuoding.wechat.common.service.crm.CrmSalePayInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (crmSalePayInfo)表服务实现类
 * 销售支付记录表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class CrmSalePayInfoServiceImpl implements CrmSalePayInfoService {
    @Resource
    private CrmSalePayInfoDao crmSalePayInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public CrmSalePayInfoEntity queryById(Integer id) {
        return this.crmSalePayInfoDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param crmSalePayInfoEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<CrmSalePayInfoEntity> queryAllByLimit(CrmSalePayInfoEntity crmSalePayInfoEntity) {
        return this.crmSalePayInfoDao.queryAllByLimit(crmSalePayInfoEntity);
    }

    /**
     * 新增数据
     *
     * @param crmSalePayInfoEntity 实例对象
     * @return 实例对象
     */
    @Override
    public CrmSalePayInfoEntity insert(CrmSalePayInfoEntity crmSalePayInfoEntity) {
        this.crmSalePayInfoDao.insert(crmSalePayInfoEntity);
        return crmSalePayInfoEntity;
    }

    /**
     * 修改数据
     *
     * @param crmSalePayInfoEntity 实例对象
     * @return 实例对象
     */
    @Override
    public CrmSalePayInfoEntity update(CrmSalePayInfoEntity crmSalePayInfoEntity) {
        this.crmSalePayInfoDao.update(crmSalePayInfoEntity);
        return this.queryById(crmSalePayInfoEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.crmSalePayInfoDao.deleteById(id) > 0;
    }
}
