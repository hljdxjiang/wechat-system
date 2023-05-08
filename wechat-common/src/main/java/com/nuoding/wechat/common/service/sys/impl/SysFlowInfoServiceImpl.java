package com.nuoding.wechat.common.service.sys.impl;

import com.nuoding.wechat.common.dao.sys.SysFlowInfoDao;
import com.nuoding.wechat.common.entity.sys.SysFlowInfoEntity;
import com.nuoding.wechat.common.service.sys.SysFlowInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (sysFlowInfo)表服务实现类
 * 楼层信息表
 * @author jhc
 * @since 2023-03-07 14:38:19
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
    public SysFlowInfoEntity queryById(Integer id) {
        return this.sysFlowInfoDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param sysFlowInfoEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<SysFlowInfoEntity> queryByPage(SysFlowInfoEntity sysFlowInfoEntity) {
        return this.sysFlowInfoDao.queryAllByLimit(sysFlowInfoEntity);
    }

    /**
     * 新增数据
     *
     * @param sysFlowInfoEntity 实例对象
     * @return 实例对象
     */
    @Override
    public SysFlowInfoEntity insert(SysFlowInfoEntity sysFlowInfoEntity) {
        this.sysFlowInfoDao.insert(sysFlowInfoEntity);
        return sysFlowInfoEntity;
    }

    /**
     * 修改数据
     *
     * @param sysFlowInfoEntity 实例对象
     * @return 实例对象
     */
    @Override
    public SysFlowInfoEntity update(SysFlowInfoEntity sysFlowInfoEntity) {
        this.sysFlowInfoDao.update(sysFlowInfoEntity);
        return this.queryById(sysFlowInfoEntity.getId());
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
