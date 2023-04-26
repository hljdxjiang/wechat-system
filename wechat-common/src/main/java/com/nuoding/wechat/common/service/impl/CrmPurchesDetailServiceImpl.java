package com.nuoding.wechat.common.service.impl;

import com.nuoding.wechat.common.dao.CrmPurchesDetailDao;
import com.nuoding.wechat.common.entity.CrmPurchesDetail;
import com.nuoding.wechat.common.service.CrmPurchesDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 进货详情表(CrmPurchesDetail)表服务实现类
 *
 * @author jhc
 * @since 2023-03-07 14:38:40
 */
@Service
public class CrmPurchesDetailServiceImpl implements CrmPurchesDetailService {
    @Resource
    private CrmPurchesDetailDao crmPurchesDetailDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public CrmPurchesDetail queryById(Integer id) {
        return this.crmPurchesDetailDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param crmPurchesDetail 筛选条件
     * @return 查询结果
     */
    @Override
    public List<CrmPurchesDetail> queryByPage(CrmPurchesDetail crmPurchesDetail) {
        return this.crmPurchesDetailDao.queryAllByLimit(crmPurchesDetail);
    }

    /**
     * 新增数据
     *
     * @param crmPurchesDetail 实例对象
     * @return 实例对象
     */
    @Override
    public CrmPurchesDetail insert(CrmPurchesDetail crmPurchesDetail) {
        this.crmPurchesDetailDao.insert(crmPurchesDetail);
        return crmPurchesDetail;
    }

    /**
     * 修改数据
     *
     * @param crmPurchesDetail 实例对象
     * @return 实例对象
     */
    @Override
    public CrmPurchesDetail update(CrmPurchesDetail crmPurchesDetail) {
        this.crmPurchesDetailDao.update(crmPurchesDetail);
        return this.queryById(crmPurchesDetail.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.crmPurchesDetailDao.deleteById(id) > 0;
    }
}
