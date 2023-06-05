package com.nuoding.wechat.common.service.mall.impl;

import com.nuoding.wechat.common.dao.mall.MallActivityDao;
import com.nuoding.wechat.common.entity.mall.MallActivityEntity;
import com.nuoding.wechat.common.service.mall.MallActivityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (mallActivity)表服务实现类
 * 活动信息表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class MallActivityServiceImpl implements MallActivityService {
    @Resource
    private MallActivityDao mallActivityDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public MallActivityEntity queryById(Integer id) {
        return this.mallActivityDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param mallActivityEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<MallActivityEntity> queryByPage(MallActivityEntity mallActivityEntity) {
        return this.mallActivityDao.queryAllByLimit(mallActivityEntity);
    }

    /**
     * 新增数据
     *
     * @param mallActivityEntity 实例对象
     * @return 实例对象
     */
    @Override
    public MallActivityEntity insert(MallActivityEntity mallActivityEntity) {
        this.mallActivityDao.insert(mallActivityEntity);
        return mallActivityEntity;
    }

    /**
     * 修改数据
     *
     * @param mallActivityEntity 实例对象
     * @return 实例对象
     */
    @Override
    public MallActivityEntity update(MallActivityEntity mallActivityEntity) {
        this.mallActivityDao.update(mallActivityEntity);
        return this.queryById(mallActivityEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.mallActivityDao.deleteById(id) > 0;
    }
}
