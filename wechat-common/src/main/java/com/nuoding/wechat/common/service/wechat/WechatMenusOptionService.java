package com.nuoding.wechat.common.service.wechat;

import com.nuoding.wechat.common.entity.wechat.WechatMenusOptionEntity;

import java.util.List;

/**
 * (wechatMenusOption)表服务接口
 * 微信菜单要素表
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface WechatMenusOptionService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    WechatMenusOptionEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param wechatMenusOptionEntity 筛选条件
     * @return 查询结果
     */
    List<WechatMenusOptionEntity> queryAllByLimit(WechatMenusOptionEntity wechatMenusOptionEntity);

    /**
     * 新增数据
     *
     * @param wechatMenusOptionEntity 实例对象
     * @return 实例对象
     */
    WechatMenusOptionEntity insert(WechatMenusOptionEntity wechatMenusOptionEntity);

    /**
     * 修改数据
     *
     * @param wechatMenusOptionEntity 实例对象
     * @return 实例对象
     */
    WechatMenusOptionEntity update(WechatMenusOptionEntity wechatMenusOptionEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
