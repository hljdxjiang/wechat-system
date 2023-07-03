package com.nuoding.wechat.api.model;

import com.nuoding.wechat.common.model.BaseDTO;
import com.nuoding.wechat.common.model.Order;

import javax.persistence.Column;
import java.util.List;

public class ProductInfoDTO extends BaseDTO {

    /***
     * 查询条件
     */
    private String searchItem;

    /**
     * 产品规格
     */
    private String prodSpecs;

    /**
     * 产品型号
     */
    private String prodModule;

    /**
     * 品牌编号
     */
    private String brandId;

    /**
     * 产品编号
     */
    private String prodId;

    /***
     * 排序列表
     */
    private List<Order> orderList;
}
