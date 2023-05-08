package com.nuoding.wechat.common.service.bbs.impl;

import com.nuoding.wechat.common.dao.bbs.BbsColumnInfoDao;
import com.nuoding.wechat.common.entity.bbs.BbsColumnInfoEntity;
import com.nuoding.wechat.common.service.bbs.BbsColumnInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (bbsColumnInfo)表服务实现类
 * 文章栏目信息表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class BbsColumnInfoServiceImpl implements BbsColumnInfoService {
    @Resource
    private BbsColumnInfoDao bbsColumnInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BbsColumnInfoEntity queryById(Integer id) {
        return this.bbsColumnInfoDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param bbsColumnInfoEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<BbsColumnInfoEntity> queryByPage(BbsColumnInfoEntity bbsColumnInfoEntity) {
        return this.bbsColumnInfoDao.queryAllByLimit(bbsColumnInfoEntity);
    }

    /**
     * 新增数据
     *
     * @param bbsColumnInfoEntity 实例对象
     * @return 实例对象
     */
    @Override
    public BbsColumnInfoEntity insert(BbsColumnInfoEntity bbsColumnInfoEntity) {
        this.bbsColumnInfoDao.insert(bbsColumnInfoEntity);
        return bbsColumnInfoEntity;
    }

    /**
     * 修改数据
     *
     * @param bbsColumnInfoEntity 实例对象
     * @return 实例对象
     */
    @Override
    public BbsColumnInfoEntity update(BbsColumnInfoEntity bbsColumnInfoEntity) {
        this.bbsColumnInfoDao.update(bbsColumnInfoEntity);
        return this.queryById(bbsColumnInfoEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.bbsColumnInfoDao.deleteById(id) > 0;
    }
}
