package com.nuoding.wechat.common.service.sys.impl;

import com.nuoding.wechat.common.dao.sys.SysFlowInfoDao;
import com.nuoding.wechat.common.entity.sys.SysFlowInfoEntity;
import com.nuoding.wechat.common.service.sys.SysFlowInfoService;
import com.nuoding.wechat.common.utils.JsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (sysFlowInfo)表服务实现类
 * 楼层信息表
 *
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class SysFlowInfoServiceImpl implements SysFlowInfoService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private SysFlowInfoDao sysFlowInfoDao;

    public SysFlowInfoServiceImpl(SysFlowInfoDao sysFlowInfoDao) {
        this.sysFlowInfoDao = sysFlowInfoDao;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SysFlowInfoEntity queryById(Integer id) {
        logger.info("queryById begin.id:{}", id);

        return this.sysFlowInfoDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param sysFlowInfoEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<SysFlowInfoEntity> queryAllByLimit(SysFlowInfoEntity sysFlowInfoEntity) {
        logger.info("queryAllByLimit begin.sysFlowInfoEntity:{}", JsonUtil.obj2Json(sysFlowInfoEntity));
        return this.sysFlowInfoDao.queryAllByLimit(sysFlowInfoEntity);
    }

    /**
     * 模糊查询
     *
     * @param sysFlowInfoEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<SysFlowInfoEntity> fuzzyQuery(SysFlowInfoEntity sysFlowInfoEntity) {
        logger.info("queryAllByLimit begin.sysFlowInfoEntity:{}", JsonUtil.obj2Json(sysFlowInfoEntity));
        return this.sysFlowInfoDao.fuzzyQuery(sysFlowInfoEntity);
    }

    /**
     * 单挑查询
     *
     * @param sysFlowInfoEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public SysFlowInfoEntity selectOne(SysFlowInfoEntity sysFlowInfoEntity) {
        logger.info("queryAllByLimit begin.sysFlowInfoEntity:{}", JsonUtil.obj2Json(sysFlowInfoEntity));
        return this.sysFlowInfoDao.selectOne(sysFlowInfoEntity);
    }

    /**
     * 新增数据
     *
     * @param sysFlowInfoEntity 实例对象
     * @return 实例对象
     */
    @Override
    public SysFlowInfoEntity insert(SysFlowInfoEntity sysFlowInfoEntity) {
        logger.info("insert begin.sysFlowInfoEntity:{}", JsonUtil.obj2Json(sysFlowInfoEntity));
        this.sysFlowInfoDao.insert(sysFlowInfoEntity);
        return sysFlowInfoEntity;
    }

    /**
     * 修改数据
     *
     * @param sysFlowInfoEntity 实例对象
     * @return 实例对象
     */
    @Override
    public SysFlowInfoEntity update(SysFlowInfoEntity sysFlowInfoEntity) {
        logger.info("update begin.sysFlowInfoEntity:{}", JsonUtil.obj2Json(sysFlowInfoEntity));
        this.sysFlowInfoDao.update(sysFlowInfoEntity);
        return this.queryById(sysFlowInfoEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        logger.info("deleteById begin.sysFlowInfoEntity:{}", id);
        return this.sysFlowInfoDao.deleteById(id) > 0;
    }
}
