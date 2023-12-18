package com.nuoding.wechat.common.dao.crm;

import com.nuoding.wechat.common.entity.crm.CrmProdTypeEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 产品类型配置表
 *
 * @Author: hzq
 * @Date: 2023-12-18 14:57:38
 */
public interface CrmProdTypeDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CrmProdTypeEntity queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param crmProdTypeEntity 查询条件
     * @return 对象列表
     */
    List<CrmProdTypeEntity> queryAllByLimit(CrmProdTypeEntity crmProdTypeEntity);

    /**
     * 查询单行数据
     *
     * @param crmProdTypeEntity 查询条件
     * @return 对象列表
     */
    CrmProdTypeEntity selectOne(CrmProdTypeEntity crmProdTypeEntity);

    /**
     * 模糊查询
     *
     * @param crmProdTypeEntity 查询条件
     * @return 对象列表
     */
    List<CrmProdTypeEntity> fuzzyQuery(CrmProdTypeEntity crmProdTypeEntity);

    /**
     * 统计总行数
     *
     * @param crmProdTypeEntity 查询条件
     * @return 总行数
     */
    long count(CrmProdTypeEntity crmProdTypeEntity);

    /**
     * 新增数据
     *
     * @param crmProdTypeEntity 实例对象
     * @return 影响行数
     */
    int insert(CrmProdTypeEntity crmProdTypeEntity);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<CrmProdTypeEntity> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<CrmProdTypeEntity> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<CrmProdTypeEntity> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<CrmProdTypeEntity> entities);

    /**
     * 修改数据
     *
     * @param crmProdTypeEntity 实例对象
     * @return 影响行数
     */
    int update(CrmProdTypeEntity crmProdTypeEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

