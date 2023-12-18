package com.nuoding.wechat.common.dao.crm;

import com.nuoding.wechat.common.entity.crm.CrmPurchesDetailEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 进货详情表
 *
 * @Author: hzq
 * @Date: 2023-12-18 14:57:39
 */
public interface CrmPurchesDetailDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CrmPurchesDetailEntity queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param crmPurchesDetailEntity 查询条件
     * @return 对象列表
     */
    List<CrmPurchesDetailEntity> queryAllByLimit(CrmPurchesDetailEntity crmPurchesDetailEntity);

    /**
     * 查询单行数据
     *
     * @param crmPurchesDetailEntity 查询条件
     * @return 对象列表
     */
    CrmPurchesDetailEntity selectOne(CrmPurchesDetailEntity crmPurchesDetailEntity);

    /**
     * 模糊查询
     *
     * @param crmPurchesDetailEntity 查询条件
     * @return 对象列表
     */
    List<CrmPurchesDetailEntity> fuzzyQuery(CrmPurchesDetailEntity crmPurchesDetailEntity);

    /**
     * 统计总行数
     *
     * @param crmPurchesDetailEntity 查询条件
     * @return 总行数
     */
    long count(CrmPurchesDetailEntity crmPurchesDetailEntity);

    /**
     * 新增数据
     *
     * @param crmPurchesDetailEntity 实例对象
     * @return 影响行数
     */
    int insert(CrmPurchesDetailEntity crmPurchesDetailEntity);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<CrmPurchesDetailEntity> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<CrmPurchesDetailEntity> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<CrmPurchesDetailEntity> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<CrmPurchesDetailEntity> entities);

    /**
     * 修改数据
     *
     * @param crmPurchesDetailEntity 实例对象
     * @return 影响行数
     */
    int update(CrmPurchesDetailEntity crmPurchesDetailEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

