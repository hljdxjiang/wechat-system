package com.nuoding.wechat.common.service.wechat.impl;

import com.nuoding.wechat.common.dao.wechat.WechatMenusOptionDao;
import com.nuoding.wechat.common.entity.wechat.WechatMenusOptionEntity;
import com.nuoding.wechat.common.service.wechat.WechatMenusOptionService;
import org.springframework.stereotype.Service;
import com.nuoding.wechat.common.utils.JsonUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.List;

/**
 * (wechatMenusOption)表服务实现类
 * 微信菜单要素表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class WechatMenusOptionServiceImpl implements WechatMenusOptionService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Resource
    private WechatMenusOptionDao wechatMenusOptionDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public WechatMenusOptionEntity queryById(Integer id) {
        logger.info("queryById begin.id:{}", id);

        return this.wechatMenusOptionDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param wechatMenusOptionEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<WechatMenusOptionEntity> queryAllByLimit(WechatMenusOptionEntity wechatMenusOptionEntity) {
        logger.info("queryAllByLimit begin.wechatMenusOptionEntity:{}", JsonUtil.obj2Json(wechatMenusOptionEntity));
        return this.wechatMenusOptionDao.queryAllByLimit(wechatMenusOptionEntity);
    }

    /**
     * 模糊查询
     *
     * @param wechatMenusOptionEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<WechatMenusOptionEntity> fuzzyQuery(WechatMenusOptionEntity wechatMenusOptionEntity) {
        logger.info("queryAllByLimit begin.wechatMenusOptionEntity:{}", JsonUtil.obj2Json(wechatMenusOptionEntity));
        return this.wechatMenusOptionDao.fuzzyQuery(wechatMenusOptionEntity);
    }

    /**
     * 单挑查询
     *
     * @param wechatMenusOptionEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public WechatMenusOptionEntity selectOne(WechatMenusOptionEntity wechatMenusOptionEntity) {
        logger.info("queryAllByLimit begin.wechatMenusOptionEntity:{}", JsonUtil.obj2Json(wechatMenusOptionEntity));
        return this.wechatMenusOptionDao.selectOne(wechatMenusOptionEntity);
    }

    /**
     * 新增数据
     *
     * @param wechatMenusOptionEntity 实例对象
     * @return 实例对象
     */
    @Override
    public WechatMenusOptionEntity insert(WechatMenusOptionEntity wechatMenusOptionEntity) {
        logger.info("insert begin.wechatMenusOptionEntity:{}", JsonUtil.obj2Json(wechatMenusOptionEntity));
        this.wechatMenusOptionDao.insert(wechatMenusOptionEntity);
        return wechatMenusOptionEntity;
    }

    /**
     * 修改数据
     *
     * @param wechatMenusOptionEntity 实例对象
     * @return 实例对象
     */
    @Override
    public WechatMenusOptionEntity update(WechatMenusOptionEntity wechatMenusOptionEntity) {
        logger.info("update begin.wechatMenusOptionEntity:{}", JsonUtil.obj2Json(wechatMenusOptionEntity));
        this.wechatMenusOptionDao.update(wechatMenusOptionEntity);
        return this.queryById(wechatMenusOptionEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        logger.info("deleteById begin.wechatMenusOptionEntity:{}", id);
        return this.wechatMenusOptionDao.deleteById(id) > 0;
    }
}
