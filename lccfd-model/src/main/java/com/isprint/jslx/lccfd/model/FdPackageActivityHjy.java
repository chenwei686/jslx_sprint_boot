package com.isprint.jslx.lccfd.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class FdPackageActivityHjy implements Serializable {
    private Integer id;

    private String name;

    private Integer packageHjyId;

    /**
     * 资费类型(1：包月；2：点播（30天、60天、90天、120天）)
     */
    private String billingType;

    private BigDecimal price;

    /**
     * 资费天数
     */
    private Integer billingDay;

    private String groupBillingId;

    private String subjectIds;

    private String subjectNames;

    /**
     * 系统
     */
    private String system;

    /**
     * 是否删除
     */
    private Boolean isDel;

    private Date createTime;

    private Integer provinceId;

    /**
     * 套餐类型 （0：基础版  1：高级版）
     */
    private Byte type;

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

    public String getBillingType() {
        return billingType;
    }

    public void setBillingType(String billingType) {
        this.billingType = billingType == null ? null : billingType.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getBillingDay() {
        return billingDay;
    }

    public void setBillingDay(Integer billingDay) {
        this.billingDay = billingDay;
    }

    public String getGroupBillingId() {
        return groupBillingId;
    }

    public void setGroupBillingId(String groupBillingId) {
        this.groupBillingId = groupBillingId == null ? null : groupBillingId.trim();
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

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system == null ? null : system.trim();
    }

    public Boolean getIsDel() {
        return isDel;
    }

    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
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
        sb.append(", billingType=").append(billingType);
        sb.append(", price=").append(price);
        sb.append(", billingDay=").append(billingDay);
        sb.append(", groupBillingId=").append(groupBillingId);
        sb.append(", subjectIds=").append(subjectIds);
        sb.append(", subjectNames=").append(subjectNames);
        sb.append(", system=").append(system);
        sb.append(", isDel=").append(isDel);
        sb.append(", createTime=").append(createTime);
        sb.append(", provinceId=").append(provinceId);
        sb.append(", type=").append(type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}