package com.nuoding.wechat.common.dao.crm;

import com.nuoding.wechat.common.entity.crm.CrmReferrerInfoEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 推荐人信息表
 *
 * @Author: hzq
 * @Date: 2023-05-08 19:32:47
 */
public interface CrmReferrerInfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CrmReferrerInfoEntity queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param crmReferrerInfoEntity 查询条件
     * @return 对象列表
     */
    List<CrmReferrerInfoEntity> queryAllByLimit(CrmReferrerInfoEntity crmReferrerInfoEntity);

    /**
     * 统计总行数
     *
     * @param crmReferrerInfoEntity 查询条件
     * @return 总行数
     */
    long count(CrmReferrerInfoEntity crmReferrerInfoEntity);

    /**
     * 新增数据
     *
     * @param crmReferrerInfoEntity 实例对象
     * @return 影响行数
     */
    int insert(CrmReferrerInfoEntity crmReferrerInfoEntity);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<CrmReferrerInfoEntity> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<CrmReferrerInfoEntity> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<CrmReferrerInfoEntity> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<CrmReferrerInfoEntity> entities);

    /**
     * 修改数据
     *
     * @param crmReferrerInfoEntity 实例对象
     * @return 影响行数
     */
    int update(CrmReferrerInfoEntity crmReferrerInfoEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

