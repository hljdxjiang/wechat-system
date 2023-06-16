package com.nuoding.wechat.common.service.wechat;

import com.nuoding.wechat.common.entity.wechat.WechatMenusVersionEntity;

import java.util.List;

/**
 * (wechatMenusVersion)表服务接口
 * 微信菜单版本表
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface WechatMenusVersionService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    WechatMenusVersionEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param wechatMenusVersionEntity 筛选条件
     * @return 查询结果
     */
    List<WechatMenusVersionEntity> queryAllByLimit(WechatMenusVersionEntity wechatMenusVersionEntity);

    /**
     * 新增数据
     *
     * @param wechatMenusVersionEntity 实例对象
     * @return 实例对象
     */
    WechatMenusVersionEntity insert(WechatMenusVersionEntity wechatMenusVersionEntity);

    /**
     * 修改数据
     *
     * @param wechatMenusVersionEntity 实例对象
     * @return 实例对象
     */
    WechatMenusVersionEntity update(WechatMenusVersionEntity wechatMenusVersionEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
