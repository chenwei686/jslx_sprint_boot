package com.isprint.jslx.lccfd.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FdPackageActivityHjyQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public FdPackageActivityHjyQuery() {
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

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
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

        public Criteria andSystemIsNull() {
            addCriterion("system is null");
            return (Criteria) this;
        }

        public Criteria andSystemIsNotNull() {
            addCriterion("system is not null");
            return (Criteria) this;
        }

        public Criteria andSystemEqualTo(String value) {
            addCriterion("system =", value, "system");
            return (Criteria) this;
        }

        public Criteria andSystemNotEqualTo(String value) {
            addCriterion("system <>", value, "system");
            return (Criteria) this;
        }

        public Criteria andSystemGreaterThan(String value) {
            addCriterion("system >", value, "system");
            return (Criteria) this;
        }

        public Criteria andSystemGreaterThanOrEqualTo(String value) {
            addCriterion("system >=", value, "system");
            return (Criteria) this;
        }

        public Criteria andSystemLessThan(String value) {
            addCriterion("system <", value, "system");
            return (Criteria) this;
        }

        public Criteria andSystemLessThanOrEqualTo(String value) {
            addCriterion("system <=", value, "system");
            return (Criteria) this;
        }

        public Criteria andSystemLike(String value) {
            addCriterion("system like", value, "system");
            return (Criteria) this;
        }

        public Criteria andSystemNotLike(String value) {
            addCriterion("system not like", value, "system");
            return (Criteria) this;
        }

        public Criteria andSystemIn(List<String> values) {
            addCriterion("system in", values, "system");
            return (Criteria) this;
        }

        public Criteria andSystemNotIn(List<String> values) {
            addCriterion("system not in", values, "system");
            return (Criteria) this;
        }

        public Criteria andSystemBetween(String value1, String value2) {
            addCriterion("system between", value1, value2, "system");
            return (Criteria) this;
        }

        public Criteria andSystemNotBetween(String value1, String value2) {
            addCriterion("system not between", value1, value2, "system");
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

        public Criteria andProvinceIdIsNull() {
            addCriterion("province_id is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIsNotNull() {
            addCriterion("province_id is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdEqualTo(Integer value) {
            addCriterion("province_id =", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotEqualTo(Integer value) {
            addCriterion("province_id <>", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThan(Integer value) {
            addCriterion("province_id >", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("province_id >=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThan(Integer value) {
            addCriterion("province_id <", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThanOrEqualTo(Integer value) {
            addCriterion("province_id <=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIn(List<Integer> values) {
            addCriterion("province_id in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotIn(List<Integer> values) {
            addCriterion("province_id not in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdBetween(Integer value1, Integer value2) {
            addCriterion("province_id between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("province_id not between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Byte value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Byte value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Byte value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Byte value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Byte value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Byte> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Byte> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Byte value1, Byte value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("type not between", value1, value2, "type");
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