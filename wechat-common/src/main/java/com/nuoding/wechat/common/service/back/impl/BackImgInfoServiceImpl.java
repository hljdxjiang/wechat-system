package com.nuoding.wechat.common.service.back.impl;

import com.nuoding.wechat.common.dao.back.BackImgInfoDao;
import com.nuoding.wechat.common.entity.back.BackImgInfoEntity;
import com.nuoding.wechat.common.service.back.BackImgInfoService;
import com.nuoding.wechat.common.utils.JsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (backImgInfo)表服务实现类
 * 系统图片配置表
 *
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class BackImgInfoServiceImpl implements BackImgInfoService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private BackImgInfoDao backImgInfoDao;

    public BackImgInfoServiceImpl(BackImgInfoDao backImgInfoDao) {
        this.backImgInfoDao = backImgInfoDao;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BackImgInfoEntity queryById(Integer id) {
        logger.info("queryById begin.id:{}", id);

        return this.backImgInfoDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param backImgInfoEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<BackImgInfoEntity> queryAllByLimit(BackImgInfoEntity backImgInfoEntity) {
        logger.info("queryAllByLimit begin.backImgInfoEntity:{}", JsonUtil.obj2Json(backImgInfoEntity));
        return this.backImgInfoDao.queryAllByLimit(backImgInfoEntity);
    }

    /**
     * 模糊查询
     *
     * @param backImgInfoEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<BackImgInfoEntity> fuzzyQuery(BackImgInfoEntity backImgInfoEntity) {
        logger.info("queryAllByLimit begin.backImgInfoEntity:{}", JsonUtil.obj2Json(backImgInfoEntity));
        return this.backImgInfoDao.fuzzyQuery(backImgInfoEntity);
    }

    /**
     * 单挑查询
     *
     * @param backImgInfoEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public BackImgInfoEntity selectOne(BackImgInfoEntity backImgInfoEntity) {
        logger.info("queryAllByLimit begin.backImgInfoEntity:{}", JsonUtil.obj2Json(backImgInfoEntity));
        return this.backImgInfoDao.selectOne(backImgInfoEntity);
    }

    /**
     * 新增数据
     *
     * @param backImgInfoEntity 实例对象
     * @return 实例对象
     */
    @Override
    public BackImgInfoEntity insert(BackImgInfoEntity backImgInfoEntity) {
        logger.info("insert begin.backImgInfoEntity:{}", JsonUtil.obj2Json(backImgInfoEntity));
        this.backImgInfoDao.insert(backImgInfoEntity);
        return backImgInfoEntity;
    }

    /**
     * 修改数据
     *
     * @param backImgInfoEntity 实例对象
     * @return 实例对象
     */
    @Override
    public BackImgInfoEntity update(BackImgInfoEntity backImgInfoEntity) {
        logger.info("update begin.backImgInfoEntity:{}", JsonUtil.obj2Json(backImgInfoEntity));
        this.backImgInfoDao.update(backImgInfoEntity);
        return this.queryById(backImgInfoEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        logger.info("deleteById begin.backImgInfoEntity:{}", id);
        return this.backImgInfoDao.deleteById(id) > 0;
    }
}
