package com.nuoding.wechat.common.service.wechat.impl;

import com.nuoding.wechat.common.dao.wechat.WechatTemplateInfoDao;
import com.nuoding.wechat.common.entity.wechat.WechatTemplateInfoEntity;
import com.nuoding.wechat.common.service.wechat.WechatTemplateInfoService;
import com.nuoding.wechat.common.utils.JsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (wechatTemplateInfo)表服务实现类
 * 微信推送模板
 *
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class WechatTemplateInfoServiceImpl implements WechatTemplateInfoService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private WechatTemplateInfoDao wechatTemplateInfoDao;

    public WechatTemplateInfoServiceImpl(WechatTemplateInfoDao wechatTemplateInfoDao) {
        this.wechatTemplateInfoDao = wechatTemplateInfoDao;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public WechatTemplateInfoEntity queryById(Integer id) {
        logger.info("queryById begin.id:{}", id);

        return this.wechatTemplateInfoDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param wechatTemplateInfoEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<WechatTemplateInfoEntity> queryAllByLimit(WechatTemplateInfoEntity wechatTemplateInfoEntity) {
        logger.info("queryAllByLimit begin.wechatTemplateInfoEntity:{}", JsonUtil.obj2Json(wechatTemplateInfoEntity));
        return this.wechatTemplateInfoDao.queryAllByLimit(wechatTemplateInfoEntity);
    }

    /**
     * 模糊查询
     *
     * @param wechatTemplateInfoEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<WechatTemplateInfoEntity> fuzzyQuery(WechatTemplateInfoEntity wechatTemplateInfoEntity) {
        logger.info("queryAllByLimit begin.wechatTemplateInfoEntity:{}", JsonUtil.obj2Json(wechatTemplateInfoEntity));
        return this.wechatTemplateInfoDao.fuzzyQuery(wechatTemplateInfoEntity);
    }

    /**
     * 单挑查询
     *
     * @param wechatTemplateInfoEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public WechatTemplateInfoEntity selectOne(WechatTemplateInfoEntity wechatTemplateInfoEntity) {
        logger.info("queryAllByLimit begin.wechatTemplateInfoEntity:{}", JsonUtil.obj2Json(wechatTemplateInfoEntity));
        return this.wechatTemplateInfoDao.selectOne(wechatTemplateInfoEntity);
    }

    /**
     * 新增数据
     *
     * @param wechatTemplateInfoEntity 实例对象
     * @return 实例对象
     */
    @Override
    public WechatTemplateInfoEntity insert(WechatTemplateInfoEntity wechatTemplateInfoEntity) {
        logger.info("insert begin.wechatTemplateInfoEntity:{}", JsonUtil.obj2Json(wechatTemplateInfoEntity));
        this.wechatTemplateInfoDao.insert(wechatTemplateInfoEntity);
        return wechatTemplateInfoEntity;
    }

    /**
     * 修改数据
     *
     * @param wechatTemplateInfoEntity 实例对象
     * @return 实例对象
     */
    @Override
    public WechatTemplateInfoEntity update(WechatTemplateInfoEntity wechatTemplateInfoEntity) {
        logger.info("update begin.wechatTemplateInfoEntity:{}", JsonUtil.obj2Json(wechatTemplateInfoEntity));
        this.wechatTemplateInfoDao.update(wechatTemplateInfoEntity);
        return this.queryById(wechatTemplateInfoEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        logger.info("deleteById begin.wechatTemplateInfoEntity:{}", id);
        return this.wechatTemplateInfoDao.deleteById(id) > 0;
    }
}
