package com.nuoding.wechat.common.dao.crm;

import com.nuoding.wechat.common.entity.crm.CrmBrandInfoEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 品牌信息表
 *
 * @Author: hzq
 * @Date: 2023-06-08 17:37:05
 */
public interface CrmBrandInfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CrmBrandInfoEntity queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param crmBrandInfoEntity 查询条件
     * @return 对象列表
     */
    List<CrmBrandInfoEntity> queryAllByLimit(CrmBrandInfoEntity crmBrandInfoEntity);

    /**
     * 统计总行数
     *
     * @param crmBrandInfoEntity 查询条件
     * @return 总行数
     */
    long count(CrmBrandInfoEntity crmBrandInfoEntity);

    /**
     * 新增数据
     *
     * @param crmBrandInfoEntity 实例对象
     * @return 影响行数
     */
    int insert(CrmBrandInfoEntity crmBrandInfoEntity);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<CrmBrandInfoEntity> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<CrmBrandInfoEntity> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<CrmBrandInfoEntity> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<CrmBrandInfoEntity> entities);

    /**
     * 修改数据
     *
     * @param crmBrandInfoEntity 实例对象
     * @return 影响行数
     */
    int update(CrmBrandInfoEntity crmBrandInfoEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

