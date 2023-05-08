package com.nuoding.wechat.common.service.sys;

import com.nuoding.wechat.common.entity.sys.SysItemInfoEntity;

import java.util.List;

/**
 * (sysItemInfo)表服务接口
 * 楼层要素表
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface SysItemInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysItemInfoEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param sysItemInfoEntity 筛选条件
     * @return 查询结果
     */
    List<SysItemInfoEntity> queryByPage(SysItemInfoEntity sysItemInfoEntity);

    /**
     * 新增数据
     *
     * @param sysItemInfoEntity 实例对象
     * @return 实例对象
     */
    SysItemInfoEntity insert(SysItemInfoEntity sysItemInfoEntity);

    /**
     * 修改数据
     *
     * @param sysItemInfoEntity 实例对象
     * @return 实例对象
     */
    SysItemInfoEntity update(SysItemInfoEntity sysItemInfoEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
