package com.nuoding.wechat.common.service;

import com.nuoding.wechat.common.entity.CrmProdGroup;

import java.util.List;

/**
 * (CrmProdGroup)表服务接口
 *
 * @author jhc
 * @since 2023-03-07 14:38:37
 */
public interface CrmProdGroupService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CrmProdGroup queryById(Integer id);

    /**
     * 分页查询
     *
     * @param crmProdGroup 筛选条件
     * @return 查询结果
     */
    List<CrmProdGroup> queryByPage(CrmProdGroup crmProdGroup);

    /**
     * 新增数据
     *
     * @param crmProdGroup 实例对象
     * @return 实例对象
     */
    CrmProdGroup insert(CrmProdGroup crmProdGroup);

    /**
     * 修改数据
     *
     * @param crmProdGroup 实例对象
     * @return 实例对象
     */
    CrmProdGroup update(CrmProdGroup crmProdGroup);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
