package com.nuoding.wechat.common.service.wechat;

import com.nuoding.wechat.common.entity.wechat.WechatMinipUserEntity;

import java.util.List;

/**
 * (wechatMinipUser)表服务接口
 * 小程序用户信息表
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface WechatMinipUserService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    WechatMinipUserEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param wechatMinipUserEntity 筛选条件
     * @return 查询结果
     */
    List<WechatMinipUserEntity> queryAllByLimit(WechatMinipUserEntity wechatMinipUserEntity);

    /**
     * 模糊查询
     *
     * @param wechatMinipUserEntity 筛选条件
     * @return 查询结果
     */
    List<WechatMinipUserEntity> fuzzyQuery(WechatMinipUserEntity wechatMinipUserEntity);

    /**
     * 单挑查询
     *
     * @param wechatMinipUserEntity 筛选条件
     * @return 查询结果
     */
    WechatMinipUserEntity selectOne(WechatMinipUserEntity wechatMinipUserEntity);

    /**
     * 新增数据
     *
     * @param wechatMinipUserEntity 实例对象
     * @return 实例对象
     */
    WechatMinipUserEntity insert(WechatMinipUserEntity wechatMinipUserEntity);

    /**
     * 修改数据
     *
     * @param wechatMinipUserEntity 实例对象
     * @return 实例对象
     */
    WechatMinipUserEntity update(WechatMinipUserEntity wechatMinipUserEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
