package com.nuoding.wechat.common.entity.bbs;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.math.BigDecimal;


/**
 * 课程详情表
 *
 * @Author: hzq
 * @Date: 2023-12-18 14:57:37
 */
@Entity
@Table(name = "bbs_course_detail")
public class BbsCourseDetailEntity implements Serializable {

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
             * 教程ID
             */
                    @Column(name = "course_id")
                    private String courseId;
                    
            /**
             * 章节ID
             */
                    @Column(name = "part_id")
                    private String partId;
                    
            /**
             * 章节标题
             */
                    @Column(name = "part_title")
                    private String partTitle;
                    
            /**
             * 作者ID
             */
                    @Column(name = "user_id")
                    private String userId;
                    
            /**
             * 备注
             */
                    @Column(name = "remark")
                    private String remark;
                    
            /**
             * 专题标签
             */
                    @Column(name = "column_id")
                    private String columnId;
                    
            /**
             * 文章标签
             */
                    @Column(name = "label_id")
                    private String labelId;
                    
            /**
             * 状态0草稿1审核中8审核拒绝9审核通过
             */
                    @Column(name = "status")
                    private Integer status;
                    
            /**
             * 创建时间
             */
                        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
                    @Column(name = "create_time")
                    private Date createTime;
                    
            /**
             * 最后修改时间
             */
                        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
                    @Column(name = "last_modified_time")
                    private Date lastModifiedTime;
                    
            /**
             * 摘要
             */
                    @Column(name = "part_summary")
                    private String partSummary;
                    
            /**
             * 详细描述
             */
                    @Column(name = "part_desc")
                    private String partDesc;
                    
            /**
             * 客户级别
             */
                    @Column(name = "cust_level")
                    private Integer custLevel;
                    
            /**
             * 会员类型0免费会员
             */
                    @Column(name = "vip_type")
                    private Integer vipType;
            
    
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
         * 获取：教程ID
         */
        public String getCourseId() {
            return courseId;
        }

        /**
         * 设置：教程ID
         */
        public void setCourseId(String courseId) {
            this.courseId=courseId;
        }
    
        /**
         * 获取：章节ID
         */
        public String getPartId() {
            return partId;
        }

        /**
         * 设置：章节ID
         */
        public void setPartId(String partId) {
            this.partId=partId;
        }
    
        /**
         * 获取：章节标题
         */
        public String getPartTitle() {
            return partTitle;
        }

        /**
         * 设置：章节标题
         */
        public void setPartTitle(String partTitle) {
            this.partTitle=partTitle;
        }
    
        /**
         * 获取：作者ID
         */
        public String getUserId() {
            return userId;
        }

        /**
         * 设置：作者ID
         */
        public void setUserId(String userId) {
            this.userId=userId;
        }
    
        /**
         * 获取：备注
         */
        public String getRemark() {
            return remark;
        }

        /**
         * 设置：备注
         */
        public void setRemark(String remark) {
            this.remark=remark;
        }
    
        /**
         * 获取：专题标签
         */
        public String getColumnId() {
            return columnId;
        }

        /**
         * 设置：专题标签
         */
        public void setColumnId(String columnId) {
            this.columnId=columnId;
        }
    
        /**
         * 获取：文章标签
         */
        public String getLabelId() {
            return labelId;
        }

        /**
         * 设置：文章标签
         */
        public void setLabelId(String labelId) {
            this.labelId=labelId;
        }
    
        /**
         * 获取：状态0草稿1审核中8审核拒绝9审核通过
         */
        public Integer getStatus() {
            return status;
        }

        /**
         * 设置：状态0草稿1审核中8审核拒绝9审核通过
         */
        public void setStatus(Integer status) {
            this.status=status;
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
         * 获取：摘要
         */
        public String getPartSummary() {
            return partSummary;
        }

        /**
         * 设置：摘要
         */
        public void setPartSummary(String partSummary) {
            this.partSummary=partSummary;
        }
    
        /**
         * 获取：详细描述
         */
        public String getPartDesc() {
            return partDesc;
        }

        /**
         * 设置：详细描述
         */
        public void setPartDesc(String partDesc) {
            this.partDesc=partDesc;
        }
    
        /**
         * 获取：客户级别
         */
        public Integer getCustLevel() {
            return custLevel;
        }

        /**
         * 设置：客户级别
         */
        public void setCustLevel(Integer custLevel) {
            this.custLevel=custLevel;
        }
    
        /**
         * 获取：会员类型0免费会员
         */
        public Integer getVipType() {
            return vipType;
        }

        /**
         * 设置：会员类型0免费会员
         */
        public void setVipType(Integer vipType) {
            this.vipType=vipType;
        }
    }
