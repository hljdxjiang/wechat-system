package com.nuoding.wechat.common.service.back;

import com.nuoding.wechat.common.entity.back.BackImgInfoEntity;

import java.util.List;

/**
 * (backImgInfo)表服务接口
 * 系统图片配置表
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface BackImgInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BackImgInfoEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param backImgInfoEntity 筛选条件
     * @return 查询结果
     */
    List<BackImgInfoEntity> queryAllByLimit(BackImgInfoEntity backImgInfoEntity);

    /**
     * 新增数据
     *
     * @param backImgInfoEntity 实例对象
     * @return 实例对象
     */
    BackImgInfoEntity insert(BackImgInfoEntity backImgInfoEntity);

    /**
     * 修改数据
     *
     * @param backImgInfoEntity 实例对象
     * @return 实例对象
     */
    BackImgInfoEntity update(BackImgInfoEntity backImgInfoEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
