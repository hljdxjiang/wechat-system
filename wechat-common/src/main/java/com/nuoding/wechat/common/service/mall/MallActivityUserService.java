package com.nuoding.wechat.common.service.mall;

import com.nuoding.wechat.common.entity.mall.MallActivityUserEntity;

import java.util.List;

/**
 * (mallActivityUser)表服务接口
 * 活动参与用户清单表
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface MallActivityUserService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MallActivityUserEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param mallActivityUserEntity 筛选条件
     * @return 查询结果
     */
    List<MallActivityUserEntity> queryByPage(MallActivityUserEntity mallActivityUserEntity);

    /**
     * 新增数据
     *
     * @param mallActivityUserEntity 实例对象
     * @return 实例对象
     */
    MallActivityUserEntity insert(MallActivityUserEntity mallActivityUserEntity);

    /**
     * 修改数据
     *
     * @param mallActivityUserEntity 实例对象
     * @return 实例对象
     */
    MallActivityUserEntity update(MallActivityUserEntity mallActivityUserEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
