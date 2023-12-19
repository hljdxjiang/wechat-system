package com.nuoding.wechat.common.service.sys;

import com.nuoding.wechat.common.entity.sys.SysPageFlowInfoEntity;

import java.util.List;

/**
 * (sysPageFlowInfo)表服务接口
 * 页面楼层表
 *
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface SysPageFlowInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysPageFlowInfoEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param sysPageFlowInfoEntity 筛选条件
     * @return 查询结果
     */
    List<SysPageFlowInfoEntity> queryAllByLimit(SysPageFlowInfoEntity sysPageFlowInfoEntity);

    /**
     * 模糊查询
     *
     * @param sysPageFlowInfoEntity 筛选条件
     * @return 查询结果
     */
    List<SysPageFlowInfoEntity> fuzzyQuery(SysPageFlowInfoEntity sysPageFlowInfoEntity);

    /**
     * 单挑查询
     *
     * @param sysPageFlowInfoEntity 筛选条件
     * @return 查询结果
     */
    SysPageFlowInfoEntity selectOne(SysPageFlowInfoEntity sysPageFlowInfoEntity);

    /**
     * 新增数据
     *
     * @param sysPageFlowInfoEntity 实例对象
     * @return 实例对象
     */
    SysPageFlowInfoEntity insert(SysPageFlowInfoEntity sysPageFlowInfoEntity);

    /**
     * 修改数据
     *
     * @param sysPageFlowInfoEntity 实例对象
     * @return 实例对象
     */
    SysPageFlowInfoEntity update(SysPageFlowInfoEntity sysPageFlowInfoEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
