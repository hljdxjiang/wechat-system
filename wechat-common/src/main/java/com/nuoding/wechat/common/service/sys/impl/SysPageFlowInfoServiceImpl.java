package com.nuoding.wechat.common.service.sys.impl;

import com.nuoding.wechat.common.dao.sys.SysPageFlowInfoDao;
import com.nuoding.wechat.common.entity.sys.SysPageFlowInfoEntity;
import com.nuoding.wechat.common.service.sys.SysPageFlowInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (sysPageFlowInfo)表服务实现类
 * 页面楼层表
 * @author jhc
 * @since 2023-03-07 14:38:19
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
    public SysPageFlowInfoEntity queryById(Integer id) {
        return this.sysPageFlowInfoDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param sysPageFlowInfoEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<SysPageFlowInfoEntity> queryByPage(SysPageFlowInfoEntity sysPageFlowInfoEntity) {
        return this.sysPageFlowInfoDao.queryAllByLimit(sysPageFlowInfoEntity);
    }

    /**
     * 新增数据
     *
     * @param sysPageFlowInfoEntity 实例对象
     * @return 实例对象
     */
    @Override
    public SysPageFlowInfoEntity insert(SysPageFlowInfoEntity sysPageFlowInfoEntity) {
        this.sysPageFlowInfoDao.insert(sysPageFlowInfoEntity);
        return sysPageFlowInfoEntity;
    }

    /**
     * 修改数据
     *
     * @param sysPageFlowInfoEntity 实例对象
     * @return 实例对象
     */
    @Override
    public SysPageFlowInfoEntity update(SysPageFlowInfoEntity sysPageFlowInfoEntity) {
        this.sysPageFlowInfoDao.update(sysPageFlowInfoEntity);
        return this.queryById(sysPageFlowInfoEntity.getId());
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
