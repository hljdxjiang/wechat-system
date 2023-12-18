package com.nuoding.wechat.common.service.crm.impl;

import com.nuoding.wechat.common.dao.crm.CrmProdInfoDao;
import com.nuoding.wechat.common.entity.crm.CrmProdInfoEntity;
import com.nuoding.wechat.common.entity.crm.CrmProdInfoOutEntity;
import com.nuoding.wechat.common.model.crm.ProdFuzzyFuzzyQueryDTO;
import com.nuoding.wechat.common.service.crm.CrmProdInfoService;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import com.nuoding.wechat.common.utils.JsonUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    
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
        logger.info("queryById begin.id:{}", id);

        return this.crmProdInfoDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param crmProdInfoEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<CrmProdInfoEntity> queryAllByLimit(CrmProdInfoEntity crmProdInfoEntity) {
        logger.info("queryAllByLimit begin.crmProdInfoEntity:{}", JsonUtil.obj2Json(crmProdInfoEntity));
        return this.crmProdInfoDao.queryAllByLimit(crmProdInfoEntity);
    }

    /**
     * 模糊查询
     *
     * @param crmProdInfoEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<CrmProdInfoEntity> fuzzyQuery(CrmProdInfoEntity crmProdInfoEntity) {
        logger.info("queryAllByLimit begin.crmProdInfoEntity:{}", JsonUtil.obj2Json(crmProdInfoEntity));
        return this.crmProdInfoDao.fuzzyQuery(crmProdInfoEntity);
    }

    /**
     * 单挑查询
     *
     * @param crmProdInfoEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public CrmProdInfoEntity selectOne(CrmProdInfoEntity crmProdInfoEntity) {
        logger.info("queryAllByLimit begin.crmProdInfoEntity:{}", JsonUtil.obj2Json(crmProdInfoEntity));
        return this.crmProdInfoDao.selectOne(crmProdInfoEntity);
    }

    /**
     * 新增数据
     *
     * @param crmProdInfoEntity 实例对象
     * @return 实例对象
     */
    @Override
    public CrmProdInfoEntity insert(CrmProdInfoEntity crmProdInfoEntity) {
        logger.info("insert begin.crmProdInfoEntity:{}", JsonUtil.obj2Json(crmProdInfoEntity));
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
        logger.info("update begin.crmProdInfoEntity:{}", JsonUtil.obj2Json(crmProdInfoEntity));
        this.crmProdInfoDao.update(crmProdInfoEntity);
        return this.queryById(crmProdInfoEntity.getId());
    }

    @Override
    public List<CrmProdInfoEntity> queryFuzzyList(CrmProdInfoEntity dto) {
        return crmProdInfoDao.fuzzyQuery(dto);
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        logger.info("deleteById begin.crmProdInfoEntity:{}", id);
        return this.crmProdInfoDao.deleteById(id) > 0;
    }

    @Override
    public CrmProdInfoEntity queryByProdId(String prodId) {
        if (StringUtils.isBlank(prodId)) {
            return null;
        }
        CrmProdInfoEntity entity = new CrmProdInfoEntity();
        entity.setProdId(prodId);
        List<CrmProdInfoEntity> list = queryAllByLimit(entity);
        if (!CollectionUtils.isEmpty(list)) {
            return list.get(0);
        }
        return null;
    }
}
