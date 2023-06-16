package com.nuoding.wechat.common.service.crm.impl;

import com.nuoding.wechat.common.dao.crm.CrmProdGroupDao;
import com.nuoding.wechat.common.entity.crm.CrmProdGroupEntity;
import com.nuoding.wechat.common.service.crm.CrmProdGroupService;
import org.springframework.stereotype.Service;
import com.nuoding.wechat.common.utils.JsonUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.List;

/**
 * (crmProdGroup)表服务实现类
 * 产品分组表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class CrmProdGroupServiceImpl implements CrmProdGroupService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Resource
    private CrmProdGroupDao crmProdGroupDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public CrmProdGroupEntity queryById(Integer id) {
        return this.crmProdGroupDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param crmProdGroupEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<CrmProdGroupEntity> queryAllByLimit(CrmProdGroupEntity crmProdGroupEntity) {
        logger.info("queryAllByLimit begin.crmProdGroupEntity:{}", JsonUtil.obj2Json(crmProdGroupEntity));
        return this.crmProdGroupDao.queryAllByLimit(crmProdGroupEntity);
    }

    /**
     * 新增数据
     *
     * @param crmProdGroupEntity 实例对象
     * @return 实例对象
     */
    @Override
    public CrmProdGroupEntity insert(CrmProdGroupEntity crmProdGroupEntity) {
        logger.info("insert begin.crmProdGroupEntity:{}", JsonUtil.obj2Json(crmProdGroupEntity));
        this.crmProdGroupDao.insert(crmProdGroupEntity);
        return crmProdGroupEntity;
    }

    /**
     * 修改数据
     *
     * @param crmProdGroupEntity 实例对象
     * @return 实例对象
     */
    @Override
    public CrmProdGroupEntity update(CrmProdGroupEntity crmProdGroupEntity) {
        logger.info("update begin.crmProdGroupEntity:{}", JsonUtil.obj2Json(crmProdGroupEntity));
        this.crmProdGroupDao.update(crmProdGroupEntity);
        return this.queryById(crmProdGroupEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        logger.info("deleteById begin.crmProdGroupEntity:{}", id);
        return this.crmProdGroupDao.deleteById(id) > 0;
    }
}
