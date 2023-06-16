package com.nuoding.wechat.common.service.bbs.impl;

import com.nuoding.wechat.common.dao.bbs.BbsCourseResourceDao;
import com.nuoding.wechat.common.entity.bbs.BbsCourseResourceEntity;
import com.nuoding.wechat.common.service.bbs.BbsCourseResourceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (bbsCourseResource)表服务实现类
 * 课程资源信息表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class BbsCourseResourceServiceImpl implements BbsCourseResourceService {
    @Resource
    private BbsCourseResourceDao bbsCourseResourceDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BbsCourseResourceEntity queryById(Integer id) {
        return this.bbsCourseResourceDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param bbsCourseResourceEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<BbsCourseResourceEntity> queryAllByLimit(BbsCourseResourceEntity bbsCourseResourceEntity) {
        return this.bbsCourseResourceDao.queryAllByLimit(bbsCourseResourceEntity);
    }

    /**
     * 新增数据
     *
     * @param bbsCourseResourceEntity 实例对象
     * @return 实例对象
     */
    @Override
    public BbsCourseResourceEntity insert(BbsCourseResourceEntity bbsCourseResourceEntity) {
        this.bbsCourseResourceDao.insert(bbsCourseResourceEntity);
        return bbsCourseResourceEntity;
    }

    /**
     * 修改数据
     *
     * @param bbsCourseResourceEntity 实例对象
     * @return 实例对象
     */
    @Override
    public BbsCourseResourceEntity update(BbsCourseResourceEntity bbsCourseResourceEntity) {
        this.bbsCourseResourceDao.update(bbsCourseResourceEntity);
        return this.queryById(bbsCourseResourceEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.bbsCourseResourceDao.deleteById(id) > 0;
    }
}