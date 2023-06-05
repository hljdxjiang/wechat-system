package com.nuoding.wechat.common.service.mall;

import com.nuoding.wechat.common.entity.mall.MallCardInfoEntity;

import java.util.List;

/**
 * (mallCardInfo)表服务接口
 * 卡券信息表
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface MallCardInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MallCardInfoEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param mallCardInfoEntity 筛选条件
     * @return 查询结果
     */
    List<MallCardInfoEntity> queryByPage(MallCardInfoEntity mallCardInfoEntity);

    /**
     * 新增数据
     *
     * @param mallCardInfoEntity 实例对象
     * @return 实例对象
     */
    MallCardInfoEntity insert(MallCardInfoEntity mallCardInfoEntity);

    /**
     * 修改数据
     *
     * @param mallCardInfoEntity 实例对象
     * @return 实例对象
     */
    MallCardInfoEntity update(MallCardInfoEntity mallCardInfoEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
