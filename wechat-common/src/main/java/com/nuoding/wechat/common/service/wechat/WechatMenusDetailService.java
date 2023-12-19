package com.nuoding.wechat.common.service.wechat;

import com.nuoding.wechat.common.entity.wechat.WechatMenusDetailEntity;

import java.util.List;

/**
 * (wechatMenusDetail)表服务接口
 * 微信菜单要素表
 *
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface WechatMenusDetailService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    WechatMenusDetailEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param wechatMenusDetailEntity 筛选条件
     * @return 查询结果
     */
    List<WechatMenusDetailEntity> queryAllByLimit(WechatMenusDetailEntity wechatMenusDetailEntity);

    /**
     * 模糊查询
     *
     * @param wechatMenusDetailEntity 筛选条件
     * @return 查询结果
     */
    List<WechatMenusDetailEntity> fuzzyQuery(WechatMenusDetailEntity wechatMenusDetailEntity);

    /**
     * 单挑查询
     *
     * @param wechatMenusDetailEntity 筛选条件
     * @return 查询结果
     */
    WechatMenusDetailEntity selectOne(WechatMenusDetailEntity wechatMenusDetailEntity);

    /**
     * 新增数据
     *
     * @param wechatMenusDetailEntity 实例对象
     * @return 实例对象
     */
    WechatMenusDetailEntity insert(WechatMenusDetailEntity wechatMenusDetailEntity);

    /**
     * 修改数据
     *
     * @param wechatMenusDetailEntity 实例对象
     * @return 实例对象
     */
    WechatMenusDetailEntity update(WechatMenusDetailEntity wechatMenusDetailEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
