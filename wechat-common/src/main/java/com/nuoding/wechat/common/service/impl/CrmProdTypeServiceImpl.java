package com.nuoding.wechat.common.service.impl;

import com.nuoding.wechat.common.dao.CrmProdTypeDao;
import com.nuoding.wechat.common.entity.CrmProdType;
import com.nuoding.wechat.common.service.CrmProdTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (CrmProdType)表服务实现类
 *
 * @author jhc
 * @since 2023-03-07 14:38:39
 */
@Service
public class CrmProdTypeServiceImpl implements CrmProdTypeService {
    @Resource
    private CrmProdTypeDao crmProdTypeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public CrmProdType queryById(Integer id) {
        return this.crmProdTypeDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param crmProdType 筛选条件
     * @return 查询结果
     */
    @Override
    public List<CrmProdType> queryByPage(CrmProdType crmProdType) {
        return this.crmProdTypeDao.queryAllByLimit(crmProdType);
    }

    /**
     * 新增数据
     *
     * @param crmProdType 实例对象
     * @return 实例对象
     */
    @Override
    public CrmProdType insert(CrmProdType crmProdType) {
        this.crmProdTypeDao.insert(crmProdType);
        return crmProdType;
    }

    /**
     * 修改数据
     *
     * @param crmProdType 实例对象
     * @return 实例对象
     */
    @Override
    public CrmProdType update(CrmProdType crmProdType) {
        this.crmProdTypeDao.update(crmProdType);
        return this.queryById(crmProdType.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.crmProdTypeDao.deleteById(id) > 0;
    }
}
