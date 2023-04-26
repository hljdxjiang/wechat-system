package com.nuoding.wechat.common.service.impl;

import com.nuoding.wechat.common.dao.SysTenantInfoDao;
import com.nuoding.wechat.common.entity.SysTenantInfo;
import com.nuoding.wechat.common.service.SysTenantInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SysTenantInfo)表服务实现类
 *
 * @author jhc
 * @since 2023-03-07 14:39:02
 */
@Service
public class SysTenantInfoServiceImpl implements SysTenantInfoService {
    @Resource
    private SysTenantInfoDao sysTenantInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SysTenantInfo queryById(Integer id) {
        return this.sysTenantInfoDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param sysTenantInfo 筛选条件
     * @return 查询结果
     */
    @Override
    public List<SysTenantInfo> queryByPage(SysTenantInfo sysTenantInfo) {
        return this.sysTenantInfoDao.queryAllByLimit(sysTenantInfo);
    }

    /**
     * 新增数据
     *
     * @param sysTenantInfo 实例对象
     * @return 实例对象
     */
    @Override
    public SysTenantInfo insert(SysTenantInfo sysTenantInfo) {
        this.sysTenantInfoDao.insert(sysTenantInfo);
        return sysTenantInfo;
    }

    /**
     * 修改数据
     *
     * @param sysTenantInfo 实例对象
     * @return 实例对象
     */
    @Override
    public SysTenantInfo update(SysTenantInfo sysTenantInfo) {
        this.sysTenantInfoDao.update(sysTenantInfo);
        return this.queryById(sysTenantInfo.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.sysTenantInfoDao.deleteById(id) > 0;
    }
}
