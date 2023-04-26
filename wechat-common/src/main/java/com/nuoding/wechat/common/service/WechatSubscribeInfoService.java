package com.nuoding.wechat.common.service;

import com.nuoding.wechat.common.entity.WechatSubscribeInfo;

import java.util.List;

/**
 * 用户订阅信息表(WechatSubscribeInfo)表服务接口
 *
 * @author jhc
 * @since 2023-03-07 14:39:18
 */
public interface WechatSubscribeInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    WechatSubscribeInfo queryById(Integer id);

    /**
     * 分页查询
     *
     * @param wechatSubscribeInfo 筛选条件
     * @return 查询结果
     */
    List<WechatSubscribeInfo> queryByPage(WechatSubscribeInfo wechatSubscribeInfo);

    /**
     * 新增数据
     *
     * @param wechatSubscribeInfo 实例对象
     * @return 实例对象
     */
    WechatSubscribeInfo insert(WechatSubscribeInfo wechatSubscribeInfo);

    /**
     * 修改数据
     *
     * @param wechatSubscribeInfo 实例对象
     * @return 实例对象
     */
    WechatSubscribeInfo update(WechatSubscribeInfo wechatSubscribeInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
