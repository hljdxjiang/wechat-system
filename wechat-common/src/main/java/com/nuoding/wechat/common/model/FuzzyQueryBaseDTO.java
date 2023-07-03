package com.nuoding.wechat.common.model;

import java.io.Serializable;
import java.util.List;

public class FuzzyQueryBaseDTO implements Serializable {

    /***
     * 模糊查询条件
     */
    private List<String> queryStr;

    /***
     * 排序列表
     */
    private List<Order> orderList;

    public List<String> getQueryStr() {
        return queryStr;
    }

    public void setQueryStr(List<String> queryStr) {
        this.queryStr = queryStr;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }
}
