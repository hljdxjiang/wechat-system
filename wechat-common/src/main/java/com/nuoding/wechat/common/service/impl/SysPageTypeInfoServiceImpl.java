package com.nuoding.wechat.common.service.impl;

import com.nuoding.wechat.common.dao.SysPageTypeInfoDao;
import com.nuoding.wechat.common.entity.SysPageTypeInfo;
import com.nuoding.wechat.common.service.SysPageTypeInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SysPageTypeInfo)表服务实现类
 *
 * @author jhc
 * @since 2023-03-07 14:39:02
 */
@Service
public class SysPageTypeInfoServiceImpl implements SysPageTypeInfoService {
    @Resource
    private SysPageTypeInfoDao sysPageTypeInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SysPageTypeInfo queryById(Integer id) {
        return this.sysPageTypeInfoDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param sysPageTypeInfo 筛选条件
     * @return 查询结果
     */
    @Override
    public List<SysPageTypeInfo> queryByPage(SysPageTypeInfo sysPageTypeInfo) {
        return this.sysPageTypeInfoDao.queryAllByLimit(sysPageTypeInfo);
    }

    /**
     * 新增数据
     *
     * @param sysPageTypeInfo 实例对象
     * @return 实例对象
     */
    @Override
    public SysPageTypeInfo insert(SysPageTypeInfo sysPageTypeInfo) {
        this.sysPageTypeInfoDao.insert(sysPageTypeInfo);
        return sysPageTypeInfo;
    }

    /**
     * 修改数据
     *
     * @param sysPageTypeInfo 实例对象
     * @return 实例对象
     */
    @Override
    public SysPageTypeInfo update(SysPageTypeInfo sysPageTypeInfo) {
        this.sysPageTypeInfoDao.update(sysPageTypeInfo);
        return this.queryById(sysPageTypeInfo.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.sysPageTypeInfoDao.deleteById(id) > 0;
    }
}
