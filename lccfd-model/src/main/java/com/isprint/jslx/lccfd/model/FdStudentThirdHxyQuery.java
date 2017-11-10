package com.isprint.jslx.lccfd.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FdStudentThirdHxyQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public FdStudentThirdHxyQuery() {
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

        public Criteria andStudentThirdAccountIdIsNull() {
            addCriterion("student_third_account_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentThirdAccountIdIsNotNull() {
            addCriterion("student_third_account_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentThirdAccountIdEqualTo(Integer value) {
            addCriterion("student_third_account_id =", value, "studentThirdAccountId");
            return (Criteria) this;
        }

        public Criteria andStudentThirdAccountIdNotEqualTo(Integer value) {
            addCriterion("student_third_account_id <>", value, "studentThirdAccountId");
            return (Criteria) this;
        }

        public Criteria andStudentThirdAccountIdGreaterThan(Integer value) {
            addCriterion("student_third_account_id >", value, "studentThirdAccountId");
            return (Criteria) this;
        }

        public Criteria andStudentThirdAccountIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_third_account_id >=", value, "studentThirdAccountId");
            return (Criteria) this;
        }

        public Criteria andStudentThirdAccountIdLessThan(Integer value) {
            addCriterion("student_third_account_id <", value, "studentThirdAccountId");
            return (Criteria) this;
        }

        public Criteria andStudentThirdAccountIdLessThanOrEqualTo(Integer value) {
            addCriterion("student_third_account_id <=", value, "studentThirdAccountId");
            return (Criteria) this;
        }

        public Criteria andStudentThirdAccountIdIn(List<Integer> values) {
            addCriterion("student_third_account_id in", values, "studentThirdAccountId");
            return (Criteria) this;
        }

        public Criteria andStudentThirdAccountIdNotIn(List<Integer> values) {
            addCriterion("student_third_account_id not in", values, "studentThirdAccountId");
            return (Criteria) this;
        }

        public Criteria andStudentThirdAccountIdBetween(Integer value1, Integer value2) {
            addCriterion("student_third_account_id between", value1, value2, "studentThirdAccountId");
            return (Criteria) this;
        }

        public Criteria andStudentThirdAccountIdNotBetween(Integer value1, Integer value2) {
            addCriterion("student_third_account_id not between", value1, value2, "studentThirdAccountId");
            return (Criteria) this;
        }

        public Criteria andThirdRoleTypeIsNull() {
            addCriterion("third_role_type is null");
            return (Criteria) this;
        }

        public Criteria andThirdRoleTypeIsNotNull() {
            addCriterion("third_role_type is not null");
            return (Criteria) this;
        }

        public Criteria andThirdRoleTypeEqualTo(Integer value) {
            addCriterion("third_role_type =", value, "thirdRoleType");
            return (Criteria) this;
        }

        public Criteria andThirdRoleTypeNotEqualTo(Integer value) {
            addCriterion("third_role_type <>", value, "thirdRoleType");
            return (Criteria) this;
        }

        public Criteria andThirdRoleTypeGreaterThan(Integer value) {
            addCriterion("third_role_type >", value, "thirdRoleType");
            return (Criteria) this;
        }

        public Criteria andThirdRoleTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("third_role_type >=", value, "thirdRoleType");
            return (Criteria) this;
        }

        public Criteria andThirdRoleTypeLessThan(Integer value) {
            addCriterion("third_role_type <", value, "thirdRoleType");
            return (Criteria) this;
        }

        public Criteria andThirdRoleTypeLessThanOrEqualTo(Integer value) {
            addCriterion("third_role_type <=", value, "thirdRoleType");
            return (Criteria) this;
        }

        public Criteria andThirdRoleTypeIn(List<Integer> values) {
            addCriterion("third_role_type in", values, "thirdRoleType");
            return (Criteria) this;
        }

        public Criteria andThirdRoleTypeNotIn(List<Integer> values) {
            addCriterion("third_role_type not in", values, "thirdRoleType");
            return (Criteria) this;
        }

        public Criteria andThirdRoleTypeBetween(Integer value1, Integer value2) {
            addCriterion("third_role_type between", value1, value2, "thirdRoleType");
            return (Criteria) this;
        }

        public Criteria andThirdRoleTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("third_role_type not between", value1, value2, "thirdRoleType");
            return (Criteria) this;
        }

        public Criteria andThirdUserIdIsNull() {
            addCriterion("third_user_id is null");
            return (Criteria) this;
        }

        public Criteria andThirdUserIdIsNotNull() {
            addCriterion("third_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andThirdUserIdEqualTo(Integer value) {
            addCriterion("third_user_id =", value, "thirdUserId");
            return (Criteria) this;
        }

        public Criteria andThirdUserIdNotEqualTo(Integer value) {
            addCriterion("third_user_id <>", value, "thirdUserId");
            return (Criteria) this;
        }

        public Criteria andThirdUserIdGreaterThan(Integer value) {
            addCriterion("third_user_id >", value, "thirdUserId");
            return (Criteria) this;
        }

        public Criteria andThirdUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("third_user_id >=", value, "thirdUserId");
            return (Criteria) this;
        }

        public Criteria andThirdUserIdLessThan(Integer value) {
            addCriterion("third_user_id <", value, "thirdUserId");
            return (Criteria) this;
        }

        public Criteria andThirdUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("third_user_id <=", value, "thirdUserId");
            return (Criteria) this;
        }

        public Criteria andThirdUserIdIn(List<Integer> values) {
            addCriterion("third_user_id in", values, "thirdUserId");
            return (Criteria) this;
        }

        public Criteria andThirdUserIdNotIn(List<Integer> values) {
            addCriterion("third_user_id not in", values, "thirdUserId");
            return (Criteria) this;
        }

        public Criteria andThirdUserIdBetween(Integer value1, Integer value2) {
            addCriterion("third_user_id between", value1, value2, "thirdUserId");
            return (Criteria) this;
        }

        public Criteria andThirdUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("third_user_id not between", value1, value2, "thirdUserId");
            return (Criteria) this;
        }

        public Criteria andThirdCityIdIsNull() {
            addCriterion("third_city_id is null");
            return (Criteria) this;
        }

        public Criteria andThirdCityIdIsNotNull() {
            addCriterion("third_city_id is not null");
            return (Criteria) this;
        }

        public Criteria andThirdCityIdEqualTo(String value) {
            addCriterion("third_city_id =", value, "thirdCityId");
            return (Criteria) this;
        }

        public Criteria andThirdCityIdNotEqualTo(String value) {
            addCriterion("third_city_id <>", value, "thirdCityId");
            return (Criteria) this;
        }

        public Criteria andThirdCityIdGreaterThan(String value) {
            addCriterion("third_city_id >", value, "thirdCityId");
            return (Criteria) this;
        }

        public Criteria andThirdCityIdGreaterThanOrEqualTo(String value) {
            addCriterion("third_city_id >=", value, "thirdCityId");
            return (Criteria) this;
        }

        public Criteria andThirdCityIdLessThan(String value) {
            addCriterion("third_city_id <", value, "thirdCityId");
            return (Criteria) this;
        }

        public Criteria andThirdCityIdLessThanOrEqualTo(String value) {
            addCriterion("third_city_id <=", value, "thirdCityId");
            return (Criteria) this;
        }

        public Criteria andThirdCityIdLike(String value) {
            addCriterion("third_city_id like", value, "thirdCityId");
            return (Criteria) this;
        }

        public Criteria andThirdCityIdNotLike(String value) {
            addCriterion("third_city_id not like", value, "thirdCityId");
            return (Criteria) this;
        }

        public Criteria andThirdCityIdIn(List<String> values) {
            addCriterion("third_city_id in", values, "thirdCityId");
            return (Criteria) this;
        }

        public Criteria andThirdCityIdNotIn(List<String> values) {
            addCriterion("third_city_id not in", values, "thirdCityId");
            return (Criteria) this;
        }

        public Criteria andThirdCityIdBetween(String value1, String value2) {
            addCriterion("third_city_id between", value1, value2, "thirdCityId");
            return (Criteria) this;
        }

        public Criteria andThirdCityIdNotBetween(String value1, String value2) {
            addCriterion("third_city_id not between", value1, value2, "thirdCityId");
            return (Criteria) this;
        }

        public Criteria andThirdEmailIsNull() {
            addCriterion("third_email is null");
            return (Criteria) this;
        }

        public Criteria andThirdEmailIsNotNull() {
            addCriterion("third_email is not null");
            return (Criteria) this;
        }

        public Criteria andThirdEmailEqualTo(String value) {
            addCriterion("third_email =", value, "thirdEmail");
            return (Criteria) this;
        }

        public Criteria andThirdEmailNotEqualTo(String value) {
            addCriterion("third_email <>", value, "thirdEmail");
            return (Criteria) this;
        }

        public Criteria andThirdEmailGreaterThan(String value) {
            addCriterion("third_email >", value, "thirdEmail");
            return (Criteria) this;
        }

        public Criteria andThirdEmailGreaterThanOrEqualTo(String value) {
            addCriterion("third_email >=", value, "thirdEmail");
            return (Criteria) this;
        }

        public Criteria andThirdEmailLessThan(String value) {
            addCriterion("third_email <", value, "thirdEmail");
            return (Criteria) this;
        }

        public Criteria andThirdEmailLessThanOrEqualTo(String value) {
            addCriterion("third_email <=", value, "thirdEmail");
            return (Criteria) this;
        }

        public Criteria andThirdEmailLike(String value) {
            addCriterion("third_email like", value, "thirdEmail");
            return (Criteria) this;
        }

        public Criteria andThirdEmailNotLike(String value) {
            addCriterion("third_email not like", value, "thirdEmail");
            return (Criteria) this;
        }

        public Criteria andThirdEmailIn(List<String> values) {
            addCriterion("third_email in", values, "thirdEmail");
            return (Criteria) this;
        }

        public Criteria andThirdEmailNotIn(List<String> values) {
            addCriterion("third_email not in", values, "thirdEmail");
            return (Criteria) this;
        }

        public Criteria andThirdEmailBetween(String value1, String value2) {
            addCriterion("third_email between", value1, value2, "thirdEmail");
            return (Criteria) this;
        }

        public Criteria andThirdEmailNotBetween(String value1, String value2) {
            addCriterion("third_email not between", value1, value2, "thirdEmail");
            return (Criteria) this;
        }

        public Criteria andThirdSchoolIdIsNull() {
            addCriterion("third_school_id is null");
            return (Criteria) this;
        }

        public Criteria andThirdSchoolIdIsNotNull() {
            addCriterion("third_school_id is not null");
            return (Criteria) this;
        }

        public Criteria andThirdSchoolIdEqualTo(Integer value) {
            addCriterion("third_school_id =", value, "thirdSchoolId");
            return (Criteria) this;
        }

        public Criteria andThirdSchoolIdNotEqualTo(Integer value) {
            addCriterion("third_school_id <>", value, "thirdSchoolId");
            return (Criteria) this;
        }

        public Criteria andThirdSchoolIdGreaterThan(Integer value) {
            addCriterion("third_school_id >", value, "thirdSchoolId");
            return (Criteria) this;
        }

        public Criteria andThirdSchoolIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("third_school_id >=", value, "thirdSchoolId");
            return (Criteria) this;
        }

        public Criteria andThirdSchoolIdLessThan(Integer value) {
            addCriterion("third_school_id <", value, "thirdSchoolId");
            return (Criteria) this;
        }

        public Criteria andThirdSchoolIdLessThanOrEqualTo(Integer value) {
            addCriterion("third_school_id <=", value, "thirdSchoolId");
            return (Criteria) this;
        }

        public Criteria andThirdSchoolIdIn(List<Integer> values) {
            addCriterion("third_school_id in", values, "thirdSchoolId");
            return (Criteria) this;
        }

        public Criteria andThirdSchoolIdNotIn(List<Integer> values) {
            addCriterion("third_school_id not in", values, "thirdSchoolId");
            return (Criteria) this;
        }

        public Criteria andThirdSchoolIdBetween(Integer value1, Integer value2) {
            addCriterion("third_school_id between", value1, value2, "thirdSchoolId");
            return (Criteria) this;
        }

        public Criteria andThirdSchoolIdNotBetween(Integer value1, Integer value2) {
            addCriterion("third_school_id not between", value1, value2, "thirdSchoolId");
            return (Criteria) this;
        }

        public Criteria andIcNoIsNull() {
            addCriterion("ic_no is null");
            return (Criteria) this;
        }

        public Criteria andIcNoIsNotNull() {
            addCriterion("ic_no is not null");
            return (Criteria) this;
        }

        public Criteria andIcNoEqualTo(String value) {
            addCriterion("ic_no =", value, "icNo");
            return (Criteria) this;
        }

        public Criteria andIcNoNotEqualTo(String value) {
            addCriterion("ic_no <>", value, "icNo");
            return (Criteria) this;
        }

        public Criteria andIcNoGreaterThan(String value) {
            addCriterion("ic_no >", value, "icNo");
            return (Criteria) this;
        }

        public Criteria andIcNoGreaterThanOrEqualTo(String value) {
            addCriterion("ic_no >=", value, "icNo");
            return (Criteria) this;
        }

        public Criteria andIcNoLessThan(String value) {
            addCriterion("ic_no <", value, "icNo");
            return (Criteria) this;
        }

        public Criteria andIcNoLessThanOrEqualTo(String value) {
            addCriterion("ic_no <=", value, "icNo");
            return (Criteria) this;
        }

        public Criteria andIcNoLike(String value) {
            addCriterion("ic_no like", value, "icNo");
            return (Criteria) this;
        }

        public Criteria andIcNoNotLike(String value) {
            addCriterion("ic_no not like", value, "icNo");
            return (Criteria) this;
        }

        public Criteria andIcNoIn(List<String> values) {
            addCriterion("ic_no in", values, "icNo");
            return (Criteria) this;
        }

        public Criteria andIcNoNotIn(List<String> values) {
            addCriterion("ic_no not in", values, "icNo");
            return (Criteria) this;
        }

        public Criteria andIcNoBetween(String value1, String value2) {
            addCriterion("ic_no between", value1, value2, "icNo");
            return (Criteria) this;
        }

        public Criteria andIcNoNotBetween(String value1, String value2) {
            addCriterion("ic_no not between", value1, value2, "icNo");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andThirdGradeIdIsNull() {
            addCriterion("third_grade_id is null");
            return (Criteria) this;
        }

        public Criteria andThirdGradeIdIsNotNull() {
            addCriterion("third_grade_id is not null");
            return (Criteria) this;
        }

        public Criteria andThirdGradeIdEqualTo(String value) {
            addCriterion("third_grade_id =", value, "thirdGradeId");
            return (Criteria) this;
        }

        public Criteria andThirdGradeIdNotEqualTo(String value) {
            addCriterion("third_grade_id <>", value, "thirdGradeId");
            return (Criteria) this;
        }

        public Criteria andThirdGradeIdGreaterThan(String value) {
            addCriterion("third_grade_id >", value, "thirdGradeId");
            return (Criteria) this;
        }

        public Criteria andThirdGradeIdGreaterThanOrEqualTo(String value) {
            addCriterion("third_grade_id >=", value, "thirdGradeId");
            return (Criteria) this;
        }

        public Criteria andThirdGradeIdLessThan(String value) {
            addCriterion("third_grade_id <", value, "thirdGradeId");
            return (Criteria) this;
        }

        public Criteria andThirdGradeIdLessThanOrEqualTo(String value) {
            addCriterion("third_grade_id <=", value, "thirdGradeId");
            return (Criteria) this;
        }

        public Criteria andThirdGradeIdLike(String value) {
            addCriterion("third_grade_id like", value, "thirdGradeId");
            return (Criteria) this;
        }

        public Criteria andThirdGradeIdNotLike(String value) {
            addCriterion("third_grade_id not like", value, "thirdGradeId");
            return (Criteria) this;
        }

        public Criteria andThirdGradeIdIn(List<String> values) {
            addCriterion("third_grade_id in", values, "thirdGradeId");
            return (Criteria) this;
        }

        public Criteria andThirdGradeIdNotIn(List<String> values) {
            addCriterion("third_grade_id not in", values, "thirdGradeId");
            return (Criteria) this;
        }

        public Criteria andThirdGradeIdBetween(String value1, String value2) {
            addCriterion("third_grade_id between", value1, value2, "thirdGradeId");
            return (Criteria) this;
        }

        public Criteria andThirdGradeIdNotBetween(String value1, String value2) {
            addCriterion("third_grade_id not between", value1, value2, "thirdGradeId");
            return (Criteria) this;
        }

        public Criteria andThirdAccountIdIsNull() {
            addCriterion("third_account_id is null");
            return (Criteria) this;
        }

        public Criteria andThirdAccountIdIsNotNull() {
            addCriterion("third_account_id is not null");
            return (Criteria) this;
        }

        public Criteria andThirdAccountIdEqualTo(Integer value) {
            addCriterion("third_account_id =", value, "thirdAccountId");
            return (Criteria) this;
        }

        public Criteria andThirdAccountIdNotEqualTo(Integer value) {
            addCriterion("third_account_id <>", value, "thirdAccountId");
            return (Criteria) this;
        }

        public Criteria andThirdAccountIdGreaterThan(Integer value) {
            addCriterion("third_account_id >", value, "thirdAccountId");
            return (Criteria) this;
        }

        public Criteria andThirdAccountIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("third_account_id >=", value, "thirdAccountId");
            return (Criteria) this;
        }

        public Criteria andThirdAccountIdLessThan(Integer value) {
            addCriterion("third_account_id <", value, "thirdAccountId");
            return (Criteria) this;
        }

        public Criteria andThirdAccountIdLessThanOrEqualTo(Integer value) {
            addCriterion("third_account_id <=", value, "thirdAccountId");
            return (Criteria) this;
        }

        public Criteria andThirdAccountIdIn(List<Integer> values) {
            addCriterion("third_account_id in", values, "thirdAccountId");
            return (Criteria) this;
        }

        public Criteria andThirdAccountIdNotIn(List<Integer> values) {
            addCriterion("third_account_id not in", values, "thirdAccountId");
            return (Criteria) this;
        }

        public Criteria andThirdAccountIdBetween(Integer value1, Integer value2) {
            addCriterion("third_account_id between", value1, value2, "thirdAccountId");
            return (Criteria) this;
        }

        public Criteria andThirdAccountIdNotBetween(Integer value1, Integer value2) {
            addCriterion("third_account_id not between", value1, value2, "thirdAccountId");
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