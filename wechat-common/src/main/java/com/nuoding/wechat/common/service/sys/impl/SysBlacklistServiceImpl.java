package com.nuoding.wechat.common.service.sys.impl;

import com.nuoding.wechat.common.dao.sys.SysBlacklistDao;
import com.nuoding.wechat.common.entity.sys.SysBlacklistEntity;
import com.nuoding.wechat.common.service.sys.SysBlacklistService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (sysBlacklist)表服务实现类
 * 黑名单表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class SysBlacklistServiceImpl implements SysBlacklistService {
    @Resource
    private SysBlacklistDao sysBlacklistDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SysBlacklistEntity queryById(Integer id) {
        return this.sysBlacklistDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param sysBlacklistEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<SysBlacklistEntity> queryAllByLimit(SysBlacklistEntity sysBlacklistEntity) {
        return this.sysBlacklistDao.queryAllByLimit(sysBlacklistEntity);
    }

    /**
     * 新增数据
     *
     * @param sysBlacklistEntity 实例对象
     * @return 实例对象
     */
    @Override
    public SysBlacklistEntity insert(SysBlacklistEntity sysBlacklistEntity) {
        this.sysBlacklistDao.insert(sysBlacklistEntity);
        return sysBlacklistEntity;
    }

    /**
     * 修改数据
     *
     * @param sysBlacklistEntity 实例对象
     * @return 实例对象
     */
    @Override
    public SysBlacklistEntity update(SysBlacklistEntity sysBlacklistEntity) {
        this.sysBlacklistDao.update(sysBlacklistEntity);
        return this.queryById(sysBlacklistEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.sysBlacklistDao.deleteById(id) > 0;
    }
}
