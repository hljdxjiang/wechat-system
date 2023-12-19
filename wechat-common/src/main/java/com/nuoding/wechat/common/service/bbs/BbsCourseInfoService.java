package com.nuoding.wechat.common.service.bbs;

import com.nuoding.wechat.common.entity.bbs.BbsCourseInfoEntity;

import java.util.List;

/**
 * (bbsCourseInfo)表服务接口
 * 课程信息表
 *
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface BbsCourseInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BbsCourseInfoEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param bbsCourseInfoEntity 筛选条件
     * @return 查询结果
     */
    List<BbsCourseInfoEntity> queryAllByLimit(BbsCourseInfoEntity bbsCourseInfoEntity);

    /**
     * 模糊查询
     *
     * @param bbsCourseInfoEntity 筛选条件
     * @return 查询结果
     */
    List<BbsCourseInfoEntity> fuzzyQuery(BbsCourseInfoEntity bbsCourseInfoEntity);

    /**
     * 单挑查询
     *
     * @param bbsCourseInfoEntity 筛选条件
     * @return 查询结果
     */
    BbsCourseInfoEntity selectOne(BbsCourseInfoEntity bbsCourseInfoEntity);

    /**
     * 新增数据
     *
     * @param bbsCourseInfoEntity 实例对象
     * @return 实例对象
     */
    BbsCourseInfoEntity insert(BbsCourseInfoEntity bbsCourseInfoEntity);

    /**
     * 修改数据
     *
     * @param bbsCourseInfoEntity 实例对象
     * @return 实例对象
     */
    BbsCourseInfoEntity update(BbsCourseInfoEntity bbsCourseInfoEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
