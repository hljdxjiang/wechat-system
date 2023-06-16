package com.nuoding.wechat.common.service.crm;

import com.nuoding.wechat.common.entity.crm.CrmSaleRecordEntity;

import java.util.List;

/**
 * (crmSaleRecord)表服务接口
 * 销售记录表
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface CrmSaleRecordService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CrmSaleRecordEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param crmSaleRecordEntity 筛选条件
     * @return 查询结果
     */
    List<CrmSaleRecordEntity> queryAllByLimit(CrmSaleRecordEntity crmSaleRecordEntity);

    /**
     * 新增数据
     *
     * @param crmSaleRecordEntity 实例对象
     * @return 实例对象
     */
    CrmSaleRecordEntity insert(CrmSaleRecordEntity crmSaleRecordEntity);

    /**
     * 修改数据
     *
     * @param crmSaleRecordEntity 实例对象
     * @return 实例对象
     */
    CrmSaleRecordEntity update(CrmSaleRecordEntity crmSaleRecordEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
