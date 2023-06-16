package com.nuoding.wechat.common.service.wechat;

import com.nuoding.wechat.common.entity.wechat.WechatUserEntity;

import java.util.List;

/**
 * (wechatUser)表服务接口
 * 微信用户信息表
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface WechatUserService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    WechatUserEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param wechatUserEntity 筛选条件
     * @return 查询结果
     */
    List<WechatUserEntity> queryAllByLimit(WechatUserEntity wechatUserEntity);

    /**
     * 新增数据
     *
     * @param wechatUserEntity 实例对象
     * @return 实例对象
     */
    WechatUserEntity insert(WechatUserEntity wechatUserEntity);

    /**
     * 修改数据
     *
     * @param wechatUserEntity 实例对象
     * @return 实例对象
     */
    WechatUserEntity update(WechatUserEntity wechatUserEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
