package com.nuoding.wechat.common.service.back.impl;

import com.nuoding.wechat.common.dao.back.BackSysRolesDao;
import com.nuoding.wechat.common.entity.back.BackSysRolesEntity;
import com.nuoding.wechat.common.service.back.BackSysRolesService;
import org.springframework.stereotype.Service;
import com.nuoding.wechat.common.utils.JsonUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.List;

/**
 * (backSysRoles)表服务实现类
 * 角色信息表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class BackSysRolesServiceImpl implements BackSysRolesService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Resource
    private BackSysRolesDao backSysRolesDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BackSysRolesEntity queryById(Integer id) {
        return this.backSysRolesDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param backSysRolesEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<BackSysRolesEntity> queryAllByLimit(BackSysRolesEntity backSysRolesEntity) {
        logger.info("queryAllByLimit begin.backSysRolesEntity:{}", JsonUtil.obj2Json(backSysRolesEntity));
        return this.backSysRolesDao.queryAllByLimit(backSysRolesEntity);
    }

    /**
     * 新增数据
     *
     * @param backSysRolesEntity 实例对象
     * @return 实例对象
     */
    @Override
    public BackSysRolesEntity insert(BackSysRolesEntity backSysRolesEntity) {
        logger.info("insert begin.backSysRolesEntity:{}", JsonUtil.obj2Json(backSysRolesEntity));
        this.backSysRolesDao.insert(backSysRolesEntity);
        return backSysRolesEntity;
    }

    /**
     * 修改数据
     *
     * @param backSysRolesEntity 实例对象
     * @return 实例对象
     */
    @Override
    public BackSysRolesEntity update(BackSysRolesEntity backSysRolesEntity) {
        logger.info("update begin.backSysRolesEntity:{}", JsonUtil.obj2Json(backSysRolesEntity));
        this.backSysRolesDao.update(backSysRolesEntity);
        return this.queryById(backSysRolesEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        logger.info("deleteById begin.backSysRolesEntity:{}", id);
        return this.backSysRolesDao.deleteById(id) > 0;
    }
}
