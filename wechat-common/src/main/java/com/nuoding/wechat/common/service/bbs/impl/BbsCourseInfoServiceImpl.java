package com.nuoding.wechat.common.service.bbs.impl;

import com.nuoding.wechat.common.dao.bbs.BbsCourseInfoDao;
import com.nuoding.wechat.common.entity.bbs.BbsCourseInfoEntity;
import com.nuoding.wechat.common.service.bbs.BbsCourseInfoService;
import com.nuoding.wechat.common.utils.JsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (bbsCourseInfo)表服务实现类
 * 课程信息表
 *
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class BbsCourseInfoServiceImpl implements BbsCourseInfoService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private BbsCourseInfoDao bbsCourseInfoDao;

    public BbsCourseInfoServiceImpl(BbsCourseInfoDao bbsCourseInfoDao) {
        this.bbsCourseInfoDao = bbsCourseInfoDao;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BbsCourseInfoEntity queryById(Integer id) {
        logger.info("queryById begin.id:{}", id);

        return this.bbsCourseInfoDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param bbsCourseInfoEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<BbsCourseInfoEntity> queryAllByLimit(BbsCourseInfoEntity bbsCourseInfoEntity) {
        logger.info("queryAllByLimit begin.bbsCourseInfoEntity:{}", JsonUtil.obj2Json(bbsCourseInfoEntity));
        return this.bbsCourseInfoDao.queryAllByLimit(bbsCourseInfoEntity);
    }

    /**
     * 模糊查询
     *
     * @param bbsCourseInfoEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<BbsCourseInfoEntity> fuzzyQuery(BbsCourseInfoEntity bbsCourseInfoEntity) {
        logger.info("queryAllByLimit begin.bbsCourseInfoEntity:{}", JsonUtil.obj2Json(bbsCourseInfoEntity));
        return this.bbsCourseInfoDao.fuzzyQuery(bbsCourseInfoEntity);
    }

    /**
     * 单挑查询
     *
     * @param bbsCourseInfoEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public BbsCourseInfoEntity selectOne(BbsCourseInfoEntity bbsCourseInfoEntity) {
        logger.info("queryAllByLimit begin.bbsCourseInfoEntity:{}", JsonUtil.obj2Json(bbsCourseInfoEntity));
        return this.bbsCourseInfoDao.selectOne(bbsCourseInfoEntity);
    }

    /**
     * 新增数据
     *
     * @param bbsCourseInfoEntity 实例对象
     * @return 实例对象
     */
    @Override
    public BbsCourseInfoEntity insert(BbsCourseInfoEntity bbsCourseInfoEntity) {
        logger.info("insert begin.bbsCourseInfoEntity:{}", JsonUtil.obj2Json(bbsCourseInfoEntity));
        this.bbsCourseInfoDao.insert(bbsCourseInfoEntity);
        return bbsCourseInfoEntity;
    }

    /**
     * 修改数据
     *
     * @param bbsCourseInfoEntity 实例对象
     * @return 实例对象
     */
    @Override
    public BbsCourseInfoEntity update(BbsCourseInfoEntity bbsCourseInfoEntity) {
        logger.info("update begin.bbsCourseInfoEntity:{}", JsonUtil.obj2Json(bbsCourseInfoEntity));
        this.bbsCourseInfoDao.update(bbsCourseInfoEntity);
        return this.queryById(bbsCourseInfoEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        logger.info("deleteById begin.bbsCourseInfoEntity:{}", id);
        return this.bbsCourseInfoDao.deleteById(id) > 0;
    }
}
