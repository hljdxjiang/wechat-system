package com.nuoding.wechat.common.service.back.impl;

import com.nuoding.wechat.common.dao.back.BackSysRevokesDao;
import com.nuoding.wechat.common.entity.back.BackSysRevokesEntity;
import com.nuoding.wechat.common.service.back.BackSysRevokesService;
import org.springframework.stereotype.Service;
import com.nuoding.wechat.common.utils.JsonUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.List;

/**
 * (backSysRevokes)表服务实现类
 * 系统权限表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class BackSysRevokesServiceImpl implements BackSysRevokesService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Resource
    private BackSysRevokesDao backSysRevokesDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BackSysRevokesEntity queryById(Integer id) {
        return this.backSysRevokesDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param backSysRevokesEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<BackSysRevokesEntity> queryAllByLimit(BackSysRevokesEntity backSysRevokesEntity) {
        logger.info("queryAllByLimit begin.backSysRevokesEntity:{}", JsonUtil.obj2Json(backSysRevokesEntity));
        return this.backSysRevokesDao.queryAllByLimit(backSysRevokesEntity);
    }

    /**
     * 新增数据
     *
     * @param backSysRevokesEntity 实例对象
     * @return 实例对象
     */
    @Override
    public BackSysRevokesEntity insert(BackSysRevokesEntity backSysRevokesEntity) {
        logger.info("insert begin.backSysRevokesEntity:{}", JsonUtil.obj2Json(backSysRevokesEntity));
        this.backSysRevokesDao.insert(backSysRevokesEntity);
        return backSysRevokesEntity;
    }

    /**
     * 修改数据
     *
     * @param backSysRevokesEntity 实例对象
     * @return 实例对象
     */
    @Override
    public BackSysRevokesEntity update(BackSysRevokesEntity backSysRevokesEntity) {
        logger.info("update begin.backSysRevokesEntity:{}", JsonUtil.obj2Json(backSysRevokesEntity));
        this.backSysRevokesDao.update(backSysRevokesEntity);
        return this.queryById(backSysRevokesEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        logger.info("deleteById begin.backSysRevokesEntity:{}", id);
        return this.backSysRevokesDao.deleteById(id) > 0;
    }
}
