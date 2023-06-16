package com.nuoding.wechat.common.dao.wechat;

import com.nuoding.wechat.common.entity.wechat.WechatMenusMatchruleEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 微信个性化菜单匹配表
 *
 * @Author: hzq
 * @Date: 2023-06-08 17:37:05
 */
public interface WechatMenusMatchruleDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    WechatMenusMatchruleEntity queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param wechatMenusMatchruleEntity 查询条件
     * @return 对象列表
     */
    List<WechatMenusMatchruleEntity> queryAllByLimit(WechatMenusMatchruleEntity wechatMenusMatchruleEntity);

    /**
     * 统计总行数
     *
     * @param wechatMenusMatchruleEntity 查询条件
     * @return 总行数
     */
    long count(WechatMenusMatchruleEntity wechatMenusMatchruleEntity);

    /**
     * 新增数据
     *
     * @param wechatMenusMatchruleEntity 实例对象
     * @return 影响行数
     */
    int insert(WechatMenusMatchruleEntity wechatMenusMatchruleEntity);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<WechatMenusMatchruleEntity> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<WechatMenusMatchruleEntity> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<WechatMenusMatchruleEntity> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<WechatMenusMatchruleEntity> entities);

    /**
     * 修改数据
     *
     * @param wechatMenusMatchruleEntity 实例对象
     * @return 影响行数
     */
    int update(WechatMenusMatchruleEntity wechatMenusMatchruleEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

