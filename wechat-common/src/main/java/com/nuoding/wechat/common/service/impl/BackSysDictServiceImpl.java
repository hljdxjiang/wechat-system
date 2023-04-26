package com.nuoding.wechat.common.service.impl;

import com.nuoding.wechat.common.dao.BackSysDictDao;
import com.nuoding.wechat.common.entity.BackSysDict;
import com.nuoding.wechat.common.service.BackSysDictService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


/**
 * 字典表(BackSysDict)表服务实现类
 *
 * @author jhc
 * @since 2023-03-07 14:38:29
 */
@Service
public class BackSysDictServiceImpl implements BackSysDictService {
    @Resource
    private BackSysDictDao backSysDictDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BackSysDict queryById(Object id) {
        return this.backSysDictDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param backSysDict 筛选条件
     * @return 查询结果
     */
    @Override
    public List<BackSysDict> queryByPage(BackSysDict backSysDict) {
        return this.backSysDictDao.queryAllByLimit(backSysDict);
    }

    /**
     * 新增数据
     *
     * @param backSysDict 实例对象
     * @return 实例对象
     */
    @Override
    public BackSysDict insert(BackSysDict backSysDict) {
        this.backSysDictDao.insert(backSysDict);
        return backSysDict;
    }

    /**
     * 修改数据
     *
     * @param backSysDict 实例对象
     * @return 实例对象
     */
    @Override
    public BackSysDict update(BackSysDict backSysDict) {
        this.backSysDictDao.update(backSysDict);
        return this.queryById(backSysDict.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Object id) {
        return this.backSysDictDao.deleteById(id) > 0;
    }
}
