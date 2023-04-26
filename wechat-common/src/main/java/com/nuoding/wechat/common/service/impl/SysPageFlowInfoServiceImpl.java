package com.nuoding.wechat.common.service.impl;

import com.nuoding.wechat.common.dao.SysPageFlowInfoDao;
import com.nuoding.wechat.common.entity.SysPageFlowInfo;
import com.nuoding.wechat.common.service.SysPageFlowInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SysPageFlowInfo)表服务实现类
 *
 * @author jhc
 * @since 2023-03-07 14:39:02
 */
@Service
public class SysPageFlowInfoServiceImpl implements SysPageFlowInfoService {
    @Resource
    private SysPageFlowInfoDao sysPageFlowInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SysPageFlowInfo queryById(Integer id) {
        return this.sysPageFlowInfoDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param sysPageFlowInfo 筛选条件
     * @return 查询结果
     */
    @Override
    public List<SysPageFlowInfo> queryByPage(SysPageFlowInfo sysPageFlowInfo) {
        return this.sysPageFlowInfoDao.queryAllByLimit(sysPageFlowInfo);
    }

    /**
     * 新增数据
     *
     * @param sysPageFlowInfo 实例对象
     * @return 实例对象
     */
    @Override
    public SysPageFlowInfo insert(SysPageFlowInfo sysPageFlowInfo) {
        this.sysPageFlowInfoDao.insert(sysPageFlowInfo);
        return sysPageFlowInfo;
    }

    /**
     * 修改数据
     *
     * @param sysPageFlowInfo 实例对象
     * @return 实例对象
     */
    @Override
    public SysPageFlowInfo update(SysPageFlowInfo sysPageFlowInfo) {
        this.sysPageFlowInfoDao.update(sysPageFlowInfo);
        return this.queryById(sysPageFlowInfo.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.sysPageFlowInfoDao.deleteById(id) > 0;
    }
}
