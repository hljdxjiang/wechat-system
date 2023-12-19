package com.nuoding.wechat.common.service.back;

import com.nuoding.wechat.common.entity.back.BackRuleControlEntity;

import java.util.List;

/**
 * (backRuleControl)表服务接口
 * 开关控制表
 *
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface BackRuleControlService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BackRuleControlEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param backRuleControlEntity 筛选条件
     * @return 查询结果
     */
    List<BackRuleControlEntity> queryAllByLimit(BackRuleControlEntity backRuleControlEntity);

    /**
     * 模糊查询
     *
     * @param backRuleControlEntity 筛选条件
     * @return 查询结果
     */
    List<BackRuleControlEntity> fuzzyQuery(BackRuleControlEntity backRuleControlEntity);

    /**
     * 单挑查询
     *
     * @param backRuleControlEntity 筛选条件
     * @return 查询结果
     */
    BackRuleControlEntity selectOne(BackRuleControlEntity backRuleControlEntity);

    /**
     * 新增数据
     *
     * @param backRuleControlEntity 实例对象
     * @return 实例对象
     */
    BackRuleControlEntity insert(BackRuleControlEntity backRuleControlEntity);

    /**
     * 修改数据
     *
     * @param backRuleControlEntity 实例对象
     * @return 实例对象
     */
    BackRuleControlEntity update(BackRuleControlEntity backRuleControlEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
