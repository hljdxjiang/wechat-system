package com.nuoding.wechat.common.service.impl;

import com.nuoding.wechat.common.dao.CrmProdInfoDao;
import com.nuoding.wechat.common.entity.CrmProdInfo;
import com.nuoding.wechat.common.service.CrmProdInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (CrmProdInfo)表服务实现类
 *
 * @author jhc
 * @since 2023-03-07 14:38:38
 */
@Service
public class CrmProdInfoServiceImpl implements CrmProdInfoService {
    @Resource
    private CrmProdInfoDao crmProdInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public CrmProdInfo queryById(Integer id) {
        return this.crmProdInfoDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param crmProdInfo 筛选条件
     * @return 查询结果
     */
    @Override
    public List<CrmProdInfo> queryByPage(CrmProdInfo crmProdInfo) {
        return this.crmProdInfoDao.queryAllByLimit(crmProdInfo);
    }

    /**
     * 新增数据
     *
     * @param crmProdInfo 实例对象
     * @return 实例对象
     */
    @Override
    public CrmProdInfo insert(CrmProdInfo crmProdInfo) {
        this.crmProdInfoDao.insert(crmProdInfo);
        return crmProdInfo;
    }

    /**
     * 修改数据
     *
     * @param crmProdInfo 实例对象
     * @return 实例对象
     */
    @Override
    public CrmProdInfo update(CrmProdInfo crmProdInfo) {
        this.crmProdInfoDao.update(crmProdInfo);
        return this.queryById(crmProdInfo.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.crmProdInfoDao.deleteById(id) > 0;
    }
}
