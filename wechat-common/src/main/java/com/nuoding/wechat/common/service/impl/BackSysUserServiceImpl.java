package com.nuoding.wechat.common.service.impl;

import com.nuoding.wechat.common.dao.BackSysUserDao;
import com.nuoding.wechat.common.entity.BackSysUser;
import com.nuoding.wechat.common.service.BackSysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


/**
 * (BackSysUser)表服务实现类
 *
 * @author jhc
 * @since 2023-03-07 14:38:32
 */
@Service
public class BackSysUserServiceImpl implements BackSysUserService {
    @Resource
    private BackSysUserDao backSysUserDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BackSysUser queryById(Integer id) {
        return this.backSysUserDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param backSysUser 筛选条件
     * @return 查询结果
     */
    @Override
    public List<BackSysUser> queryByPage(BackSysUser backSysUser) {
        return this.backSysUserDao.queryAllByLimit(backSysUser);
    }

    /**
     * 新增数据
     *
     * @param backSysUser 实例对象
     * @return 实例对象
     */
    @Override
    public BackSysUser insert(BackSysUser backSysUser) {
        this.backSysUserDao.insert(backSysUser);
        return backSysUser;
    }

    /**
     * 修改数据
     *
     * @param backSysUser 实例对象
     * @return 实例对象
     */
    @Override
    public BackSysUser update(BackSysUser backSysUser) {
        this.backSysUserDao.update(backSysUser);
        return this.queryById(backSysUser.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.backSysUserDao.deleteById(id) > 0;
    }
}
