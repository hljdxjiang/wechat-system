package com.nuoding.wechat.common.service.sys.impl;

import com.nuoding.wechat.common.dao.sys.SysTenantTokenDao;
import com.nuoding.wechat.common.entity.sys.SysTenantTokenEntity;
import com.nuoding.wechat.common.service.sys.SysTenantTokenService;
import org.springframework.stereotype.Service;
import com.nuoding.wechat.common.utils.JsonUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.List;

/**
 * (sysTenantToken)表服务实现类
 * 企业token信息表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class SysTenantTokenServiceImpl implements SysTenantTokenService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Resource
    private SysTenantTokenDao sysTenantTokenDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SysTenantTokenEntity queryById(Integer id) {
        logger.info("queryById begin.id:{}", id);

        return this.sysTenantTokenDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param sysTenantTokenEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<SysTenantTokenEntity> queryAllByLimit(SysTenantTokenEntity sysTenantTokenEntity) {
        logger.info("queryAllByLimit begin.sysTenantTokenEntity:{}", JsonUtil.obj2Json(sysTenantTokenEntity));
        return this.sysTenantTokenDao.queryAllByLimit(sysTenantTokenEntity);
    }

    /**
     * 模糊查询
     *
     * @param sysTenantTokenEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<SysTenantTokenEntity> fuzzyQuery(SysTenantTokenEntity sysTenantTokenEntity) {
        logger.info("queryAllByLimit begin.sysTenantTokenEntity:{}", JsonUtil.obj2Json(sysTenantTokenEntity));
        return this.sysTenantTokenDao.fuzzyQuery(sysTenantTokenEntity);
    }

    /**
     * 单挑查询
     *
     * @param sysTenantTokenEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public SysTenantTokenEntity selectOne(SysTenantTokenEntity sysTenantTokenEntity) {
        logger.info("queryAllByLimit begin.sysTenantTokenEntity:{}", JsonUtil.obj2Json(sysTenantTokenEntity));
        return this.sysTenantTokenDao.selectOne(sysTenantTokenEntity);
    }

    /**
     * 新增数据
     *
     * @param sysTenantTokenEntity 实例对象
     * @return 实例对象
     */
    @Override
    public SysTenantTokenEntity insert(SysTenantTokenEntity sysTenantTokenEntity) {
        logger.info("insert begin.sysTenantTokenEntity:{}", JsonUtil.obj2Json(sysTenantTokenEntity));
        this.sysTenantTokenDao.insert(sysTenantTokenEntity);
        return sysTenantTokenEntity;
    }

    /**
     * 修改数据
     *
     * @param sysTenantTokenEntity 实例对象
     * @return 实例对象
     */
    @Override
    public SysTenantTokenEntity update(SysTenantTokenEntity sysTenantTokenEntity) {
        logger.info("update begin.sysTenantTokenEntity:{}", JsonUtil.obj2Json(sysTenantTokenEntity));
        this.sysTenantTokenDao.update(sysTenantTokenEntity);
        return this.queryById(sysTenantTokenEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        logger.info("deleteById begin.sysTenantTokenEntity:{}", id);
        return this.sysTenantTokenDao.deleteById(id) > 0;
    }
}
