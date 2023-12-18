package com.nuoding.wechat.common.service.bbs.impl;

import com.nuoding.wechat.common.dao.bbs.BbsCourseDetailDao;
import com.nuoding.wechat.common.entity.bbs.BbsCourseDetailEntity;
import com.nuoding.wechat.common.service.bbs.BbsCourseDetailService;
import org.springframework.stereotype.Service;
import com.nuoding.wechat.common.utils.JsonUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.List;

/**
 * (bbsCourseDetail)表服务实现类
 * 课程详情表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class BbsCourseDetailServiceImpl implements BbsCourseDetailService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Resource
    private BbsCourseDetailDao bbsCourseDetailDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BbsCourseDetailEntity queryById(Integer id) {
        logger.info("queryById begin.id:{}", id);

        return this.bbsCourseDetailDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param bbsCourseDetailEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<BbsCourseDetailEntity> queryAllByLimit(BbsCourseDetailEntity bbsCourseDetailEntity) {
        logger.info("queryAllByLimit begin.bbsCourseDetailEntity:{}", JsonUtil.obj2Json(bbsCourseDetailEntity));
        return this.bbsCourseDetailDao.queryAllByLimit(bbsCourseDetailEntity);
    }

    /**
     * 模糊查询
     *
     * @param bbsCourseDetailEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<BbsCourseDetailEntity> fuzzyQuery(BbsCourseDetailEntity bbsCourseDetailEntity) {
        logger.info("queryAllByLimit begin.bbsCourseDetailEntity:{}", JsonUtil.obj2Json(bbsCourseDetailEntity));
        return this.bbsCourseDetailDao.fuzzyQuery(bbsCourseDetailEntity);
    }

    /**
     * 单挑查询
     *
     * @param bbsCourseDetailEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public BbsCourseDetailEntity selectOne(BbsCourseDetailEntity bbsCourseDetailEntity) {
        logger.info("queryAllByLimit begin.bbsCourseDetailEntity:{}", JsonUtil.obj2Json(bbsCourseDetailEntity));
        return this.bbsCourseDetailDao.selectOne(bbsCourseDetailEntity);
    }

    /**
     * 新增数据
     *
     * @param bbsCourseDetailEntity 实例对象
     * @return 实例对象
     */
    @Override
    public BbsCourseDetailEntity insert(BbsCourseDetailEntity bbsCourseDetailEntity) {
        logger.info("insert begin.bbsCourseDetailEntity:{}", JsonUtil.obj2Json(bbsCourseDetailEntity));
        this.bbsCourseDetailDao.insert(bbsCourseDetailEntity);
        return bbsCourseDetailEntity;
    }

    /**
     * 修改数据
     *
     * @param bbsCourseDetailEntity 实例对象
     * @return 实例对象
     */
    @Override
    public BbsCourseDetailEntity update(BbsCourseDetailEntity bbsCourseDetailEntity) {
        logger.info("update begin.bbsCourseDetailEntity:{}", JsonUtil.obj2Json(bbsCourseDetailEntity));
        this.bbsCourseDetailDao.update(bbsCourseDetailEntity);
        return this.queryById(bbsCourseDetailEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        logger.info("deleteById begin.bbsCourseDetailEntity:{}", id);
        return this.bbsCourseDetailDao.deleteById(id) > 0;
    }
}
