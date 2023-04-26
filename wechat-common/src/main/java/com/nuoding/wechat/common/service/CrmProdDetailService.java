package com.nuoding.wechat.common.service;

import com.nuoding.wechat.common.entity.CrmProdDetail;

import java.util.List;

/**
 * (CrmProdDetail)表服务接口
 *
 * @author jhc
 * @since 2023-03-07 14:38:36
 */
public interface CrmProdDetailService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CrmProdDetail queryById(Integer id);

    /**
     * 分页查询
     *
     * @param crmProdDetail 筛选条件
     * @return 查询结果
     */
    List<CrmProdDetail> queryByPage(CrmProdDetail crmProdDetail);

    /**
     * 新增数据
     *
     * @param crmProdDetail 实例对象
     * @return 实例对象
     */
    CrmProdDetail insert(CrmProdDetail crmProdDetail);

    /**
     * 修改数据
     *
     * @param crmProdDetail 实例对象
     * @return 实例对象
     */
    CrmProdDetail update(CrmProdDetail crmProdDetail);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
