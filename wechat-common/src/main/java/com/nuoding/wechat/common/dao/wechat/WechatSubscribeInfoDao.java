package com.nuoding.wechat.common.dao.wechat;

import com.nuoding.wechat.common.entity.wechat.WechatSubscribeInfoEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户订阅信息表
 *
 * @Author: hzq
 * @Date: 2023-12-19 13:50:20
 */
@Repository
public interface WechatSubscribeInfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    WechatSubscribeInfoEntity queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param wechatSubscribeInfoEntity 查询条件
     * @return 对象列表
     */
    List<WechatSubscribeInfoEntity> queryAllByLimit(WechatSubscribeInfoEntity wechatSubscribeInfoEntity);

    /**
     * 查询单行数据
     *
     * @param wechatSubscribeInfoEntity 查询条件
     * @return 对象列表
     */
    WechatSubscribeInfoEntity selectOne(WechatSubscribeInfoEntity wechatSubscribeInfoEntity);

    /**
     * 模糊查询
     *
     * @param wechatSubscribeInfoEntity 查询条件
     * @return 对象列表
     */
    List<WechatSubscribeInfoEntity> fuzzyQuery(WechatSubscribeInfoEntity wechatSubscribeInfoEntity);

    /**
     * 统计总行数
     *
     * @param wechatSubscribeInfoEntity 查询条件
     * @return 总行数
     */
    long count(WechatSubscribeInfoEntity wechatSubscribeInfoEntity);

    /**
     * 新增数据
     *
     * @param wechatSubscribeInfoEntity 实例对象
     * @return 影响行数
     */
    int insert(WechatSubscribeInfoEntity wechatSubscribeInfoEntity);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<WechatSubscribeInfoEntity> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<WechatSubscribeInfoEntity> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<WechatSubscribeInfoEntity> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<WechatSubscribeInfoEntity> entities);

    /**
     * 修改数据
     *
     * @param wechatSubscribeInfoEntity 实例对象
     * @return 影响行数
     */
    int update(WechatSubscribeInfoEntity wechatSubscribeInfoEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

