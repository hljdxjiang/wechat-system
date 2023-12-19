package com.nuoding.wechat.common.service.crm.impl;

import com.nuoding.wechat.common.dao.crm.CrmProdDetailDao;
import com.nuoding.wechat.common.entity.crm.CrmProdDetailEntity;
import com.nuoding.wechat.common.service.crm.CrmProdDetailService;
import com.nuoding.wechat.common.utils.JsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (crmProdDetail)表服务实现类
 * 产品详情表
 *
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class CrmProdDetailServiceImpl implements CrmProdDetailService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private CrmProdDetailDao crmProdDetailDao;

    public CrmProdDetailServiceImpl(CrmProdDetailDao crmProdDetailDao) {
        this.crmProdDetailDao = crmProdDetailDao;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public CrmProdDetailEntity queryById(Integer id) {
        logger.info("queryById begin.id:{}", id);

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
        logger.info("queryAllByLimit begin.crmProdDetailEntity:{}", JsonUtil.obj2Json(crmProdDetailEntity));
        return this.crmProdDetailDao.queryAllByLimit(crmProdDetailEntity);
    }

    /**
     * 模糊查询
     *
     * @param crmProdDetailEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<CrmProdDetailEntity> fuzzyQuery(CrmProdDetailEntity crmProdDetailEntity) {
        logger.info("queryAllByLimit begin.crmProdDetailEntity:{}", JsonUtil.obj2Json(crmProdDetailEntity));
        return this.crmProdDetailDao.fuzzyQuery(crmProdDetailEntity);
    }

    /**
     * 单挑查询
     *
     * @param crmProdDetailEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public CrmProdDetailEntity selectOne(CrmProdDetailEntity crmProdDetailEntity) {
        logger.info("queryAllByLimit begin.crmProdDetailEntity:{}", JsonUtil.obj2Json(crmProdDetailEntity));
        return this.crmProdDetailDao.selectOne(crmProdDetailEntity);
    }

    /**
     * 新增数据
     *
     * @param crmProdDetailEntity 实例对象
     * @return 实例对象
     */
    @Override
    public CrmProdDetailEntity insert(CrmProdDetailEntity crmProdDetailEntity) {
        logger.info("insert begin.crmProdDetailEntity:{}", JsonUtil.obj2Json(crmProdDetailEntity));
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
        logger.info("update begin.crmProdDetailEntity:{}", JsonUtil.obj2Json(crmProdDetailEntity));
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
        logger.info("deleteById begin.crmProdDetailEntity:{}", id);
        return this.crmProdDetailDao.deleteById(id) > 0;
    }
}
