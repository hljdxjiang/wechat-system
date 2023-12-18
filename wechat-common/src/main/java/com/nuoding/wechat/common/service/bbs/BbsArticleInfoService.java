package com.nuoding.wechat.common.service.bbs;

import com.nuoding.wechat.common.entity.bbs.BbsArticleInfoEntity;

import java.util.List;

/**
 * (bbsArticleInfo)表服务接口
 * 文章记录表
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface BbsArticleInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BbsArticleInfoEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param bbsArticleInfoEntity 筛选条件
     * @return 查询结果
     */
    List<BbsArticleInfoEntity> queryAllByLimit(BbsArticleInfoEntity bbsArticleInfoEntity);

    /**
     * 模糊查询
     *
     * @param bbsArticleInfoEntity 筛选条件
     * @return 查询结果
     */
    List<BbsArticleInfoEntity> fuzzyQuery(BbsArticleInfoEntity bbsArticleInfoEntity);

    /**
     * 单挑查询
     *
     * @param bbsArticleInfoEntity 筛选条件
     * @return 查询结果
     */
    BbsArticleInfoEntity selectOne(BbsArticleInfoEntity bbsArticleInfoEntity);

    /**
     * 新增数据
     *
     * @param bbsArticleInfoEntity 实例对象
     * @return 实例对象
     */
    BbsArticleInfoEntity insert(BbsArticleInfoEntity bbsArticleInfoEntity);

    /**
     * 修改数据
     *
     * @param bbsArticleInfoEntity 实例对象
     * @return 实例对象
     */
    BbsArticleInfoEntity update(BbsArticleInfoEntity bbsArticleInfoEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
