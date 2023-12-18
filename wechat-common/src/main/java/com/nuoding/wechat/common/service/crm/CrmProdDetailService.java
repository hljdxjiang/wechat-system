package com.nuoding.wechat.common.service.crm;

import com.nuoding.wechat.common.entity.crm.CrmProdDetailEntity;

import java.util.List;

/**
 * (crmProdDetail)表服务接口
 * 产品详情表
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface CrmProdDetailService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CrmProdDetailEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param crmProdDetailEntity 筛选条件
     * @return 查询结果
     */
    List<CrmProdDetailEntity> queryAllByLimit(CrmProdDetailEntity crmProdDetailEntity);

    /**
     * 模糊查询
     *
     * @param crmProdDetailEntity 筛选条件
     * @return 查询结果
     */
    List<CrmProdDetailEntity> fuzzyQuery(CrmProdDetailEntity crmProdDetailEntity);

    /**
     * 单挑查询
     *
     * @param crmProdDetailEntity 筛选条件
     * @return 查询结果
     */
    CrmProdDetailEntity selectOne(CrmProdDetailEntity crmProdDetailEntity);

    /**
     * 新增数据
     *
     * @param crmProdDetailEntity 实例对象
     * @return 实例对象
     */
    CrmProdDetailEntity insert(CrmProdDetailEntity crmProdDetailEntity);

    /**
     * 修改数据
     *
     * @param crmProdDetailEntity 实例对象
     * @return 实例对象
     */
    CrmProdDetailEntity update(CrmProdDetailEntity crmProdDetailEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

    List<CrmProdDetailEntity> queryByProdId(String prodId);

}
