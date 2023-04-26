package com.nuoding.wechat.common.service;

import com.nuoding.wechat.common.entity.BackOperaRecord;

import java.util.List;

/**
 * (BackOperaRecord)表服务接口
 *
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
    BackOperaRecord queryById(Integer id);

    /**
     * 分页查询
     *
     * @param backOperaRecord 筛选条件
     * @return 查询结果
     */
    List<BackOperaRecord> queryByPage(BackOperaRecord backOperaRecord);

    /**
     * 新增数据
     *
     * @param backOperaRecord 实例对象
     * @return 实例对象
     */
    BackOperaRecord insert(BackOperaRecord backOperaRecord);

    /**
     * 修改数据
     *
     * @param backOperaRecord 实例对象
     * @return 实例对象
     */
    BackOperaRecord update(BackOperaRecord backOperaRecord);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
