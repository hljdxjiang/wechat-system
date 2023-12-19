package com.nuoding.wechat.common.service.crm;

import com.nuoding.wechat.common.entity.crm.CrmProdInfoEntity;

import java.util.List;

/**
 * (crmProdInfo)表服务接口
 * 产品信息表
 *
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface CrmProdInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CrmProdInfoEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param crmProdInfoEntity 筛选条件
     * @return 查询结果
     */
    List<CrmProdInfoEntity> queryAllByLimit(CrmProdInfoEntity crmProdInfoEntity);

    /**
     * 模糊查询
     *
     * @param crmProdInfoEntity 筛选条件
     * @return 查询结果
     */
    List<CrmProdInfoEntity> fuzzyQuery(CrmProdInfoEntity crmProdInfoEntity);

    /**
     * 单挑查询
     *
     * @param crmProdInfoEntity 筛选条件
     * @return 查询结果
     */
    CrmProdInfoEntity selectOne(CrmProdInfoEntity crmProdInfoEntity);

    /**
     * 新增数据
     *
     * @param crmProdInfoEntity 实例对象
     * @return 实例对象
     */
    CrmProdInfoEntity insert(CrmProdInfoEntity crmProdInfoEntity);

    /**
     * 修改数据
     *
     * @param crmProdInfoEntity 实例对象
     * @return 实例对象
     */
    CrmProdInfoEntity update(CrmProdInfoEntity crmProdInfoEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
