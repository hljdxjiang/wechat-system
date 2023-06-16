package com.nuoding.wechat.common.service.mall.impl;

import com.nuoding.wechat.common.dao.mall.MallActivityUserDao;
import com.nuoding.wechat.common.entity.mall.MallActivityUserEntity;
import com.nuoding.wechat.common.service.mall.MallActivityUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (mallActivityUser)表服务实现类
 * 活动参与用户清单表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class MallActivityUserServiceImpl implements MallActivityUserService {
    @Resource
    private MallActivityUserDao mallActivityUserDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public MallActivityUserEntity queryById(Integer id) {
        return this.mallActivityUserDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param mallActivityUserEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<MallActivityUserEntity> queryAllByLimit(MallActivityUserEntity mallActivityUserEntity) {
        return this.mallActivityUserDao.queryAllByLimit(mallActivityUserEntity);
    }

    /**
     * 新增数据
     *
     * @param mallActivityUserEntity 实例对象
     * @return 实例对象
     */
    @Override
    public MallActivityUserEntity insert(MallActivityUserEntity mallActivityUserEntity) {
        this.mallActivityUserDao.insert(mallActivityUserEntity);
        return mallActivityUserEntity;
    }

    /**
     * 修改数据
     *
     * @param mallActivityUserEntity 实例对象
     * @return 实例对象
     */
    @Override
    public MallActivityUserEntity update(MallActivityUserEntity mallActivityUserEntity) {
        this.mallActivityUserDao.update(mallActivityUserEntity);
        return this.queryById(mallActivityUserEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.mallActivityUserDao.deleteById(id) > 0;
    }
}
