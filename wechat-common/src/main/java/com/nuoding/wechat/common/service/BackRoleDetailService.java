package com.nuoding.wechat.common.service;

import com.nuoding.wechat.common.entity.BackRoleDetail;

import java.util.List;

/**
 * 角色权限详情表(BackRoleDetail)表服务接口
 *
 * @author jhc
 * @since 2023-03-07 14:38:27
 */
public interface BackRoleDetailService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BackRoleDetail queryById(Integer id);

    /**
     * 分页查询
     *
     * @param backRoleDetail 筛选条件
     * @return 查询结果
     */
    List<BackRoleDetail> queryByPage(BackRoleDetail backRoleDetail);

    /**
     * 新增数据
     *
     * @param backRoleDetail 实例对象
     * @return 实例对象
     */
    BackRoleDetail insert(BackRoleDetail backRoleDetail);

    /**
     * 修改数据
     *
     * @param backRoleDetail 实例对象
     * @return 实例对象
     */
    BackRoleDetail update(BackRoleDetail backRoleDetail);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
