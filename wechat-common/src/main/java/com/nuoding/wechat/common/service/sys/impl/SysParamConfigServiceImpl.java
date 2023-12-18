package com.nuoding.wechat.common.service.sys.impl;

import com.nuoding.wechat.common.dao.sys.SysParamConfigDao;
import com.nuoding.wechat.common.entity.sys.SysParamConfigEntity;
import com.nuoding.wechat.common.service.sys.SysParamConfigService;
import org.springframework.stereotype.Service;
import com.nuoding.wechat.common.utils.JsonUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.List;

/**
 * (sysParamConfig)表服务实现类
 * 系统参数配置表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class SysParamConfigServiceImpl implements SysParamConfigService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Resource
    private SysParamConfigDao sysParamConfigDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SysParamConfigEntity queryById(Integer id) {
        logger.info("queryById begin.id:{}", id);

        return this.sysParamConfigDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param sysParamConfigEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<SysParamConfigEntity> queryAllByLimit(SysParamConfigEntity sysParamConfigEntity) {
        logger.info("queryAllByLimit begin.sysParamConfigEntity:{}", JsonUtil.obj2Json(sysParamConfigEntity));
        return this.sysParamConfigDao.queryAllByLimit(sysParamConfigEntity);
    }

    /**
     * 模糊查询
     *
     * @param sysParamConfigEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<SysParamConfigEntity> fuzzyQuery(SysParamConfigEntity sysParamConfigEntity) {
        logger.info("queryAllByLimit begin.sysParamConfigEntity:{}", JsonUtil.obj2Json(sysParamConfigEntity));
        return this.sysParamConfigDao.fuzzyQuery(sysParamConfigEntity);
    }

    /**
     * 单挑查询
     *
     * @param sysParamConfigEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public SysParamConfigEntity selectOne(SysParamConfigEntity sysParamConfigEntity) {
        logger.info("queryAllByLimit begin.sysParamConfigEntity:{}", JsonUtil.obj2Json(sysParamConfigEntity));
        return this.sysParamConfigDao.selectOne(sysParamConfigEntity);
    }

    /**
     * 新增数据
     *
     * @param sysParamConfigEntity 实例对象
     * @return 实例对象
     */
    @Override
    public SysParamConfigEntity insert(SysParamConfigEntity sysParamConfigEntity) {
        logger.info("insert begin.sysParamConfigEntity:{}", JsonUtil.obj2Json(sysParamConfigEntity));
        this.sysParamConfigDao.insert(sysParamConfigEntity);
        return sysParamConfigEntity;
    }

    /**
     * 修改数据
     *
     * @param sysParamConfigEntity 实例对象
     * @return 实例对象
     */
    @Override
    public SysParamConfigEntity update(SysParamConfigEntity sysParamConfigEntity) {
        logger.info("update begin.sysParamConfigEntity:{}", JsonUtil.obj2Json(sysParamConfigEntity));
        this.sysParamConfigDao.update(sysParamConfigEntity);
        return this.queryById(sysParamConfigEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        logger.info("deleteById begin.sysParamConfigEntity:{}", id);
        return this.sysParamConfigDao.deleteById(id) > 0;
    }
}
