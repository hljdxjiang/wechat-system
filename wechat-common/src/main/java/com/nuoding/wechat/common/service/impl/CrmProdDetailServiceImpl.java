package com.nuoding.wechat.common.service.impl;

import com.nuoding.wechat.common.dao.CrmProdDetailDao;
import com.nuoding.wechat.common.entity.CrmProdDetail;
import com.nuoding.wechat.common.service.CrmProdDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (CrmProdDetail)表服务实现类
 *
 * @author jhc
 * @since 2023-03-07 14:38:36
 */
@Service
public class CrmProdDetailServiceImpl implements CrmProdDetailService {
    @Resource
    private CrmProdDetailDao crmProdDetailDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public CrmProdDetail queryById(Integer id) {
        return this.crmProdDetailDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param crmProdDetail 筛选条件
     * @return 查询结果
     */
    @Override
    public List<CrmProdDetail> queryByPage(CrmProdDetail crmProdDetail) {
        return this.crmProdDetailDao.queryAllByLimit(crmProdDetail);
    }

    /**
     * 新增数据
     *
     * @param crmProdDetail 实例对象
     * @return 实例对象
     */
    @Override
    public CrmProdDetail insert(CrmProdDetail crmProdDetail) {
        this.crmProdDetailDao.insert(crmProdDetail);
        return crmProdDetail;
    }

    /**
     * 修改数据
     *
     * @param crmProdDetail 实例对象
     * @return 实例对象
     */
    @Override
    public CrmProdDetail update(CrmProdDetail crmProdDetail) {
        this.crmProdDetailDao.update(crmProdDetail);
        return this.queryById(crmProdDetail.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.crmProdDetailDao.deleteById(id) > 0;
    }
}
