package com.nuoding.wechat.common.service.crm;

import com.nuoding.wechat.common.entity.crm.CrmPurchesDetailEntity;

import java.util.List;

/**
 * (crmPurchesDetail)表服务接口
 * 进货详情表
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface CrmPurchesDetailService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CrmPurchesDetailEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param crmPurchesDetailEntity 筛选条件
     * @return 查询结果
     */
    List<CrmPurchesDetailEntity> queryAllByLimit(CrmPurchesDetailEntity crmPurchesDetailEntity);

    /**
     * 模糊查询
     *
     * @param crmPurchesDetailEntity 筛选条件
     * @return 查询结果
     */
    List<CrmPurchesDetailEntity> fuzzyQuery(CrmPurchesDetailEntity crmPurchesDetailEntity);

    /**
     * 单挑查询
     *
     * @param crmPurchesDetailEntity 筛选条件
     * @return 查询结果
     */
    CrmPurchesDetailEntity selectOne(CrmPurchesDetailEntity crmPurchesDetailEntity);

    /**
     * 新增数据
     *
     * @param crmPurchesDetailEntity 实例对象
     * @return 实例对象
     */
    CrmPurchesDetailEntity insert(CrmPurchesDetailEntity crmPurchesDetailEntity);

    /**
     * 修改数据
     *
     * @param crmPurchesDetailEntity 实例对象
     * @return 实例对象
     */
    CrmPurchesDetailEntity update(CrmPurchesDetailEntity crmPurchesDetailEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
