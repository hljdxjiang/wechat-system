package com.nuoding.wechat.common.service;

import com.nuoding.wechat.common.entity.WechatMinipUser;

import java.util.List;

/**
 * (WechatMinipUser)表服务接口
 *
 * @author jhc
 * @since 2023-03-07 14:39:17
 */
public interface WechatMinipUserService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    WechatMinipUser queryById(Integer id);

    /**
     * 分页查询
     *
     * @param wechatMinipUser 筛选条件
     * @return 查询结果
     */
    List<WechatMinipUser> queryByPage(WechatMinipUser wechatMinipUser);

    /**
     * 新增数据
     *
     * @param wechatMinipUser 实例对象
     * @return 实例对象
     */
    WechatMinipUser insert(WechatMinipUser wechatMinipUser);

    /**
     * 修改数据
     *
     * @param wechatMinipUser 实例对象
     * @return 实例对象
     */
    WechatMinipUser update(WechatMinipUser wechatMinipUser);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
