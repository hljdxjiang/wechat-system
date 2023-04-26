package com.nuoding.wechat.common.service;

import com.nuoding.wechat.common.entity.WechatUser;

import java.util.List;

/**
 * (WechatUser)表服务接口
 *
 * @author jhc
 * @since 2023-03-07 14:39:20
 */
public interface WechatUserService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    WechatUser queryById(Integer id);

    /**
     * 分页查询
     *
     * @param wechatUser 筛选条件
     * @return 查询结果
     */
    List<WechatUser> queryByPage(WechatUser wechatUser);

    /**
     * 新增数据
     *
     * @param wechatUser 实例对象
     * @return 实例对象
     */
    WechatUser insert(WechatUser wechatUser);

    /**
     * 修改数据
     *
     * @param wechatUser 实例对象
     * @return 实例对象
     */
    WechatUser update(WechatUser wechatUser);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
