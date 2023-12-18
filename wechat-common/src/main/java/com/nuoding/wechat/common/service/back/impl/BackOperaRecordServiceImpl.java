package com.nuoding.wechat.common.service.back.impl;

import com.nuoding.wechat.common.dao.back.BackOperaRecordDao;
import com.nuoding.wechat.common.entity.back.BackOperaRecordEntity;
import com.nuoding.wechat.common.service.back.BackOperaRecordService;
import org.springframework.stereotype.Service;
import com.nuoding.wechat.common.utils.JsonUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.List;

/**
 * (backOperaRecord)表服务实现类
 * 后管操作记录表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class BackOperaRecordServiceImpl implements BackOperaRecordService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Resource
    private BackOperaRecordDao backOperaRecordDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BackOperaRecordEntity queryById(Integer id) {
        logger.info("queryById begin.id:{}", id);

        return this.backOperaRecordDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param backOperaRecordEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<BackOperaRecordEntity> queryAllByLimit(BackOperaRecordEntity backOperaRecordEntity) {
        logger.info("queryAllByLimit begin.backOperaRecordEntity:{}", JsonUtil.obj2Json(backOperaRecordEntity));
        return this.backOperaRecordDao.queryAllByLimit(backOperaRecordEntity);
    }

    /**
     * 模糊查询
     *
     * @param backOperaRecordEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<BackOperaRecordEntity> fuzzyQuery(BackOperaRecordEntity backOperaRecordEntity) {
        logger.info("queryAllByLimit begin.backOperaRecordEntity:{}", JsonUtil.obj2Json(backOperaRecordEntity));
        return this.backOperaRecordDao.fuzzyQuery(backOperaRecordEntity);
    }

    /**
     * 单挑查询
     *
     * @param backOperaRecordEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public BackOperaRecordEntity selectOne(BackOperaRecordEntity backOperaRecordEntity) {
        logger.info("queryAllByLimit begin.backOperaRecordEntity:{}", JsonUtil.obj2Json(backOperaRecordEntity));
        return this.backOperaRecordDao.selectOne(backOperaRecordEntity);
    }

    /**
     * 新增数据
     *
     * @param backOperaRecordEntity 实例对象
     * @return 实例对象
     */
    @Override
    public BackOperaRecordEntity insert(BackOperaRecordEntity backOperaRecordEntity) {
        logger.info("insert begin.backOperaRecordEntity:{}", JsonUtil.obj2Json(backOperaRecordEntity));
        this.backOperaRecordDao.insert(backOperaRecordEntity);
        return backOperaRecordEntity;
    }

    /**
     * 修改数据
     *
     * @param backOperaRecordEntity 实例对象
     * @return 实例对象
     */
    @Override
    public BackOperaRecordEntity update(BackOperaRecordEntity backOperaRecordEntity) {
        logger.info("update begin.backOperaRecordEntity:{}", JsonUtil.obj2Json(backOperaRecordEntity));
        this.backOperaRecordDao.update(backOperaRecordEntity);
        return this.queryById(backOperaRecordEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        logger.info("deleteById begin.backOperaRecordEntity:{}", id);
        return this.backOperaRecordDao.deleteById(id) > 0;
    }
}
