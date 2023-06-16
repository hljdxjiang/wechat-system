package com.nuoding.wechat.common.service.crm.impl;

import com.nuoding.wechat.common.dao.crm.CrmProdDetailDao;
import com.nuoding.wechat.common.entity.crm.CrmProdDetailEntity;
import com.nuoding.wechat.common.service.crm.CrmProdDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (crmProdDetail)表服务实现类
 * 产品详情表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class CrmProdDetailServiceImpl implements CrmProdDetailService {
    @Resource
    private CrmProdDetailDao crmProdDetailDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public CrmProdDetailEntity queryById(Integer id) {
        return this.crmProdDetailDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param crmProdDetailEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<CrmProdDetailEntity> queryAllByLimit(CrmProdDetailEntity crmProdDetailEntity) {
        return this.crmProdDetailDao.queryAllByLimit(crmProdDetailEntity);
    }

    /**
     * 新增数据
     *
     * @param crmProdDetailEntity 实例对象
     * @return 实例对象
     */
    @Override
    public CrmProdDetailEntity insert(CrmProdDetailEntity crmProdDetailEntity) {
        this.crmProdDetailDao.insert(crmProdDetailEntity);
        return crmProdDetailEntity;
    }

    /**
     * 修改数据
     *
     * @param crmProdDetailEntity 实例对象
     * @return 实例对象
     */
    @Override
    public CrmProdDetailEntity update(CrmProdDetailEntity crmProdDetailEntity) {
        this.crmProdDetailDao.update(crmProdDetailEntity);
        return this.queryById(crmProdDetailEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.crmProdDetailDao.deleteById(id) > 0;
    }
}
