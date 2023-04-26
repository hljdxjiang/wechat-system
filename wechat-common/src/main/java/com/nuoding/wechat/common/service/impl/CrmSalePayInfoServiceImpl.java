package com.nuoding.wechat.common.service.impl;

import com.nuoding.wechat.common.dao.CrmSalePayInfoDao;
import com.nuoding.wechat.common.entity.CrmSalePayInfo;
import com.nuoding.wechat.common.service.CrmSalePayInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 销售记录表(CrmSalePayInfo)表服务实现类
 *
 * @author jhc
 * @since 2023-03-07 14:38:43
 */
@Service
public class CrmSalePayInfoServiceImpl implements CrmSalePayInfoService {
    @Resource
    private CrmSalePayInfoDao crmSalePayInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public CrmSalePayInfo queryById(Integer id) {
        return this.crmSalePayInfoDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param crmSalePayInfo 筛选条件
     * @return 查询结果
     */
    @Override
    public List<CrmSalePayInfo> queryByPage(CrmSalePayInfo crmSalePayInfo) {
        return this.crmSalePayInfoDao.queryAllByLimit(crmSalePayInfo);
    }

    /**
     * 新增数据
     *
     * @param crmSalePayInfo 实例对象
     * @return 实例对象
     */
    @Override
    public CrmSalePayInfo insert(CrmSalePayInfo crmSalePayInfo) {
        this.crmSalePayInfoDao.insert(crmSalePayInfo);
        return crmSalePayInfo;
    }

    /**
     * 修改数据
     *
     * @param crmSalePayInfo 实例对象
     * @return 实例对象
     */
    @Override
    public CrmSalePayInfo update(CrmSalePayInfo crmSalePayInfo) {
        this.crmSalePayInfoDao.update(crmSalePayInfo);
        return this.queryById(crmSalePayInfo.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.crmSalePayInfoDao.deleteById(id) > 0;
    }
}
