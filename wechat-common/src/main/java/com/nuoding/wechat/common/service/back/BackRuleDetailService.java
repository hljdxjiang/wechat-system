package com.nuoding.wechat.common.service.back;

import com.nuoding.wechat.common.entity.back.BackRuleDetailEntity;

import java.util.List;

/**
 * (backRuleDetail)表服务接口
 * 角色权限详情表
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface BackRuleDetailService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BackRuleDetailEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param backRuleDetailEntity 筛选条件
     * @return 查询结果
     */
    List<BackRuleDetailEntity> queryAllByLimit(BackRuleDetailEntity backRuleDetailEntity);

    /**
     * 模糊查询
     *
     * @param backRuleDetailEntity 筛选条件
     * @return 查询结果
     */
    List<BackRuleDetailEntity> fuzzyQuery(BackRuleDetailEntity backRuleDetailEntity);

    /**
     * 单挑查询
     *
     * @param backRuleDetailEntity 筛选条件
     * @return 查询结果
     */
    BackRuleDetailEntity selectOne(BackRuleDetailEntity backRuleDetailEntity);

    /**
     * 新增数据
     *
     * @param backRuleDetailEntity 实例对象
     * @return 实例对象
     */
    BackRuleDetailEntity insert(BackRuleDetailEntity backRuleDetailEntity);

    /**
     * 修改数据
     *
     * @param backRuleDetailEntity 实例对象
     * @return 实例对象
     */
    BackRuleDetailEntity update(BackRuleDetailEntity backRuleDetailEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
