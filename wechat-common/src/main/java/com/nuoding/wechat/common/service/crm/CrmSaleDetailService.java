package com.nuoding.wechat.common.service.crm;

import com.nuoding.wechat.common.entity.crm.CrmSaleDetailEntity;

import java.util.List;

/**
 * (crmSaleDetail)表服务接口
 * 销售记录表
 *
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface CrmSaleDetailService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CrmSaleDetailEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param crmSaleDetailEntity 筛选条件
     * @return 查询结果
     */
    List<CrmSaleDetailEntity> queryAllByLimit(CrmSaleDetailEntity crmSaleDetailEntity);

    /**
     * 模糊查询
     *
     * @param crmSaleDetailEntity 筛选条件
     * @return 查询结果
     */
    List<CrmSaleDetailEntity> fuzzyQuery(CrmSaleDetailEntity crmSaleDetailEntity);

    /**
     * 单挑查询
     *
     * @param crmSaleDetailEntity 筛选条件
     * @return 查询结果
     */
    CrmSaleDetailEntity selectOne(CrmSaleDetailEntity crmSaleDetailEntity);

    /**
     * 新增数据
     *
     * @param crmSaleDetailEntity 实例对象
     * @return 实例对象
     */
    CrmSaleDetailEntity insert(CrmSaleDetailEntity crmSaleDetailEntity);

    /**
     * 修改数据
     *
     * @param crmSaleDetailEntity 实例对象
     * @return 实例对象
     */
    CrmSaleDetailEntity update(CrmSaleDetailEntity crmSaleDetailEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
