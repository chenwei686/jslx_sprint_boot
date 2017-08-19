package com.isprint.jslx.lccfd.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FdStudentOrderQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public FdStudentOrderQuery() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo=pageNo;
        this.startRow = (pageNo-1)*this.pageSize;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setStartRow(Integer startRow) {
        this.startRow=startRow;
    }

    public Integer getStartRow() {
        return startRow;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize=pageSize;
        this.startRow = (pageNo-1)*this.pageSize;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setFields(String fields) {
        this.fields=fields;
    }

    public String getFields() {
        return fields;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPackageIdIsNull() {
            addCriterion("package_id is null");
            return (Criteria) this;
        }

        public Criteria andPackageIdIsNotNull() {
            addCriterion("package_id is not null");
            return (Criteria) this;
        }

        public Criteria andPackageIdEqualTo(Integer value) {
            addCriterion("package_id =", value, "packageId");
            return (Criteria) this;
        }

        public Criteria andPackageIdNotEqualTo(Integer value) {
            addCriterion("package_id <>", value, "packageId");
            return (Criteria) this;
        }

        public Criteria andPackageIdGreaterThan(Integer value) {
            addCriterion("package_id >", value, "packageId");
            return (Criteria) this;
        }

        public Criteria andPackageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("package_id >=", value, "packageId");
            return (Criteria) this;
        }

        public Criteria andPackageIdLessThan(Integer value) {
            addCriterion("package_id <", value, "packageId");
            return (Criteria) this;
        }

        public Criteria andPackageIdLessThanOrEqualTo(Integer value) {
            addCriterion("package_id <=", value, "packageId");
            return (Criteria) this;
        }

        public Criteria andPackageIdIn(List<Integer> values) {
            addCriterion("package_id in", values, "packageId");
            return (Criteria) this;
        }

        public Criteria andPackageIdNotIn(List<Integer> values) {
            addCriterion("package_id not in", values, "packageId");
            return (Criteria) this;
        }

        public Criteria andPackageIdBetween(Integer value1, Integer value2) {
            addCriterion("package_id between", value1, value2, "packageId");
            return (Criteria) this;
        }

        public Criteria andPackageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("package_id not between", value1, value2, "packageId");
            return (Criteria) this;
        }

        public Criteria andPackageActivityIdIsNull() {
            addCriterion("package_activity_id is null");
            return (Criteria) this;
        }

        public Criteria andPackageActivityIdIsNotNull() {
            addCriterion("package_activity_id is not null");
            return (Criteria) this;
        }

        public Criteria andPackageActivityIdEqualTo(Integer value) {
            addCriterion("package_activity_id =", value, "packageActivityId");
            return (Criteria) this;
        }

        public Criteria andPackageActivityIdNotEqualTo(Integer value) {
            addCriterion("package_activity_id <>", value, "packageActivityId");
            return (Criteria) this;
        }

        public Criteria andPackageActivityIdGreaterThan(Integer value) {
            addCriterion("package_activity_id >", value, "packageActivityId");
            return (Criteria) this;
        }

        public Criteria andPackageActivityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("package_activity_id >=", value, "packageActivityId");
            return (Criteria) this;
        }

        public Criteria andPackageActivityIdLessThan(Integer value) {
            addCriterion("package_activity_id <", value, "packageActivityId");
            return (Criteria) this;
        }

        public Criteria andPackageActivityIdLessThanOrEqualTo(Integer value) {
            addCriterion("package_activity_id <=", value, "packageActivityId");
            return (Criteria) this;
        }

        public Criteria andPackageActivityIdIn(List<Integer> values) {
            addCriterion("package_activity_id in", values, "packageActivityId");
            return (Criteria) this;
        }

        public Criteria andPackageActivityIdNotIn(List<Integer> values) {
            addCriterion("package_activity_id not in", values, "packageActivityId");
            return (Criteria) this;
        }

        public Criteria andPackageActivityIdBetween(Integer value1, Integer value2) {
            addCriterion("package_activity_id between", value1, value2, "packageActivityId");
            return (Criteria) this;
        }

        public Criteria andPackageActivityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("package_activity_id not between", value1, value2, "packageActivityId");
            return (Criteria) this;
        }

        public Criteria andPackageMoneyIsNull() {
            addCriterion("package_money is null");
            return (Criteria) this;
        }

        public Criteria andPackageMoneyIsNotNull() {
            addCriterion("package_money is not null");
            return (Criteria) this;
        }

        public Criteria andPackageMoneyEqualTo(BigDecimal value) {
            addCriterion("package_money =", value, "packageMoney");
            return (Criteria) this;
        }

        public Criteria andPackageMoneyNotEqualTo(BigDecimal value) {
            addCriterion("package_money <>", value, "packageMoney");
            return (Criteria) this;
        }

        public Criteria andPackageMoneyGreaterThan(BigDecimal value) {
            addCriterion("package_money >", value, "packageMoney");
            return (Criteria) this;
        }

        public Criteria andPackageMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("package_money >=", value, "packageMoney");
            return (Criteria) this;
        }

        public Criteria andPackageMoneyLessThan(BigDecimal value) {
            addCriterion("package_money <", value, "packageMoney");
            return (Criteria) this;
        }

        public Criteria andPackageMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("package_money <=", value, "packageMoney");
            return (Criteria) this;
        }

        public Criteria andPackageMoneyIn(List<BigDecimal> values) {
            addCriterion("package_money in", values, "packageMoney");
            return (Criteria) this;
        }

        public Criteria andPackageMoneyNotIn(List<BigDecimal> values) {
            addCriterion("package_money not in", values, "packageMoney");
            return (Criteria) this;
        }

        public Criteria andPackageMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("package_money between", value1, value2, "packageMoney");
            return (Criteria) this;
        }

        public Criteria andPackageMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("package_money not between", value1, value2, "packageMoney");
            return (Criteria) this;
        }

        public Criteria andPackageActivityMoneyIsNull() {
            addCriterion("package_activity_money is null");
            return (Criteria) this;
        }

        public Criteria andPackageActivityMoneyIsNotNull() {
            addCriterion("package_activity_money is not null");
            return (Criteria) this;
        }

        public Criteria andPackageActivityMoneyEqualTo(BigDecimal value) {
            addCriterion("package_activity_money =", value, "packageActivityMoney");
            return (Criteria) this;
        }

        public Criteria andPackageActivityMoneyNotEqualTo(BigDecimal value) {
            addCriterion("package_activity_money <>", value, "packageActivityMoney");
            return (Criteria) this;
        }

        public Criteria andPackageActivityMoneyGreaterThan(BigDecimal value) {
            addCriterion("package_activity_money >", value, "packageActivityMoney");
            return (Criteria) this;
        }

        public Criteria andPackageActivityMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("package_activity_money >=", value, "packageActivityMoney");
            return (Criteria) this;
        }

        public Criteria andPackageActivityMoneyLessThan(BigDecimal value) {
            addCriterion("package_activity_money <", value, "packageActivityMoney");
            return (Criteria) this;
        }

        public Criteria andPackageActivityMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("package_activity_money <=", value, "packageActivityMoney");
            return (Criteria) this;
        }

        public Criteria andPackageActivityMoneyIn(List<BigDecimal> values) {
            addCriterion("package_activity_money in", values, "packageActivityMoney");
            return (Criteria) this;
        }

        public Criteria andPackageActivityMoneyNotIn(List<BigDecimal> values) {
            addCriterion("package_activity_money not in", values, "packageActivityMoney");
            return (Criteria) this;
        }

        public Criteria andPackageActivityMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("package_activity_money between", value1, value2, "packageActivityMoney");
            return (Criteria) this;
        }

        public Criteria andPackageActivityMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("package_activity_money not between", value1, value2, "packageActivityMoney");
            return (Criteria) this;
        }

        public Criteria andPackageActivityDiscountIsNull() {
            addCriterion("package_activity_discount is null");
            return (Criteria) this;
        }

        public Criteria andPackageActivityDiscountIsNotNull() {
            addCriterion("package_activity_discount is not null");
            return (Criteria) this;
        }

        public Criteria andPackageActivityDiscountEqualTo(BigDecimal value) {
            addCriterion("package_activity_discount =", value, "packageActivityDiscount");
            return (Criteria) this;
        }

        public Criteria andPackageActivityDiscountNotEqualTo(BigDecimal value) {
            addCriterion("package_activity_discount <>", value, "packageActivityDiscount");
            return (Criteria) this;
        }

        public Criteria andPackageActivityDiscountGreaterThan(BigDecimal value) {
            addCriterion("package_activity_discount >", value, "packageActivityDiscount");
            return (Criteria) this;
        }

        public Criteria andPackageActivityDiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("package_activity_discount >=", value, "packageActivityDiscount");
            return (Criteria) this;
        }

        public Criteria andPackageActivityDiscountLessThan(BigDecimal value) {
            addCriterion("package_activity_discount <", value, "packageActivityDiscount");
            return (Criteria) this;
        }

        public Criteria andPackageActivityDiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("package_activity_discount <=", value, "packageActivityDiscount");
            return (Criteria) this;
        }

        public Criteria andPackageActivityDiscountIn(List<BigDecimal> values) {
            addCriterion("package_activity_discount in", values, "packageActivityDiscount");
            return (Criteria) this;
        }

        public Criteria andPackageActivityDiscountNotIn(List<BigDecimal> values) {
            addCriterion("package_activity_discount not in", values, "packageActivityDiscount");
            return (Criteria) this;
        }

        public Criteria andPackageActivityDiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("package_activity_discount between", value1, value2, "packageActivityDiscount");
            return (Criteria) this;
        }

        public Criteria andPackageActivityDiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("package_activity_discount not between", value1, value2, "packageActivityDiscount");
            return (Criteria) this;
        }

        public Criteria andPackageCouponIdIsNull() {
            addCriterion("package_coupon_id is null");
            return (Criteria) this;
        }

        public Criteria andPackageCouponIdIsNotNull() {
            addCriterion("package_coupon_id is not null");
            return (Criteria) this;
        }

        public Criteria andPackageCouponIdEqualTo(Integer value) {
            addCriterion("package_coupon_id =", value, "packageCouponId");
            return (Criteria) this;
        }

        public Criteria andPackageCouponIdNotEqualTo(Integer value) {
            addCriterion("package_coupon_id <>", value, "packageCouponId");
            return (Criteria) this;
        }

        public Criteria andPackageCouponIdGreaterThan(Integer value) {
            addCriterion("package_coupon_id >", value, "packageCouponId");
            return (Criteria) this;
        }

        public Criteria andPackageCouponIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("package_coupon_id >=", value, "packageCouponId");
            return (Criteria) this;
        }

        public Criteria andPackageCouponIdLessThan(Integer value) {
            addCriterion("package_coupon_id <", value, "packageCouponId");
            return (Criteria) this;
        }

        public Criteria andPackageCouponIdLessThanOrEqualTo(Integer value) {
            addCriterion("package_coupon_id <=", value, "packageCouponId");
            return (Criteria) this;
        }

        public Criteria andPackageCouponIdIn(List<Integer> values) {
            addCriterion("package_coupon_id in", values, "packageCouponId");
            return (Criteria) this;
        }

        public Criteria andPackageCouponIdNotIn(List<Integer> values) {
            addCriterion("package_coupon_id not in", values, "packageCouponId");
            return (Criteria) this;
        }

        public Criteria andPackageCouponIdBetween(Integer value1, Integer value2) {
            addCriterion("package_coupon_id between", value1, value2, "packageCouponId");
            return (Criteria) this;
        }

        public Criteria andPackageCouponIdNotBetween(Integer value1, Integer value2) {
            addCriterion("package_coupon_id not between", value1, value2, "packageCouponId");
            return (Criteria) this;
        }

        public Criteria andPackageCouponCodeIdIsNull() {
            addCriterion("package_coupon_code_id is null");
            return (Criteria) this;
        }

        public Criteria andPackageCouponCodeIdIsNotNull() {
            addCriterion("package_coupon_code_id is not null");
            return (Criteria) this;
        }

        public Criteria andPackageCouponCodeIdEqualTo(Integer value) {
            addCriterion("package_coupon_code_id =", value, "packageCouponCodeId");
            return (Criteria) this;
        }

        public Criteria andPackageCouponCodeIdNotEqualTo(Integer value) {
            addCriterion("package_coupon_code_id <>", value, "packageCouponCodeId");
            return (Criteria) this;
        }

        public Criteria andPackageCouponCodeIdGreaterThan(Integer value) {
            addCriterion("package_coupon_code_id >", value, "packageCouponCodeId");
            return (Criteria) this;
        }

        public Criteria andPackageCouponCodeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("package_coupon_code_id >=", value, "packageCouponCodeId");
            return (Criteria) this;
        }

        public Criteria andPackageCouponCodeIdLessThan(Integer value) {
            addCriterion("package_coupon_code_id <", value, "packageCouponCodeId");
            return (Criteria) this;
        }

        public Criteria andPackageCouponCodeIdLessThanOrEqualTo(Integer value) {
            addCriterion("package_coupon_code_id <=", value, "packageCouponCodeId");
            return (Criteria) this;
        }

        public Criteria andPackageCouponCodeIdIn(List<Integer> values) {
            addCriterion("package_coupon_code_id in", values, "packageCouponCodeId");
            return (Criteria) this;
        }

        public Criteria andPackageCouponCodeIdNotIn(List<Integer> values) {
            addCriterion("package_coupon_code_id not in", values, "packageCouponCodeId");
            return (Criteria) this;
        }

        public Criteria andPackageCouponCodeIdBetween(Integer value1, Integer value2) {
            addCriterion("package_coupon_code_id between", value1, value2, "packageCouponCodeId");
            return (Criteria) this;
        }

        public Criteria andPackageCouponCodeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("package_coupon_code_id not between", value1, value2, "packageCouponCodeId");
            return (Criteria) this;
        }

        public Criteria andPackageCouponDiscountIsNull() {
            addCriterion("package_coupon_discount is null");
            return (Criteria) this;
        }

        public Criteria andPackageCouponDiscountIsNotNull() {
            addCriterion("package_coupon_discount is not null");
            return (Criteria) this;
        }

        public Criteria andPackageCouponDiscountEqualTo(BigDecimal value) {
            addCriterion("package_coupon_discount =", value, "packageCouponDiscount");
            return (Criteria) this;
        }

        public Criteria andPackageCouponDiscountNotEqualTo(BigDecimal value) {
            addCriterion("package_coupon_discount <>", value, "packageCouponDiscount");
            return (Criteria) this;
        }

        public Criteria andPackageCouponDiscountGreaterThan(BigDecimal value) {
            addCriterion("package_coupon_discount >", value, "packageCouponDiscount");
            return (Criteria) this;
        }

        public Criteria andPackageCouponDiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("package_coupon_discount >=", value, "packageCouponDiscount");
            return (Criteria) this;
        }

        public Criteria andPackageCouponDiscountLessThan(BigDecimal value) {
            addCriterion("package_coupon_discount <", value, "packageCouponDiscount");
            return (Criteria) this;
        }

        public Criteria andPackageCouponDiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("package_coupon_discount <=", value, "packageCouponDiscount");
            return (Criteria) this;
        }

        public Criteria andPackageCouponDiscountIn(List<BigDecimal> values) {
            addCriterion("package_coupon_discount in", values, "packageCouponDiscount");
            return (Criteria) this;
        }

        public Criteria andPackageCouponDiscountNotIn(List<BigDecimal> values) {
            addCriterion("package_coupon_discount not in", values, "packageCouponDiscount");
            return (Criteria) this;
        }

        public Criteria andPackageCouponDiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("package_coupon_discount between", value1, value2, "packageCouponDiscount");
            return (Criteria) this;
        }

        public Criteria andPackageCouponDiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("package_coupon_discount not between", value1, value2, "packageCouponDiscount");
            return (Criteria) this;
        }

        public Criteria andPayMoneyIsNull() {
            addCriterion("pay_money is null");
            return (Criteria) this;
        }

        public Criteria andPayMoneyIsNotNull() {
            addCriterion("pay_money is not null");
            return (Criteria) this;
        }

        public Criteria andPayMoneyEqualTo(BigDecimal value) {
            addCriterion("pay_money =", value, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyNotEqualTo(BigDecimal value) {
            addCriterion("pay_money <>", value, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyGreaterThan(BigDecimal value) {
            addCriterion("pay_money >", value, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_money >=", value, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyLessThan(BigDecimal value) {
            addCriterion("pay_money <", value, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_money <=", value, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyIn(List<BigDecimal> values) {
            addCriterion("pay_money in", values, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyNotIn(List<BigDecimal> values) {
            addCriterion("pay_money not in", values, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_money between", value1, value2, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_money not between", value1, value2, "payMoney");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNull() {
            addCriterion("student_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNotNull() {
            addCriterion("student_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdEqualTo(Integer value) {
            addCriterion("student_id =", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotEqualTo(Integer value) {
            addCriterion("student_id <>", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThan(Integer value) {
            addCriterion("student_id >", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_id >=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThan(Integer value) {
            addCriterion("student_id <", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThanOrEqualTo(Integer value) {
            addCriterion("student_id <=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIn(List<Integer> values) {
            addCriterion("student_id in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotIn(List<Integer> values) {
            addCriterion("student_id not in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdBetween(Integer value1, Integer value2) {
            addCriterion("student_id between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("student_id not between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdIsNull() {
            addCriterion("school_id is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIdIsNotNull() {
            addCriterion("school_id is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolIdEqualTo(Integer value) {
            addCriterion("school_id =", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdNotEqualTo(Integer value) {
            addCriterion("school_id <>", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdGreaterThan(Integer value) {
            addCriterion("school_id >", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("school_id >=", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdLessThan(Integer value) {
            addCriterion("school_id <", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdLessThanOrEqualTo(Integer value) {
            addCriterion("school_id <=", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdIn(List<Integer> values) {
            addCriterion("school_id in", values, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdNotIn(List<Integer> values) {
            addCriterion("school_id not in", values, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdBetween(Integer value1, Integer value2) {
            addCriterion("school_id between", value1, value2, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdNotBetween(Integer value1, Integer value2) {
            addCriterion("school_id not between", value1, value2, "schoolId");
            return (Criteria) this;
        }

        public Criteria andGradeIdIsNull() {
            addCriterion("grade_id is null");
            return (Criteria) this;
        }

        public Criteria andGradeIdIsNotNull() {
            addCriterion("grade_id is not null");
            return (Criteria) this;
        }

        public Criteria andGradeIdEqualTo(Integer value) {
            addCriterion("grade_id =", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotEqualTo(Integer value) {
            addCriterion("grade_id <>", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdGreaterThan(Integer value) {
            addCriterion("grade_id >", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("grade_id >=", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdLessThan(Integer value) {
            addCriterion("grade_id <", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdLessThanOrEqualTo(Integer value) {
            addCriterion("grade_id <=", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdIn(List<Integer> values) {
            addCriterion("grade_id in", values, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotIn(List<Integer> values) {
            addCriterion("grade_id not in", values, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdBetween(Integer value1, Integer value2) {
            addCriterion("grade_id between", value1, value2, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("grade_id not between", value1, value2, "gradeId");
            return (Criteria) this;
        }

        public Criteria andClassesIdIsNull() {
            addCriterion("classes_id is null");
            return (Criteria) this;
        }

        public Criteria andClassesIdIsNotNull() {
            addCriterion("classes_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassesIdEqualTo(Integer value) {
            addCriterion("classes_id =", value, "classesId");
            return (Criteria) this;
        }

        public Criteria andClassesIdNotEqualTo(Integer value) {
            addCriterion("classes_id <>", value, "classesId");
            return (Criteria) this;
        }

        public Criteria andClassesIdGreaterThan(Integer value) {
            addCriterion("classes_id >", value, "classesId");
            return (Criteria) this;
        }

        public Criteria andClassesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("classes_id >=", value, "classesId");
            return (Criteria) this;
        }

        public Criteria andClassesIdLessThan(Integer value) {
            addCriterion("classes_id <", value, "classesId");
            return (Criteria) this;
        }

        public Criteria andClassesIdLessThanOrEqualTo(Integer value) {
            addCriterion("classes_id <=", value, "classesId");
            return (Criteria) this;
        }

        public Criteria andClassesIdIn(List<Integer> values) {
            addCriterion("classes_id in", values, "classesId");
            return (Criteria) this;
        }

        public Criteria andClassesIdNotIn(List<Integer> values) {
            addCriterion("classes_id not in", values, "classesId");
            return (Criteria) this;
        }

        public Criteria andClassesIdBetween(Integer value1, Integer value2) {
            addCriterion("classes_id between", value1, value2, "classesId");
            return (Criteria) this;
        }

        public Criteria andClassesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("classes_id not between", value1, value2, "classesId");
            return (Criteria) this;
        }

        public Criteria andYearIsNull() {
            addCriterion("year is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("year is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(String value) {
            addCriterion("year =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(String value) {
            addCriterion("year <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(String value) {
            addCriterion("year >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(String value) {
            addCriterion("year >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(String value) {
            addCriterion("year <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(String value) {
            addCriterion("year <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLike(String value) {
            addCriterion("year like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotLike(String value) {
            addCriterion("year not like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<String> values) {
            addCriterion("year in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<String> values) {
            addCriterion("year not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(String value1, String value2) {
            addCriterion("year between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(String value1, String value2) {
            addCriterion("year not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNull() {
            addCriterion("pay_type is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNotNull() {
            addCriterion("pay_type is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeEqualTo(String value) {
            addCriterion("pay_type =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(String value) {
            addCriterion("pay_type <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(String value) {
            addCriterion("pay_type >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(String value) {
            addCriterion("pay_type >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThan(String value) {
            addCriterion("pay_type <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThanOrEqualTo(String value) {
            addCriterion("pay_type <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLike(String value) {
            addCriterion("pay_type like", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotLike(String value) {
            addCriterion("pay_type not like", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIn(List<String> values) {
            addCriterion("pay_type in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotIn(List<String> values) {
            addCriterion("pay_type not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(String value1, String value2) {
            addCriterion("pay_type between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(String value1, String value2) {
            addCriterion("pay_type not between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNull() {
            addCriterion("is_del is null");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNotNull() {
            addCriterion("is_del is not null");
            return (Criteria) this;
        }

        public Criteria andIsDelEqualTo(Boolean value) {
            addCriterion("is_del =", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotEqualTo(Boolean value) {
            addCriterion("is_del <>", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThan(Boolean value) {
            addCriterion("is_del >", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_del >=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThan(Boolean value) {
            addCriterion("is_del <", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThanOrEqualTo(Boolean value) {
            addCriterion("is_del <=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelIn(List<Boolean> values) {
            addCriterion("is_del in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotIn(List<Boolean> values) {
            addCriterion("is_del not in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelBetween(Boolean value1, Boolean value2) {
            addCriterion("is_del between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_del not between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNull() {
            addCriterion("order_num is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNotNull() {
            addCriterion("order_num is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumEqualTo(String value) {
            addCriterion("order_num =", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotEqualTo(String value) {
            addCriterion("order_num <>", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThan(String value) {
            addCriterion("order_num >", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThanOrEqualTo(String value) {
            addCriterion("order_num >=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThan(String value) {
            addCriterion("order_num <", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThanOrEqualTo(String value) {
            addCriterion("order_num <=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLike(String value) {
            addCriterion("order_num like", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotLike(String value) {
            addCriterion("order_num not like", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumIn(List<String> values) {
            addCriterion("order_num in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotIn(List<String> values) {
            addCriterion("order_num not in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumBetween(String value1, String value2) {
            addCriterion("order_num between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotBetween(String value1, String value2) {
            addCriterion("order_num not between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andChargeIdIsNull() {
            addCriterion("charge_id is null");
            return (Criteria) this;
        }

        public Criteria andChargeIdIsNotNull() {
            addCriterion("charge_id is not null");
            return (Criteria) this;
        }

        public Criteria andChargeIdEqualTo(String value) {
            addCriterion("charge_id =", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdNotEqualTo(String value) {
            addCriterion("charge_id <>", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdGreaterThan(String value) {
            addCriterion("charge_id >", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdGreaterThanOrEqualTo(String value) {
            addCriterion("charge_id >=", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdLessThan(String value) {
            addCriterion("charge_id <", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdLessThanOrEqualTo(String value) {
            addCriterion("charge_id <=", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdLike(String value) {
            addCriterion("charge_id like", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdNotLike(String value) {
            addCriterion("charge_id not like", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdIn(List<String> values) {
            addCriterion("charge_id in", values, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdNotIn(List<String> values) {
            addCriterion("charge_id not in", values, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdBetween(String value1, String value2) {
            addCriterion("charge_id between", value1, value2, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdNotBetween(String value1, String value2) {
            addCriterion("charge_id not between", value1, value2, "chargeId");
            return (Criteria) this;
        }

        public Criteria andPaySuccessTimeIsNull() {
            addCriterion("pay_success_time is null");
            return (Criteria) this;
        }

        public Criteria andPaySuccessTimeIsNotNull() {
            addCriterion("pay_success_time is not null");
            return (Criteria) this;
        }

        public Criteria andPaySuccessTimeEqualTo(Date value) {
            addCriterion("pay_success_time =", value, "paySuccessTime");
            return (Criteria) this;
        }

        public Criteria andPaySuccessTimeNotEqualTo(Date value) {
            addCriterion("pay_success_time <>", value, "paySuccessTime");
            return (Criteria) this;
        }

        public Criteria andPaySuccessTimeGreaterThan(Date value) {
            addCriterion("pay_success_time >", value, "paySuccessTime");
            return (Criteria) this;
        }

        public Criteria andPaySuccessTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pay_success_time >=", value, "paySuccessTime");
            return (Criteria) this;
        }

        public Criteria andPaySuccessTimeLessThan(Date value) {
            addCriterion("pay_success_time <", value, "paySuccessTime");
            return (Criteria) this;
        }

        public Criteria andPaySuccessTimeLessThanOrEqualTo(Date value) {
            addCriterion("pay_success_time <=", value, "paySuccessTime");
            return (Criteria) this;
        }

        public Criteria andPaySuccessTimeIn(List<Date> values) {
            addCriterion("pay_success_time in", values, "paySuccessTime");
            return (Criteria) this;
        }

        public Criteria andPaySuccessTimeNotIn(List<Date> values) {
            addCriterion("pay_success_time not in", values, "paySuccessTime");
            return (Criteria) this;
        }

        public Criteria andPaySuccessTimeBetween(Date value1, Date value2) {
            addCriterion("pay_success_time between", value1, value2, "paySuccessTime");
            return (Criteria) this;
        }

        public Criteria andPaySuccessTimeNotBetween(Date value1, Date value2) {
            addCriterion("pay_success_time not between", value1, value2, "paySuccessTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}