package com.nuoding.wechat.common.service.crm.impl;

import com.nuoding.wechat.common.dao.crm.CrmSaleDetailDao;
import com.nuoding.wechat.common.entity.crm.CrmSaleDetailEntity;
import com.nuoding.wechat.common.service.crm.CrmSaleDetailService;
import org.springframework.stereotype.Service;
import com.nuoding.wechat.common.utils.JsonUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.List;

/**
 * (crmSaleDetail)表服务实现类
 * 销售记录表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class CrmSaleDetailServiceImpl implements CrmSaleDetailService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Resource
    private CrmSaleDetailDao crmSaleDetailDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public CrmSaleDetailEntity queryById(Integer id) {
        return this.crmSaleDetailDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param crmSaleDetailEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<CrmSaleDetailEntity> queryAllByLimit(CrmSaleDetailEntity crmSaleDetailEntity) {
        logger.info("queryAllByLimit begin.crmSaleDetailEntity:{}", JsonUtil.obj2Json(crmSaleDetailEntity));
        return this.crmSaleDetailDao.queryAllByLimit(crmSaleDetailEntity);
    }

    /**
     * 新增数据
     *
     * @param crmSaleDetailEntity 实例对象
     * @return 实例对象
     */
    @Override
    public CrmSaleDetailEntity insert(CrmSaleDetailEntity crmSaleDetailEntity) {
        logger.info("insert begin.crmSaleDetailEntity:{}", JsonUtil.obj2Json(crmSaleDetailEntity));
        this.crmSaleDetailDao.insert(crmSaleDetailEntity);
        return crmSaleDetailEntity;
    }

    /**
     * 修改数据
     *
     * @param crmSaleDetailEntity 实例对象
     * @return 实例对象
     */
    @Override
    public CrmSaleDetailEntity update(CrmSaleDetailEntity crmSaleDetailEntity) {
        logger.info("update begin.crmSaleDetailEntity:{}", JsonUtil.obj2Json(crmSaleDetailEntity));
        this.crmSaleDetailDao.update(crmSaleDetailEntity);
        return this.queryById(crmSaleDetailEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        logger.info("deleteById begin.crmSaleDetailEntity:{}", id);
        return this.crmSaleDetailDao.deleteById(id) > 0;
    }
}
