package com.nuoding.wechat.common.service.bbs;

import com.nuoding.wechat.common.entity.bbs.BbsCourseResourceEntity;

import java.util.List;

/**
 * (bbsCourseResource)表服务接口
 * 课程资源信息表
 *
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface BbsCourseResourceService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BbsCourseResourceEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param bbsCourseResourceEntity 筛选条件
     * @return 查询结果
     */
    List<BbsCourseResourceEntity> queryAllByLimit(BbsCourseResourceEntity bbsCourseResourceEntity);

    /**
     * 模糊查询
     *
     * @param bbsCourseResourceEntity 筛选条件
     * @return 查询结果
     */
    List<BbsCourseResourceEntity> fuzzyQuery(BbsCourseResourceEntity bbsCourseResourceEntity);

    /**
     * 单挑查询
     *
     * @param bbsCourseResourceEntity 筛选条件
     * @return 查询结果
     */
    BbsCourseResourceEntity selectOne(BbsCourseResourceEntity bbsCourseResourceEntity);

    /**
     * 新增数据
     *
     * @param bbsCourseResourceEntity 实例对象
     * @return 实例对象
     */
    BbsCourseResourceEntity insert(BbsCourseResourceEntity bbsCourseResourceEntity);

    /**
     * 修改数据
     *
     * @param bbsCourseResourceEntity 实例对象
     * @return 实例对象
     */
    BbsCourseResourceEntity update(BbsCourseResourceEntity bbsCourseResourceEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
