package com.nuoding.wechat.common.service.mall.impl;

import com.nuoding.wechat.common.dao.mall.MallActivityConditionDao;
import com.nuoding.wechat.common.entity.mall.MallActivityConditionEntity;
import com.nuoding.wechat.common.service.mall.MallActivityConditionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (mallActivityCondition)表服务实现类
 * 活动条件表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class MallActivityConditionServiceImpl implements MallActivityConditionService {
    @Resource
    private MallActivityConditionDao mallActivityConditionDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public MallActivityConditionEntity queryById(Integer id) {
        return this.mallActivityConditionDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param mallActivityConditionEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<MallActivityConditionEntity> queryByPage(MallActivityConditionEntity mallActivityConditionEntity) {
        return this.mallActivityConditionDao.queryAllByLimit(mallActivityConditionEntity);
    }

    /**
     * 新增数据
     *
     * @param mallActivityConditionEntity 实例对象
     * @return 实例对象
     */
    @Override
    public MallActivityConditionEntity insert(MallActivityConditionEntity mallActivityConditionEntity) {
        this.mallActivityConditionDao.insert(mallActivityConditionEntity);
        return mallActivityConditionEntity;
    }

    /**
     * 修改数据
     *
     * @param mallActivityConditionEntity 实例对象
     * @return 实例对象
     */
    @Override
    public MallActivityConditionEntity update(MallActivityConditionEntity mallActivityConditionEntity) {
        this.mallActivityConditionDao.update(mallActivityConditionEntity);
        return this.queryById(mallActivityConditionEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.mallActivityConditionDao.deleteById(id) > 0;
    }
}
