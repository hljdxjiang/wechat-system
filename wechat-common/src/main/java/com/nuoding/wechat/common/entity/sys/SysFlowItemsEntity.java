package com.nuoding.wechat.common.entity.sys;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.math.BigDecimal;


/**
 * 楼层要素表
 *
 * @Author: hzq
 * @Date: 2023-05-08 19:32:47
 */
@Entity
@Table(name = "sys_flow_items")
public class SysFlowItemsEntity implements Serializable {

    private static final long serialVersionUID = 1L;

            
            /**
             * 
             */
            @Id
            @Column(length = 32)
            private Integer id;
                    
            /**
             * 租户ID
             */
                    @Column(name = "tenant_id")
                    private String tenantId;
                    
            /**
             * 页面ID
             */
                    @Column(name = "flow_id")
                    private String flowId;
                    
            /**
             * 标签ID
             */
                    @Column(name = "item_id")
                    private String itemId;
                    
            /**
             * 排序
             */
                    @Column(name = "item_sort")
                    private Integer itemSort;
                    
            /**
             * 要素类型：item:要素，flow:楼层
             */
                    @Column(name = "item_type")
                    private String itemType;
                    
            /**
             * 用户状态
             */
                    @Column(name = "status")
                    private Integer status;
                    
            /**
             * 最后修改时间
             */
                        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
                    @Column(name = "last_modified_time")
                    private Date lastModifiedTime;
                    
            /**
             * 创建时间
             */
                        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
                    @Column(name = "create_time")
                    private Date createTime;
            
    
        /**
         * 获取：
         */
        public Integer getId() {
            return id;
        }

        /**
         * 设置：
         */
        public void setId(Integer id) {
            this.id=id;
        }
    
        /**
         * 获取：租户ID
         */
        public String getTenantId() {
            return tenantId;
        }

        /**
         * 设置：租户ID
         */
        public void setTenantId(String tenantId) {
            this.tenantId=tenantId;
        }
    
        /**
         * 获取：页面ID
         */
        public String getFlowId() {
            return flowId;
        }

        /**
         * 设置：页面ID
         */
        public void setFlowId(String flowId) {
            this.flowId=flowId;
        }
    
        /**
         * 获取：标签ID
         */
        public String getItemId() {
            return itemId;
        }

        /**
         * 设置：标签ID
         */
        public void setItemId(String itemId) {
            this.itemId=itemId;
        }
    
        /**
         * 获取：排序
         */
        public Integer getItemSort() {
            return itemSort;
        }

        /**
         * 设置：排序
         */
        public void setItemSort(Integer itemSort) {
            this.itemSort=itemSort;
        }
    
        /**
         * 获取：要素类型：item:要素，flow:楼层
         */
        public String getItemType() {
            return itemType;
        }

        /**
         * 设置：要素类型：item:要素，flow:楼层
         */
        public void setItemType(String itemType) {
            this.itemType=itemType;
        }
    
        /**
         * 获取：用户状态
         */
        public Integer getStatus() {
            return status;
        }

        /**
         * 设置：用户状态
         */
        public void setStatus(Integer status) {
            this.status=status;
        }
    
        /**
         * 获取：最后修改时间
         */
        public Date getLastModifiedTime() {
            return lastModifiedTime;
        }

        /**
         * 设置：最后修改时间
         */
        public void setLastModifiedTime(Date lastModifiedTime) {
            this.lastModifiedTime=lastModifiedTime;
        }
    
        /**
         * 获取：创建时间
         */
        public Date getCreateTime() {
            return createTime;
        }

        /**
         * 设置：创建时间
         */
        public void setCreateTime(Date createTime) {
            this.createTime=createTime;
        }
    }
