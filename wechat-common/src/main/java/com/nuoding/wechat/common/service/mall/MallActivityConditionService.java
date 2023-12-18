package com.nuoding.wechat.common.service.mall;

import com.nuoding.wechat.common.entity.mall.MallActivityConditionEntity;

import java.util.List;

/**
 * (mallActivityCondition)表服务接口
 * 活动条件表
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface MallActivityConditionService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MallActivityConditionEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param mallActivityConditionEntity 筛选条件
     * @return 查询结果
     */
    List<MallActivityConditionEntity> queryAllByLimit(MallActivityConditionEntity mallActivityConditionEntity);

    /**
     * 模糊查询
     *
     * @param mallActivityConditionEntity 筛选条件
     * @return 查询结果
     */
    List<MallActivityConditionEntity> fuzzyQuery(MallActivityConditionEntity mallActivityConditionEntity);

    /**
     * 单挑查询
     *
     * @param mallActivityConditionEntity 筛选条件
     * @return 查询结果
     */
    MallActivityConditionEntity selectOne(MallActivityConditionEntity mallActivityConditionEntity);

    /**
     * 新增数据
     *
     * @param mallActivityConditionEntity 实例对象
     * @return 实例对象
     */
    MallActivityConditionEntity insert(MallActivityConditionEntity mallActivityConditionEntity);

    /**
     * 修改数据
     *
     * @param mallActivityConditionEntity 实例对象
     * @return 实例对象
     */
    MallActivityConditionEntity update(MallActivityConditionEntity mallActivityConditionEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
