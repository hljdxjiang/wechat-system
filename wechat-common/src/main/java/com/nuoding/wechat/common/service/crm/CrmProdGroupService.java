package com.nuoding.wechat.common.service.crm;

import com.nuoding.wechat.common.entity.crm.CrmProdGroupEntity;

import java.util.List;

/**
 * (crmProdGroup)表服务接口
 * 产品分组表
 *
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface CrmProdGroupService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CrmProdGroupEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param crmProdGroupEntity 筛选条件
     * @return 查询结果
     */
    List<CrmProdGroupEntity> queryAllByLimit(CrmProdGroupEntity crmProdGroupEntity);

    /**
     * 模糊查询
     *
     * @param crmProdGroupEntity 筛选条件
     * @return 查询结果
     */
    List<CrmProdGroupEntity> fuzzyQuery(CrmProdGroupEntity crmProdGroupEntity);

    /**
     * 单挑查询
     *
     * @param crmProdGroupEntity 筛选条件
     * @return 查询结果
     */
    CrmProdGroupEntity selectOne(CrmProdGroupEntity crmProdGroupEntity);

    /**
     * 新增数据
     *
     * @param crmProdGroupEntity 实例对象
     * @return 实例对象
     */
    CrmProdGroupEntity insert(CrmProdGroupEntity crmProdGroupEntity);

    /**
     * 修改数据
     *
     * @param crmProdGroupEntity 实例对象
     * @return 实例对象
     */
    CrmProdGroupEntity update(CrmProdGroupEntity crmProdGroupEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
