package com.nuoding.wechat.common.service.bbs;

import com.nuoding.wechat.common.entity.bbs.BbsCourseDetailEntity;

import java.util.List;

/**
 * (bbsCourseDetail)表服务接口
 * 课程详情表
 *
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface BbsCourseDetailService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BbsCourseDetailEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param bbsCourseDetailEntity 筛选条件
     * @return 查询结果
     */
    List<BbsCourseDetailEntity> queryAllByLimit(BbsCourseDetailEntity bbsCourseDetailEntity);

    /**
     * 模糊查询
     *
     * @param bbsCourseDetailEntity 筛选条件
     * @return 查询结果
     */
    List<BbsCourseDetailEntity> fuzzyQuery(BbsCourseDetailEntity bbsCourseDetailEntity);

    /**
     * 单挑查询
     *
     * @param bbsCourseDetailEntity 筛选条件
     * @return 查询结果
     */
    BbsCourseDetailEntity selectOne(BbsCourseDetailEntity bbsCourseDetailEntity);

    /**
     * 新增数据
     *
     * @param bbsCourseDetailEntity 实例对象
     * @return 实例对象
     */
    BbsCourseDetailEntity insert(BbsCourseDetailEntity bbsCourseDetailEntity);

    /**
     * 修改数据
     *
     * @param bbsCourseDetailEntity 实例对象
     * @return 实例对象
     */
    BbsCourseDetailEntity update(BbsCourseDetailEntity bbsCourseDetailEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
