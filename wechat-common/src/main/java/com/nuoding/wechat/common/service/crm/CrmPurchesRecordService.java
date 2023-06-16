package com.nuoding.wechat.common.service.crm;

import com.nuoding.wechat.common.entity.crm.CrmPurchesRecordEntity;

import java.util.List;

/**
 * (crmPurchesRecord)表服务接口
 * 进货记录表
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface CrmPurchesRecordService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CrmPurchesRecordEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param crmPurchesRecordEntity 筛选条件
     * @return 查询结果
     */
    List<CrmPurchesRecordEntity> queryAllByLimit(CrmPurchesRecordEntity crmPurchesRecordEntity);

    /**
     * 新增数据
     *
     * @param crmPurchesRecordEntity 实例对象
     * @return 实例对象
     */
    CrmPurchesRecordEntity insert(CrmPurchesRecordEntity crmPurchesRecordEntity);

    /**
     * 修改数据
     *
     * @param crmPurchesRecordEntity 实例对象
     * @return 实例对象
     */
    CrmPurchesRecordEntity update(CrmPurchesRecordEntity crmPurchesRecordEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
