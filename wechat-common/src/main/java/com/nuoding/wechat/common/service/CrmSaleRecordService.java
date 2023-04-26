package com.nuoding.wechat.common.service;

import com.nuoding.wechat.common.entity.CrmSaleRecord;

import java.util.List;

/**
 * 销售记录表(CrmSaleRecord)表服务接口
 *
 * @author jhc
 * @since 2023-03-07 14:37:10
 */
public interface CrmSaleRecordService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CrmSaleRecord queryById(Integer id);

    /**
     * 分页查询
     *
     * @param crmSaleRecord 筛选条件
     * @return 查询结果
     */
    List<CrmSaleRecord> queryByPage(CrmSaleRecord crmSaleRecord);

    /**
     * 新增数据
     *
     * @param crmSaleRecord 实例对象
     * @return 实例对象
     */
    CrmSaleRecord insert(CrmSaleRecord crmSaleRecord);

    /**
     * 修改数据
     *
     * @param crmSaleRecord 实例对象
     * @return 实例对象
     */
    CrmSaleRecord update(CrmSaleRecord crmSaleRecord);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
