package com.nuoding.wechat.common.dao.crm;

import com.nuoding.wechat.common.entity.crm.CrmProdInfoEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 产品信息表
 *
 * @Author: hzq
 * @Date: 2023-12-18 14:57:37
 */
public interface CrmProdInfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CrmProdInfoEntity queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param crmProdInfoEntity 查询条件
     * @return 对象列表
     */
    List<CrmProdInfoEntity> queryAllByLimit(CrmProdInfoEntity crmProdInfoEntity);

    /**
     * 查询单行数据
     *
     * @param crmProdInfoEntity 查询条件
     * @return 对象列表
     */
    CrmProdInfoEntity selectOne(CrmProdInfoEntity crmProdInfoEntity);

    /**
     * 模糊查询
     *
     * @param crmProdInfoEntity 查询条件
     * @return 对象列表
     */
    List<CrmProdInfoEntity> fuzzyQuery(CrmProdInfoEntity crmProdInfoEntity);

    /**
     * 统计总行数
     *
     * @param crmProdInfoEntity 查询条件
     * @return 总行数
     */
    long count(CrmProdInfoEntity crmProdInfoEntity);

    /**
     * 新增数据
     *
     * @param crmProdInfoEntity 实例对象
     * @return 影响行数
     */
    int insert(CrmProdInfoEntity crmProdInfoEntity);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<CrmProdInfoEntity> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<CrmProdInfoEntity> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<CrmProdInfoEntity> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<CrmProdInfoEntity> entities);

    /**
     * 修改数据
     *
     * @param crmProdInfoEntity 实例对象
     * @return 影响行数
     */
    int update(CrmProdInfoEntity crmProdInfoEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

