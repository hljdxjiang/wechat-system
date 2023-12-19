package com.nuoding.wechat.common.service.crm;

import com.nuoding.wechat.common.entity.crm.CrmReferrerInfoEntity;

import java.util.List;

/**
 * (crmReferrerInfo)表服务接口
 * 推荐人信息表
 *
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface CrmReferrerInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CrmReferrerInfoEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param crmReferrerInfoEntity 筛选条件
     * @return 查询结果
     */
    List<CrmReferrerInfoEntity> queryAllByLimit(CrmReferrerInfoEntity crmReferrerInfoEntity);

    /**
     * 模糊查询
     *
     * @param crmReferrerInfoEntity 筛选条件
     * @return 查询结果
     */
    List<CrmReferrerInfoEntity> fuzzyQuery(CrmReferrerInfoEntity crmReferrerInfoEntity);

    /**
     * 单挑查询
     *
     * @param crmReferrerInfoEntity 筛选条件
     * @return 查询结果
     */
    CrmReferrerInfoEntity selectOne(CrmReferrerInfoEntity crmReferrerInfoEntity);

    /**
     * 新增数据
     *
     * @param crmReferrerInfoEntity 实例对象
     * @return 实例对象
     */
    CrmReferrerInfoEntity insert(CrmReferrerInfoEntity crmReferrerInfoEntity);

    /**
     * 修改数据
     *
     * @param crmReferrerInfoEntity 实例对象
     * @return 实例对象
     */
    CrmReferrerInfoEntity update(CrmReferrerInfoEntity crmReferrerInfoEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
