package com.nuoding.wechat.common.service.impl;

import com.nuoding.wechat.common.dao.SysTokenConfigDao;
import com.nuoding.wechat.common.entity.SysTokenConfig;
import com.nuoding.wechat.common.service.SysTokenConfigService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SysTokenConfig)表服务实现类
 *
 * @author jhc
 * @since 2023-03-07 14:39:02
 */
@Service
public class SysTokenConfigServiceImpl implements SysTokenConfigService {
    @Resource
    private SysTokenConfigDao sysTokenConfigDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SysTokenConfig queryById(Integer id) {
        return this.sysTokenConfigDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param sysTokenConfig 筛选条件
     * @return 查询结果
     */
    @Override
    public List<SysTokenConfig> queryByPage(SysTokenConfig sysTokenConfig) {
        return this.sysTokenConfigDao.queryAllByLimit(sysTokenConfig);
    }

    /**
     * 新增数据
     *
     * @param sysTokenConfig 实例对象
     * @return 实例对象
     */
    @Override
    public SysTokenConfig insert(SysTokenConfig sysTokenConfig) {
        this.sysTokenConfigDao.insert(sysTokenConfig);
        return sysTokenConfig;
    }

    /**
     * 修改数据
     *
     * @param sysTokenConfig 实例对象
     * @return 实例对象
     */
    @Override
    public SysTokenConfig update(SysTokenConfig sysTokenConfig) {
        this.sysTokenConfigDao.update(sysTokenConfig);
        return this.queryById(sysTokenConfig.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.sysTokenConfigDao.deleteById(id) > 0;
    }
}
