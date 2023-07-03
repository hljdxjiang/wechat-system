package com.nuoding.wechat.common.service.user.impl;

import com.nuoding.wechat.common.dao.user.UserOperaRecordDao;
import com.nuoding.wechat.common.entity.user.UserOperaRecordEntity;
import com.nuoding.wechat.common.service.user.UserOperaRecordService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import com.nuoding.wechat.common.utils.JsonUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.List;

/**
 * (userOperaRecord)表服务实现类
 * 用户操作历史表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class UserOperaRecordServiceImpl implements UserOperaRecordService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Resource
    private UserOperaRecordDao userOperaRecordDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UserOperaRecordEntity queryById(Integer id) {
        return this.userOperaRecordDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param userOperaRecordEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<UserOperaRecordEntity> queryAllByLimit(UserOperaRecordEntity userOperaRecordEntity) {
        logger.info("queryAllByLimit begin.userOperaRecordEntity:{}", JsonUtil.obj2Json(userOperaRecordEntity));
        return this.userOperaRecordDao.queryAllByLimit(userOperaRecordEntity);
    }

    /**
     * 新增数据
     *
     * @param userOperaRecordEntity 实例对象
     * @return 实例对象
     */
    @Override
    public UserOperaRecordEntity insert(UserOperaRecordEntity userOperaRecordEntity) {
        logger.info("insert begin.userOperaRecordEntity:{}", JsonUtil.obj2Json(userOperaRecordEntity));
        this.userOperaRecordDao.insert(userOperaRecordEntity);
        return userOperaRecordEntity;
    }

    @Override
    @Async
    public UserOperaRecordEntity asyncInsert(UserOperaRecordEntity userOperaRecordEntity) {
        logger.info("asyncInsert begin.userOperaRecordEntity:{}", JsonUtil.obj2Json(userOperaRecordEntity));
        this.userOperaRecordDao.insert(userOperaRecordEntity);
        return userOperaRecordEntity;    }

    /**
     * 修改数据
     *
     * @param userOperaRecordEntity 实例对象
     * @return 实例对象
     */
    @Override
    public UserOperaRecordEntity update(UserOperaRecordEntity userOperaRecordEntity) {
        logger.info("update begin.userOperaRecordEntity:{}", JsonUtil.obj2Json(userOperaRecordEntity));
        this.userOperaRecordDao.update(userOperaRecordEntity);
        return this.queryById(userOperaRecordEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        logger.info("deleteById begin.userOperaRecordEntity:{}", id);
        return this.userOperaRecordDao.deleteById(id) > 0;
    }
}
