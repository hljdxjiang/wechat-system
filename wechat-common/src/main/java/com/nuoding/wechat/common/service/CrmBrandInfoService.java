package com.nuoding.wechat.common.service;

import com.nuoding.wechat.common.entity.CrmBrandInfo;

import java.util.List;

/**
 * 品牌信息(CrmBrandInfo)表服务接口
 *
 * @author jhc
 * @since 2023-03-07 14:38:35
 */
public interface CrmBrandInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CrmBrandInfo queryById(Integer id);

    /**
     * 分页查询
     *
     * @param crmBrandInfo 筛选条件
     * @return 查询结果
     */
    List<CrmBrandInfo> queryByPage(CrmBrandInfo crmBrandInfo);

    /**
     * 新增数据
     *
     * @param crmBrandInfo 实例对象
     * @return 实例对象
     */
    CrmBrandInfo insert(CrmBrandInfo crmBrandInfo);

    /**
     * 修改数据
     *
     * @param crmBrandInfo 实例对象
     * @return 实例对象
     */
    CrmBrandInfo update(CrmBrandInfo crmBrandInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
