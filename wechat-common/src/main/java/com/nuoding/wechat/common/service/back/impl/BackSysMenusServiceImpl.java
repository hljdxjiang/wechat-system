package com.nuoding.wechat.common.service.back.impl;

import com.nuoding.wechat.common.dao.back.BackSysMenusDao;
import com.nuoding.wechat.common.entity.back.BackSysMenusEntity;
import com.nuoding.wechat.common.service.back.BackSysMenusService;
import org.springframework.stereotype.Service;
import com.nuoding.wechat.common.utils.JsonUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.List;

/**
 * (backSysMenus)表服务实现类
 * 系统菜单表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class BackSysMenusServiceImpl implements BackSysMenusService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Resource
    private BackSysMenusDao backSysMenusDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BackSysMenusEntity queryById(Integer id) {
        return this.backSysMenusDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param backSysMenusEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<BackSysMenusEntity> queryAllByLimit(BackSysMenusEntity backSysMenusEntity) {
        logger.info("queryAllByLimit begin.backSysMenusEntity:{}", JsonUtil.obj2Json(backSysMenusEntity));
        return this.backSysMenusDao.queryAllByLimit(backSysMenusEntity);
    }

    /**
     * 新增数据
     *
     * @param backSysMenusEntity 实例对象
     * @return 实例对象
     */
    @Override
    public BackSysMenusEntity insert(BackSysMenusEntity backSysMenusEntity) {
        logger.info("insert begin.backSysMenusEntity:{}", JsonUtil.obj2Json(backSysMenusEntity));
        this.backSysMenusDao.insert(backSysMenusEntity);
        return backSysMenusEntity;
    }

    /**
     * 修改数据
     *
     * @param backSysMenusEntity 实例对象
     * @return 实例对象
     */
    @Override
    public BackSysMenusEntity update(BackSysMenusEntity backSysMenusEntity) {
        logger.info("update begin.backSysMenusEntity:{}", JsonUtil.obj2Json(backSysMenusEntity));
        this.backSysMenusDao.update(backSysMenusEntity);
        return this.queryById(backSysMenusEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        logger.info("deleteById begin.backSysMenusEntity:{}", id);
        return this.backSysMenusDao.deleteById(id) > 0;
    }
}
