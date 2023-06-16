package com.nuoding.wechat.common.service.wechat.impl;

import com.nuoding.wechat.common.dao.wechat.WechatTemplateInfoDao;
import com.nuoding.wechat.common.entity.wechat.WechatTemplateInfoEntity;
import com.nuoding.wechat.common.service.wechat.WechatTemplateInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (wechatTemplateInfo)表服务实现类
 * 微信推送模板
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class WechatTemplateInfoServiceImpl implements WechatTemplateInfoService {
    @Resource
    private WechatTemplateInfoDao wechatTemplateInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public WechatTemplateInfoEntity queryById(Integer id) {
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
        return this.wechatTemplateInfoDao.queryAllByLimit(wechatTemplateInfoEntity);
    }

    /**
     * 新增数据
     *
     * @param wechatTemplateInfoEntity 实例对象
     * @return 实例对象
     */
    @Override
    public WechatTemplateInfoEntity insert(WechatTemplateInfoEntity wechatTemplateInfoEntity) {
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
        return this.wechatTemplateInfoDao.deleteById(id) > 0;
    }
}
