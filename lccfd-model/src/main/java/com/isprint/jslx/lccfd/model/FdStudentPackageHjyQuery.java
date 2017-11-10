package com.isprint.jslx.lccfd.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FdStudentPackageHjyQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public FdStudentPackageHjyQuery() {
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

        public Criteria andStudentOrderHjyIdIsNull() {
            addCriterion("student_order_hjy_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentOrderHjyIdIsNotNull() {
            addCriterion("student_order_hjy_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentOrderHjyIdEqualTo(Integer value) {
            addCriterion("student_order_hjy_id =", value, "studentOrderHjyId");
            return (Criteria) this;
        }

        public Criteria andStudentOrderHjyIdNotEqualTo(Integer value) {
            addCriterion("student_order_hjy_id <>", value, "studentOrderHjyId");
            return (Criteria) this;
        }

        public Criteria andStudentOrderHjyIdGreaterThan(Integer value) {
            addCriterion("student_order_hjy_id >", value, "studentOrderHjyId");
            return (Criteria) this;
        }

        public Criteria andStudentOrderHjyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_order_hjy_id >=", value, "studentOrderHjyId");
            return (Criteria) this;
        }

        public Criteria andStudentOrderHjyIdLessThan(Integer value) {
            addCriterion("student_order_hjy_id <", value, "studentOrderHjyId");
            return (Criteria) this;
        }

        public Criteria andStudentOrderHjyIdLessThanOrEqualTo(Integer value) {
            addCriterion("student_order_hjy_id <=", value, "studentOrderHjyId");
            return (Criteria) this;
        }

        public Criteria andStudentOrderHjyIdIn(List<Integer> values) {
            addCriterion("student_order_hjy_id in", values, "studentOrderHjyId");
            return (Criteria) this;
        }

        public Criteria andStudentOrderHjyIdNotIn(List<Integer> values) {
            addCriterion("student_order_hjy_id not in", values, "studentOrderHjyId");
            return (Criteria) this;
        }

        public Criteria andStudentOrderHjyIdBetween(Integer value1, Integer value2) {
            addCriterion("student_order_hjy_id between", value1, value2, "studentOrderHjyId");
            return (Criteria) this;
        }

        public Criteria andStudentOrderHjyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("student_order_hjy_id not between", value1, value2, "studentOrderHjyId");
            return (Criteria) this;
        }

        public Criteria andPackegeHjyIdIsNull() {
            addCriterion("packege_hjy_id is null");
            return (Criteria) this;
        }

        public Criteria andPackegeHjyIdIsNotNull() {
            addCriterion("packege_hjy_id is not null");
            return (Criteria) this;
        }

        public Criteria andPackegeHjyIdEqualTo(Integer value) {
            addCriterion("packege_hjy_id =", value, "packegeHjyId");
            return (Criteria) this;
        }

        public Criteria andPackegeHjyIdNotEqualTo(Integer value) {
            addCriterion("packege_hjy_id <>", value, "packegeHjyId");
            return (Criteria) this;
        }

        public Criteria andPackegeHjyIdGreaterThan(Integer value) {
            addCriterion("packege_hjy_id >", value, "packegeHjyId");
            return (Criteria) this;
        }

        public Criteria andPackegeHjyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("packege_hjy_id >=", value, "packegeHjyId");
            return (Criteria) this;
        }

        public Criteria andPackegeHjyIdLessThan(Integer value) {
            addCriterion("packege_hjy_id <", value, "packegeHjyId");
            return (Criteria) this;
        }

        public Criteria andPackegeHjyIdLessThanOrEqualTo(Integer value) {
            addCriterion("packege_hjy_id <=", value, "packegeHjyId");
            return (Criteria) this;
        }

        public Criteria andPackegeHjyIdIn(List<Integer> values) {
            addCriterion("packege_hjy_id in", values, "packegeHjyId");
            return (Criteria) this;
        }

        public Criteria andPackegeHjyIdNotIn(List<Integer> values) {
            addCriterion("packege_hjy_id not in", values, "packegeHjyId");
            return (Criteria) this;
        }

        public Criteria andPackegeHjyIdBetween(Integer value1, Integer value2) {
            addCriterion("packege_hjy_id between", value1, value2, "packegeHjyId");
            return (Criteria) this;
        }

        public Criteria andPackegeHjyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("packege_hjy_id not between", value1, value2, "packegeHjyId");
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

        public Criteria andSubjectIdIsNull() {
            addCriterion("subject_id is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIsNotNull() {
            addCriterion("subject_id is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectIdEqualTo(Integer value) {
            addCriterion("subject_id =", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotEqualTo(Integer value) {
            addCriterion("subject_id <>", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdGreaterThan(Integer value) {
            addCriterion("subject_id >", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("subject_id >=", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdLessThan(Integer value) {
            addCriterion("subject_id <", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("subject_id <=", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIn(List<Integer> values) {
            addCriterion("subject_id in", values, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotIn(List<Integer> values) {
            addCriterion("subject_id not in", values, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdBetween(Integer value1, Integer value2) {
            addCriterion("subject_id between", value1, value2, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("subject_id not between", value1, value2, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectNameIsNull() {
            addCriterion("subject_name is null");
            return (Criteria) this;
        }

        public Criteria andSubjectNameIsNotNull() {
            addCriterion("subject_name is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectNameEqualTo(String value) {
            addCriterion("subject_name =", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameNotEqualTo(String value) {
            addCriterion("subject_name <>", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameGreaterThan(String value) {
            addCriterion("subject_name >", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("subject_name >=", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameLessThan(String value) {
            addCriterion("subject_name <", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameLessThanOrEqualTo(String value) {
            addCriterion("subject_name <=", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameLike(String value) {
            addCriterion("subject_name like", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameNotLike(String value) {
            addCriterion("subject_name not like", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameIn(List<String> values) {
            addCriterion("subject_name in", values, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameNotIn(List<String> values) {
            addCriterion("subject_name not in", values, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameBetween(String value1, String value2) {
            addCriterion("subject_name between", value1, value2, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameNotBetween(String value1, String value2) {
            addCriterion("subject_name not between", value1, value2, "subjectName");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
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