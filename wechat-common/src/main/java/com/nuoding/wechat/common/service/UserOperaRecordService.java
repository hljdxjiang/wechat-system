package com.nuoding.wechat.common.service;

import com.nuoding.wechat.common.entity.UserOperaRecord;

import java.util.List;

/**
 * (UserOperaRecord)表服务接口
 *
 * @author jhc
 * @since 2023-03-07 14:39:03
 */
public interface UserOperaRecordService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UserOperaRecord queryById(Integer id);

    /**
     * 分页查询
     *
     * @param userOperaRecord 筛选条件
     * @return 查询结果
     */
    List<UserOperaRecord> queryByPage(UserOperaRecord userOperaRecord);

    /**
     * 新增数据
     *
     * @param userOperaRecord 实例对象
     * @return 实例对象
     */
    UserOperaRecord insert(UserOperaRecord userOperaRecord);

    /**
     * 异步新增数据
     *
     * @param userOperaRecord 实例对象
     * @return 实例对象
     */
    UserOperaRecord asyncInsert(UserOperaRecord userOperaRecord);

    /**
     * 修改数据
     *
     * @param userOperaRecord 实例对象
     * @return 实例对象
     */
    UserOperaRecord update(UserOperaRecord userOperaRecord);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
