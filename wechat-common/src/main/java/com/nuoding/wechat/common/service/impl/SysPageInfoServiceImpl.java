package com.nuoding.wechat.common.service.impl;

import com.nuoding.wechat.common.dao.SysPageInfoDao;
import com.nuoding.wechat.common.entity.SysPageInfo;
import com.nuoding.wechat.common.service.SysPageInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SysPageInfo)表服务实现类
 *
 * @author jhc
 * @since 2023-03-07 14:39:02
 */
@Service
public class SysPageInfoServiceImpl implements SysPageInfoService {
    @Resource
    private SysPageInfoDao sysPageInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SysPageInfo queryById(Integer id) {
        return this.sysPageInfoDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param sysPageInfo 筛选条件
     * @return 查询结果
     */
    @Override
    public List<SysPageInfo> queryByPage(SysPageInfo sysPageInfo) {
        return this.sysPageInfoDao.queryAllByLimit(sysPageInfo);
    }

    /**
     * 新增数据
     *
     * @param sysPageInfo 实例对象
     * @return 实例对象
     */
    @Override
    public SysPageInfo insert(SysPageInfo sysPageInfo) {
        this.sysPageInfoDao.insert(sysPageInfo);
        return sysPageInfo;
    }

    /**
     * 修改数据
     *
     * @param sysPageInfo 实例对象
     * @return 实例对象
     */
    @Override
    public SysPageInfo update(SysPageInfo sysPageInfo) {
        this.sysPageInfoDao.update(sysPageInfo);
        return this.queryById(sysPageInfo.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.sysPageInfoDao.deleteById(id) > 0;
    }
}
