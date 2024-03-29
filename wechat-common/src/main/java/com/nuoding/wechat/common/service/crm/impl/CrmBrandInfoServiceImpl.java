package com.nuoding.wechat.common.service.crm.impl;

import com.nuoding.wechat.common.dao.crm.CrmBrandInfoDao;
import com.nuoding.wechat.common.entity.crm.CrmBrandInfoEntity;
import com.nuoding.wechat.common.service.crm.CrmBrandInfoService;
import com.nuoding.wechat.common.utils.JsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (crmBrandInfo)表服务实现类
 * 品牌信息表
 *
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class CrmBrandInfoServiceImpl implements CrmBrandInfoService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private CrmBrandInfoDao crmBrandInfoDao;

    public CrmBrandInfoServiceImpl(CrmBrandInfoDao crmBrandInfoDao) {
        this.crmBrandInfoDao = crmBrandInfoDao;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public CrmBrandInfoEntity queryById(Integer id) {
        logger.info("queryById begin.id:{}", id);

        return this.crmBrandInfoDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param crmBrandInfoEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<CrmBrandInfoEntity> queryAllByLimit(CrmBrandInfoEntity crmBrandInfoEntity) {
        logger.info("queryAllByLimit begin.crmBrandInfoEntity:{}", JsonUtil.obj2Json(crmBrandInfoEntity));
        return this.crmBrandInfoDao.queryAllByLimit(crmBrandInfoEntity);
    }

    /**
     * 模糊查询
     *
     * @param crmBrandInfoEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<CrmBrandInfoEntity> fuzzyQuery(CrmBrandInfoEntity crmBrandInfoEntity) {
        logger.info("queryAllByLimit begin.crmBrandInfoEntity:{}", JsonUtil.obj2Json(crmBrandInfoEntity));
        return this.crmBrandInfoDao.fuzzyQuery(crmBrandInfoEntity);
    }

    /**
     * 单挑查询
     *
     * @param crmBrandInfoEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public CrmBrandInfoEntity selectOne(CrmBrandInfoEntity crmBrandInfoEntity) {
        logger.info("queryAllByLimit begin.crmBrandInfoEntity:{}", JsonUtil.obj2Json(crmBrandInfoEntity));
        return this.crmBrandInfoDao.selectOne(crmBrandInfoEntity);
    }

    /**
     * 新增数据
     *
     * @param crmBrandInfoEntity 实例对象
     * @return 实例对象
     */
    @Override
    public CrmBrandInfoEntity insert(CrmBrandInfoEntity crmBrandInfoEntity) {
        logger.info("insert begin.crmBrandInfoEntity:{}", JsonUtil.obj2Json(crmBrandInfoEntity));
        this.crmBrandInfoDao.insert(crmBrandInfoEntity);
        return crmBrandInfoEntity;
    }

    /**
     * 修改数据
     *
     * @param crmBrandInfoEntity 实例对象
     * @return 实例对象
     */
    @Override
    public CrmBrandInfoEntity update(CrmBrandInfoEntity crmBrandInfoEntity) {
        logger.info("update begin.crmBrandInfoEntity:{}", JsonUtil.obj2Json(crmBrandInfoEntity));
        this.crmBrandInfoDao.update(crmBrandInfoEntity);
        return this.queryById(crmBrandInfoEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        logger.info("deleteById begin.crmBrandInfoEntity:{}", id);
        return this.crmBrandInfoDao.deleteById(id) > 0;
    }
}
