package com.nuoding.wechat.common.service;

import com.nuoding.wechat.common.entity.CrmPurchesDetail;

import java.util.List;

/**
 * 进货详情表(CrmPurchesDetail)表服务接口
 *
 * @author jhc
 * @since 2023-03-07 14:38:40
 */
public interface CrmPurchesDetailService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CrmPurchesDetail queryById(Integer id);

    /**
     * 分页查询
     *
     * @param crmPurchesDetail 筛选条件
     * @return 查询结果
     */
    List<CrmPurchesDetail> queryByPage(CrmPurchesDetail crmPurchesDetail);

    /**
     * 新增数据
     *
     * @param crmPurchesDetail 实例对象
     * @return 实例对象
     */
    CrmPurchesDetail insert(CrmPurchesDetail crmPurchesDetail);

    /**
     * 修改数据
     *
     * @param crmPurchesDetail 实例对象
     * @return 实例对象
     */
    CrmPurchesDetail update(CrmPurchesDetail crmPurchesDetail);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
