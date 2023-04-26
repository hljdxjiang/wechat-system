package com.nuoding.wechat.common.service.impl;

import com.nuoding.wechat.common.dao.CrmProdGroupDao;
import com.nuoding.wechat.common.entity.CrmProdGroup;
import com.nuoding.wechat.common.service.CrmProdGroupService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (CrmProdGroup)表服务实现类
 *
 * @author jhc
 * @since 2023-03-07 14:38:37
 */
@Service
public class CrmProdGroupServiceImpl implements CrmProdGroupService {
    @Resource
    private CrmProdGroupDao crmProdGroupDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public CrmProdGroup queryById(Integer id) {
        return this.crmProdGroupDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param crmProdGroup 筛选条件
     * @return 查询结果
     */
    @Override
    public List<CrmProdGroup> queryByPage(CrmProdGroup crmProdGroup) {
        return this.crmProdGroupDao.queryAllByLimit(crmProdGroup);
    }

    /**
     * 新增数据
     *
     * @param crmProdGroup 实例对象
     * @return 实例对象
     */
    @Override
    public CrmProdGroup insert(CrmProdGroup crmProdGroup) {
        this.crmProdGroupDao.insert(crmProdGroup);
        return crmProdGroup;
    }

    /**
     * 修改数据
     *
     * @param crmProdGroup 实例对象
     * @return 实例对象
     */
    @Override
    public CrmProdGroup update(CrmProdGroup crmProdGroup) {
        this.crmProdGroupDao.update(crmProdGroup);
        return this.queryById(crmProdGroup.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.crmProdGroupDao.deleteById(id) > 0;
    }
}
