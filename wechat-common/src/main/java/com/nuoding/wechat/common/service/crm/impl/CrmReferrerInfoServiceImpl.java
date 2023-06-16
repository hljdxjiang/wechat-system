package com.nuoding.wechat.common.service.crm.impl;

import com.nuoding.wechat.common.dao.crm.CrmReferrerInfoDao;
import com.nuoding.wechat.common.entity.crm.CrmReferrerInfoEntity;
import com.nuoding.wechat.common.service.crm.CrmReferrerInfoService;
import org.springframework.stereotype.Service;
import com.nuoding.wechat.common.utils.JsonUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.List;

/**
 * (crmReferrerInfo)表服务实现类
 * 推荐人信息表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class CrmReferrerInfoServiceImpl implements CrmReferrerInfoService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Resource
    private CrmReferrerInfoDao crmReferrerInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public CrmReferrerInfoEntity queryById(Integer id) {
        return this.crmReferrerInfoDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param crmReferrerInfoEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<CrmReferrerInfoEntity> queryAllByLimit(CrmReferrerInfoEntity crmReferrerInfoEntity) {
        logger.info("queryAllByLimit begin.crmReferrerInfoEntity:{}", JsonUtil.obj2Json(crmReferrerInfoEntity));
        return this.crmReferrerInfoDao.queryAllByLimit(crmReferrerInfoEntity);
    }

    /**
     * 新增数据
     *
     * @param crmReferrerInfoEntity 实例对象
     * @return 实例对象
     */
    @Override
    public CrmReferrerInfoEntity insert(CrmReferrerInfoEntity crmReferrerInfoEntity) {
        logger.info("insert begin.crmReferrerInfoEntity:{}", JsonUtil.obj2Json(crmReferrerInfoEntity));
        this.crmReferrerInfoDao.insert(crmReferrerInfoEntity);
        return crmReferrerInfoEntity;
    }

    /**
     * 修改数据
     *
     * @param crmReferrerInfoEntity 实例对象
     * @return 实例对象
     */
    @Override
    public CrmReferrerInfoEntity update(CrmReferrerInfoEntity crmReferrerInfoEntity) {
        logger.info("update begin.crmReferrerInfoEntity:{}", JsonUtil.obj2Json(crmReferrerInfoEntity));
        this.crmReferrerInfoDao.update(crmReferrerInfoEntity);
        return this.queryById(crmReferrerInfoEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        logger.info("deleteById begin.crmReferrerInfoEntity:{}", id);
        return this.crmReferrerInfoDao.deleteById(id) > 0;
    }
}
