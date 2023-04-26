package com.nuoding.wechat.common.service.impl;

import com.nuoding.wechat.common.dao.BackRoleDetailDao;
import com.nuoding.wechat.common.entity.BackRoleDetail;
import com.nuoding.wechat.common.service.BackRoleDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


/**
 * 角色权限详情表(BackRoleDetail)表服务实现类
 *
 * @author jhc
 * @since 2023-03-07 14:38:27
 */
@Service
public class BackRoleDetailServiceImpl implements BackRoleDetailService {
    @Resource
    private BackRoleDetailDao backRoleDetailDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BackRoleDetail queryById(Integer id) {
        return this.backRoleDetailDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param backRoleDetail 筛选条件
     * @return 查询结果
     */
    @Override
    public List<BackRoleDetail> queryByPage(BackRoleDetail backRoleDetail) {
        return this.backRoleDetailDao.queryAllByLimit(backRoleDetail);
    }

    /**
     * 新增数据
     *
     * @param backRoleDetail 实例对象
     * @return 实例对象
     */
    @Override
    public BackRoleDetail insert(BackRoleDetail backRoleDetail) {
        this.backRoleDetailDao.insert(backRoleDetail);
        return backRoleDetail;
    }

    /**
     * 修改数据
     *
     * @param backRoleDetail 实例对象
     * @return 实例对象
     */
    @Override
    public BackRoleDetail update(BackRoleDetail backRoleDetail) {
        this.backRoleDetailDao.update(backRoleDetail);
        return this.queryById(backRoleDetail.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.backRoleDetailDao.deleteById(id) > 0;
    }
}
