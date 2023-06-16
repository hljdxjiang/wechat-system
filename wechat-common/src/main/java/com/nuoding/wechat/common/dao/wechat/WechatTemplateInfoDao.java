package com.nuoding.wechat.common.dao.wechat;

import com.nuoding.wechat.common.entity.wechat.WechatTemplateInfoEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 微信推送模板
 *
 * @Author: hzq
 * @Date: 2023-06-08 17:37:05
 */
public interface WechatTemplateInfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    WechatTemplateInfoEntity queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param wechatTemplateInfoEntity 查询条件
     * @return 对象列表
     */
    List<WechatTemplateInfoEntity> queryAllByLimit(WechatTemplateInfoEntity wechatTemplateInfoEntity);

    /**
     * 统计总行数
     *
     * @param wechatTemplateInfoEntity 查询条件
     * @return 总行数
     */
    long count(WechatTemplateInfoEntity wechatTemplateInfoEntity);

    /**
     * 新增数据
     *
     * @param wechatTemplateInfoEntity 实例对象
     * @return 影响行数
     */
    int insert(WechatTemplateInfoEntity wechatTemplateInfoEntity);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<WechatTemplateInfoEntity> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<WechatTemplateInfoEntity> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<WechatTemplateInfoEntity> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<WechatTemplateInfoEntity> entities);

    /**
     * 修改数据
     *
     * @param wechatTemplateInfoEntity 实例对象
     * @return 影响行数
     */
    int update(WechatTemplateInfoEntity wechatTemplateInfoEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

