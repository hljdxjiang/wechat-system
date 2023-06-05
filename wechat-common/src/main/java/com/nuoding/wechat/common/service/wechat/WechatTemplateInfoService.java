package com.nuoding.wechat.common.service.wechat;

import com.nuoding.wechat.common.entity.wechat.WechatTemplateInfoEntity;

import java.util.List;

/**
 * (wechatTemplateInfo)表服务接口
 * 微信推送模板
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface WechatTemplateInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    WechatTemplateInfoEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param wechatTemplateInfoEntity 筛选条件
     * @return 查询结果
     */
    List<WechatTemplateInfoEntity> queryByPage(WechatTemplateInfoEntity wechatTemplateInfoEntity);

    /**
     * 新增数据
     *
     * @param wechatTemplateInfoEntity 实例对象
     * @return 实例对象
     */
    WechatTemplateInfoEntity insert(WechatTemplateInfoEntity wechatTemplateInfoEntity);

    /**
     * 修改数据
     *
     * @param wechatTemplateInfoEntity 实例对象
     * @return 实例对象
     */
    WechatTemplateInfoEntity update(WechatTemplateInfoEntity wechatTemplateInfoEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
