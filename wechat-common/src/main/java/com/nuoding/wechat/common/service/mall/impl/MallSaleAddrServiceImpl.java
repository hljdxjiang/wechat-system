package com.nuoding.wechat.common.service.mall.impl;

import com.nuoding.wechat.common.dao.mall.MallSaleAddrDao;
import com.nuoding.wechat.common.entity.mall.MallSaleAddrEntity;
import com.nuoding.wechat.common.service.mall.MallSaleAddrService;
import org.springframework.stereotype.Service;
import com.nuoding.wechat.common.utils.JsonUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.List;

/**
 * (mallSaleAddr)表服务实现类
 * 客户信息表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@Service
public class MallSaleAddrServiceImpl implements MallSaleAddrService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Resource
    private MallSaleAddrDao mallSaleAddrDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public MallSaleAddrEntity queryById(Integer id) {
        return this.mallSaleAddrDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param mallSaleAddrEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<MallSaleAddrEntity> queryAllByLimit(MallSaleAddrEntity mallSaleAddrEntity) {
        logger.info("queryAllByLimit begin.mallSaleAddrEntity:{}", JsonUtil.obj2Json(mallSaleAddrEntity));
        return this.mallSaleAddrDao.queryAllByLimit(mallSaleAddrEntity);
    }

    /**
     * 新增数据
     *
     * @param mallSaleAddrEntity 实例对象
     * @return 实例对象
     */
    @Override
    public MallSaleAddrEntity insert(MallSaleAddrEntity mallSaleAddrEntity) {
        logger.info("insert begin.mallSaleAddrEntity:{}", JsonUtil.obj2Json(mallSaleAddrEntity));
        this.mallSaleAddrDao.insert(mallSaleAddrEntity);
        return mallSaleAddrEntity;
    }

    /**
     * 修改数据
     *
     * @param mallSaleAddrEntity 实例对象
     * @return 实例对象
     */
    @Override
    public MallSaleAddrEntity update(MallSaleAddrEntity mallSaleAddrEntity) {
        logger.info("update begin.mallSaleAddrEntity:{}", JsonUtil.obj2Json(mallSaleAddrEntity));
        this.mallSaleAddrDao.update(mallSaleAddrEntity);
        return this.queryById(mallSaleAddrEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        logger.info("deleteById begin.mallSaleAddrEntity:{}", id);
        return this.mallSaleAddrDao.deleteById(id) > 0;
    }
}
