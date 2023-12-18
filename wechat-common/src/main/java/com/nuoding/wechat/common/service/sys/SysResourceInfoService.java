package com.nuoding.wechat.common.service.sys;

import com.nuoding.wechat.common.entity.sys.SysResourceInfoEntity;

import java.util.List;

/**
 * (sysResourceInfo)表服务接口
 * 资源信息表
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface SysResourceInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysResourceInfoEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param sysResourceInfoEntity 筛选条件
     * @return 查询结果
     */
    List<SysResourceInfoEntity> queryAllByLimit(SysResourceInfoEntity sysResourceInfoEntity);

    /**
     * 模糊查询
     *
     * @param sysResourceInfoEntity 筛选条件
     * @return 查询结果
     */
    List<SysResourceInfoEntity> fuzzyQuery(SysResourceInfoEntity sysResourceInfoEntity);

    /**
     * 单挑查询
     *
     * @param sysResourceInfoEntity 筛选条件
     * @return 查询结果
     */
    SysResourceInfoEntity selectOne(SysResourceInfoEntity sysResourceInfoEntity);

    /**
     * 新增数据
     *
     * @param sysResourceInfoEntity 实例对象
     * @return 实例对象
     */
    SysResourceInfoEntity insert(SysResourceInfoEntity sysResourceInfoEntity);

    /**
     * 修改数据
     *
     * @param sysResourceInfoEntity 实例对象
     * @return 实例对象
     */
    SysResourceInfoEntity update(SysResourceInfoEntity sysResourceInfoEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
