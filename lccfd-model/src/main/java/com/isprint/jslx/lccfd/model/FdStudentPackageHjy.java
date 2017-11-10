package com.isprint.jslx.lccfd.model;

import java.io.Serializable;
import java.util.Date;

public class FdStudentPackageHjy implements Serializable {
    private Integer id;

    /**
     * 套餐名称
     */
    private String name;

    /**
     * 学生id
     */
    private Integer studentId;

    /**
     * 学生订单id
     */
    private Integer studentOrderHjyId;

    /**
     * 套餐id
     */
    private Integer packegeHjyId;

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
     * 时间（几天、几个月、几年）
     */
    private Integer billingDay;

    /**
     * system：系统套餐不在客户端显示  online：在客户端显示
     */
    private String packageType;

    private Integer subjectId;

    private String subjectName;

    private Date startTime;

    private Date endTime;

    private Date createTime;

    private Integer groupId;

    /**
     * 0：未订购 1：包月中 2：点播中 3：试用推广中 4：暂停 5：销号 6：过期 7：已购相同套餐
     */
    private Byte status;

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

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getStudentOrderHjyId() {
        return studentOrderHjyId;
    }

    public void setStudentOrderHjyId(Integer studentOrderHjyId) {
        this.studentOrderHjyId = studentOrderHjyId;
    }

    public Integer getPackegeHjyId() {
        return packegeHjyId;
    }

    public void setPackegeHjyId(Integer packegeHjyId) {
        this.packegeHjyId = packegeHjyId;
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

    public Integer getBillingDay() {
        return billingDay;
    }

    public void setBillingDay(Integer billingDay) {
        this.billingDay = billingDay;
    }

    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType == null ? null : packageType.trim();
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName == null ? null : subjectName.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
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

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", studentId=").append(studentId);
        sb.append(", studentOrderHjyId=").append(studentOrderHjyId);
        sb.append(", packegeHjyId=").append(packegeHjyId);
        sb.append(", packageActivityHjyId=").append(packageActivityHjyId);
        sb.append(", groupBillingId=").append(groupBillingId);
        sb.append(", billingType=").append(billingType);
        sb.append(", billingDay=").append(billingDay);
        sb.append(", packageType=").append(packageType);
        sb.append(", subjectId=").append(subjectId);
        sb.append(", subjectName=").append(subjectName);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", groupId=").append(groupId);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}