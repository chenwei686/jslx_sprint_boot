package com.isprint.jslx.lccfd.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FdStudentOrderHjyQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public FdStudentOrderHjyQuery() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPackageHjyIdIsNull() {
            addCriterion("package_hjy_id is null");
            return (Criteria) this;
        }

        public Criteria andPackageHjyIdIsNotNull() {
            addCriterion("package_hjy_id is not null");
            return (Criteria) this;
        }

        public Criteria andPackageHjyIdEqualTo(Integer value) {
            addCriterion("package_hjy_id =", value, "packageHjyId");
            return (Criteria) this;
        }

        public Criteria andPackageHjyIdNotEqualTo(Integer value) {
            addCriterion("package_hjy_id <>", value, "packageHjyId");
            return (Criteria) this;
        }

        public Criteria andPackageHjyIdGreaterThan(Integer value) {
            addCriterion("package_hjy_id >", value, "packageHjyId");
            return (Criteria) this;
        }

        public Criteria andPackageHjyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("package_hjy_id >=", value, "packageHjyId");
            return (Criteria) this;
        }

        public Criteria andPackageHjyIdLessThan(Integer value) {
            addCriterion("package_hjy_id <", value, "packageHjyId");
            return (Criteria) this;
        }

        public Criteria andPackageHjyIdLessThanOrEqualTo(Integer value) {
            addCriterion("package_hjy_id <=", value, "packageHjyId");
            return (Criteria) this;
        }

        public Criteria andPackageHjyIdIn(List<Integer> values) {
            addCriterion("package_hjy_id in", values, "packageHjyId");
            return (Criteria) this;
        }

        public Criteria andPackageHjyIdNotIn(List<Integer> values) {
            addCriterion("package_hjy_id not in", values, "packageHjyId");
            return (Criteria) this;
        }

        public Criteria andPackageHjyIdBetween(Integer value1, Integer value2) {
            addCriterion("package_hjy_id between", value1, value2, "packageHjyId");
            return (Criteria) this;
        }

        public Criteria andPackageHjyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("package_hjy_id not between", value1, value2, "packageHjyId");
            return (Criteria) this;
        }

        public Criteria andPackageActivityHjyIdIsNull() {
            addCriterion("package_activity_hjy_id is null");
            return (Criteria) this;
        }

        public Criteria andPackageActivityHjyIdIsNotNull() {
            addCriterion("package_activity_hjy_id is not null");
            return (Criteria) this;
        }

        public Criteria andPackageActivityHjyIdEqualTo(Integer value) {
            addCriterion("package_activity_hjy_id =", value, "packageActivityHjyId");
            return (Criteria) this;
        }

        public Criteria andPackageActivityHjyIdNotEqualTo(Integer value) {
            addCriterion("package_activity_hjy_id <>", value, "packageActivityHjyId");
            return (Criteria) this;
        }

        public Criteria andPackageActivityHjyIdGreaterThan(Integer value) {
            addCriterion("package_activity_hjy_id >", value, "packageActivityHjyId");
            return (Criteria) this;
        }

        public Criteria andPackageActivityHjyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("package_activity_hjy_id >=", value, "packageActivityHjyId");
            return (Criteria) this;
        }

        public Criteria andPackageActivityHjyIdLessThan(Integer value) {
            addCriterion("package_activity_hjy_id <", value, "packageActivityHjyId");
            return (Criteria) this;
        }

        public Criteria andPackageActivityHjyIdLessThanOrEqualTo(Integer value) {
            addCriterion("package_activity_hjy_id <=", value, "packageActivityHjyId");
            return (Criteria) this;
        }

        public Criteria andPackageActivityHjyIdIn(List<Integer> values) {
            addCriterion("package_activity_hjy_id in", values, "packageActivityHjyId");
            return (Criteria) this;
        }

        public Criteria andPackageActivityHjyIdNotIn(List<Integer> values) {
            addCriterion("package_activity_hjy_id not in", values, "packageActivityHjyId");
            return (Criteria) this;
        }

        public Criteria andPackageActivityHjyIdBetween(Integer value1, Integer value2) {
            addCriterion("package_activity_hjy_id between", value1, value2, "packageActivityHjyId");
            return (Criteria) this;
        }

        public Criteria andPackageActivityHjyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("package_activity_hjy_id not between", value1, value2, "packageActivityHjyId");
            return (Criteria) this;
        }

        public Criteria andGroupBillingIdIsNull() {
            addCriterion("group_billing_id is null");
            return (Criteria) this;
        }

        public Criteria andGroupBillingIdIsNotNull() {
            addCriterion("group_billing_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroupBillingIdEqualTo(String value) {
            addCriterion("group_billing_id =", value, "groupBillingId");
            return (Criteria) this;
        }

        public Criteria andGroupBillingIdNotEqualTo(String value) {
            addCriterion("group_billing_id <>", value, "groupBillingId");
            return (Criteria) this;
        }

        public Criteria andGroupBillingIdGreaterThan(String value) {
            addCriterion("group_billing_id >", value, "groupBillingId");
            return (Criteria) this;
        }

        public Criteria andGroupBillingIdGreaterThanOrEqualTo(String value) {
            addCriterion("group_billing_id >=", value, "groupBillingId");
            return (Criteria) this;
        }

        public Criteria andGroupBillingIdLessThan(String value) {
            addCriterion("group_billing_id <", value, "groupBillingId");
            return (Criteria) this;
        }

        public Criteria andGroupBillingIdLessThanOrEqualTo(String value) {
            addCriterion("group_billing_id <=", value, "groupBillingId");
            return (Criteria) this;
        }

        public Criteria andGroupBillingIdLike(String value) {
            addCriterion("group_billing_id like", value, "groupBillingId");
            return (Criteria) this;
        }

        public Criteria andGroupBillingIdNotLike(String value) {
            addCriterion("group_billing_id not like", value, "groupBillingId");
            return (Criteria) this;
        }

        public Criteria andGroupBillingIdIn(List<String> values) {
            addCriterion("group_billing_id in", values, "groupBillingId");
            return (Criteria) this;
        }

        public Criteria andGroupBillingIdNotIn(List<String> values) {
            addCriterion("group_billing_id not in", values, "groupBillingId");
            return (Criteria) this;
        }

        public Criteria andGroupBillingIdBetween(String value1, String value2) {
            addCriterion("group_billing_id between", value1, value2, "groupBillingId");
            return (Criteria) this;
        }

        public Criteria andGroupBillingIdNotBetween(String value1, String value2) {
            addCriterion("group_billing_id not between", value1, value2, "groupBillingId");
            return (Criteria) this;
        }

        public Criteria andBillingTypeIsNull() {
            addCriterion("billing_type is null");
            return (Criteria) this;
        }

        public Criteria andBillingTypeIsNotNull() {
            addCriterion("billing_type is not null");
            return (Criteria) this;
        }

        public Criteria andBillingTypeEqualTo(String value) {
            addCriterion("billing_type =", value, "billingType");
            return (Criteria) this;
        }

        public Criteria andBillingTypeNotEqualTo(String value) {
            addCriterion("billing_type <>", value, "billingType");
            return (Criteria) this;
        }

        public Criteria andBillingTypeGreaterThan(String value) {
            addCriterion("billing_type >", value, "billingType");
            return (Criteria) this;
        }

        public Criteria andBillingTypeGreaterThanOrEqualTo(String value) {
            addCriterion("billing_type >=", value, "billingType");
            return (Criteria) this;
        }

        public Criteria andBillingTypeLessThan(String value) {
            addCriterion("billing_type <", value, "billingType");
            return (Criteria) this;
        }

        public Criteria andBillingTypeLessThanOrEqualTo(String value) {
            addCriterion("billing_type <=", value, "billingType");
            return (Criteria) this;
        }

        public Criteria andBillingTypeLike(String value) {
            addCriterion("billing_type like", value, "billingType");
            return (Criteria) this;
        }

        public Criteria andBillingTypeNotLike(String value) {
            addCriterion("billing_type not like", value, "billingType");
            return (Criteria) this;
        }

        public Criteria andBillingTypeIn(List<String> values) {
            addCriterion("billing_type in", values, "billingType");
            return (Criteria) this;
        }

        public Criteria andBillingTypeNotIn(List<String> values) {
            addCriterion("billing_type not in", values, "billingType");
            return (Criteria) this;
        }

        public Criteria andBillingTypeBetween(String value1, String value2) {
            addCriterion("billing_type between", value1, value2, "billingType");
            return (Criteria) this;
        }

        public Criteria andBillingTypeNotBetween(String value1, String value2) {
            addCriterion("billing_type not between", value1, value2, "billingType");
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

        public Criteria andPackageTypeIsNull() {
            addCriterion("package_type is null");
            return (Criteria) this;
        }

        public Criteria andPackageTypeIsNotNull() {
            addCriterion("package_type is not null");
            return (Criteria) this;
        }

        public Criteria andPackageTypeEqualTo(String value) {
            addCriterion("package_type =", value, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeNotEqualTo(String value) {
            addCriterion("package_type <>", value, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeGreaterThan(String value) {
            addCriterion("package_type >", value, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeGreaterThanOrEqualTo(String value) {
            addCriterion("package_type >=", value, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeLessThan(String value) {
            addCriterion("package_type <", value, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeLessThanOrEqualTo(String value) {
            addCriterion("package_type <=", value, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeLike(String value) {
            addCriterion("package_type like", value, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeNotLike(String value) {
            addCriterion("package_type not like", value, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeIn(List<String> values) {
            addCriterion("package_type in", values, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeNotIn(List<String> values) {
            addCriterion("package_type not in", values, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeBetween(String value1, String value2) {
            addCriterion("package_type between", value1, value2, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeNotBetween(String value1, String value2) {
            addCriterion("package_type not between", value1, value2, "packageType");
            return (Criteria) this;
        }

        public Criteria andBillingDayIsNull() {
            addCriterion("billing_day is null");
            return (Criteria) this;
        }

        public Criteria andBillingDayIsNotNull() {
            addCriterion("billing_day is not null");
            return (Criteria) this;
        }

        public Criteria andBillingDayEqualTo(Integer value) {
            addCriterion("billing_day =", value, "billingDay");
            return (Criteria) this;
        }

        public Criteria andBillingDayNotEqualTo(Integer value) {
            addCriterion("billing_day <>", value, "billingDay");
            return (Criteria) this;
        }

        public Criteria andBillingDayGreaterThan(Integer value) {
            addCriterion("billing_day >", value, "billingDay");
            return (Criteria) this;
        }

        public Criteria andBillingDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("billing_day >=", value, "billingDay");
            return (Criteria) this;
        }

        public Criteria andBillingDayLessThan(Integer value) {
            addCriterion("billing_day <", value, "billingDay");
            return (Criteria) this;
        }

        public Criteria andBillingDayLessThanOrEqualTo(Integer value) {
            addCriterion("billing_day <=", value, "billingDay");
            return (Criteria) this;
        }

        public Criteria andBillingDayIn(List<Integer> values) {
            addCriterion("billing_day in", values, "billingDay");
            return (Criteria) this;
        }

        public Criteria andBillingDayNotIn(List<Integer> values) {
            addCriterion("billing_day not in", values, "billingDay");
            return (Criteria) this;
        }

        public Criteria andBillingDayBetween(Integer value1, Integer value2) {
            addCriterion("billing_day between", value1, value2, "billingDay");
            return (Criteria) this;
        }

        public Criteria andBillingDayNotBetween(Integer value1, Integer value2) {
            addCriterion("billing_day not between", value1, value2, "billingDay");
            return (Criteria) this;
        }

        public Criteria andSubjectIdsIsNull() {
            addCriterion("subject_ids is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIdsIsNotNull() {
            addCriterion("subject_ids is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectIdsEqualTo(String value) {
            addCriterion("subject_ids =", value, "subjectIds");
            return (Criteria) this;
        }

        public Criteria andSubjectIdsNotEqualTo(String value) {
            addCriterion("subject_ids <>", value, "subjectIds");
            return (Criteria) this;
        }

        public Criteria andSubjectIdsGreaterThan(String value) {
            addCriterion("subject_ids >", value, "subjectIds");
            return (Criteria) this;
        }

        public Criteria andSubjectIdsGreaterThanOrEqualTo(String value) {
            addCriterion("subject_ids >=", value, "subjectIds");
            return (Criteria) this;
        }

        public Criteria andSubjectIdsLessThan(String value) {
            addCriterion("subject_ids <", value, "subjectIds");
            return (Criteria) this;
        }

        public Criteria andSubjectIdsLessThanOrEqualTo(String value) {
            addCriterion("subject_ids <=", value, "subjectIds");
            return (Criteria) this;
        }

        public Criteria andSubjectIdsLike(String value) {
            addCriterion("subject_ids like", value, "subjectIds");
            return (Criteria) this;
        }

        public Criteria andSubjectIdsNotLike(String value) {
            addCriterion("subject_ids not like", value, "subjectIds");
            return (Criteria) this;
        }

        public Criteria andSubjectIdsIn(List<String> values) {
            addCriterion("subject_ids in", values, "subjectIds");
            return (Criteria) this;
        }

        public Criteria andSubjectIdsNotIn(List<String> values) {
            addCriterion("subject_ids not in", values, "subjectIds");
            return (Criteria) this;
        }

        public Criteria andSubjectIdsBetween(String value1, String value2) {
            addCriterion("subject_ids between", value1, value2, "subjectIds");
            return (Criteria) this;
        }

        public Criteria andSubjectIdsNotBetween(String value1, String value2) {
            addCriterion("subject_ids not between", value1, value2, "subjectIds");
            return (Criteria) this;
        }

        public Criteria andSubjectNamesIsNull() {
            addCriterion("subject_names is null");
            return (Criteria) this;
        }

        public Criteria andSubjectNamesIsNotNull() {
            addCriterion("subject_names is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectNamesEqualTo(String value) {
            addCriterion("subject_names =", value, "subjectNames");
            return (Criteria) this;
        }

        public Criteria andSubjectNamesNotEqualTo(String value) {
            addCriterion("subject_names <>", value, "subjectNames");
            return (Criteria) this;
        }

        public Criteria andSubjectNamesGreaterThan(String value) {
            addCriterion("subject_names >", value, "subjectNames");
            return (Criteria) this;
        }

        public Criteria andSubjectNamesGreaterThanOrEqualTo(String value) {
            addCriterion("subject_names >=", value, "subjectNames");
            return (Criteria) this;
        }

        public Criteria andSubjectNamesLessThan(String value) {
            addCriterion("subject_names <", value, "subjectNames");
            return (Criteria) this;
        }

        public Criteria andSubjectNamesLessThanOrEqualTo(String value) {
            addCriterion("subject_names <=", value, "subjectNames");
            return (Criteria) this;
        }

        public Criteria andSubjectNamesLike(String value) {
            addCriterion("subject_names like", value, "subjectNames");
            return (Criteria) this;
        }

        public Criteria andSubjectNamesNotLike(String value) {
            addCriterion("subject_names not like", value, "subjectNames");
            return (Criteria) this;
        }

        public Criteria andSubjectNamesIn(List<String> values) {
            addCriterion("subject_names in", values, "subjectNames");
            return (Criteria) this;
        }

        public Criteria andSubjectNamesNotIn(List<String> values) {
            addCriterion("subject_names not in", values, "subjectNames");
            return (Criteria) this;
        }

        public Criteria andSubjectNamesBetween(String value1, String value2) {
            addCriterion("subject_names between", value1, value2, "subjectNames");
            return (Criteria) this;
        }

        public Criteria andSubjectNamesNotBetween(String value1, String value2) {
            addCriterion("subject_names not between", value1, value2, "subjectNames");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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

        public Criteria andGroupIdIsNull() {
            addCriterion("group_id is null");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNotNull() {
            addCriterion("group_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIdEqualTo(Integer value) {
            addCriterion("group_id =", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(Integer value) {
            addCriterion("group_id <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(Integer value) {
            addCriterion("group_id >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("group_id >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(Integer value) {
            addCriterion("group_id <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(Integer value) {
            addCriterion("group_id <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIn(List<Integer> values) {
            addCriterion("group_id in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotIn(List<Integer> values) {
            addCriterion("group_id not in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdBetween(Integer value1, Integer value2) {
            addCriterion("group_id between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotBetween(Integer value1, Integer value2) {
            addCriterion("group_id not between", value1, value2, "groupId");
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