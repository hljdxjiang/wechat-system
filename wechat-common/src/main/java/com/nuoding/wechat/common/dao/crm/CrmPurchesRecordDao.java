package com.nuoding.wechat.common.dao.crm;

import com.nuoding.wechat.common.entity.crm.CrmPurchesRecordEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 进货记录表
 *
 * @Author: hzq
 * @Date: 2023-12-18 14:57:39
 */
public interface CrmPurchesRecordDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CrmPurchesRecordEntity queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param crmPurchesRecordEntity 查询条件
     * @return 对象列表
     */
    List<CrmPurchesRecordEntity> queryAllByLimit(CrmPurchesRecordEntity crmPurchesRecordEntity);

    /**
     * 查询单行数据
     *
     * @param crmPurchesRecordEntity 查询条件
     * @return 对象列表
     */
    CrmPurchesRecordEntity selectOne(CrmPurchesRecordEntity crmPurchesRecordEntity);

    /**
     * 模糊查询
     *
     * @param crmPurchesRecordEntity 查询条件
     * @return 对象列表
     */
    List<CrmPurchesRecordEntity> fuzzyQuery(CrmPurchesRecordEntity crmPurchesRecordEntity);

    /**
     * 统计总行数
     *
     * @param crmPurchesRecordEntity 查询条件
     * @return 总行数
     */
    long count(CrmPurchesRecordEntity crmPurchesRecordEntity);

    /**
     * 新增数据
     *
     * @param crmPurchesRecordEntity 实例对象
     * @return 影响行数
     */
    int insert(CrmPurchesRecordEntity crmPurchesRecordEntity);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<CrmPurchesRecordEntity> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<CrmPurchesRecordEntity> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<CrmPurchesRecordEntity> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<CrmPurchesRecordEntity> entities);

    /**
     * 修改数据
     *
     * @param crmPurchesRecordEntity 实例对象
     * @return 影响行数
     */
    int update(CrmPurchesRecordEntity crmPurchesRecordEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

