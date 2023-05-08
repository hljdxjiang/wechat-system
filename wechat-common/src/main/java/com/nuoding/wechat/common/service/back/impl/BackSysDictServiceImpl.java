package com.nuoding.wechat.common.service.back.impl;

import com.nuoding.wechat.common.dao.back.BackSysDictDao;
import com.nuoding.wechat.common.entity.back.BackSysDictEntity;
import com.nuoding.wechat.common.service.back.BackSysDictService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (backSysDict)表服务实现类
 * 字典表
 * @author jhc
 * @since 2023-03-07 14:38:19
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
    public BackSysDictEntity queryById(Integer id) {
        return this.backSysDictDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param backSysDictEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<BackSysDictEntity> queryByPage(BackSysDictEntity backSysDictEntity) {
        return this.backSysDictDao.queryAllByLimit(backSysDictEntity);
    }

    /**
     * 新增数据
     *
     * @param backSysDictEntity 实例对象
     * @return 实例对象
     */
    @Override
    public BackSysDictEntity insert(BackSysDictEntity backSysDictEntity) {
        this.backSysDictDao.insert(backSysDictEntity);
        return backSysDictEntity;
    }

    /**
     * 修改数据
     *
     * @param backSysDictEntity 实例对象
     * @return 实例对象
     */
    @Override
    public BackSysDictEntity update(BackSysDictEntity backSysDictEntity) {
        this.backSysDictDao.update(backSysDictEntity);
        return this.queryById(backSysDictEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.backSysDictDao.deleteById(id) > 0;
    }
}
