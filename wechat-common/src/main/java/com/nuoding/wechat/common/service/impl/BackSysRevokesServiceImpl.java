package com.nuoding.wechat.common.service.impl;

import com.nuoding.wechat.common.dao.BackSysRevokesDao;
import com.nuoding.wechat.common.entity.BackSysRevokes;
import com.nuoding.wechat.common.service.BackSysRevokesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


/**
 * 系统权限表(BackSysRevokes)表服务实现类
 *
 * @author jhc
 * @since 2023-03-07 14:38:30
 */
@Service
public class BackSysRevokesServiceImpl implements BackSysRevokesService {
    @Resource
    private BackSysRevokesDao backSysRevokesDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BackSysRevokes queryById(Integer id) {
        return this.backSysRevokesDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param backSysRevokes 筛选条件
     * @return 查询结果
     */
    @Override
    public List<BackSysRevokes> queryByPage(BackSysRevokes backSysRevokes) {
        return this.backSysRevokesDao.queryAllByLimit(backSysRevokes);
    }

    /**
     * 新增数据
     *
     * @param backSysRevokes 实例对象
     * @return 实例对象
     */
    @Override
    public BackSysRevokes insert(BackSysRevokes backSysRevokes) {
        this.backSysRevokesDao.insert(backSysRevokes);
        return backSysRevokes;
    }

    /**
     * 修改数据
     *
     * @param backSysRevokes 实例对象
     * @return 实例对象
     */
    @Override
    public BackSysRevokes update(BackSysRevokes backSysRevokes) {
        this.backSysRevokesDao.update(backSysRevokes);
        return this.queryById(backSysRevokes.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.backSysRevokesDao.deleteById(id) > 0;
    }
}
