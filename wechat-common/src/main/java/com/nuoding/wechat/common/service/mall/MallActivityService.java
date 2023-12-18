package com.nuoding.wechat.common.service.mall;

import com.nuoding.wechat.common.entity.mall.MallActivityEntity;

import java.util.List;

/**
 * (mallActivity)表服务接口
 * 活动信息表
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface MallActivityService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MallActivityEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param mallActivityEntity 筛选条件
     * @return 查询结果
     */
    List<MallActivityEntity> queryAllByLimit(MallActivityEntity mallActivityEntity);

    /**
     * 模糊查询
     *
     * @param mallActivityEntity 筛选条件
     * @return 查询结果
     */
    List<MallActivityEntity> fuzzyQuery(MallActivityEntity mallActivityEntity);

    /**
     * 单挑查询
     *
     * @param mallActivityEntity 筛选条件
     * @return 查询结果
     */
    MallActivityEntity selectOne(MallActivityEntity mallActivityEntity);

    /**
     * 新增数据
     *
     * @param mallActivityEntity 实例对象
     * @return 实例对象
     */
    MallActivityEntity insert(MallActivityEntity mallActivityEntity);

    /**
     * 修改数据
     *
     * @param mallActivityEntity 实例对象
     * @return 实例对象
     */
    MallActivityEntity update(MallActivityEntity mallActivityEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
