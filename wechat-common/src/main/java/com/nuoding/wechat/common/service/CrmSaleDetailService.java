package com.nuoding.wechat.common.service;

import com.nuoding.wechat.common.entity.CrmSaleDetail;

import java.util.List;

/**
 * 销售记录表(CrmSaleDetail)表服务接口
 *
 * @author jhc
 * @since 2023-03-07 14:38:42
 */
public interface CrmSaleDetailService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CrmSaleDetail queryById(Integer id);

    /**
     * 分页查询
     *
     * @param crmSaleDetail 筛选条件
     * @return 查询结果
     */
    List<CrmSaleDetail> queryByPage(CrmSaleDetail crmSaleDetail);

    /**
     * 新增数据
     *
     * @param crmSaleDetail 实例对象
     * @return 实例对象
     */
    CrmSaleDetail insert(CrmSaleDetail crmSaleDetail);

    /**
     * 修改数据
     *
     * @param crmSaleDetail 实例对象
     * @return 实例对象
     */
    CrmSaleDetail update(CrmSaleDetail crmSaleDetail);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
