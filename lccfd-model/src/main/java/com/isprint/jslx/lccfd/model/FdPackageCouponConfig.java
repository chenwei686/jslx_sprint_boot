package com.isprint.jslx.lccfd.model;

import java.io.Serializable;
import java.util.Date;

public class FdPackageCouponConfig implements Serializable {
    /**
     * 优惠券生成数量配置表
     */
    private Integer id;

    /**
     * 优惠券id
     */
    private Integer packageCouponId;

    /**
     * 生成数量
     */
    private Integer number;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPackageCouponId() {
        return packageCouponId;
    }

    public void setPackageCouponId(Integer packageCouponId) {
        this.packageCouponId = packageCouponId;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
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
        sb.append(", packageCouponId=").append(packageCouponId);
        sb.append(", number=").append(number);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}