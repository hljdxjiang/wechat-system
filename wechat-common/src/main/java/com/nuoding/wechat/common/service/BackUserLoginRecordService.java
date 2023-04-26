package com.nuoding.wechat.common.service;

import com.nuoding.wechat.common.entity.BackUserLoginRecord;

import java.util.List;

/**
 * (BackUserLoginRecord)表服务接口
 *
 * @author jhc
 * @since 2023-03-07 14:38:32
 */
public interface BackUserLoginRecordService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BackUserLoginRecord queryById(Integer id);

    /**
     * 分页查询
     *
     * @param backUserLoginRecord 筛选条件
     * @return 查询结果
     */
    List<BackUserLoginRecord> queryByPage(BackUserLoginRecord backUserLoginRecord);

    /**
     * 新增数据
     *
     * @param backUserLoginRecord 实例对象
     * @return 实例对象
     */
    BackUserLoginRecord insert(BackUserLoginRecord backUserLoginRecord);

    /**
     * 修改数据
     *
     * @param backUserLoginRecord 实例对象
     * @return 实例对象
     */
    BackUserLoginRecord update(BackUserLoginRecord backUserLoginRecord);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

    /**
     * 异步新增数据
     *
     * @param backUserLoginRecord 实例对象
     * @return 实例对象
     */
    BackUserLoginRecord asyncInsert(BackUserLoginRecord backUserLoginRecord);


}
