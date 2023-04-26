package com.nuoding.wechat.common.service.impl;

import com.nuoding.wechat.common.dao.BackSysRolesDao;
import com.nuoding.wechat.common.entity.BackSysRoles;
import com.nuoding.wechat.common.service.BackSysRolesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 角色信息表(BackSysRoles)表服务实现类
 *
 * @author jhc
 * @since 2023-03-07 14:38:31
 */
@Service
public class BackSysRolesServiceImpl implements BackSysRolesService {
    @Resource
    private BackSysRolesDao backSysRolesDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BackSysRoles queryById(Integer id) {
        return this.backSysRolesDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param backSysRoles 筛选条件
     * @return 查询结果
     */
    @Override
    public List<BackSysRoles> queryByPage(BackSysRoles backSysRoles) {
        return this.backSysRolesDao.queryAllByLimit(backSysRoles);
    }

    /**
     * 新增数据
     *
     * @param backSysRoles 实例对象
     * @return 实例对象
     */
    @Override
    public BackSysRoles insert(BackSysRoles backSysRoles) {
        this.backSysRolesDao.insert(backSysRoles);
        return backSysRoles;
    }

    /**
     * 修改数据
     *
     * @param backSysRoles 实例对象
     * @return 实例对象
     */
    @Override
    public BackSysRoles update(BackSysRoles backSysRoles) {
        this.backSysRolesDao.update(backSysRoles);
        return this.queryById(backSysRoles.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.backSysRolesDao.deleteById(id) > 0;
    }
}
