package com.nuoding.wechat.common.service.wechat.impl;

import com.nuoding.wechat.common.dao.wechat.WechatMenusDao;
import com.nuoding.wechat.common.entity.wechat.WechatMenusEntity;
import com.nuoding.wechat.common.service.wechat.WechatMenusService;
import org.springframework.stereotype.Service;
import com.nuoding.wechat.common.utils.JsonUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.List;

/**
 * (wechatMenus)表服务实现类
 * 微信菜单表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class WechatMenusServiceImpl implements WechatMenusService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Resource
    private WechatMenusDao wechatMenusDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public WechatMenusEntity queryById(Integer id) {
        logger.info("queryById begin.id:{}", id);

        return this.wechatMenusDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param wechatMenusEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<WechatMenusEntity> queryAllByLimit(WechatMenusEntity wechatMenusEntity) {
        logger.info("queryAllByLimit begin.wechatMenusEntity:{}", JsonUtil.obj2Json(wechatMenusEntity));
        return this.wechatMenusDao.queryAllByLimit(wechatMenusEntity);
    }

    /**
     * 模糊查询
     *
     * @param wechatMenusEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<WechatMenusEntity> fuzzyQuery(WechatMenusEntity wechatMenusEntity) {
        logger.info("queryAllByLimit begin.wechatMenusEntity:{}", JsonUtil.obj2Json(wechatMenusEntity));
        return this.wechatMenusDao.fuzzyQuery(wechatMenusEntity);
    }

    /**
     * 单挑查询
     *
     * @param wechatMenusEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public WechatMenusEntity selectOne(WechatMenusEntity wechatMenusEntity) {
        logger.info("queryAllByLimit begin.wechatMenusEntity:{}", JsonUtil.obj2Json(wechatMenusEntity));
        return this.wechatMenusDao.selectOne(wechatMenusEntity);
    }

    /**
     * 新增数据
     *
     * @param wechatMenusEntity 实例对象
     * @return 实例对象
     */
    @Override
    public WechatMenusEntity insert(WechatMenusEntity wechatMenusEntity) {
        logger.info("insert begin.wechatMenusEntity:{}", JsonUtil.obj2Json(wechatMenusEntity));
        this.wechatMenusDao.insert(wechatMenusEntity);
        return wechatMenusEntity;
    }

    /**
     * 修改数据
     *
     * @param wechatMenusEntity 实例对象
     * @return 实例对象
     */
    @Override
    public WechatMenusEntity update(WechatMenusEntity wechatMenusEntity) {
        logger.info("update begin.wechatMenusEntity:{}", JsonUtil.obj2Json(wechatMenusEntity));
        this.wechatMenusDao.update(wechatMenusEntity);
        return this.queryById(wechatMenusEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        logger.info("deleteById begin.wechatMenusEntity:{}", id);
        return this.wechatMenusDao.deleteById(id) > 0;
    }
}
