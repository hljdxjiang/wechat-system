package com.nuoding.wechat.common.service.crm.impl;

import com.nuoding.wechat.common.dao.crm.CrmPurchesRecordDao;
import com.nuoding.wechat.common.entity.crm.CrmPurchesRecordEntity;
import com.nuoding.wechat.common.service.crm.CrmPurchesRecordService;
import org.springframework.stereotype.Service;
import com.nuoding.wechat.common.utils.JsonUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.List;

/**
 * (crmPurchesRecord)表服务实现类
 * 进货记录表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class CrmPurchesRecordServiceImpl implements CrmPurchesRecordService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Resource
    private CrmPurchesRecordDao crmPurchesRecordDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public CrmPurchesRecordEntity queryById(Integer id) {
        logger.info("queryById begin.id:{}", id);

        return this.crmPurchesRecordDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param crmPurchesRecordEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<CrmPurchesRecordEntity> queryAllByLimit(CrmPurchesRecordEntity crmPurchesRecordEntity) {
        logger.info("queryAllByLimit begin.crmPurchesRecordEntity:{}", JsonUtil.obj2Json(crmPurchesRecordEntity));
        return this.crmPurchesRecordDao.queryAllByLimit(crmPurchesRecordEntity);
    }

    /**
     * 模糊查询
     *
     * @param crmPurchesRecordEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<CrmPurchesRecordEntity> fuzzyQuery(CrmPurchesRecordEntity crmPurchesRecordEntity) {
        logger.info("queryAllByLimit begin.crmPurchesRecordEntity:{}", JsonUtil.obj2Json(crmPurchesRecordEntity));
        return this.crmPurchesRecordDao.fuzzyQuery(crmPurchesRecordEntity);
    }

    /**
     * 单挑查询
     *
     * @param crmPurchesRecordEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public CrmPurchesRecordEntity selectOne(CrmPurchesRecordEntity crmPurchesRecordEntity) {
        logger.info("queryAllByLimit begin.crmPurchesRecordEntity:{}", JsonUtil.obj2Json(crmPurchesRecordEntity));
        return this.crmPurchesRecordDao.selectOne(crmPurchesRecordEntity);
    }

    /**
     * 新增数据
     *
     * @param crmPurchesRecordEntity 实例对象
     * @return 实例对象
     */
    @Override
    public CrmPurchesRecordEntity insert(CrmPurchesRecordEntity crmPurchesRecordEntity) {
        logger.info("insert begin.crmPurchesRecordEntity:{}", JsonUtil.obj2Json(crmPurchesRecordEntity));
        this.crmPurchesRecordDao.insert(crmPurchesRecordEntity);
        return crmPurchesRecordEntity;
    }

    /**
     * 修改数据
     *
     * @param crmPurchesRecordEntity 实例对象
     * @return 实例对象
     */
    @Override
    public CrmPurchesRecordEntity update(CrmPurchesRecordEntity crmPurchesRecordEntity) {
        logger.info("update begin.crmPurchesRecordEntity:{}", JsonUtil.obj2Json(crmPurchesRecordEntity));
        this.crmPurchesRecordDao.update(crmPurchesRecordEntity);
        return this.queryById(crmPurchesRecordEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        logger.info("deleteById begin.crmPurchesRecordEntity:{}", id);
        return this.crmPurchesRecordDao.deleteById(id) > 0;
    }
}
