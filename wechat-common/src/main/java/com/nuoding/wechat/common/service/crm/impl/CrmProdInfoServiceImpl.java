package com.nuoding.wechat.common.service.crm.impl;

import com.nuoding.wechat.common.dao.crm.CrmProdInfoDao;
import com.nuoding.wechat.common.entity.crm.CrmProdInfoEntity;
import com.nuoding.wechat.common.service.crm.CrmProdInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (crmProdInfo)表服务实现类
 * 产品信息表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class CrmProdInfoServiceImpl implements CrmProdInfoService {
    @Resource
    private CrmProdInfoDao crmProdInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public CrmProdInfoEntity queryById(Integer id) {
        return this.crmProdInfoDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param crmProdInfoEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<CrmProdInfoEntity> queryByPage(CrmProdInfoEntity crmProdInfoEntity) {
        return this.crmProdInfoDao.queryAllByLimit(crmProdInfoEntity);
    }

    /**
     * 新增数据
     *
     * @param crmProdInfoEntity 实例对象
     * @return 实例对象
     */
    @Override
    public CrmProdInfoEntity insert(CrmProdInfoEntity crmProdInfoEntity) {
        this.crmProdInfoDao.insert(crmProdInfoEntity);
        return crmProdInfoEntity;
    }

    /**
     * 修改数据
     *
     * @param crmProdInfoEntity 实例对象
     * @return 实例对象
     */
    @Override
    public CrmProdInfoEntity update(CrmProdInfoEntity crmProdInfoEntity) {
        this.crmProdInfoDao.update(crmProdInfoEntity);
        return this.queryById(crmProdInfoEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.crmProdInfoDao.deleteById(id) > 0;
    }
}
