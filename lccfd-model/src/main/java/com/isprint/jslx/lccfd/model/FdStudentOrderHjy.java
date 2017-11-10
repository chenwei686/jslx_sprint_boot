package com.isprint.jslx.lccfd.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class FdStudentOrderHjy implements Serializable {
    private Integer id;

    /**
     * 套餐名称
     */
    private String name;

    /**
     * 套餐id
     */
    private Integer packageHjyId;

    /**
     * 套餐活动id
     */
    private Integer packageActivityHjyId;

    private String groupBillingId;

    /**
     * 资费类型(1：包月；2：点播（30天、60天、90天、120天）)
     */
    private String billingType;

    /**
     * 实际支付金额
     */
    private BigDecimal payMoney;

    /**
     * 学生id
     */
    private Integer studentId;

    /**
     * 订单状态（0：待支付  1：取消支付  2：支付成功 3：支付超时）
     */
    private Byte status;

    /**
     * system：系统套餐不在客户端显示  online：在客户端显示
     */
    private String packageType;

    /**
     * 时间（几天、几个月、几年）
     */
    private Integer billingDay;

    private String subjectIds;

    private String subjectNames;

    private Date updateTime;

    private Date createTime;

    private Integer groupId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getPackageHjyId() {
        return packageHjyId;
    }

    public void setPackageHjyId(Integer packageHjyId) {
        this.packageHjyId = packageHjyId;
    }

    public Integer getPackageActivityHjyId() {
        return packageActivityHjyId;
    }

    public void setPackageActivityHjyId(Integer packageActivityHjyId) {
        this.packageActivityHjyId = packageActivityHjyId;
    }

    public String getGroupBillingId() {
        return groupBillingId;
    }

    public void setGroupBillingId(String groupBillingId) {
        this.groupBillingId = groupBillingId == null ? null : groupBillingId.trim();
    }

    public String getBillingType() {
        return billingType;
    }

    public void setBillingType(String billingType) {
        this.billingType = billingType == null ? null : billingType.trim();
    }

    public BigDecimal getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(BigDecimal payMoney) {
        this.payMoney = payMoney;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType == null ? null : packageType.trim();
    }

    public Integer getBillingDay() {
        return billingDay;
    }

    public void setBillingDay(Integer billingDay) {
        this.billingDay = billingDay;
    }

    public String getSubjectIds() {
        return subjectIds;
    }

    public void setSubjectIds(String subjectIds) {
        this.subjectIds = subjectIds == null ? null : subjectIds.trim();
    }

    public String getSubjectNames() {
        return subjectNames;
    }

    public void setSubjectNames(String subjectNames) {
        this.subjectNames = subjectNames == null ? null : subjectNames.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", packageHjyId=").append(packageHjyId);
        sb.append(", packageActivityHjyId=").append(packageActivityHjyId);
        sb.append(", groupBillingId=").append(groupBillingId);
        sb.append(", billingType=").append(billingType);
        sb.append(", payMoney=").append(payMoney);
        sb.append(", studentId=").append(studentId);
        sb.append(", status=").append(status);
        sb.append(", packageType=").append(packageType);
        sb.append(", billingDay=").append(billingDay);
        sb.append(", subjectIds=").append(subjectIds);
        sb.append(", subjectNames=").append(subjectNames);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", groupId=").append(groupId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}