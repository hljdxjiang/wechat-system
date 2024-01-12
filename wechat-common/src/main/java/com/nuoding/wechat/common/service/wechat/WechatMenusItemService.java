package com.nuoding.wechat.common.service.wechat;

import com.nuoding.wechat.common.entity.wechat.WechatMenusItemEntity;

import java.util.List;

/**
 * (wechatMenusItem)表服务接口
 * 微信菜单要素表
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface WechatMenusItemService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    WechatMenusItemEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param wechatMenusItemEntity 筛选条件
     * @return 查询结果
     */
    List<WechatMenusItemEntity> queryAllByLimit(WechatMenusItemEntity wechatMenusItemEntity);

    /**
     * 模糊查询
     *
     * @param wechatMenusItemEntity 筛选条件
     * @return 查询结果
     */
    List<WechatMenusItemEntity> fuzzyQuery(WechatMenusItemEntity wechatMenusItemEntity);

    /**
     * 单挑查询
     *
     * @param wechatMenusItemEntity 筛选条件
     * @return 查询结果
     */
    WechatMenusItemEntity selectOne(WechatMenusItemEntity wechatMenusItemEntity);

    /**
     * 新增数据
     *
     * @param wechatMenusItemEntity 实例对象
     * @return 实例对象
     */
    WechatMenusItemEntity insert(WechatMenusItemEntity wechatMenusItemEntity);

    /**
     * 修改数据
     *
     * @param wechatMenusItemEntity 实例对象
     * @return 实例对象
     */
    WechatMenusItemEntity update(WechatMenusItemEntity wechatMenusItemEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
