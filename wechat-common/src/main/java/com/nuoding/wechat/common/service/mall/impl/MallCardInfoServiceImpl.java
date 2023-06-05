package com.nuoding.wechat.common.service.mall.impl;

import com.nuoding.wechat.common.dao.mall.MallCardInfoDao;
import com.nuoding.wechat.common.entity.mall.MallCardInfoEntity;
import com.nuoding.wechat.common.service.mall.MallCardInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (mallCardInfo)表服务实现类
 * 卡券信息表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class MallCardInfoServiceImpl implements MallCardInfoService {
    @Resource
    private MallCardInfoDao mallCardInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public MallCardInfoEntity queryById(Integer id) {
        return this.mallCardInfoDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param mallCardInfoEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<MallCardInfoEntity> queryByPage(MallCardInfoEntity mallCardInfoEntity) {
        return this.mallCardInfoDao.queryAllByLimit(mallCardInfoEntity);
    }

    /**
     * 新增数据
     *
     * @param mallCardInfoEntity 实例对象
     * @return 实例对象
     */
    @Override
    public MallCardInfoEntity insert(MallCardInfoEntity mallCardInfoEntity) {
        this.mallCardInfoDao.insert(mallCardInfoEntity);
        return mallCardInfoEntity;
    }

    /**
     * 修改数据
     *
     * @param mallCardInfoEntity 实例对象
     * @return 实例对象
     */
    @Override
    public MallCardInfoEntity update(MallCardInfoEntity mallCardInfoEntity) {
        this.mallCardInfoDao.update(mallCardInfoEntity);
        return this.queryById(mallCardInfoEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.mallCardInfoDao.deleteById(id) > 0;
    }
}
