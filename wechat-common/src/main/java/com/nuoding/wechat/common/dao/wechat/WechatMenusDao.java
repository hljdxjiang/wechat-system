package com.nuoding.wechat.common.dao.wechat;

import com.nuoding.wechat.common.entity.wechat.WechatMenusEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 微信菜单表
 *
 * @Author: hzq
 * @Date: 2023-12-22 17:12:02
 */
@Repository
public interface WechatMenusDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    WechatMenusEntity queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param wechatMenusEntity 查询条件
     * @return 对象列表
     */
    List<WechatMenusEntity> queryAllByLimit(WechatMenusEntity wechatMenusEntity);

    /**
     * 查询单行数据
     *
     * @param wechatMenusEntity 查询条件
     * @return 对象列表
     */
    WechatMenusEntity selectOne(WechatMenusEntity wechatMenusEntity);

    /**
     * 模糊查询
     *
     * @param wechatMenusEntity 查询条件
     * @return 对象列表
     */
    List<WechatMenusEntity> fuzzyQuery(WechatMenusEntity wechatMenusEntity);

    /**
     * 统计总行数
     *
     * @param wechatMenusEntity 查询条件
     * @return 总行数
     */
    long count(WechatMenusEntity wechatMenusEntity);

    /**
     * 新增数据
     *
     * @param wechatMenusEntity 实例对象
     * @return 影响行数
     */
    int insert(WechatMenusEntity wechatMenusEntity);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<WechatMenusEntity> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<WechatMenusEntity> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<WechatMenusEntity> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<WechatMenusEntity> entities);

    /**
     * 修改数据
     *
     * @param wechatMenusEntity 实例对象
     * @return 影响行数
     */
    int update(WechatMenusEntity wechatMenusEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

