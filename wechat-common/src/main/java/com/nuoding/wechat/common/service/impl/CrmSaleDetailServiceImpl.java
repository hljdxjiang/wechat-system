package com.nuoding.wechat.common.service.impl;

import com.nuoding.wechat.common.dao.CrmSaleDetailDao;
import com.nuoding.wechat.common.entity.CrmSaleDetail;
import com.nuoding.wechat.common.service.CrmSaleDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 销售记录表(CrmSaleDetail)表服务实现类
 *
 * @author jhc
 * @since 2023-03-07 14:38:42
 */
@Service
public class CrmSaleDetailServiceImpl implements CrmSaleDetailService {
    @Resource
    private CrmSaleDetailDao crmSaleDetailDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public CrmSaleDetail queryById(Integer id) {
        return this.crmSaleDetailDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param crmSaleDetail 筛选条件
     * @return 查询结果
     */
    @Override
    public List<CrmSaleDetail> queryByPage(CrmSaleDetail crmSaleDetail) {
        return this.crmSaleDetailDao.queryAllByLimit(crmSaleDetail);
    }

    /**
     * 新增数据
     *
     * @param crmSaleDetail 实例对象
     * @return 实例对象
     */
    @Override
    public CrmSaleDetail insert(CrmSaleDetail crmSaleDetail) {
        this.crmSaleDetailDao.insert(crmSaleDetail);
        return crmSaleDetail;
    }

    /**
     * 修改数据
     *
     * @param crmSaleDetail 实例对象
     * @return 实例对象
     */
    @Override
    public CrmSaleDetail update(CrmSaleDetail crmSaleDetail) {
        this.crmSaleDetailDao.update(crmSaleDetail);
        return this.queryById(crmSaleDetail.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.crmSaleDetailDao.deleteById(id) > 0;
    }
}
