package com.nuoding.wechat.common.service.back;

import com.nuoding.wechat.common.entity.back.BackOperaRecordEntity;

import java.util.List;

/**
 * (backOperaRecord)表服务接口
 * 后管操作记录表
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface BackOperaRecordService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BackOperaRecordEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param backOperaRecordEntity 筛选条件
     * @return 查询结果
     */
    List<BackOperaRecordEntity> queryAllByLimit(BackOperaRecordEntity backOperaRecordEntity);

    /**
     * 模糊查询
     *
     * @param backOperaRecordEntity 筛选条件
     * @return 查询结果
     */
    List<BackOperaRecordEntity> fuzzyQuery(BackOperaRecordEntity backOperaRecordEntity);

    /**
     * 单挑查询
     *
     * @param backOperaRecordEntity 筛选条件
     * @return 查询结果
     */
    BackOperaRecordEntity selectOne(BackOperaRecordEntity backOperaRecordEntity);

    /**
     * 新增数据
     *
     * @param backOperaRecordEntity 实例对象
     * @return 实例对象
     */
    BackOperaRecordEntity insert(BackOperaRecordEntity backOperaRecordEntity);

    /**
     * 修改数据
     *
     * @param backOperaRecordEntity 实例对象
     * @return 实例对象
     */
    BackOperaRecordEntity update(BackOperaRecordEntity backOperaRecordEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
