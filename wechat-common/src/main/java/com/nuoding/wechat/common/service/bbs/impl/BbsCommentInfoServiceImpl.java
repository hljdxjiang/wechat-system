package com.nuoding.wechat.common.service.bbs.impl;

import com.nuoding.wechat.common.dao.bbs.BbsCommentInfoDao;
import com.nuoding.wechat.common.entity.bbs.BbsCommentInfoEntity;
import com.nuoding.wechat.common.service.bbs.BbsCommentInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (bbsCommentInfo)表服务实现类
 * 评论记录表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class BbsCommentInfoServiceImpl implements BbsCommentInfoService {
    @Resource
    private BbsCommentInfoDao bbsCommentInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BbsCommentInfoEntity queryById(Integer id) {
        return this.bbsCommentInfoDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param bbsCommentInfoEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<BbsCommentInfoEntity> queryByPage(BbsCommentInfoEntity bbsCommentInfoEntity) {
        return this.bbsCommentInfoDao.queryAllByLimit(bbsCommentInfoEntity);
    }

    /**
     * 新增数据
     *
     * @param bbsCommentInfoEntity 实例对象
     * @return 实例对象
     */
    @Override
    public BbsCommentInfoEntity insert(BbsCommentInfoEntity bbsCommentInfoEntity) {
        this.bbsCommentInfoDao.insert(bbsCommentInfoEntity);
        return bbsCommentInfoEntity;
    }

    /**
     * 修改数据
     *
     * @param bbsCommentInfoEntity 实例对象
     * @return 实例对象
     */
    @Override
    public BbsCommentInfoEntity update(BbsCommentInfoEntity bbsCommentInfoEntity) {
        this.bbsCommentInfoDao.update(bbsCommentInfoEntity);
        return this.queryById(bbsCommentInfoEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.bbsCommentInfoDao.deleteById(id) > 0;
    }
}
