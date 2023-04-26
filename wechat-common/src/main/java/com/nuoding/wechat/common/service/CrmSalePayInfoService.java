package com.nuoding.wechat.common.service;

import com.nuoding.wechat.common.entity.CrmSalePayInfo;

import java.util.List;

/**
 * 销售记录表(CrmSalePayInfo)表服务接口
 *
 * @author jhc
 * @since 2023-03-07 14:38:43
 */
public interface CrmSalePayInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CrmSalePayInfo queryById(Integer id);

    /**
     * 分页查询
     *
     * @param crmSalePayInfo 筛选条件
     * @return 查询结果
     */
    List<CrmSalePayInfo> queryByPage(CrmSalePayInfo crmSalePayInfo);

    /**
     * 新增数据
     *
     * @param crmSalePayInfo 实例对象
     * @return 实例对象
     */
    CrmSalePayInfo insert(CrmSalePayInfo crmSalePayInfo);

    /**
     * 修改数据
     *
     * @param crmSalePayInfo 实例对象
     * @return 实例对象
     */
    CrmSalePayInfo update(CrmSalePayInfo crmSalePayInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
