package com.nuoding.wechat.common.service.sys.impl;

import com.nuoding.wechat.common.dao.sys.SysUserLabelsDao;
import com.nuoding.wechat.common.entity.sys.SysUserLabelsEntity;
import com.nuoding.wechat.common.service.sys.SysUserLabelsService;
import org.springframework.stereotype.Service;
import com.nuoding.wechat.common.utils.JsonUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.List;

/**
 * (sysUserLabels)表服务实现类
 * 客户信息表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class SysUserLabelsServiceImpl implements SysUserLabelsService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Resource
    private SysUserLabelsDao sysUserLabelsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SysUserLabelsEntity queryById(Integer id) {
        return this.sysUserLabelsDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param sysUserLabelsEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<SysUserLabelsEntity> queryAllByLimit(SysUserLabelsEntity sysUserLabelsEntity) {
        logger.info("queryAllByLimit begin.sysUserLabelsEntity:{}", JsonUtil.obj2Json(sysUserLabelsEntity));
        return this.sysUserLabelsDao.queryAllByLimit(sysUserLabelsEntity);
    }

    /**
     * 新增数据
     *
     * @param sysUserLabelsEntity 实例对象
     * @return 实例对象
     */
    @Override
    public SysUserLabelsEntity insert(SysUserLabelsEntity sysUserLabelsEntity) {
        logger.info("insert begin.sysUserLabelsEntity:{}", JsonUtil.obj2Json(sysUserLabelsEntity));
        this.sysUserLabelsDao.insert(sysUserLabelsEntity);
        return sysUserLabelsEntity;
    }

    /**
     * 修改数据
     *
     * @param sysUserLabelsEntity 实例对象
     * @return 实例对象
     */
    @Override
    public SysUserLabelsEntity update(SysUserLabelsEntity sysUserLabelsEntity) {
        logger.info("update begin.sysUserLabelsEntity:{}", JsonUtil.obj2Json(sysUserLabelsEntity));
        this.sysUserLabelsDao.update(sysUserLabelsEntity);
        return this.queryById(sysUserLabelsEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        logger.info("deleteById begin.sysUserLabelsEntity:{}", id);
        return this.sysUserLabelsDao.deleteById(id) > 0;
    }
}
