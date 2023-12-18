package com.nuoding.wechat.common.service.wechat;

import com.nuoding.wechat.common.entity.wechat.WechatMenusEntity;

import java.util.List;

/**
 * (wechatMenus)表服务接口
 * 微信菜单表
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface WechatMenusService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    WechatMenusEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param wechatMenusEntity 筛选条件
     * @return 查询结果
     */
    List<WechatMenusEntity> queryAllByLimit(WechatMenusEntity wechatMenusEntity);

    /**
     * 模糊查询
     *
     * @param wechatMenusEntity 筛选条件
     * @return 查询结果
     */
    List<WechatMenusEntity> fuzzyQuery(WechatMenusEntity wechatMenusEntity);

    /**
     * 单挑查询
     *
     * @param wechatMenusEntity 筛选条件
     * @return 查询结果
     */
    WechatMenusEntity selectOne(WechatMenusEntity wechatMenusEntity);

    /**
     * 新增数据
     *
     * @param wechatMenusEntity 实例对象
     * @return 实例对象
     */
    WechatMenusEntity insert(WechatMenusEntity wechatMenusEntity);

    /**
     * 修改数据
     *
     * @param wechatMenusEntity 实例对象
     * @return 实例对象
     */
    WechatMenusEntity update(WechatMenusEntity wechatMenusEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
