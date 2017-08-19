package com.isprint.jslx.lccfd.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class FdPackage implements Serializable {
    /**
     * 套餐表
     */
    private Integer id;

    /**
     * 套餐名称
     */
    private String name;

    /**
     * 套餐类型id
     */
    private Integer packageTypeId;

    /**
     * 价格
     */
    private BigDecimal money;

    /**
     * 时间类型
     */
    private String timeType;

    /**
     * 时间（几天、几个月、几年）
     */
    private Integer time;

    /**
     * 系统
     */
    private String system;

    /**
     * ios标识
     */
    private String iosCode;

    /**
     * 是否激活
     */
    private Boolean isActivate;

    private String subjectIds;

    private String subjectNames;

    /**
     * 是否删除
     */
    private Boolean isDel;

    private Date updateTime;

    private Date createTime;

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

    public Integer getPackageTypeId() {
        return packageTypeId;
    }

    public void setPackageTypeId(Integer packageTypeId) {
        this.packageTypeId = packageTypeId;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getTimeType() {
        return timeType;
    }

    public void setTimeType(String timeType) {
        this.timeType = timeType == null ? null : timeType.trim();
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system == null ? null : system.trim();
    }

    public String getIosCode() {
        return iosCode;
    }

    public void setIosCode(String iosCode) {
        this.iosCode = iosCode == null ? null : iosCode.trim();
    }

    public Boolean getIsActivate() {
        return isActivate;
    }

    public void setIsActivate(Boolean isActivate) {
        this.isActivate = isActivate;
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

    public Boolean getIsDel() {
        return isDel;
    }

    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", packageTypeId=").append(packageTypeId);
        sb.append(", money=").append(money);
        sb.append(", timeType=").append(timeType);
        sb.append(", time=").append(time);
        sb.append(", system=").append(system);
        sb.append(", iosCode=").append(iosCode);
        sb.append(", isActivate=").append(isActivate);
        sb.append(", subjectIds=").append(subjectIds);
        sb.append(", subjectNames=").append(subjectNames);
        sb.append(", isDel=").append(isDel);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}