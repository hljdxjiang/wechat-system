package com.nuoding.wechat.common.service;

import com.nuoding.wechat.common.entity.CrmReferrerInfo;

import java.util.List;

/**
 * 品牌信息(CrmReferrerInfo)表服务接口
 *
 * @author jhc
 * @since 2023-03-07 14:38:35
 */
public interface CrmReferrerInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CrmReferrerInfo queryById(Integer id);

    /**
     * 分页查询
     *
     * @param crmReferrerInfo 筛选条件
     * @return 查询结果
     */
    List<CrmReferrerInfo> queryByPage(CrmReferrerInfo crmReferrerInfo);

    /**
     * 新增数据
     *
     * @param crmReferrerInfo 实例对象
     * @return 实例对象
     */
    CrmReferrerInfo insert(CrmReferrerInfo crmReferrerInfo);

    /**
     * 修改数据
     *
     * @param crmReferrerInfo 实例对象
     * @return 实例对象
     */
    CrmReferrerInfo update(CrmReferrerInfo crmReferrerInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
