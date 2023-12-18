package com.nuoding.wechat.common.service.sys.impl;

import com.nuoding.wechat.common.dao.sys.SysTokenConfigDao;
import com.nuoding.wechat.common.entity.sys.SysTokenConfigEntity;
import com.nuoding.wechat.common.service.sys.SysTokenConfigService;
import org.springframework.stereotype.Service;
import com.nuoding.wechat.common.utils.JsonUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.List;

/**
 * (sysTokenConfig)表服务实现类
 * token信息表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class SysTokenConfigServiceImpl implements SysTokenConfigService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Resource
    private SysTokenConfigDao sysTokenConfigDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SysTokenConfigEntity queryById(Integer id) {
        logger.info("queryById begin.id:{}", id);

        return this.sysTokenConfigDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param sysTokenConfigEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<SysTokenConfigEntity> queryAllByLimit(SysTokenConfigEntity sysTokenConfigEntity) {
        logger.info("queryAllByLimit begin.sysTokenConfigEntity:{}", JsonUtil.obj2Json(sysTokenConfigEntity));
        return this.sysTokenConfigDao.queryAllByLimit(sysTokenConfigEntity);
    }

    /**
     * 模糊查询
     *
     * @param sysTokenConfigEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<SysTokenConfigEntity> fuzzyQuery(SysTokenConfigEntity sysTokenConfigEntity) {
        logger.info("queryAllByLimit begin.sysTokenConfigEntity:{}", JsonUtil.obj2Json(sysTokenConfigEntity));
        return this.sysTokenConfigDao.fuzzyQuery(sysTokenConfigEntity);
    }

    /**
     * 单挑查询
     *
     * @param sysTokenConfigEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public SysTokenConfigEntity selectOne(SysTokenConfigEntity sysTokenConfigEntity) {
        logger.info("queryAllByLimit begin.sysTokenConfigEntity:{}", JsonUtil.obj2Json(sysTokenConfigEntity));
        return this.sysTokenConfigDao.selectOne(sysTokenConfigEntity);
    }

    /**
     * 新增数据
     *
     * @param sysTokenConfigEntity 实例对象
     * @return 实例对象
     */
    @Override
    public SysTokenConfigEntity insert(SysTokenConfigEntity sysTokenConfigEntity) {
        logger.info("insert begin.sysTokenConfigEntity:{}", JsonUtil.obj2Json(sysTokenConfigEntity));
        this.sysTokenConfigDao.insert(sysTokenConfigEntity);
        return sysTokenConfigEntity;
    }

    /**
     * 修改数据
     *
     * @param sysTokenConfigEntity 实例对象
     * @return 实例对象
     */
    @Override
    public SysTokenConfigEntity update(SysTokenConfigEntity sysTokenConfigEntity) {
        logger.info("update begin.sysTokenConfigEntity:{}", JsonUtil.obj2Json(sysTokenConfigEntity));
        this.sysTokenConfigDao.update(sysTokenConfigEntity);
        return this.queryById(sysTokenConfigEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        logger.info("deleteById begin.sysTokenConfigEntity:{}", id);
        return this.sysTokenConfigDao.deleteById(id) > 0;
    }
}
