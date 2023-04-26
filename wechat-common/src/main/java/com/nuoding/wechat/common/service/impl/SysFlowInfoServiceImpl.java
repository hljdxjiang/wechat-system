package com.nuoding.wechat.common.service.impl;

import com.nuoding.wechat.common.dao.SysFlowInfoDao;
import com.nuoding.wechat.common.entity.SysFlowInfo;
import com.nuoding.wechat.common.service.SysFlowInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SysFlowInfo)表服务实现类
 *
 * @author jhc
 * @since 2023-03-07 14:39:02
 */
@Service
public class SysFlowInfoServiceImpl implements SysFlowInfoService {
    @Resource
    private SysFlowInfoDao sysFlowInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SysFlowInfo queryById(Integer id) {
        return this.sysFlowInfoDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param sysFlowInfo 筛选条件
     * @return 查询结果
     */
    @Override
    public List<SysFlowInfo> queryByPage(SysFlowInfo sysFlowInfo) {
        return this.sysFlowInfoDao.queryAllByLimit(sysFlowInfo);
    }

    /**
     * 新增数据
     *
     * @param sysFlowInfo 实例对象
     * @return 实例对象
     */
    @Override
    public SysFlowInfo insert(SysFlowInfo sysFlowInfo) {
        this.sysFlowInfoDao.insert(sysFlowInfo);
        return sysFlowInfo;
    }

    /**
     * 修改数据
     *
     * @param sysFlowInfo 实例对象
     * @return 实例对象
     */
    @Override
    public SysFlowInfo update(SysFlowInfo sysFlowInfo) {
        this.sysFlowInfoDao.update(sysFlowInfo);
        return this.queryById(sysFlowInfo.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.sysFlowInfoDao.deleteById(id) > 0;
    }
}
