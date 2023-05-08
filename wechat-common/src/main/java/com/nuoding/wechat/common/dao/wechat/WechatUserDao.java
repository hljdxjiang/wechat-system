package com.nuoding.wechat.common.dao.wechat;

import com.nuoding.wechat.common.entity.wechat.WechatUserEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 微信用户信息表
 *
 * @Author: hzq
 * @Date: 2023-05-08 19:32:47
 */
public interface WechatUserDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    WechatUserEntity queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param wechatUserEntity 查询条件
     * @return 对象列表
     */
    List<WechatUserEntity> queryAllByLimit(WechatUserEntity wechatUserEntity);

    /**
     * 统计总行数
     *
     * @param wechatUserEntity 查询条件
     * @return 总行数
     */
    long count(WechatUserEntity wechatUserEntity);

    /**
     * 新增数据
     *
     * @param wechatUserEntity 实例对象
     * @return 影响行数
     */
    int insert(WechatUserEntity wechatUserEntity);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<WechatUserEntity> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<WechatUserEntity> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<WechatUserEntity> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<WechatUserEntity> entities);

    /**
     * 修改数据
     *
     * @param wechatUserEntity 实例对象
     * @return 影响行数
     */
    int update(WechatUserEntity wechatUserEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

