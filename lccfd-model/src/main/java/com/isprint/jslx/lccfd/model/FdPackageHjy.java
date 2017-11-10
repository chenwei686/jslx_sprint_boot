package com.isprint.jslx.lccfd.model;

import java.io.Serializable;
import java.util.Date;

public class FdPackageHjy implements Serializable {
    private Integer id;

    /**
     * 子组合包名称
     */
    private String groupName;

    /**
     * 是否可试用，0：不可1：可试用
     */
    private Boolean isTrial;

    /**
     * 试用天数
     */
    private Integer trialDay;

    /**
     * 子产品ID
     */
    private Integer productId;

    /**
     * 子组合包Id
     */
    private Integer groupId;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    public Boolean getIsTrial() {
        return isTrial;
    }

    public void setIsTrial(Boolean isTrial) {
        this.isTrial = isTrial;
    }

    public Integer getTrialDay() {
        return trialDay;
    }

    public void setTrialDay(Integer trialDay) {
        this.trialDay = trialDay;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
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
        sb.append(", groupName=").append(groupName);
        sb.append(", isTrial=").append(isTrial);
        sb.append(", trialDay=").append(trialDay);
        sb.append(", productId=").append(productId);
        sb.append(", groupId=").append(groupId);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}