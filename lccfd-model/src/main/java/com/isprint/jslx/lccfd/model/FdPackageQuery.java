package com.isprint.jslx.lccfd.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FdPackageQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public FdPackageQuery() {
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

        public Criteria andPackageTypeIdIsNull() {
            addCriterion("package_type_id is null");
            return (Criteria) this;
        }

        public Criteria andPackageTypeIdIsNotNull() {
            addCriterion("package_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andPackageTypeIdEqualTo(Integer value) {
            addCriterion("package_type_id =", value, "packageTypeId");
            return (Criteria) this;
        }

        public Criteria andPackageTypeIdNotEqualTo(Integer value) {
            addCriterion("package_type_id <>", value, "packageTypeId");
            return (Criteria) this;
        }

        public Criteria andPackageTypeIdGreaterThan(Integer value) {
            addCriterion("package_type_id >", value, "packageTypeId");
            return (Criteria) this;
        }

        public Criteria andPackageTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("package_type_id >=", value, "packageTypeId");
            return (Criteria) this;
        }

        public Criteria andPackageTypeIdLessThan(Integer value) {
            addCriterion("package_type_id <", value, "packageTypeId");
            return (Criteria) this;
        }

        public Criteria andPackageTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("package_type_id <=", value, "packageTypeId");
            return (Criteria) this;
        }

        public Criteria andPackageTypeIdIn(List<Integer> values) {
            addCriterion("package_type_id in", values, "packageTypeId");
            return (Criteria) this;
        }

        public Criteria andPackageTypeIdNotIn(List<Integer> values) {
            addCriterion("package_type_id not in", values, "packageTypeId");
            return (Criteria) this;
        }

        public Criteria andPackageTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("package_type_id between", value1, value2, "packageTypeId");
            return (Criteria) this;
        }

        public Criteria andPackageTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("package_type_id not between", value1, value2, "packageTypeId");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(BigDecimal value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(BigDecimal value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(BigDecimal value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(BigDecimal value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<BigDecimal> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<BigDecimal> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andTimeTypeIsNull() {
            addCriterion("time_type is null");
            return (Criteria) this;
        }

        public Criteria andTimeTypeIsNotNull() {
            addCriterion("time_type is not null");
            return (Criteria) this;
        }

        public Criteria andTimeTypeEqualTo(String value) {
            addCriterion("time_type =", value, "timeType");
            return (Criteria) this;
        }

        public Criteria andTimeTypeNotEqualTo(String value) {
            addCriterion("time_type <>", value, "timeType");
            return (Criteria) this;
        }

        public Criteria andTimeTypeGreaterThan(String value) {
            addCriterion("time_type >", value, "timeType");
            return (Criteria) this;
        }

        public Criteria andTimeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("time_type >=", value, "timeType");
            return (Criteria) this;
        }

        public Criteria andTimeTypeLessThan(String value) {
            addCriterion("time_type <", value, "timeType");
            return (Criteria) this;
        }

        public Criteria andTimeTypeLessThanOrEqualTo(String value) {
            addCriterion("time_type <=", value, "timeType");
            return (Criteria) this;
        }

        public Criteria andTimeTypeLike(String value) {
            addCriterion("time_type like", value, "timeType");
            return (Criteria) this;
        }

        public Criteria andTimeTypeNotLike(String value) {
            addCriterion("time_type not like", value, "timeType");
            return (Criteria) this;
        }

        public Criteria andTimeTypeIn(List<String> values) {
            addCriterion("time_type in", values, "timeType");
            return (Criteria) this;
        }

        public Criteria andTimeTypeNotIn(List<String> values) {
            addCriterion("time_type not in", values, "timeType");
            return (Criteria) this;
        }

        public Criteria andTimeTypeBetween(String value1, String value2) {
            addCriterion("time_type between", value1, value2, "timeType");
            return (Criteria) this;
        }

        public Criteria andTimeTypeNotBetween(String value1, String value2) {
            addCriterion("time_type not between", value1, value2, "timeType");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Integer value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Integer value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Integer value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Integer value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Integer value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Integer> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Integer> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Integer value1, Integer value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("time not between", value1, value2, "time");
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

        public Criteria andIosCodeIsNull() {
            addCriterion("ios_code is null");
            return (Criteria) this;
        }

        public Criteria andIosCodeIsNotNull() {
            addCriterion("ios_code is not null");
            return (Criteria) this;
        }

        public Criteria andIosCodeEqualTo(String value) {
            addCriterion("ios_code =", value, "iosCode");
            return (Criteria) this;
        }

        public Criteria andIosCodeNotEqualTo(String value) {
            addCriterion("ios_code <>", value, "iosCode");
            return (Criteria) this;
        }

        public Criteria andIosCodeGreaterThan(String value) {
            addCriterion("ios_code >", value, "iosCode");
            return (Criteria) this;
        }

        public Criteria andIosCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ios_code >=", value, "iosCode");
            return (Criteria) this;
        }

        public Criteria andIosCodeLessThan(String value) {
            addCriterion("ios_code <", value, "iosCode");
            return (Criteria) this;
        }

        public Criteria andIosCodeLessThanOrEqualTo(String value) {
            addCriterion("ios_code <=", value, "iosCode");
            return (Criteria) this;
        }

        public Criteria andIosCodeLike(String value) {
            addCriterion("ios_code like", value, "iosCode");
            return (Criteria) this;
        }

        public Criteria andIosCodeNotLike(String value) {
            addCriterion("ios_code not like", value, "iosCode");
            return (Criteria) this;
        }

        public Criteria andIosCodeIn(List<String> values) {
            addCriterion("ios_code in", values, "iosCode");
            return (Criteria) this;
        }

        public Criteria andIosCodeNotIn(List<String> values) {
            addCriterion("ios_code not in", values, "iosCode");
            return (Criteria) this;
        }

        public Criteria andIosCodeBetween(String value1, String value2) {
            addCriterion("ios_code between", value1, value2, "iosCode");
            return (Criteria) this;
        }

        public Criteria andIosCodeNotBetween(String value1, String value2) {
            addCriterion("ios_code not between", value1, value2, "iosCode");
            return (Criteria) this;
        }

        public Criteria andIsActivateIsNull() {
            addCriterion("is_activate is null");
            return (Criteria) this;
        }

        public Criteria andIsActivateIsNotNull() {
            addCriterion("is_activate is not null");
            return (Criteria) this;
        }

        public Criteria andIsActivateEqualTo(Boolean value) {
            addCriterion("is_activate =", value, "isActivate");
            return (Criteria) this;
        }

        public Criteria andIsActivateNotEqualTo(Boolean value) {
            addCriterion("is_activate <>", value, "isActivate");
            return (Criteria) this;
        }

        public Criteria andIsActivateGreaterThan(Boolean value) {
            addCriterion("is_activate >", value, "isActivate");
            return (Criteria) this;
        }

        public Criteria andIsActivateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_activate >=", value, "isActivate");
            return (Criteria) this;
        }

        public Criteria andIsActivateLessThan(Boolean value) {
            addCriterion("is_activate <", value, "isActivate");
            return (Criteria) this;
        }

        public Criteria andIsActivateLessThanOrEqualTo(Boolean value) {
            addCriterion("is_activate <=", value, "isActivate");
            return (Criteria) this;
        }

        public Criteria andIsActivateIn(List<Boolean> values) {
            addCriterion("is_activate in", values, "isActivate");
            return (Criteria) this;
        }

        public Criteria andIsActivateNotIn(List<Boolean> values) {
            addCriterion("is_activate not in", values, "isActivate");
            return (Criteria) this;
        }

        public Criteria andIsActivateBetween(Boolean value1, Boolean value2) {
            addCriterion("is_activate between", value1, value2, "isActivate");
            return (Criteria) this;
        }

        public Criteria andIsActivateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_activate not between", value1, value2, "isActivate");
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