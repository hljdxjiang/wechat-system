package com.nuoding.wechat.common.service;

import com.nuoding.wechat.common.entity.CrmPurchesRecord;

import java.util.List;

/**
 * 进货记录表(CrmPurchesRecord)表服务接口
 *
 * @author jhc
 * @since 2023-03-07 14:38:41
 */
public interface CrmPurchesRecordService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CrmPurchesRecord queryById(Integer id);

    /**
     * 分页查询
     *
     * @param crmPurchesRecord 筛选条件
     * @return 查询结果
     */
    List<CrmPurchesRecord> queryByPage(CrmPurchesRecord crmPurchesRecord);

    /**
     * 新增数据
     *
     * @param crmPurchesRecord 实例对象
     * @return 实例对象
     */
    CrmPurchesRecord insert(CrmPurchesRecord crmPurchesRecord);

    /**
     * 修改数据
     *
     * @param crmPurchesRecord 实例对象
     * @return 实例对象
     */
    CrmPurchesRecord update(CrmPurchesRecord crmPurchesRecord);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
