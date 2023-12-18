package com.nuoding.wechat.common.dao.wechat;

import com.nuoding.wechat.common.entity.wechat.WechatMenusOptionEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 微信菜单要素表
 *
 * @Author: hzq
 * @Date: 2023-12-18 14:57:38
 */
public interface WechatMenusOptionDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    WechatMenusOptionEntity queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param wechatMenusOptionEntity 查询条件
     * @return 对象列表
     */
    List<WechatMenusOptionEntity> queryAllByLimit(WechatMenusOptionEntity wechatMenusOptionEntity);

    /**
     * 查询单行数据
     *
     * @param wechatMenusOptionEntity 查询条件
     * @return 对象列表
     */
    WechatMenusOptionEntity selectOne(WechatMenusOptionEntity wechatMenusOptionEntity);

    /**
     * 模糊查询
     *
     * @param wechatMenusOptionEntity 查询条件
     * @return 对象列表
     */
    List<WechatMenusOptionEntity> fuzzyQuery(WechatMenusOptionEntity wechatMenusOptionEntity);

    /**
     * 统计总行数
     *
     * @param wechatMenusOptionEntity 查询条件
     * @return 总行数
     */
    long count(WechatMenusOptionEntity wechatMenusOptionEntity);

    /**
     * 新增数据
     *
     * @param wechatMenusOptionEntity 实例对象
     * @return 影响行数
     */
    int insert(WechatMenusOptionEntity wechatMenusOptionEntity);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<WechatMenusOptionEntity> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<WechatMenusOptionEntity> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<WechatMenusOptionEntity> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<WechatMenusOptionEntity> entities);

    /**
     * 修改数据
     *
     * @param wechatMenusOptionEntity 实例对象
     * @return 影响行数
     */
    int update(WechatMenusOptionEntity wechatMenusOptionEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

