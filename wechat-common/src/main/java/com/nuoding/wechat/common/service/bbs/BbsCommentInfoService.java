package com.nuoding.wechat.common.service.bbs;

import com.nuoding.wechat.common.entity.bbs.BbsCommentInfoEntity;

import java.util.List;

/**
 * (bbsCommentInfo)表服务接口
 * 评论记录表
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface BbsCommentInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BbsCommentInfoEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param bbsCommentInfoEntity 筛选条件
     * @return 查询结果
     */
    List<BbsCommentInfoEntity> queryAllByLimit(BbsCommentInfoEntity bbsCommentInfoEntity);

    /**
     * 新增数据
     *
     * @param bbsCommentInfoEntity 实例对象
     * @return 实例对象
     */
    BbsCommentInfoEntity insert(BbsCommentInfoEntity bbsCommentInfoEntity);

    /**
     * 修改数据
     *
     * @param bbsCommentInfoEntity 实例对象
     * @return 实例对象
     */
    BbsCommentInfoEntity update(BbsCommentInfoEntity bbsCommentInfoEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
