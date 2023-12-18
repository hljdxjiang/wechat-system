package com.nuoding.wechat.common.service.crm;

import com.nuoding.wechat.common.entity.crm.CrmBrandInfoEntity;

import java.util.List;

/**
 * (crmBrandInfo)表服务接口
 * 品牌信息表
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface CrmBrandInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CrmBrandInfoEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param crmBrandInfoEntity 筛选条件
     * @return 查询结果
     */
    List<CrmBrandInfoEntity> queryAllByLimit(CrmBrandInfoEntity crmBrandInfoEntity);

    /**
     * 模糊查询
     *
     * @param crmBrandInfoEntity 筛选条件
     * @return 查询结果
     */
    List<CrmBrandInfoEntity> fuzzyQuery(CrmBrandInfoEntity crmBrandInfoEntity);

    /**
     * 单挑查询
     *
     * @param crmBrandInfoEntity 筛选条件
     * @return 查询结果
     */
    CrmBrandInfoEntity selectOne(CrmBrandInfoEntity crmBrandInfoEntity);

    /**
     * 新增数据
     *
     * @param crmBrandInfoEntity 实例对象
     * @return 实例对象
     */
    CrmBrandInfoEntity insert(CrmBrandInfoEntity crmBrandInfoEntity);

    /**
     * 修改数据
     *
     * @param crmBrandInfoEntity 实例对象
     * @return 实例对象
     */
    CrmBrandInfoEntity update(CrmBrandInfoEntity crmBrandInfoEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
