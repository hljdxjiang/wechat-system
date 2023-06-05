package com.nuoding.wechat.common.service.crm;

import com.nuoding.wechat.common.entity.crm.CrmSalePayInfoEntity;

import java.util.List;

/**
 * (crmSalePayInfo)表服务接口
 * 销售支付记录表
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface CrmSalePayInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CrmSalePayInfoEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param crmSalePayInfoEntity 筛选条件
     * @return 查询结果
     */
    List<CrmSalePayInfoEntity> queryByPage(CrmSalePayInfoEntity crmSalePayInfoEntity);

    /**
     * 新增数据
     *
     * @param crmSalePayInfoEntity 实例对象
     * @return 实例对象
     */
    CrmSalePayInfoEntity insert(CrmSalePayInfoEntity crmSalePayInfoEntity);

    /**
     * 修改数据
     *
     * @param crmSalePayInfoEntity 实例对象
     * @return 实例对象
     */
    CrmSalePayInfoEntity update(CrmSalePayInfoEntity crmSalePayInfoEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
