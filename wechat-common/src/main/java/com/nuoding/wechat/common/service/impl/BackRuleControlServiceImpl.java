package com.nuoding.wechat.common.service.impl;

import com.nuoding.wechat.common.dao.BackRuleControlDao;
import com.nuoding.wechat.common.entity.BackRuleControl;
import com.nuoding.wechat.common.service.BackRuleControlService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 开关控制表(BackRuleControl)表服务实现类
 *
 * @author jhc
 * @since 2023-03-07 14:38:24
 */
@Service
public class BackRuleControlServiceImpl implements BackRuleControlService {
    @Resource
    private BackRuleControlDao backRuleControlDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BackRuleControl queryById(Integer id) {
        return this.backRuleControlDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param backRuleControl 筛选条件
     * @return 查询结果
     */
    @Override
    public List<BackRuleControl> queryByPage(BackRuleControl backRuleControl) {
        return this.backRuleControlDao.queryAllByLimit(backRuleControl);
    }

    /**
     * 新增数据
     *
     * @param backRuleControl 实例对象
     * @return 实例对象
     */
    @Override
    public BackRuleControl insert(BackRuleControl backRuleControl) {
        this.backRuleControlDao.insert(backRuleControl);
        return backRuleControl;
    }

    /**
     * 修改数据
     *
     * @param backRuleControl 实例对象
     * @return 实例对象
     */
    @Override
    public BackRuleControl update(BackRuleControl backRuleControl) {
        this.backRuleControlDao.update(backRuleControl);
        return this.queryById(backRuleControl.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.backRuleControlDao.deleteById(id) > 0;
    }
}
