package com.nuoding.wechat.common.service.crm.impl;

import com.nuoding.wechat.common.dao.crm.CrmPurchesDetailDao;
import com.nuoding.wechat.common.entity.crm.CrmPurchesDetailEntity;
import com.nuoding.wechat.common.service.crm.CrmPurchesDetailService;
import org.springframework.stereotype.Service;
import com.nuoding.wechat.common.utils.JsonUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.List;

/**
 * (crmPurchesDetail)表服务实现类
 * 进货详情表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class CrmPurchesDetailServiceImpl implements CrmPurchesDetailService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Resource
    private CrmPurchesDetailDao crmPurchesDetailDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public CrmPurchesDetailEntity queryById(Integer id) {
        return this.crmPurchesDetailDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param crmPurchesDetailEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<CrmPurchesDetailEntity> queryAllByLimit(CrmPurchesDetailEntity crmPurchesDetailEntity) {
        logger.info("queryAllByLimit begin.crmPurchesDetailEntity:{}", JsonUtil.obj2Json(crmPurchesDetailEntity));
        return this.crmPurchesDetailDao.queryAllByLimit(crmPurchesDetailEntity);
    }

    /**
     * 新增数据
     *
     * @param crmPurchesDetailEntity 实例对象
     * @return 实例对象
     */
    @Override
    public CrmPurchesDetailEntity insert(CrmPurchesDetailEntity crmPurchesDetailEntity) {
        logger.info("insert begin.crmPurchesDetailEntity:{}", JsonUtil.obj2Json(crmPurchesDetailEntity));
        this.crmPurchesDetailDao.insert(crmPurchesDetailEntity);
        return crmPurchesDetailEntity;
    }

    /**
     * 修改数据
     *
     * @param crmPurchesDetailEntity 实例对象
     * @return 实例对象
     */
    @Override
    public CrmPurchesDetailEntity update(CrmPurchesDetailEntity crmPurchesDetailEntity) {
        logger.info("update begin.crmPurchesDetailEntity:{}", JsonUtil.obj2Json(crmPurchesDetailEntity));
        this.crmPurchesDetailDao.update(crmPurchesDetailEntity);
        return this.queryById(crmPurchesDetailEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        logger.info("deleteById begin.crmPurchesDetailEntity:{}", id);
        return this.crmPurchesDetailDao.deleteById(id) > 0;
    }
}
