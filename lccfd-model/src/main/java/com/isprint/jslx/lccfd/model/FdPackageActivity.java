package com.isprint.jslx.lccfd.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class FdPackageActivity implements Serializable {
    /**
     * 套餐活动表
     */
    private Integer id;

    /**
     * 活动名称
     */
    private String content;

    /**
     * 套餐id
     */
    private Integer packageId;

    private Date startTime;

    private Date endTime;

    /**
     * none：无优惠
     */
    private String activityType;

    /**
     * 折扣
     */
    private BigDecimal discount;

    /**
     * 优惠价格
     */
    private BigDecimal dealsMoney;

    /**
     * 实际支付金额
     */
    private BigDecimal payMoney;

    /**
     * 是否激活
     */
    private Boolean isActivate;

    /**
     * 是否删除
     */
    private Boolean isDel;

    private String thirdPackageActivityId;

    /**
     * ios标识
     */
    private String iosCode;

    private Date updateTime;

    private Date createTime;

    /**
     * ios标识
     */
    private String iosCodeHjy;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getPackageId() {
        return packageId;
    }

    public void setPackageId(Integer packageId) {
        this.packageId = packageId;
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

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType == null ? null : activityType.trim();
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getDealsMoney() {
        return dealsMoney;
    }

    public void setDealsMoney(BigDecimal dealsMoney) {
        this.dealsMoney = dealsMoney;
    }

    public BigDecimal getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(BigDecimal payMoney) {
        this.payMoney = payMoney;
    }

    public Boolean getIsActivate() {
        return isActivate;
    }

    public void setIsActivate(Boolean isActivate) {
        this.isActivate = isActivate;
    }

    public Boolean getIsDel() {
        return isDel;
    }

    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }

    public String getThirdPackageActivityId() {
        return thirdPackageActivityId;
    }

    public void setThirdPackageActivityId(String thirdPackageActivityId) {
        this.thirdPackageActivityId = thirdPackageActivityId == null ? null : thirdPackageActivityId.trim();
    }

    public String getIosCode() {
        return iosCode;
    }

    public void setIosCode(String iosCode) {
        this.iosCode = iosCode == null ? null : iosCode.trim();
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

    public String getIosCodeHjy() {
        return iosCodeHjy;
    }

    public void setIosCodeHjy(String iosCodeHjy) {
        this.iosCodeHjy = iosCodeHjy == null ? null : iosCodeHjy.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", content=").append(content);
        sb.append(", packageId=").append(packageId);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", activityType=").append(activityType);
        sb.append(", discount=").append(discount);
        sb.append(", dealsMoney=").append(dealsMoney);
        sb.append(", payMoney=").append(payMoney);
        sb.append(", isActivate=").append(isActivate);
        sb.append(", isDel=").append(isDel);
        sb.append(", thirdPackageActivityId=").append(thirdPackageActivityId);
        sb.append(", iosCode=").append(iosCode);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", iosCodeHjy=").append(iosCodeHjy);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}