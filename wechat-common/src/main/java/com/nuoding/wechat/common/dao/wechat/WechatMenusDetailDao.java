package com.nuoding.wechat.common.dao.wechat;

import com.nuoding.wechat.common.entity.wechat.WechatMenusDetailEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 微信菜单要素表
 *
 * @Author: hzq
 * @Date: 2023-06-05 17:49:46
 */
public interface WechatMenusDetailDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    WechatMenusDetailEntity queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param wechatMenusDetailEntity 查询条件
     * @return 对象列表
     */
    List<WechatMenusDetailEntity> queryAllByLimit(WechatMenusDetailEntity wechatMenusDetailEntity);

    /**
     * 统计总行数
     *
     * @param wechatMenusDetailEntity 查询条件
     * @return 总行数
     */
    long count(WechatMenusDetailEntity wechatMenusDetailEntity);

    /**
     * 新增数据
     *
     * @param wechatMenusDetailEntity 实例对象
     * @return 影响行数
     */
    int insert(WechatMenusDetailEntity wechatMenusDetailEntity);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<WechatMenusDetailEntity> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<WechatMenusDetailEntity> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<WechatMenusDetailEntity> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<WechatMenusDetailEntity> entities);

    /**
     * 修改数据
     *
     * @param wechatMenusDetailEntity 实例对象
     * @return 影响行数
     */
    int update(WechatMenusDetailEntity wechatMenusDetailEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

