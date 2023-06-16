package com.nuoding.wechat.common.service.sys.impl;

import com.nuoding.wechat.common.dao.sys.SysFlowItemsDao;
import com.nuoding.wechat.common.entity.sys.SysFlowItemsEntity;
import com.nuoding.wechat.common.service.sys.SysFlowItemsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (sysFlowItems)表服务实现类
 * 楼层要素表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class SysFlowItemsServiceImpl implements SysFlowItemsService {
    @Resource
    private SysFlowItemsDao sysFlowItemsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SysFlowItemsEntity queryById(Integer id) {
        return this.sysFlowItemsDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param sysFlowItemsEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<SysFlowItemsEntity> queryAllByLimit(SysFlowItemsEntity sysFlowItemsEntity) {
        return this.sysFlowItemsDao.queryAllByLimit(sysFlowItemsEntity);
    }

    /**
     * 新增数据
     *
     * @param sysFlowItemsEntity 实例对象
     * @return 实例对象
     */
    @Override
    public SysFlowItemsEntity insert(SysFlowItemsEntity sysFlowItemsEntity) {
        this.sysFlowItemsDao.insert(sysFlowItemsEntity);
        return sysFlowItemsEntity;
    }

    /**
     * 修改数据
     *
     * @param sysFlowItemsEntity 实例对象
     * @return 实例对象
     */
    @Override
    public SysFlowItemsEntity update(SysFlowItemsEntity sysFlowItemsEntity) {
        this.sysFlowItemsDao.update(sysFlowItemsEntity);
        return this.queryById(sysFlowItemsEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.sysFlowItemsDao.deleteById(id) > 0;
    }
}
