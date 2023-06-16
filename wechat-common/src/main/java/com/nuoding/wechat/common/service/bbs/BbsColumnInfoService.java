package com.nuoding.wechat.common.service.bbs;

import com.nuoding.wechat.common.entity.bbs.BbsColumnInfoEntity;

import java.util.List;

/**
 * (bbsColumnInfo)表服务接口
 * 文章栏目信息表
 * @author jhc
 * @since 2023-03-07 14:38:18
 */
public interface BbsColumnInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BbsColumnInfoEntity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param bbsColumnInfoEntity 筛选条件
     * @return 查询结果
     */
    List<BbsColumnInfoEntity> queryAllByLimit(BbsColumnInfoEntity bbsColumnInfoEntity);

    /**
     * 新增数据
     *
     * @param bbsColumnInfoEntity 实例对象
     * @return 实例对象
     */
    BbsColumnInfoEntity insert(BbsColumnInfoEntity bbsColumnInfoEntity);

    /**
     * 修改数据
     *
     * @param bbsColumnInfoEntity 实例对象
     * @return 实例对象
     */
    BbsColumnInfoEntity update(BbsColumnInfoEntity bbsColumnInfoEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
