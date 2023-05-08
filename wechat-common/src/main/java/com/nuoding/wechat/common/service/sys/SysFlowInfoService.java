package com.nuoding.wechat.common.service.sys;

import com.nuoding.wechat.common.entity.sys.SysFlowInfoEntity;

import java.util.List;

/**
 * (sysFlowInfo)表服务接口
 * 楼层信息表
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface SysFlowInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysFlowInfoEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param sysFlowInfoEntity 筛选条件
     * @return 查询结果
     */
    List<SysFlowInfoEntity> queryByPage(SysFlowInfoEntity sysFlowInfoEntity);

    /**
     * 新增数据
     *
     * @param sysFlowInfoEntity 实例对象
     * @return 实例对象
     */
    SysFlowInfoEntity insert(SysFlowInfoEntity sysFlowInfoEntity);

    /**
     * 修改数据
     *
     * @param sysFlowInfoEntity 实例对象
     * @return 实例对象
     */
    SysFlowInfoEntity update(SysFlowInfoEntity sysFlowInfoEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
