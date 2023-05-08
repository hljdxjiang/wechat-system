package com.nuoding.wechat.common.service.back.impl;

import com.nuoding.wechat.common.dao.back.BackRuleDetailDao;
import com.nuoding.wechat.common.entity.back.BackRuleDetailEntity;
import com.nuoding.wechat.common.service.back.BackRuleDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (backRuleDetail)表服务实现类
 * 角色权限详情表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class BackRuleDetailServiceImpl implements BackRuleDetailService {
    @Resource
    private BackRuleDetailDao backRuleDetailDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BackRuleDetailEntity queryById(Integer id) {
        return this.backRuleDetailDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param backRuleDetailEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<BackRuleDetailEntity> queryByPage(BackRuleDetailEntity backRuleDetailEntity) {
        return this.backRuleDetailDao.queryAllByLimit(backRuleDetailEntity);
    }

    /**
     * 新增数据
     *
     * @param backRuleDetailEntity 实例对象
     * @return 实例对象
     */
    @Override
    public BackRuleDetailEntity insert(BackRuleDetailEntity backRuleDetailEntity) {
        this.backRuleDetailDao.insert(backRuleDetailEntity);
        return backRuleDetailEntity;
    }

    /**
     * 修改数据
     *
     * @param backRuleDetailEntity 实例对象
     * @return 实例对象
     */
    @Override
    public BackRuleDetailEntity update(BackRuleDetailEntity backRuleDetailEntity) {
        this.backRuleDetailDao.update(backRuleDetailEntity);
        return this.queryById(backRuleDetailEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.backRuleDetailDao.deleteById(id) > 0;
    }
}
