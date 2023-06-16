package com.nuoding.wechat.common.service.sys.impl;

import com.nuoding.wechat.common.dao.sys.SysPageTypeInfoDao;
import com.nuoding.wechat.common.entity.sys.SysPageTypeInfoEntity;
import com.nuoding.wechat.common.service.sys.SysPageTypeInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (sysPageTypeInfo)表服务实现类
 * 类型配置表
 * @author jhc
 * @since 2023-03-07 14:38:19
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
    public SysPageTypeInfoEntity queryById(Integer id) {
        return this.sysPageTypeInfoDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param sysPageTypeInfoEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<SysPageTypeInfoEntity> queryAllByLimit(SysPageTypeInfoEntity sysPageTypeInfoEntity) {
        return this.sysPageTypeInfoDao.queryAllByLimit(sysPageTypeInfoEntity);
    }

    /**
     * 新增数据
     *
     * @param sysPageTypeInfoEntity 实例对象
     * @return 实例对象
     */
    @Override
    public SysPageTypeInfoEntity insert(SysPageTypeInfoEntity sysPageTypeInfoEntity) {
        this.sysPageTypeInfoDao.insert(sysPageTypeInfoEntity);
        return sysPageTypeInfoEntity;
    }

    /**
     * 修改数据
     *
     * @param sysPageTypeInfoEntity 实例对象
     * @return 实例对象
     */
    @Override
    public SysPageTypeInfoEntity update(SysPageTypeInfoEntity sysPageTypeInfoEntity) {
        this.sysPageTypeInfoDao.update(sysPageTypeInfoEntity);
        return this.queryById(sysPageTypeInfoEntity.getId());
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
