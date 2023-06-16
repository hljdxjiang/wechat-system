package com.nuoding.wechat.common.service.back;

import com.nuoding.wechat.common.entity.back.BackUserLoginRecordEntity;

import java.util.List;

/**
 * (backUserLoginRecord)表服务接口
 * 用户登录历史表
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface BackUserLoginRecordService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BackUserLoginRecordEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param backUserLoginRecordEntity 筛选条件
     * @return 查询结果
     */
    List<BackUserLoginRecordEntity> queryAllByLimit(BackUserLoginRecordEntity backUserLoginRecordEntity);

    /**
     * 新增数据
     *
     * @param backUserLoginRecordEntity 实例对象
     * @return 实例对象
     */
    BackUserLoginRecordEntity insert(BackUserLoginRecordEntity backUserLoginRecordEntity);

    /**
     * 修改数据
     *
     * @param backUserLoginRecordEntity 实例对象
     * @return 实例对象
     */
    BackUserLoginRecordEntity update(BackUserLoginRecordEntity backUserLoginRecordEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
