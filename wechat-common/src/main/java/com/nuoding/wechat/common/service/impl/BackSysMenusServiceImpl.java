package com.nuoding.wechat.common.service.impl;

import com.nuoding.wechat.common.dao.BackSysMenusDao;
import com.nuoding.wechat.common.entity.BackSysMenus;
import com.nuoding.wechat.common.service.BackSysMenusService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


/**
 * 系统菜单表(BackSysMenus)表服务实现类
 *
 * @author jhc
 * @since 2023-03-07 14:38:29
 */
@Service
public class BackSysMenusServiceImpl implements BackSysMenusService {
    @Resource
    private BackSysMenusDao backSysMenusDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BackSysMenus queryById(Integer id) {
        return this.backSysMenusDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param backSysMenus 筛选条件
     * @return 查询结果
     */
    @Override
    public List<BackSysMenus> queryByPage(BackSysMenus backSysMenus) {
        return this.backSysMenusDao.queryAllByLimit(backSysMenus);
    }

    /**
     * 新增数据
     *
     * @param backSysMenus 实例对象
     * @return 实例对象
     */
    @Override
    public BackSysMenus insert(BackSysMenus backSysMenus) {
        this.backSysMenusDao.insert(backSysMenus);
        return backSysMenus;
    }

    /**
     * 修改数据
     *
     * @param backSysMenus 实例对象
     * @return 实例对象
     */
    @Override
    public BackSysMenus update(BackSysMenus backSysMenus) {
        this.backSysMenusDao.update(backSysMenus);
        return this.queryById(backSysMenus.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.backSysMenusDao.deleteById(id) > 0;
    }
}
