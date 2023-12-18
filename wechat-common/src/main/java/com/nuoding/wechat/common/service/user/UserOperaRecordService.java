package com.nuoding.wechat.common.service.user;

import com.nuoding.wechat.common.entity.user.UserOperaRecordEntity;

import java.util.List;

/**
 * (userOperaRecord)表服务接口
 * 用户操作历史表
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface UserOperaRecordService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UserOperaRecordEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param userOperaRecordEntity 筛选条件
     * @return 查询结果
     */
    List<UserOperaRecordEntity> queryAllByLimit(UserOperaRecordEntity userOperaRecordEntity);

    /**
     * 模糊查询
     *
     * @param userOperaRecordEntity 筛选条件
     * @return 查询结果
     */
    List<UserOperaRecordEntity> fuzzyQuery(UserOperaRecordEntity userOperaRecordEntity);

    /**
     * 单挑查询
     *
     * @param userOperaRecordEntity 筛选条件
     * @return 查询结果
     */
    UserOperaRecordEntity selectOne(UserOperaRecordEntity userOperaRecordEntity);

    /**
     * 新增数据
     *
     * @param userOperaRecordEntity 实例对象
     * @return 实例对象
     */
    UserOperaRecordEntity insert(UserOperaRecordEntity userOperaRecordEntity);

    /**
     * 异步新增数据
     *
     * @param userOperaRecordEntity 实例对象
     * @return 实例对象
     */
    UserOperaRecordEntity asyncInsert(UserOperaRecordEntity userOperaRecordEntity);

    /**
     * 修改数据
     *
     * @param userOperaRecordEntity 实例对象
     * @return 实例对象
     */
    UserOperaRecordEntity update(UserOperaRecordEntity userOperaRecordEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
