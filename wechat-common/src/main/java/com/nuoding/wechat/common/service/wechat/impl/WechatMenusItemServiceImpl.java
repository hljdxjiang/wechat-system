package com.nuoding.wechat.common.service.wechat.impl;

import com.nuoding.wechat.common.dao.wechat.WechatMenusItemDao;
import com.nuoding.wechat.common.entity.wechat.WechatMenusItemEntity;
import com.nuoding.wechat.common.service.wechat.WechatMenusItemService;
import org.springframework.stereotype.Service;
import com.nuoding.wechat.common.utils.JsonUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.List;

/**
 * (wechatMenusItem)表服务实现类
 * 微信菜单要素表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class WechatMenusItemServiceImpl implements WechatMenusItemService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private WechatMenusItemDao wechatMenusItemDao;

    public WechatMenusItemServiceImpl(WechatMenusItemDao wechatMenusItemDao) {
        this.wechatMenusItemDao = wechatMenusItemDao;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public WechatMenusItemEntity queryById(Integer id) {
        logger.info("queryById begin.id:{}", id);

        return this.wechatMenusItemDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param wechatMenusItemEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<WechatMenusItemEntity> queryAllByLimit(WechatMenusItemEntity wechatMenusItemEntity) {
        logger.info("queryAllByLimit begin.wechatMenusItemEntity:{}", JsonUtil.obj2Json(wechatMenusItemEntity));
        return this.wechatMenusItemDao.queryAllByLimit(wechatMenusItemEntity);
    }

    /**
     * 模糊查询
     *
     * @param wechatMenusItemEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<WechatMenusItemEntity> fuzzyQuery(WechatMenusItemEntity wechatMenusItemEntity) {
        logger.info("queryAllByLimit begin.wechatMenusItemEntity:{}", JsonUtil.obj2Json(wechatMenusItemEntity));
        return this.wechatMenusItemDao.fuzzyQuery(wechatMenusItemEntity);
    }

    /**
     * 单挑查询
     *
     * @param wechatMenusItemEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public WechatMenusItemEntity selectOne(WechatMenusItemEntity wechatMenusItemEntity) {
        logger.info("queryAllByLimit begin.wechatMenusItemEntity:{}", JsonUtil.obj2Json(wechatMenusItemEntity));
        return this.wechatMenusItemDao.selectOne(wechatMenusItemEntity);
    }

    /**
     * 新增数据
     *
     * @param wechatMenusItemEntity 实例对象
     * @return 实例对象
     */
    @Override
    public WechatMenusItemEntity insert(WechatMenusItemEntity wechatMenusItemEntity) {
        logger.info("insert begin.wechatMenusItemEntity:{}", JsonUtil.obj2Json(wechatMenusItemEntity));
        this.wechatMenusItemDao.insert(wechatMenusItemEntity);
        return wechatMenusItemEntity;
    }

    /**
     * 修改数据
     *
     * @param wechatMenusItemEntity 实例对象
     * @return 实例对象
     */
    @Override
    public WechatMenusItemEntity update(WechatMenusItemEntity wechatMenusItemEntity) {
        logger.info("update begin.wechatMenusItemEntity:{}", JsonUtil.obj2Json(wechatMenusItemEntity));
        this.wechatMenusItemDao.update(wechatMenusItemEntity);
        return this.queryById(wechatMenusItemEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        logger.info("deleteById begin.wechatMenusItemEntity:{}", id);
        return this.wechatMenusItemDao.deleteById(id) > 0;
    }
}
