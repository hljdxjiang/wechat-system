package com.nuoding.wechat.common.service.wechat;

import com.nuoding.wechat.common.entity.wechat.WechatSubscribeInfoEntity;

import java.util.List;

/**
 * (wechatSubscribeInfo)表服务接口
 * 用户订阅信息表
 *
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface WechatSubscribeInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    WechatSubscribeInfoEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param wechatSubscribeInfoEntity 筛选条件
     * @return 查询结果
     */
    List<WechatSubscribeInfoEntity> queryAllByLimit(WechatSubscribeInfoEntity wechatSubscribeInfoEntity);

    /**
     * 模糊查询
     *
     * @param wechatSubscribeInfoEntity 筛选条件
     * @return 查询结果
     */
    List<WechatSubscribeInfoEntity> fuzzyQuery(WechatSubscribeInfoEntity wechatSubscribeInfoEntity);

    /**
     * 单挑查询
     *
     * @param wechatSubscribeInfoEntity 筛选条件
     * @return 查询结果
     */
    WechatSubscribeInfoEntity selectOne(WechatSubscribeInfoEntity wechatSubscribeInfoEntity);

    /**
     * 新增数据
     *
     * @param wechatSubscribeInfoEntity 实例对象
     * @return 实例对象
     */
    WechatSubscribeInfoEntity insert(WechatSubscribeInfoEntity wechatSubscribeInfoEntity);

    /**
     * 修改数据
     *
     * @param wechatSubscribeInfoEntity 实例对象
     * @return 实例对象
     */
    WechatSubscribeInfoEntity update(WechatSubscribeInfoEntity wechatSubscribeInfoEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
