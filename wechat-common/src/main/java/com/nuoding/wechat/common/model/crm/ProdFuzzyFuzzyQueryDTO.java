package com.nuoding.wechat.common.model.crm;

import com.nuoding.wechat.common.model.FuzzyQueryBaseDTO;
import com.nuoding.wechat.common.model.Order;

import java.io.Serializable;
import java.util.List;

public class ProdFuzzyFuzzyQueryDTO implements Serializable {

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
     * 销售渠道
     */
    private String channel_no;

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

    public String getChannel_no() {
        return channel_no;
    }

    public void setChannel_no(String channel_no) {
        this.channel_no = channel_no;
    }

    public String getProdSpecs() {
        return prodSpecs;
    }

    public void setProdSpecs(String prodSpecs) {
        this.prodSpecs = prodSpecs;
    }

    public String getProdModule() {
        return prodModule;
    }

    public void setProdModule(String prodModule) {
        this.prodModule = prodModule;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }
}
