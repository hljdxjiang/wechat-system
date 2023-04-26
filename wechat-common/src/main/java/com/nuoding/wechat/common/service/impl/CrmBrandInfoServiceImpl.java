package com.nuoding.wechat.common.service.impl;

import com.nuoding.wechat.common.dao.CrmBrandInfoDao;
import com.nuoding.wechat.common.entity.CrmBrandInfo;
import com.nuoding.wechat.common.service.CrmBrandInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


/**
 * (CrmBrandInfo)表服务实现类
 *
 * @author jhc
 * @since 2023-03-07 14:38:35
 */
@Service
public class CrmBrandInfoServiceImpl implements CrmBrandInfoService {
    @Resource
    private CrmBrandInfoDao crmBrandInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public CrmBrandInfo queryById(Integer id) {
        return this.crmBrandInfoDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param crmBrandInfo 筛选条件
     * @return 查询结果
     */
    @Override
    public List<CrmBrandInfo> queryByPage(CrmBrandInfo crmBrandInfo) {
        return this.crmBrandInfoDao.queryAllByLimit(crmBrandInfo);
    }

    /**
     * 新增数据
     *
     * @param crmBrandInfo 实例对象
     * @return 实例对象
     */
    @Override
    public CrmBrandInfo insert(CrmBrandInfo crmBrandInfo) {
        this.crmBrandInfoDao.insert(crmBrandInfo);
        return crmBrandInfo;
    }

    /**
     * 修改数据
     *
     * @param crmBrandInfo 实例对象
     * @return 实例对象
     */
    @Override
    public CrmBrandInfo update(CrmBrandInfo crmBrandInfo) {
        this.crmBrandInfoDao.update(crmBrandInfo);
        return this.queryById(crmBrandInfo.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.crmBrandInfoDao.deleteById(id) > 0;
    }
}
