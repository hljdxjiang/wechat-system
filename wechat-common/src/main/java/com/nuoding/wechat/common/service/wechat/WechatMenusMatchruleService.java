package com.nuoding.wechat.common.service.wechat;

import com.nuoding.wechat.common.entity.wechat.WechatMenusMatchruleEntity;

import java.util.List;

/**
 * (wechatMenusMatchrule)表服务接口
 * 微信个性化菜单匹配表
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface WechatMenusMatchruleService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    WechatMenusMatchruleEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param wechatMenusMatchruleEntity 筛选条件
     * @return 查询结果
     */
    List<WechatMenusMatchruleEntity> queryAllByLimit(WechatMenusMatchruleEntity wechatMenusMatchruleEntity);

    /**
     * 新增数据
     *
     * @param wechatMenusMatchruleEntity 实例对象
     * @return 实例对象
     */
    WechatMenusMatchruleEntity insert(WechatMenusMatchruleEntity wechatMenusMatchruleEntity);

    /**
     * 修改数据
     *
     * @param wechatMenusMatchruleEntity 实例对象
     * @return 实例对象
     */
    WechatMenusMatchruleEntity update(WechatMenusMatchruleEntity wechatMenusMatchruleEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
