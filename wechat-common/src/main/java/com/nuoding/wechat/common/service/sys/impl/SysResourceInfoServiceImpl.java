package com.nuoding.wechat.common.service.sys.impl;

import com.nuoding.wechat.common.dao.sys.SysResourceInfoDao;
import com.nuoding.wechat.common.entity.sys.SysResourceInfoEntity;
import com.nuoding.wechat.common.service.sys.SysResourceInfoService;
import org.springframework.stereotype.Service;
import com.nuoding.wechat.common.utils.JsonUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.List;

/**
 * (sysResourceInfo)表服务实现类
 * 资源信息表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class SysResourceInfoServiceImpl implements SysResourceInfoService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Resource
    private SysResourceInfoDao sysResourceInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SysResourceInfoEntity queryById(Integer id) {
        logger.info("queryById begin.id:{}", id);

        return this.sysResourceInfoDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param sysResourceInfoEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<SysResourceInfoEntity> queryAllByLimit(SysResourceInfoEntity sysResourceInfoEntity) {
        logger.info("queryAllByLimit begin.sysResourceInfoEntity:{}", JsonUtil.obj2Json(sysResourceInfoEntity));
        return this.sysResourceInfoDao.queryAllByLimit(sysResourceInfoEntity);
    }

    /**
     * 模糊查询
     *
     * @param sysResourceInfoEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<SysResourceInfoEntity> fuzzyQuery(SysResourceInfoEntity sysResourceInfoEntity) {
        logger.info("queryAllByLimit begin.sysResourceInfoEntity:{}", JsonUtil.obj2Json(sysResourceInfoEntity));
        return this.sysResourceInfoDao.fuzzyQuery(sysResourceInfoEntity);
    }

    /**
     * 单挑查询
     *
     * @param sysResourceInfoEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public SysResourceInfoEntity selectOne(SysResourceInfoEntity sysResourceInfoEntity) {
        logger.info("queryAllByLimit begin.sysResourceInfoEntity:{}", JsonUtil.obj2Json(sysResourceInfoEntity));
        return this.sysResourceInfoDao.selectOne(sysResourceInfoEntity);
    }

    /**
     * 新增数据
     *
     * @param sysResourceInfoEntity 实例对象
     * @return 实例对象
     */
    @Override
    public SysResourceInfoEntity insert(SysResourceInfoEntity sysResourceInfoEntity) {
        logger.info("insert begin.sysResourceInfoEntity:{}", JsonUtil.obj2Json(sysResourceInfoEntity));
        this.sysResourceInfoDao.insert(sysResourceInfoEntity);
        return sysResourceInfoEntity;
    }

    /**
     * 修改数据
     *
     * @param sysResourceInfoEntity 实例对象
     * @return 实例对象
     */
    @Override
    public SysResourceInfoEntity update(SysResourceInfoEntity sysResourceInfoEntity) {
        logger.info("update begin.sysResourceInfoEntity:{}", JsonUtil.obj2Json(sysResourceInfoEntity));
        this.sysResourceInfoDao.update(sysResourceInfoEntity);
        return this.queryById(sysResourceInfoEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        logger.info("deleteById begin.sysResourceInfoEntity:{}", id);
        return this.sysResourceInfoDao.deleteById(id) > 0;
    }
}
