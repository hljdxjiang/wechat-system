package com.nuoding.wechat.common.service;

import com.nuoding.wechat.common.entity.CrmProdInfo;

import java.util.List;

/**
 * (CrmProdInfo)表服务接口
 *
 * @author jhc
 * @since 2023-03-07 14:38:38
 */
public interface CrmProdInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CrmProdInfo queryById(Integer id);

    /**
     * 分页查询
     *
     * @param crmProdInfo 筛选条件
     * @return 查询结果
     */
    List<CrmProdInfo> queryByPage(CrmProdInfo crmProdInfo);

    /**
     * 新增数据
     *
     * @param crmProdInfo 实例对象
     * @return 实例对象
     */
    CrmProdInfo insert(CrmProdInfo crmProdInfo);

    /**
     * 修改数据
     *
     * @param crmProdInfo 实例对象
     * @return 实例对象
     */
    CrmProdInfo update(CrmProdInfo crmProdInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
