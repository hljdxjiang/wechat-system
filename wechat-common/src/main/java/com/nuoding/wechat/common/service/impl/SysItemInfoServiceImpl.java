package com.nuoding.wechat.common.service.impl;

import com.nuoding.wechat.common.dao.SysItemInfoDao;
import com.nuoding.wechat.common.entity.SysItemInfo;
import com.nuoding.wechat.common.service.SysItemInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SysItemInfo)表服务实现类
 *
 * @author jhc
 * @since 2023-03-07 14:39:02
 */
@Service
public class SysItemInfoServiceImpl implements SysItemInfoService {
    @Resource
    private SysItemInfoDao sysItemInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SysItemInfo queryById(Integer id) {
        return this.sysItemInfoDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param sysItemInfo 筛选条件
     * @return 查询结果
     */
    @Override
    public List<SysItemInfo> queryByPage(SysItemInfo sysItemInfo) {
        return this.sysItemInfoDao.queryAllByLimit(sysItemInfo);
    }

    /**
     * 新增数据
     *
     * @param sysItemInfo 实例对象
     * @return 实例对象
     */
    @Override
    public SysItemInfo insert(SysItemInfo sysItemInfo) {
        this.sysItemInfoDao.insert(sysItemInfo);
        return sysItemInfo;
    }

    /**
     * 修改数据
     *
     * @param sysItemInfo 实例对象
     * @return 实例对象
     */
    @Override
    public SysItemInfo update(SysItemInfo sysItemInfo) {
        this.sysItemInfoDao.update(sysItemInfo);
        return this.queryById(sysItemInfo.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.sysItemInfoDao.deleteById(id) > 0;
    }
}
