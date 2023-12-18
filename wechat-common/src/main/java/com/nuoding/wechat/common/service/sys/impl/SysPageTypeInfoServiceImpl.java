package com.nuoding.wechat.common.service.sys.impl;

import com.nuoding.wechat.common.dao.sys.SysPageTypeInfoDao;
import com.nuoding.wechat.common.entity.sys.SysPageTypeInfoEntity;
import com.nuoding.wechat.common.service.sys.SysPageTypeInfoService;
import org.springframework.stereotype.Service;
import com.nuoding.wechat.common.utils.JsonUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.List;

/**
 * (sysPageTypeInfo)表服务实现类
 * 类型配置表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class SysPageTypeInfoServiceImpl implements SysPageTypeInfoService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Resource
    private SysPageTypeInfoDao sysPageTypeInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SysPageTypeInfoEntity queryById(Integer id) {
        logger.info("queryById begin.id:{}", id);

        return this.sysPageTypeInfoDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param sysPageTypeInfoEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<SysPageTypeInfoEntity> queryAllByLimit(SysPageTypeInfoEntity sysPageTypeInfoEntity) {
        logger.info("queryAllByLimit begin.sysPageTypeInfoEntity:{}", JsonUtil.obj2Json(sysPageTypeInfoEntity));
        return this.sysPageTypeInfoDao.queryAllByLimit(sysPageTypeInfoEntity);
    }

    /**
     * 模糊查询
     *
     * @param sysPageTypeInfoEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<SysPageTypeInfoEntity> fuzzyQuery(SysPageTypeInfoEntity sysPageTypeInfoEntity) {
        logger.info("queryAllByLimit begin.sysPageTypeInfoEntity:{}", JsonUtil.obj2Json(sysPageTypeInfoEntity));
        return this.sysPageTypeInfoDao.fuzzyQuery(sysPageTypeInfoEntity);
    }

    /**
     * 单挑查询
     *
     * @param sysPageTypeInfoEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public SysPageTypeInfoEntity selectOne(SysPageTypeInfoEntity sysPageTypeInfoEntity) {
        logger.info("queryAllByLimit begin.sysPageTypeInfoEntity:{}", JsonUtil.obj2Json(sysPageTypeInfoEntity));
        return this.sysPageTypeInfoDao.selectOne(sysPageTypeInfoEntity);
    }

    /**
     * 新增数据
     *
     * @param sysPageTypeInfoEntity 实例对象
     * @return 实例对象
     */
    @Override
    public SysPageTypeInfoEntity insert(SysPageTypeInfoEntity sysPageTypeInfoEntity) {
        logger.info("insert begin.sysPageTypeInfoEntity:{}", JsonUtil.obj2Json(sysPageTypeInfoEntity));
        this.sysPageTypeInfoDao.insert(sysPageTypeInfoEntity);
        return sysPageTypeInfoEntity;
    }

    /**
     * 修改数据
     *
     * @param sysPageTypeInfoEntity 实例对象
     * @return 实例对象
     */
    @Override
    public SysPageTypeInfoEntity update(SysPageTypeInfoEntity sysPageTypeInfoEntity) {
        logger.info("update begin.sysPageTypeInfoEntity:{}", JsonUtil.obj2Json(sysPageTypeInfoEntity));
        this.sysPageTypeInfoDao.update(sysPageTypeInfoEntity);
        return this.queryById(sysPageTypeInfoEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        logger.info("deleteById begin.sysPageTypeInfoEntity:{}", id);
        return this.sysPageTypeInfoDao.deleteById(id) > 0;
    }
}
