package com.nuoding.wechat.common.service.crm.impl;

import com.nuoding.wechat.common.dao.crm.CrmProdTypeDao;
import com.nuoding.wechat.common.entity.crm.CrmProdTypeEntity;
import com.nuoding.wechat.common.service.crm.CrmProdTypeService;
import org.springframework.stereotype.Service;
import com.nuoding.wechat.common.utils.JsonUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.List;

/**
 * (crmProdType)表服务实现类
 * 产品类型配置表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class CrmProdTypeServiceImpl implements CrmProdTypeService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Resource
    private CrmProdTypeDao crmProdTypeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public CrmProdTypeEntity queryById(Integer id) {
        return this.crmProdTypeDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param crmProdTypeEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<CrmProdTypeEntity> queryAllByLimit(CrmProdTypeEntity crmProdTypeEntity) {
        logger.info("queryAllByLimit begin.crmProdTypeEntity:{}", JsonUtil.obj2Json(crmProdTypeEntity));
        return this.crmProdTypeDao.queryAllByLimit(crmProdTypeEntity);
    }

    /**
     * 新增数据
     *
     * @param crmProdTypeEntity 实例对象
     * @return 实例对象
     */
    @Override
    public CrmProdTypeEntity insert(CrmProdTypeEntity crmProdTypeEntity) {
        logger.info("insert begin.crmProdTypeEntity:{}", JsonUtil.obj2Json(crmProdTypeEntity));
        this.crmProdTypeDao.insert(crmProdTypeEntity);
        return crmProdTypeEntity;
    }

    /**
     * 修改数据
     *
     * @param crmProdTypeEntity 实例对象
     * @return 实例对象
     */
    @Override
    public CrmProdTypeEntity update(CrmProdTypeEntity crmProdTypeEntity) {
        logger.info("update begin.crmProdTypeEntity:{}", JsonUtil.obj2Json(crmProdTypeEntity));
        this.crmProdTypeDao.update(crmProdTypeEntity);
        return this.queryById(crmProdTypeEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        logger.info("deleteById begin.crmProdTypeEntity:{}", id);
        return this.crmProdTypeDao.deleteById(id) > 0;
    }
}
