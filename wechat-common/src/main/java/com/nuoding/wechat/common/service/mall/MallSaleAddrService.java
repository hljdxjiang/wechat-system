package com.nuoding.wechat.common.service.mall;

import com.nuoding.wechat.common.entity.mall.MallSaleAddrEntity;

import java.util.List;

/**
 * (mallSaleAddr)表服务接口
 * 客户信息表
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface MallSaleAddrService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MallSaleAddrEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param mallSaleAddrEntity 筛选条件
     * @return 查询结果
     */
    List<MallSaleAddrEntity> queryByPage(MallSaleAddrEntity mallSaleAddrEntity);

    /**
     * 新增数据
     *
     * @param mallSaleAddrEntity 实例对象
     * @return 实例对象
     */
    MallSaleAddrEntity insert(MallSaleAddrEntity mallSaleAddrEntity);

    /**
     * 修改数据
     *
     * @param mallSaleAddrEntity 实例对象
     * @return 实例对象
     */
    MallSaleAddrEntity update(MallSaleAddrEntity mallSaleAddrEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
