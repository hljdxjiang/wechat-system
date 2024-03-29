package com.nuoding.wechat.common.service.back.impl;

import com.nuoding.wechat.common.dao.back.BackRuleControlDao;
import com.nuoding.wechat.common.entity.back.BackRuleControlEntity;
import com.nuoding.wechat.common.service.back.BackRuleControlService;
import com.nuoding.wechat.common.utils.JsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (backRuleControl)表服务实现类
 * 开关控制表
 *
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class BackRuleControlServiceImpl implements BackRuleControlService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private BackRuleControlDao backRuleControlDao;

    public BackRuleControlServiceImpl(BackRuleControlDao backRuleControlDao) {
        this.backRuleControlDao = backRuleControlDao;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BackRuleControlEntity queryById(Integer id) {
        logger.info("queryById begin.id:{}", id);

        return this.backRuleControlDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param backRuleControlEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<BackRuleControlEntity> queryAllByLimit(BackRuleControlEntity backRuleControlEntity) {
        logger.info("queryAllByLimit begin.backRuleControlEntity:{}", JsonUtil.obj2Json(backRuleControlEntity));
        return this.backRuleControlDao.queryAllByLimit(backRuleControlEntity);
    }

    /**
     * 模糊查询
     *
     * @param backRuleControlEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<BackRuleControlEntity> fuzzyQuery(BackRuleControlEntity backRuleControlEntity) {
        logger.info("queryAllByLimit begin.backRuleControlEntity:{}", JsonUtil.obj2Json(backRuleControlEntity));
        return this.backRuleControlDao.fuzzyQuery(backRuleControlEntity);
    }

    /**
     * 单挑查询
     *
     * @param backRuleControlEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public BackRuleControlEntity selectOne(BackRuleControlEntity backRuleControlEntity) {
        logger.info("queryAllByLimit begin.backRuleControlEntity:{}", JsonUtil.obj2Json(backRuleControlEntity));
        return this.backRuleControlDao.selectOne(backRuleControlEntity);
    }

    /**
     * 新增数据
     *
     * @param backRuleControlEntity 实例对象
     * @return 实例对象
     */
    @Override
    public BackRuleControlEntity insert(BackRuleControlEntity backRuleControlEntity) {
        logger.info("insert begin.backRuleControlEntity:{}", JsonUtil.obj2Json(backRuleControlEntity));
        this.backRuleControlDao.insert(backRuleControlEntity);
        return backRuleControlEntity;
    }

    /**
     * 修改数据
     *
     * @param backRuleControlEntity 实例对象
     * @return 实例对象
     */
    @Override
    public BackRuleControlEntity update(BackRuleControlEntity backRuleControlEntity) {
        logger.info("update begin.backRuleControlEntity:{}", JsonUtil.obj2Json(backRuleControlEntity));
        this.backRuleControlDao.update(backRuleControlEntity);
        return this.queryById(backRuleControlEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        logger.info("deleteById begin.backRuleControlEntity:{}", id);
        return this.backRuleControlDao.deleteById(id) > 0;
    }
}
