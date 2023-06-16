package com.nuoding.wechat.common.service.sys.impl;

import com.nuoding.wechat.common.dao.sys.SysPageInfoDao;
import com.nuoding.wechat.common.entity.sys.SysPageInfoEntity;
import com.nuoding.wechat.common.service.sys.SysPageInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (sysPageInfo)表服务实现类
 * 页面信息表
 * @author jhc
 * @since 2023-03-07 14:38:19
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
    public SysPageInfoEntity queryById(Integer id) {
        return this.sysPageInfoDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param sysPageInfoEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<SysPageInfoEntity> queryAllByLimit(SysPageInfoEntity sysPageInfoEntity) {
        return this.sysPageInfoDao.queryAllByLimit(sysPageInfoEntity);
    }

    /**
     * 新增数据
     *
     * @param sysPageInfoEntity 实例对象
     * @return 实例对象
     */
    @Override
    public SysPageInfoEntity insert(SysPageInfoEntity sysPageInfoEntity) {
        this.sysPageInfoDao.insert(sysPageInfoEntity);
        return sysPageInfoEntity;
    }

    /**
     * 修改数据
     *
     * @param sysPageInfoEntity 实例对象
     * @return 实例对象
     */
    @Override
    public SysPageInfoEntity update(SysPageInfoEntity sysPageInfoEntity) {
        this.sysPageInfoDao.update(sysPageInfoEntity);
        return this.queryById(sysPageInfoEntity.getId());
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
