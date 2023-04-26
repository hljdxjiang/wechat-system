package com.nuoding.wechat.common.service.impl;

import com.nuoding.wechat.common.dao.CrmReferrerInfoDao;
import com.nuoding.wechat.common.entity.CrmReferrerInfo;
import com.nuoding.wechat.common.service.CrmReferrerInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 进货记录表(CrmReferrerInfo)表服务实现类
 *
 * @author jhc
 * @since 2023-03-07 14:38:41
 */
@Service
public class CrmReferrerInfoServiceImpl implements CrmReferrerInfoService {
    @Resource
    private CrmReferrerInfoDao crmReferrerInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public CrmReferrerInfo queryById(Integer id) {
        return this.crmReferrerInfoDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param crmReferrerInfo 筛选条件
     * @return 查询结果
     */
    @Override
    public List<CrmReferrerInfo> queryByPage(CrmReferrerInfo crmReferrerInfo) {
        return this.crmReferrerInfoDao.queryAllByLimit(crmReferrerInfo);
    }

    /**
     * 新增数据
     *
     * @param crmReferrerInfo 实例对象
     * @return 实例对象
     */
    @Override
    public CrmReferrerInfo insert(CrmReferrerInfo crmReferrerInfo) {
        this.crmReferrerInfoDao.insert(crmReferrerInfo);
        return crmReferrerInfo;
    }

    /**
     * 修改数据
     *
     * @param crmReferrerInfo 实例对象
     * @return 实例对象
     */
    @Override
    public CrmReferrerInfo update(CrmReferrerInfo crmReferrerInfo) {
        this.crmReferrerInfoDao.update(crmReferrerInfo);
        return this.queryById(crmReferrerInfo.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.crmReferrerInfoDao.deleteById(id) > 0;
    }
}
