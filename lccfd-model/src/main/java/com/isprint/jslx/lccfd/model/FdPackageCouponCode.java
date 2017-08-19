package com.isprint.jslx.lccfd.model;

import java.io.Serializable;
import java.util.Date;

public class FdPackageCouponCode implements Serializable {
    /**
     * 套餐优惠码表
     */
    private Integer id;

    /**
     * 优惠券id
     */
    private Integer packageCouponId;

    /**
     * 优惠券生成数量配置id
     */
    private Integer packageCouponConfigId;

    /**
     * 优惠码
     */
    private String code;

    /**
     * 使用状态（0：未使用  1：已使用）
     */
    private Boolean isUse;

    /**
     * 使用时间
     */
    private Date useTime;

    /**
     * 使用的学生id
     */
    private Integer studentId;

    /**
     * 是否删除
     */
    private Boolean isDel;

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

    public Integer getPackageCouponConfigId() {
        return packageCouponConfigId;
    }

    public void setPackageCouponConfigId(Integer packageCouponConfigId) {
        this.packageCouponConfigId = packageCouponConfigId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Boolean getIsUse() {
        return isUse;
    }

    public void setIsUse(Boolean isUse) {
        this.isUse = isUse;
    }

    public Date getUseTime() {
        return useTime;
    }

    public void setUseTime(Date useTime) {
        this.useTime = useTime;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", packageCouponId=").append(packageCouponId);
        sb.append(", packageCouponConfigId=").append(packageCouponConfigId);
        sb.append(", code=").append(code);
        sb.append(", isUse=").append(isUse);
        sb.append(", useTime=").append(useTime);
        sb.append(", studentId=").append(studentId);
        sb.append(", isDel=").append(isDel);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}