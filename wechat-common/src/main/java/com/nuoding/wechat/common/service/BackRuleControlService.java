package com.nuoding.wechat.common.service;

import com.nuoding.wechat.common.entity.BackRuleControl;

import java.util.List;

/**
 * 开关控制表(BackRuleControl)表服务接口
 *
 * @author jhc
 * @since 2023-03-07 14:38:23
 */
public interface BackRuleControlService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BackRuleControl queryById(Integer id);

    /**
     * 分页查询
     *
     * @param backRuleControl 筛选条件
     * @return 查询结果
     */
    List<BackRuleControl> queryByPage(BackRuleControl backRuleControl);

    /**
     * 新增数据
     *
     * @param backRuleControl 实例对象
     * @return 实例对象
     */
    BackRuleControl insert(BackRuleControl backRuleControl);

    /**
     * 修改数据
     *
     * @param backRuleControl 实例对象
     * @return 实例对象
     */
    BackRuleControl update(BackRuleControl backRuleControl);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
