package com.nuoding.wechat.common.dao.crm;

import com.nuoding.wechat.common.entity.crm.CrmSaleDetailEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 销售记录表
 *
 * @Author: hzq
 * @Date: 2023-05-08 19:32:48
 */
public interface CrmSaleDetailDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CrmSaleDetailEntity queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param crmSaleDetailEntity 查询条件
     * @return 对象列表
     */
    List<CrmSaleDetailEntity> queryAllByLimit(CrmSaleDetailEntity crmSaleDetailEntity);

    /**
     * 统计总行数
     *
     * @param crmSaleDetailEntity 查询条件
     * @return 总行数
     */
    long count(CrmSaleDetailEntity crmSaleDetailEntity);

    /**
     * 新增数据
     *
     * @param crmSaleDetailEntity 实例对象
     * @return 影响行数
     */
    int insert(CrmSaleDetailEntity crmSaleDetailEntity);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<CrmSaleDetailEntity> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<CrmSaleDetailEntity> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<CrmSaleDetailEntity> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<CrmSaleDetailEntity> entities);

    /**
     * 修改数据
     *
     * @param crmSaleDetailEntity 实例对象
     * @return 影响行数
     */
    int update(CrmSaleDetailEntity crmSaleDetailEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

