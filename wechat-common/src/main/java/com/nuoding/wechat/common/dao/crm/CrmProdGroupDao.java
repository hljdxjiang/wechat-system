package com.nuoding.wechat.common.dao.crm;

import com.nuoding.wechat.common.entity.crm.CrmProdGroupEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 产品分组表
 *
 * @Author: hzq
 * @Date: 2023-12-19 13:50:19
 */
@Repository
public interface CrmProdGroupDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CrmProdGroupEntity queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param crmProdGroupEntity 查询条件
     * @return 对象列表
     */
    List<CrmProdGroupEntity> queryAllByLimit(CrmProdGroupEntity crmProdGroupEntity);

    /**
     * 查询单行数据
     *
     * @param crmProdGroupEntity 查询条件
     * @return 对象列表
     */
    CrmProdGroupEntity selectOne(CrmProdGroupEntity crmProdGroupEntity);

    /**
     * 模糊查询
     *
     * @param crmProdGroupEntity 查询条件
     * @return 对象列表
     */
    List<CrmProdGroupEntity> fuzzyQuery(CrmProdGroupEntity crmProdGroupEntity);

    /**
     * 统计总行数
     *
     * @param crmProdGroupEntity 查询条件
     * @return 总行数
     */
    long count(CrmProdGroupEntity crmProdGroupEntity);

    /**
     * 新增数据
     *
     * @param crmProdGroupEntity 实例对象
     * @return 影响行数
     */
    int insert(CrmProdGroupEntity crmProdGroupEntity);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<CrmProdGroupEntity> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<CrmProdGroupEntity> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<CrmProdGroupEntity> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<CrmProdGroupEntity> entities);

    /**
     * 修改数据
     *
     * @param crmProdGroupEntity 实例对象
     * @return 影响行数
     */
    int update(CrmProdGroupEntity crmProdGroupEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

