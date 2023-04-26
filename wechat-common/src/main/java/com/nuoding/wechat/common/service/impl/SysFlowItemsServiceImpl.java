package com.nuoding.wechat.common.service.impl;

import com.nuoding.wechat.common.dao.SysFlowItemsDao;
import com.nuoding.wechat.common.entity.SysFlowItems;
import com.nuoding.wechat.common.service.SysFlowItemsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SysFlowItems)表服务实现类
 *
 * @author jhc
 * @since 2023-03-07 14:39:02
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
    public SysFlowItems queryById(Integer id) {
        return this.sysFlowItemsDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param sysFlowItems 筛选条件
     * @return 查询结果
     */
    @Override
    public List<SysFlowItems> queryByPage(SysFlowItems sysFlowItems) {
        return this.sysFlowItemsDao.queryAllByLimit(sysFlowItems);
    }

    /**
     * 新增数据
     *
     * @param sysFlowItems 实例对象
     * @return 实例对象
     */
    @Override
    public SysFlowItems insert(SysFlowItems sysFlowItems) {
        this.sysFlowItemsDao.insert(sysFlowItems);
        return sysFlowItems;
    }

    /**
     * 修改数据
     *
     * @param sysFlowItems 实例对象
     * @return 实例对象
     */
    @Override
    public SysFlowItems update(SysFlowItems sysFlowItems) {
        this.sysFlowItemsDao.update(sysFlowItems);
        return this.queryById(sysFlowItems.getId());
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
