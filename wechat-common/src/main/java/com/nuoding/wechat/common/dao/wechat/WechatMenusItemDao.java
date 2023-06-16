package com.nuoding.wechat.common.dao.wechat;

import com.nuoding.wechat.common.entity.wechat.WechatMenusItemEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 微信菜单要素表
 *
 * @Author: hzq
 * @Date: 2023-06-08 17:37:05
 */
public interface WechatMenusItemDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    WechatMenusItemEntity queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param wechatMenusItemEntity 查询条件
     * @return 对象列表
     */
    List<WechatMenusItemEntity> queryAllByLimit(WechatMenusItemEntity wechatMenusItemEntity);

    /**
     * 统计总行数
     *
     * @param wechatMenusItemEntity 查询条件
     * @return 总行数
     */
    long count(WechatMenusItemEntity wechatMenusItemEntity);

    /**
     * 新增数据
     *
     * @param wechatMenusItemEntity 实例对象
     * @return 影响行数
     */
    int insert(WechatMenusItemEntity wechatMenusItemEntity);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<WechatMenusItemEntity> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<WechatMenusItemEntity> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<WechatMenusItemEntity> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<WechatMenusItemEntity> entities);

    /**
     * 修改数据
     *
     * @param wechatMenusItemEntity 实例对象
     * @return 影响行数
     */
    int update(WechatMenusItemEntity wechatMenusItemEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

