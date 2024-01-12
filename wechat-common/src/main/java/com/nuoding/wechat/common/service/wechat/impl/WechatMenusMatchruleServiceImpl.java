package com.nuoding.wechat.common.service.wechat.impl;

import com.nuoding.wechat.common.dao.wechat.WechatMenusMatchruleDao;
import com.nuoding.wechat.common.entity.wechat.WechatMenusMatchruleEntity;
import com.nuoding.wechat.common.service.wechat.WechatMenusMatchruleService;
import org.springframework.stereotype.Service;
import com.nuoding.wechat.common.utils.JsonUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.List;

/**
 * (wechatMenusMatchrule)表服务实现类
 * 微信个性化菜单匹配表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class WechatMenusMatchruleServiceImpl implements WechatMenusMatchruleService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private WechatMenusMatchruleDao wechatMenusMatchruleDao;

    public WechatMenusMatchruleServiceImpl(WechatMenusMatchruleDao wechatMenusMatchruleDao) {
        this.wechatMenusMatchruleDao = wechatMenusMatchruleDao;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public WechatMenusMatchruleEntity queryById(Integer id) {
        logger.info("queryById begin.id:{}", id);

        return this.wechatMenusMatchruleDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param wechatMenusMatchruleEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<WechatMenusMatchruleEntity> queryAllByLimit(WechatMenusMatchruleEntity wechatMenusMatchruleEntity) {
        logger.info("queryAllByLimit begin.wechatMenusMatchruleEntity:{}", JsonUtil.obj2Json(wechatMenusMatchruleEntity));
        return this.wechatMenusMatchruleDao.queryAllByLimit(wechatMenusMatchruleEntity);
    }

    /**
     * 模糊查询
     *
     * @param wechatMenusMatchruleEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<WechatMenusMatchruleEntity> fuzzyQuery(WechatMenusMatchruleEntity wechatMenusMatchruleEntity) {
        logger.info("queryAllByLimit begin.wechatMenusMatchruleEntity:{}", JsonUtil.obj2Json(wechatMenusMatchruleEntity));
        return this.wechatMenusMatchruleDao.fuzzyQuery(wechatMenusMatchruleEntity);
    }

    /**
     * 单挑查询
     *
     * @param wechatMenusMatchruleEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public WechatMenusMatchruleEntity selectOne(WechatMenusMatchruleEntity wechatMenusMatchruleEntity) {
        logger.info("queryAllByLimit begin.wechatMenusMatchruleEntity:{}", JsonUtil.obj2Json(wechatMenusMatchruleEntity));
        return this.wechatMenusMatchruleDao.selectOne(wechatMenusMatchruleEntity);
    }

    /**
     * 新增数据
     *
     * @param wechatMenusMatchruleEntity 实例对象
     * @return 实例对象
     */
    @Override
    public WechatMenusMatchruleEntity insert(WechatMenusMatchruleEntity wechatMenusMatchruleEntity) {
        logger.info("insert begin.wechatMenusMatchruleEntity:{}", JsonUtil.obj2Json(wechatMenusMatchruleEntity));
        this.wechatMenusMatchruleDao.insert(wechatMenusMatchruleEntity);
        return wechatMenusMatchruleEntity;
    }

    /**
     * 修改数据
     *
     * @param wechatMenusMatchruleEntity 实例对象
     * @return 实例对象
     */
    @Override
    public WechatMenusMatchruleEntity update(WechatMenusMatchruleEntity wechatMenusMatchruleEntity) {
        logger.info("update begin.wechatMenusMatchruleEntity:{}", JsonUtil.obj2Json(wechatMenusMatchruleEntity));
        this.wechatMenusMatchruleDao.update(wechatMenusMatchruleEntity);
        return this.queryById(wechatMenusMatchruleEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        logger.info("deleteById begin.wechatMenusMatchruleEntity:{}", id);
        return this.wechatMenusMatchruleDao.deleteById(id) > 0;
    }
}
