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
     * 套餐名称
     */
    private String name;

    /**
     * 套餐id
     */
    private Integer packageId;

    /**
     * 套餐活动id
     */
    private Integer packageActivityId;

    private String packageActivityType;

    /**
     * 套餐价格
     */
    private BigDecimal money;

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
     * 优惠券id
     */
    private Integer packageCouponId;

    private Integer packageCouponCodeId;

    /**
     * 优惠码折扣
     */
    private BigDecimal packageCouponDiscount;

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
    private Integer yearId;

    /**
     * 支付方式 （alipay：支付宝 APP 支付  wx：微信 APP 支付）
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

    private Date updateTime;

    private Date createTime;

    /**
     * system：系统套餐不在客户端显示  online：在客户端显示
     */
    private String packageType;

    /**
     * 支付环境
     */
    private String payEnvironment;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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

    public String getPackageActivityType() {
        return packageActivityType;
    }

    public void setPackageActivityType(String packageActivityType) {
        this.packageActivityType = packageActivityType == null ? null : packageActivityType.trim();
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
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

    public Integer getYearId() {
        return yearId;
    }

    public void setYearId(Integer yearId) {
        this.yearId = yearId;
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

    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType == null ? null : packageType.trim();
    }

    public String getPayEnvironment() {
        return payEnvironment;
    }

    public void setPayEnvironment(String payEnvironment) {
        this.payEnvironment = payEnvironment == null ? null : payEnvironment.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", packageId=").append(packageId);
        sb.append(", packageActivityId=").append(packageActivityId);
        sb.append(", packageActivityType=").append(packageActivityType);
        sb.append(", money=").append(money);
        sb.append(", discount=").append(discount);
        sb.append(", dealsMoney=").append(dealsMoney);
        sb.append(", payMoney=").append(payMoney);
        sb.append(", packageCouponId=").append(packageCouponId);
        sb.append(", packageCouponCodeId=").append(packageCouponCodeId);
        sb.append(", packageCouponDiscount=").append(packageCouponDiscount);
        sb.append(", studentId=").append(studentId);
        sb.append(", schoolId=").append(schoolId);
        sb.append(", gradeId=").append(gradeId);
        sb.append(", classesId=").append(classesId);
        sb.append(", yearId=").append(yearId);
        sb.append(", payType=").append(payType);
        sb.append(", status=").append(status);
        sb.append(", isDel=").append(isDel);
        sb.append(", orderNum=").append(orderNum);
        sb.append(", chargeId=").append(chargeId);
        sb.append(", paySuccessTime=").append(paySuccessTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", packageType=").append(packageType);
        sb.append(", payEnvironment=").append(payEnvironment);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}