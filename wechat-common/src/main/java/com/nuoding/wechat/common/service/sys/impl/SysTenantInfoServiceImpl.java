package com.nuoding.wechat.common.service.sys.impl;

import com.nuoding.wechat.common.dao.sys.SysTenantInfoDao;
import com.nuoding.wechat.common.entity.sys.SysTenantInfoEntity;
import com.nuoding.wechat.common.service.sys.SysTenantInfoService;
import org.springframework.stereotype.Service;
import com.nuoding.wechat.common.utils.JsonUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.List;

/**
 * (sysTenantInfo)表服务实现类
 * 租户信息表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class SysTenantInfoServiceImpl implements SysTenantInfoService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Resource
    private SysTenantInfoDao sysTenantInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SysTenantInfoEntity queryById(Integer id) {
        return this.sysTenantInfoDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param sysTenantInfoEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<SysTenantInfoEntity> queryAllByLimit(SysTenantInfoEntity sysTenantInfoEntity) {
        logger.info("queryAllByLimit begin.sysTenantInfoEntity:{}", JsonUtil.obj2Json(sysTenantInfoEntity));
        return this.sysTenantInfoDao.queryAllByLimit(sysTenantInfoEntity);
    }

    /**
     * 新增数据
     *
     * @param sysTenantInfoEntity 实例对象
     * @return 实例对象
     */
    @Override
    public SysTenantInfoEntity insert(SysTenantInfoEntity sysTenantInfoEntity) {
        logger.info("insert begin.sysTenantInfoEntity:{}", JsonUtil.obj2Json(sysTenantInfoEntity));
        this.sysTenantInfoDao.insert(sysTenantInfoEntity);
        return sysTenantInfoEntity;
    }

    /**
     * 修改数据
     *
     * @param sysTenantInfoEntity 实例对象
     * @return 实例对象
     */
    @Override
    public SysTenantInfoEntity update(SysTenantInfoEntity sysTenantInfoEntity) {
        logger.info("update begin.sysTenantInfoEntity:{}", JsonUtil.obj2Json(sysTenantInfoEntity));
        this.sysTenantInfoDao.update(sysTenantInfoEntity);
        return this.queryById(sysTenantInfoEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        logger.info("deleteById begin.sysTenantInfoEntity:{}", id);
        return this.sysTenantInfoDao.deleteById(id) > 0;
    }
}
