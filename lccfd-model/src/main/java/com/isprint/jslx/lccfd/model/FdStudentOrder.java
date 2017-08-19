package com.isprint.jslx.lccfd.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class FdStudentOrder implements Serializable {
    /**
     * 订单表
     */
    private Long id;

    /**
     * 套餐id
     */
    private Integer packageId;

    /**
     * 套餐活动id
     */
    private Integer packageActivityId;

    /**
     * 套餐价格
     */
    private BigDecimal packageMoney;

    /**
     * 套餐活动优惠价格
     */
    private BigDecimal packageActivityMoney;

    /**
     * 套餐活动折扣
     */
    private BigDecimal packageActivityDiscount;

    /**
     * 优惠券id
     */
    private Integer packageCouponId;

    private Integer packageCouponCodeId;

    /**
     * 优惠码折扣
     */
    private BigDecimal packageCouponDiscount;

    /**
     * 实际支付金额
     */
    private BigDecimal payMoney;

    /**
     * 学生id
     */
    private Integer studentId;

    /**
     * 学校id
     */
    private Integer schoolId;

    /**
     * 年级id
     */
    private Integer gradeId;

    /**
     * 班级id
     */
    private Integer classesId;

    /**
     * 入学年份
     */
    private String year;

    /**
     * 支付方式
     */
    private String payType;

    /**
     * 订单状态（0：待支付  1：取消支付  2：支付成功 3：支付超时）
     */
    private Byte status;

    /**
     * 是否删除
     */
    private Boolean isDel;

    /**
     * 提交到第三方订单编号
     */
    private String orderNum;

    /**
     * ping++支付对象id，由ping++生成，27位长度字符串
     */
    private String chargeId;

    /**
     * 支付成功时间
     */
    private Date paySuccessTime;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPackageId() {
        return packageId;
    }

    public void setPackageId(Integer packageId) {
        this.packageId = packageId;
    }

    public Integer getPackageActivityId() {
        return packageActivityId;
    }

    public void setPackageActivityId(Integer packageActivityId) {
        this.packageActivityId = packageActivityId;
    }

    public BigDecimal getPackageMoney() {
        return packageMoney;
    }

    public void setPackageMoney(BigDecimal packageMoney) {
        this.packageMoney = packageMoney;
    }

    public BigDecimal getPackageActivityMoney() {
        return packageActivityMoney;
    }

    public void setPackageActivityMoney(BigDecimal packageActivityMoney) {
        this.packageActivityMoney = packageActivityMoney;
    }

    public BigDecimal getPackageActivityDiscount() {
        return packageActivityDiscount;
    }

    public void setPackageActivityDiscount(BigDecimal packageActivityDiscount) {
        this.packageActivityDiscount = packageActivityDiscount;
    }

    public Integer getPackageCouponId() {
        return packageCouponId;
    }

    public void setPackageCouponId(Integer packageCouponId) {
        this.packageCouponId = packageCouponId;
    }

    public Integer getPackageCouponCodeId() {
        return packageCouponCodeId;
    }

    public void setPackageCouponCodeId(Integer packageCouponCodeId) {
        this.packageCouponCodeId = packageCouponCodeId;
    }

    public BigDecimal getPackageCouponDiscount() {
        return packageCouponDiscount;
    }

    public void setPackageCouponDiscount(BigDecimal packageCouponDiscount) {
        this.packageCouponDiscount = packageCouponDiscount;
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

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }

    public Integer getClassesId() {
        return classesId;
    }

    public void setClassesId(Integer classesId) {
        this.classesId = classesId;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Boolean getIsDel() {
        return isDel;
    }

    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum == null ? null : orderNum.trim();
    }

    public String getChargeId() {
        return chargeId;
    }

    public void setChargeId(String chargeId) {
        this.chargeId = chargeId == null ? null : chargeId.trim();
    }

    public Date getPaySuccessTime() {
        return paySuccessTime;
    }

    public void setPaySuccessTime(Date paySuccessTime) {
        this.paySuccessTime = paySuccessTime;
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
        sb.append(", packageId=").append(packageId);
        sb.append(", packageActivityId=").append(packageActivityId);
        sb.append(", packageMoney=").append(packageMoney);
        sb.append(", packageActivityMoney=").append(packageActivityMoney);
        sb.append(", packageActivityDiscount=").append(packageActivityDiscount);
        sb.append(", packageCouponId=").append(packageCouponId);
        sb.append(", packageCouponCodeId=").append(packageCouponCodeId);
        sb.append(", packageCouponDiscount=").append(packageCouponDiscount);
        sb.append(", payMoney=").append(payMoney);
        sb.append(", studentId=").append(studentId);
        sb.append(", schoolId=").append(schoolId);
        sb.append(", gradeId=").append(gradeId);
        sb.append(", classesId=").append(classesId);
        sb.append(", year=").append(year);
        sb.append(", payType=").append(payType);
        sb.append(", status=").append(status);
        sb.append(", isDel=").append(isDel);
        sb.append(", orderNum=").append(orderNum);
        sb.append(", chargeId=").append(chargeId);
        sb.append(", paySuccessTime=").append(paySuccessTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}