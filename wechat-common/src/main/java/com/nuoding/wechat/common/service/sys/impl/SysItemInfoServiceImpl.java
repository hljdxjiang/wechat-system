package com.nuoding.wechat.common.service.sys.impl;

import com.nuoding.wechat.common.dao.sys.SysItemInfoDao;
import com.nuoding.wechat.common.entity.sys.SysItemInfoEntity;
import com.nuoding.wechat.common.service.sys.SysItemInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (sysItemInfo)表服务实现类
 * 楼层要素表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class SysItemInfoServiceImpl implements SysItemInfoService {
    @Resource
    private SysItemInfoDao sysItemInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SysItemInfoEntity queryById(Integer id) {
        return this.sysItemInfoDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param sysItemInfoEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<SysItemInfoEntity> queryAllByLimit(SysItemInfoEntity sysItemInfoEntity) {
        return this.sysItemInfoDao.queryAllByLimit(sysItemInfoEntity);
    }

    /**
     * 新增数据
     *
     * @param sysItemInfoEntity 实例对象
     * @return 实例对象
     */
    @Override
    public SysItemInfoEntity insert(SysItemInfoEntity sysItemInfoEntity) {
        this.sysItemInfoDao.insert(sysItemInfoEntity);
        return sysItemInfoEntity;
    }

    /**
     * 修改数据
     *
     * @param sysItemInfoEntity 实例对象
     * @return 实例对象
     */
    @Override
    public SysItemInfoEntity update(SysItemInfoEntity sysItemInfoEntity) {
        this.sysItemInfoDao.update(sysItemInfoEntity);
        return this.queryById(sysItemInfoEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.sysItemInfoDao.deleteById(id) > 0;
    }
}
