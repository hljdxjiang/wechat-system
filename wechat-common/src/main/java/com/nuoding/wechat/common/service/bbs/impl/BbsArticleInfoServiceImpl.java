package com.nuoding.wechat.common.service.bbs.impl;

import com.nuoding.wechat.common.dao.bbs.BbsArticleInfoDao;
import com.nuoding.wechat.common.entity.bbs.BbsArticleInfoEntity;
import com.nuoding.wechat.common.service.bbs.BbsArticleInfoService;
import org.springframework.stereotype.Service;
import com.nuoding.wechat.common.utils.JsonUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.List;

/**
 * (bbsArticleInfo)表服务实现类
 * 文章记录表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class BbsArticleInfoServiceImpl implements BbsArticleInfoService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Resource
    private BbsArticleInfoDao bbsArticleInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BbsArticleInfoEntity queryById(Integer id) {
        logger.info("queryById begin.id:{}", id);

        return this.bbsArticleInfoDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param bbsArticleInfoEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<BbsArticleInfoEntity> queryAllByLimit(BbsArticleInfoEntity bbsArticleInfoEntity) {
        logger.info("queryAllByLimit begin.bbsArticleInfoEntity:{}", JsonUtil.obj2Json(bbsArticleInfoEntity));
        return this.bbsArticleInfoDao.queryAllByLimit(bbsArticleInfoEntity);
    }

    /**
     * 模糊查询
     *
     * @param bbsArticleInfoEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<BbsArticleInfoEntity> fuzzyQuery(BbsArticleInfoEntity bbsArticleInfoEntity) {
        logger.info("queryAllByLimit begin.bbsArticleInfoEntity:{}", JsonUtil.obj2Json(bbsArticleInfoEntity));
        return this.bbsArticleInfoDao.fuzzyQuery(bbsArticleInfoEntity);
    }

    /**
     * 单挑查询
     *
     * @param bbsArticleInfoEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public BbsArticleInfoEntity selectOne(BbsArticleInfoEntity bbsArticleInfoEntity) {
        logger.info("queryAllByLimit begin.bbsArticleInfoEntity:{}", JsonUtil.obj2Json(bbsArticleInfoEntity));
        return this.bbsArticleInfoDao.selectOne(bbsArticleInfoEntity);
    }

    /**
     * 新增数据
     *
     * @param bbsArticleInfoEntity 实例对象
     * @return 实例对象
     */
    @Override
    public BbsArticleInfoEntity insert(BbsArticleInfoEntity bbsArticleInfoEntity) {
        logger.info("insert begin.bbsArticleInfoEntity:{}", JsonUtil.obj2Json(bbsArticleInfoEntity));
        this.bbsArticleInfoDao.insert(bbsArticleInfoEntity);
        return bbsArticleInfoEntity;
    }

    /**
     * 修改数据
     *
     * @param bbsArticleInfoEntity 实例对象
     * @return 实例对象
     */
    @Override
    public BbsArticleInfoEntity update(BbsArticleInfoEntity bbsArticleInfoEntity) {
        logger.info("update begin.bbsArticleInfoEntity:{}", JsonUtil.obj2Json(bbsArticleInfoEntity));
        this.bbsArticleInfoDao.update(bbsArticleInfoEntity);
        return this.queryById(bbsArticleInfoEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        logger.info("deleteById begin.bbsArticleInfoEntity:{}", id);
        return this.bbsArticleInfoDao.deleteById(id) > 0;
    }
}
