package com.nuoding.wechat.common.service;

import com.nuoding.wechat.common.entity.CrmProdType;

import java.util.List;

/**
 * (CrmProdType)表服务接口
 *
 * @author jhc
 * @since 2023-03-07 14:38:39
 */
public interface CrmProdTypeService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CrmProdType queryById(Integer id);

    /**
     * 分页查询
     *
     * @param crmProdType 筛选条件
     * @return 查询结果
     */
    List<CrmProdType> queryByPage(CrmProdType crmProdType);

    /**
     * 新增数据
     *
     * @param crmProdType 实例对象
     * @return 实例对象
     */
    CrmProdType insert(CrmProdType crmProdType);

    /**
     * 修改数据
     *
     * @param crmProdType 实例对象
     * @return 实例对象
     */
    CrmProdType update(CrmProdType crmProdType);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
