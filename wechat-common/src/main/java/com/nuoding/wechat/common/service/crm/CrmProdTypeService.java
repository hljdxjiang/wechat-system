package com.nuoding.wechat.common.service.crm;

import com.nuoding.wechat.common.entity.crm.CrmProdTypeEntity;

import java.util.List;

/**
 * (crmProdType)表服务接口
 * 产品类型配置表
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface CrmProdTypeService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CrmProdTypeEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param crmProdTypeEntity 筛选条件
     * @return 查询结果
     */
    List<CrmProdTypeEntity> queryAllByLimit(CrmProdTypeEntity crmProdTypeEntity);

    /**
     * 模糊查询
     *
     * @param crmProdTypeEntity 筛选条件
     * @return 查询结果
     */
    List<CrmProdTypeEntity> fuzzyQuery(CrmProdTypeEntity crmProdTypeEntity);

    /**
     * 单挑查询
     *
     * @param crmProdTypeEntity 筛选条件
     * @return 查询结果
     */
    CrmProdTypeEntity selectOne(CrmProdTypeEntity crmProdTypeEntity);

    /**
     * 新增数据
     *
     * @param crmProdTypeEntity 实例对象
     * @return 实例对象
     */
    CrmProdTypeEntity insert(CrmProdTypeEntity crmProdTypeEntity);

    /**
     * 修改数据
     *
     * @param crmProdTypeEntity 实例对象
     * @return 实例对象
     */
    CrmProdTypeEntity update(CrmProdTypeEntity crmProdTypeEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
