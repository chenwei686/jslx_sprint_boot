package com.isprint.jslx.lccfd.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FdStudentThirdHjyQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public FdStudentThirdHjyQuery() {
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

        public Criteria andThirdSchoolIdIsNull() {
            addCriterion("third_school_id is null");
            return (Criteria) this;
        }

        public Criteria andThirdSchoolIdIsNotNull() {
            addCriterion("third_school_id is not null");
            return (Criteria) this;
        }

        public Criteria andThirdSchoolIdEqualTo(String value) {
            addCriterion("third_school_id =", value, "thirdSchoolId");
            return (Criteria) this;
        }

        public Criteria andThirdSchoolIdNotEqualTo(String value) {
            addCriterion("third_school_id <>", value, "thirdSchoolId");
            return (Criteria) this;
        }

        public Criteria andThirdSchoolIdGreaterThan(String value) {
            addCriterion("third_school_id >", value, "thirdSchoolId");
            return (Criteria) this;
        }

        public Criteria andThirdSchoolIdGreaterThanOrEqualTo(String value) {
            addCriterion("third_school_id >=", value, "thirdSchoolId");
            return (Criteria) this;
        }

        public Criteria andThirdSchoolIdLessThan(String value) {
            addCriterion("third_school_id <", value, "thirdSchoolId");
            return (Criteria) this;
        }

        public Criteria andThirdSchoolIdLessThanOrEqualTo(String value) {
            addCriterion("third_school_id <=", value, "thirdSchoolId");
            return (Criteria) this;
        }

        public Criteria andThirdSchoolIdLike(String value) {
            addCriterion("third_school_id like", value, "thirdSchoolId");
            return (Criteria) this;
        }

        public Criteria andThirdSchoolIdNotLike(String value) {
            addCriterion("third_school_id not like", value, "thirdSchoolId");
            return (Criteria) this;
        }

        public Criteria andThirdSchoolIdIn(List<String> values) {
            addCriterion("third_school_id in", values, "thirdSchoolId");
            return (Criteria) this;
        }

        public Criteria andThirdSchoolIdNotIn(List<String> values) {
            addCriterion("third_school_id not in", values, "thirdSchoolId");
            return (Criteria) this;
        }

        public Criteria andThirdSchoolIdBetween(String value1, String value2) {
            addCriterion("third_school_id between", value1, value2, "thirdSchoolId");
            return (Criteria) this;
        }

        public Criteria andThirdSchoolIdNotBetween(String value1, String value2) {
            addCriterion("third_school_id not between", value1, value2, "thirdSchoolId");
            return (Criteria) this;
        }

        public Criteria andThirdSchoolNameIsNull() {
            addCriterion("third_school_name is null");
            return (Criteria) this;
        }

        public Criteria andThirdSchoolNameIsNotNull() {
            addCriterion("third_school_name is not null");
            return (Criteria) this;
        }

        public Criteria andThirdSchoolNameEqualTo(String value) {
            addCriterion("third_school_name =", value, "thirdSchoolName");
            return (Criteria) this;
        }

        public Criteria andThirdSchoolNameNotEqualTo(String value) {
            addCriterion("third_school_name <>", value, "thirdSchoolName");
            return (Criteria) this;
        }

        public Criteria andThirdSchoolNameGreaterThan(String value) {
            addCriterion("third_school_name >", value, "thirdSchoolName");
            return (Criteria) this;
        }

        public Criteria andThirdSchoolNameGreaterThanOrEqualTo(String value) {
            addCriterion("third_school_name >=", value, "thirdSchoolName");
            return (Criteria) this;
        }

        public Criteria andThirdSchoolNameLessThan(String value) {
            addCriterion("third_school_name <", value, "thirdSchoolName");
            return (Criteria) this;
        }

        public Criteria andThirdSchoolNameLessThanOrEqualTo(String value) {
            addCriterion("third_school_name <=", value, "thirdSchoolName");
            return (Criteria) this;
        }

        public Criteria andThirdSchoolNameLike(String value) {
            addCriterion("third_school_name like", value, "thirdSchoolName");
            return (Criteria) this;
        }

        public Criteria andThirdSchoolNameNotLike(String value) {
            addCriterion("third_school_name not like", value, "thirdSchoolName");
            return (Criteria) this;
        }

        public Criteria andThirdSchoolNameIn(List<String> values) {
            addCriterion("third_school_name in", values, "thirdSchoolName");
            return (Criteria) this;
        }

        public Criteria andThirdSchoolNameNotIn(List<String> values) {
            addCriterion("third_school_name not in", values, "thirdSchoolName");
            return (Criteria) this;
        }

        public Criteria andThirdSchoolNameBetween(String value1, String value2) {
            addCriterion("third_school_name between", value1, value2, "thirdSchoolName");
            return (Criteria) this;
        }

        public Criteria andThirdSchoolNameNotBetween(String value1, String value2) {
            addCriterion("third_school_name not between", value1, value2, "thirdSchoolName");
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

        public Criteria andThirdGradeNameIsNull() {
            addCriterion("third_grade_name is null");
            return (Criteria) this;
        }

        public Criteria andThirdGradeNameIsNotNull() {
            addCriterion("third_grade_name is not null");
            return (Criteria) this;
        }

        public Criteria andThirdGradeNameEqualTo(String value) {
            addCriterion("third_grade_name =", value, "thirdGradeName");
            return (Criteria) this;
        }

        public Criteria andThirdGradeNameNotEqualTo(String value) {
            addCriterion("third_grade_name <>", value, "thirdGradeName");
            return (Criteria) this;
        }

        public Criteria andThirdGradeNameGreaterThan(String value) {
            addCriterion("third_grade_name >", value, "thirdGradeName");
            return (Criteria) this;
        }

        public Criteria andThirdGradeNameGreaterThanOrEqualTo(String value) {
            addCriterion("third_grade_name >=", value, "thirdGradeName");
            return (Criteria) this;
        }

        public Criteria andThirdGradeNameLessThan(String value) {
            addCriterion("third_grade_name <", value, "thirdGradeName");
            return (Criteria) this;
        }

        public Criteria andThirdGradeNameLessThanOrEqualTo(String value) {
            addCriterion("third_grade_name <=", value, "thirdGradeName");
            return (Criteria) this;
        }

        public Criteria andThirdGradeNameLike(String value) {
            addCriterion("third_grade_name like", value, "thirdGradeName");
            return (Criteria) this;
        }

        public Criteria andThirdGradeNameNotLike(String value) {
            addCriterion("third_grade_name not like", value, "thirdGradeName");
            return (Criteria) this;
        }

        public Criteria andThirdGradeNameIn(List<String> values) {
            addCriterion("third_grade_name in", values, "thirdGradeName");
            return (Criteria) this;
        }

        public Criteria andThirdGradeNameNotIn(List<String> values) {
            addCriterion("third_grade_name not in", values, "thirdGradeName");
            return (Criteria) this;
        }

        public Criteria andThirdGradeNameBetween(String value1, String value2) {
            addCriterion("third_grade_name between", value1, value2, "thirdGradeName");
            return (Criteria) this;
        }

        public Criteria andThirdGradeNameNotBetween(String value1, String value2) {
            addCriterion("third_grade_name not between", value1, value2, "thirdGradeName");
            return (Criteria) this;
        }

        public Criteria andThirdClassesIdIsNull() {
            addCriterion("third_classes_id is null");
            return (Criteria) this;
        }

        public Criteria andThirdClassesIdIsNotNull() {
            addCriterion("third_classes_id is not null");
            return (Criteria) this;
        }

        public Criteria andThirdClassesIdEqualTo(String value) {
            addCriterion("third_classes_id =", value, "thirdClassesId");
            return (Criteria) this;
        }

        public Criteria andThirdClassesIdNotEqualTo(String value) {
            addCriterion("third_classes_id <>", value, "thirdClassesId");
            return (Criteria) this;
        }

        public Criteria andThirdClassesIdGreaterThan(String value) {
            addCriterion("third_classes_id >", value, "thirdClassesId");
            return (Criteria) this;
        }

        public Criteria andThirdClassesIdGreaterThanOrEqualTo(String value) {
            addCriterion("third_classes_id >=", value, "thirdClassesId");
            return (Criteria) this;
        }

        public Criteria andThirdClassesIdLessThan(String value) {
            addCriterion("third_classes_id <", value, "thirdClassesId");
            return (Criteria) this;
        }

        public Criteria andThirdClassesIdLessThanOrEqualTo(String value) {
            addCriterion("third_classes_id <=", value, "thirdClassesId");
            return (Criteria) this;
        }

        public Criteria andThirdClassesIdLike(String value) {
            addCriterion("third_classes_id like", value, "thirdClassesId");
            return (Criteria) this;
        }

        public Criteria andThirdClassesIdNotLike(String value) {
            addCriterion("third_classes_id not like", value, "thirdClassesId");
            return (Criteria) this;
        }

        public Criteria andThirdClassesIdIn(List<String> values) {
            addCriterion("third_classes_id in", values, "thirdClassesId");
            return (Criteria) this;
        }

        public Criteria andThirdClassesIdNotIn(List<String> values) {
            addCriterion("third_classes_id not in", values, "thirdClassesId");
            return (Criteria) this;
        }

        public Criteria andThirdClassesIdBetween(String value1, String value2) {
            addCriterion("third_classes_id between", value1, value2, "thirdClassesId");
            return (Criteria) this;
        }

        public Criteria andThirdClassesIdNotBetween(String value1, String value2) {
            addCriterion("third_classes_id not between", value1, value2, "thirdClassesId");
            return (Criteria) this;
        }

        public Criteria andThirdClassesNameIsNull() {
            addCriterion("third_classes_name is null");
            return (Criteria) this;
        }

        public Criteria andThirdClassesNameIsNotNull() {
            addCriterion("third_classes_name is not null");
            return (Criteria) this;
        }

        public Criteria andThirdClassesNameEqualTo(String value) {
            addCriterion("third_classes_name =", value, "thirdClassesName");
            return (Criteria) this;
        }

        public Criteria andThirdClassesNameNotEqualTo(String value) {
            addCriterion("third_classes_name <>", value, "thirdClassesName");
            return (Criteria) this;
        }

        public Criteria andThirdClassesNameGreaterThan(String value) {
            addCriterion("third_classes_name >", value, "thirdClassesName");
            return (Criteria) this;
        }

        public Criteria andThirdClassesNameGreaterThanOrEqualTo(String value) {
            addCriterion("third_classes_name >=", value, "thirdClassesName");
            return (Criteria) this;
        }

        public Criteria andThirdClassesNameLessThan(String value) {
            addCriterion("third_classes_name <", value, "thirdClassesName");
            return (Criteria) this;
        }

        public Criteria andThirdClassesNameLessThanOrEqualTo(String value) {
            addCriterion("third_classes_name <=", value, "thirdClassesName");
            return (Criteria) this;
        }

        public Criteria andThirdClassesNameLike(String value) {
            addCriterion("third_classes_name like", value, "thirdClassesName");
            return (Criteria) this;
        }

        public Criteria andThirdClassesNameNotLike(String value) {
            addCriterion("third_classes_name not like", value, "thirdClassesName");
            return (Criteria) this;
        }

        public Criteria andThirdClassesNameIn(List<String> values) {
            addCriterion("third_classes_name in", values, "thirdClassesName");
            return (Criteria) this;
        }

        public Criteria andThirdClassesNameNotIn(List<String> values) {
            addCriterion("third_classes_name not in", values, "thirdClassesName");
            return (Criteria) this;
        }

        public Criteria andThirdClassesNameBetween(String value1, String value2) {
            addCriterion("third_classes_name between", value1, value2, "thirdClassesName");
            return (Criteria) this;
        }

        public Criteria andThirdClassesNameNotBetween(String value1, String value2) {
            addCriterion("third_classes_name not between", value1, value2, "thirdClassesName");
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

        public Criteria andThirdProvinceIdIsNull() {
            addCriterion("third_province_id is null");
            return (Criteria) this;
        }

        public Criteria andThirdProvinceIdIsNotNull() {
            addCriterion("third_province_id is not null");
            return (Criteria) this;
        }

        public Criteria andThirdProvinceIdEqualTo(Integer value) {
            addCriterion("third_province_id =", value, "thirdProvinceId");
            return (Criteria) this;
        }

        public Criteria andThirdProvinceIdNotEqualTo(Integer value) {
            addCriterion("third_province_id <>", value, "thirdProvinceId");
            return (Criteria) this;
        }

        public Criteria andThirdProvinceIdGreaterThan(Integer value) {
            addCriterion("third_province_id >", value, "thirdProvinceId");
            return (Criteria) this;
        }

        public Criteria andThirdProvinceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("third_province_id >=", value, "thirdProvinceId");
            return (Criteria) this;
        }

        public Criteria andThirdProvinceIdLessThan(Integer value) {
            addCriterion("third_province_id <", value, "thirdProvinceId");
            return (Criteria) this;
        }

        public Criteria andThirdProvinceIdLessThanOrEqualTo(Integer value) {
            addCriterion("third_province_id <=", value, "thirdProvinceId");
            return (Criteria) this;
        }

        public Criteria andThirdProvinceIdIn(List<Integer> values) {
            addCriterion("third_province_id in", values, "thirdProvinceId");
            return (Criteria) this;
        }

        public Criteria andThirdProvinceIdNotIn(List<Integer> values) {
            addCriterion("third_province_id not in", values, "thirdProvinceId");
            return (Criteria) this;
        }

        public Criteria andThirdProvinceIdBetween(Integer value1, Integer value2) {
            addCriterion("third_province_id between", value1, value2, "thirdProvinceId");
            return (Criteria) this;
        }

        public Criteria andThirdProvinceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("third_province_id not between", value1, value2, "thirdProvinceId");
            return (Criteria) this;
        }

        public Criteria andThirdProvinceNameIsNull() {
            addCriterion("third_province_name is null");
            return (Criteria) this;
        }

        public Criteria andThirdProvinceNameIsNotNull() {
            addCriterion("third_province_name is not null");
            return (Criteria) this;
        }

        public Criteria andThirdProvinceNameEqualTo(String value) {
            addCriterion("third_province_name =", value, "thirdProvinceName");
            return (Criteria) this;
        }

        public Criteria andThirdProvinceNameNotEqualTo(String value) {
            addCriterion("third_province_name <>", value, "thirdProvinceName");
            return (Criteria) this;
        }

        public Criteria andThirdProvinceNameGreaterThan(String value) {
            addCriterion("third_province_name >", value, "thirdProvinceName");
            return (Criteria) this;
        }

        public Criteria andThirdProvinceNameGreaterThanOrEqualTo(String value) {
            addCriterion("third_province_name >=", value, "thirdProvinceName");
            return (Criteria) this;
        }

        public Criteria andThirdProvinceNameLessThan(String value) {
            addCriterion("third_province_name <", value, "thirdProvinceName");
            return (Criteria) this;
        }

        public Criteria andThirdProvinceNameLessThanOrEqualTo(String value) {
            addCriterion("third_province_name <=", value, "thirdProvinceName");
            return (Criteria) this;
        }

        public Criteria andThirdProvinceNameLike(String value) {
            addCriterion("third_province_name like", value, "thirdProvinceName");
            return (Criteria) this;
        }

        public Criteria andThirdProvinceNameNotLike(String value) {
            addCriterion("third_province_name not like", value, "thirdProvinceName");
            return (Criteria) this;
        }

        public Criteria andThirdProvinceNameIn(List<String> values) {
            addCriterion("third_province_name in", values, "thirdProvinceName");
            return (Criteria) this;
        }

        public Criteria andThirdProvinceNameNotIn(List<String> values) {
            addCriterion("third_province_name not in", values, "thirdProvinceName");
            return (Criteria) this;
        }

        public Criteria andThirdProvinceNameBetween(String value1, String value2) {
            addCriterion("third_province_name between", value1, value2, "thirdProvinceName");
            return (Criteria) this;
        }

        public Criteria andThirdProvinceNameNotBetween(String value1, String value2) {
            addCriterion("third_province_name not between", value1, value2, "thirdProvinceName");
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

        public Criteria andThirdUserIdEqualTo(String value) {
            addCriterion("third_user_id =", value, "thirdUserId");
            return (Criteria) this;
        }

        public Criteria andThirdUserIdNotEqualTo(String value) {
            addCriterion("third_user_id <>", value, "thirdUserId");
            return (Criteria) this;
        }

        public Criteria andThirdUserIdGreaterThan(String value) {
            addCriterion("third_user_id >", value, "thirdUserId");
            return (Criteria) this;
        }

        public Criteria andThirdUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("third_user_id >=", value, "thirdUserId");
            return (Criteria) this;
        }

        public Criteria andThirdUserIdLessThan(String value) {
            addCriterion("third_user_id <", value, "thirdUserId");
            return (Criteria) this;
        }

        public Criteria andThirdUserIdLessThanOrEqualTo(String value) {
            addCriterion("third_user_id <=", value, "thirdUserId");
            return (Criteria) this;
        }

        public Criteria andThirdUserIdLike(String value) {
            addCriterion("third_user_id like", value, "thirdUserId");
            return (Criteria) this;
        }

        public Criteria andThirdUserIdNotLike(String value) {
            addCriterion("third_user_id not like", value, "thirdUserId");
            return (Criteria) this;
        }

        public Criteria andThirdUserIdIn(List<String> values) {
            addCriterion("third_user_id in", values, "thirdUserId");
            return (Criteria) this;
        }

        public Criteria andThirdUserIdNotIn(List<String> values) {
            addCriterion("third_user_id not in", values, "thirdUserId");
            return (Criteria) this;
        }

        public Criteria andThirdUserIdBetween(String value1, String value2) {
            addCriterion("third_user_id between", value1, value2, "thirdUserId");
            return (Criteria) this;
        }

        public Criteria andThirdUserIdNotBetween(String value1, String value2) {
            addCriterion("third_user_id not between", value1, value2, "thirdUserId");
            return (Criteria) this;
        }

        public Criteria andXxtStateIsNull() {
            addCriterion("xxt_state is null");
            return (Criteria) this;
        }

        public Criteria andXxtStateIsNotNull() {
            addCriterion("xxt_state is not null");
            return (Criteria) this;
        }

        public Criteria andXxtStateEqualTo(Integer value) {
            addCriterion("xxt_state =", value, "xxtState");
            return (Criteria) this;
        }

        public Criteria andXxtStateNotEqualTo(Integer value) {
            addCriterion("xxt_state <>", value, "xxtState");
            return (Criteria) this;
        }

        public Criteria andXxtStateGreaterThan(Integer value) {
            addCriterion("xxt_state >", value, "xxtState");
            return (Criteria) this;
        }

        public Criteria andXxtStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("xxt_state >=", value, "xxtState");
            return (Criteria) this;
        }

        public Criteria andXxtStateLessThan(Integer value) {
            addCriterion("xxt_state <", value, "xxtState");
            return (Criteria) this;
        }

        public Criteria andXxtStateLessThanOrEqualTo(Integer value) {
            addCriterion("xxt_state <=", value, "xxtState");
            return (Criteria) this;
        }

        public Criteria andXxtStateIn(List<Integer> values) {
            addCriterion("xxt_state in", values, "xxtState");
            return (Criteria) this;
        }

        public Criteria andXxtStateNotIn(List<Integer> values) {
            addCriterion("xxt_state not in", values, "xxtState");
            return (Criteria) this;
        }

        public Criteria andXxtStateBetween(Integer value1, Integer value2) {
            addCriterion("xxt_state between", value1, value2, "xxtState");
            return (Criteria) this;
        }

        public Criteria andXxtStateNotBetween(Integer value1, Integer value2) {
            addCriterion("xxt_state not between", value1, value2, "xxtState");
            return (Criteria) this;
        }

        public Criteria andHead20IsNull() {
            addCriterion("head20 is null");
            return (Criteria) this;
        }

        public Criteria andHead20IsNotNull() {
            addCriterion("head20 is not null");
            return (Criteria) this;
        }

        public Criteria andHead20EqualTo(String value) {
            addCriterion("head20 =", value, "head20");
            return (Criteria) this;
        }

        public Criteria andHead20NotEqualTo(String value) {
            addCriterion("head20 <>", value, "head20");
            return (Criteria) this;
        }

        public Criteria andHead20GreaterThan(String value) {
            addCriterion("head20 >", value, "head20");
            return (Criteria) this;
        }

        public Criteria andHead20GreaterThanOrEqualTo(String value) {
            addCriterion("head20 >=", value, "head20");
            return (Criteria) this;
        }

        public Criteria andHead20LessThan(String value) {
            addCriterion("head20 <", value, "head20");
            return (Criteria) this;
        }

        public Criteria andHead20LessThanOrEqualTo(String value) {
            addCriterion("head20 <=", value, "head20");
            return (Criteria) this;
        }

        public Criteria andHead20Like(String value) {
            addCriterion("head20 like", value, "head20");
            return (Criteria) this;
        }

        public Criteria andHead20NotLike(String value) {
            addCriterion("head20 not like", value, "head20");
            return (Criteria) this;
        }

        public Criteria andHead20In(List<String> values) {
            addCriterion("head20 in", values, "head20");
            return (Criteria) this;
        }

        public Criteria andHead20NotIn(List<String> values) {
            addCriterion("head20 not in", values, "head20");
            return (Criteria) this;
        }

        public Criteria andHead20Between(String value1, String value2) {
            addCriterion("head20 between", value1, value2, "head20");
            return (Criteria) this;
        }

        public Criteria andHead20NotBetween(String value1, String value2) {
            addCriterion("head20 not between", value1, value2, "head20");
            return (Criteria) this;
        }

        public Criteria andHead70IsNull() {
            addCriterion("head70 is null");
            return (Criteria) this;
        }

        public Criteria andHead70IsNotNull() {
            addCriterion("head70 is not null");
            return (Criteria) this;
        }

        public Criteria andHead70EqualTo(String value) {
            addCriterion("head70 =", value, "head70");
            return (Criteria) this;
        }

        public Criteria andHead70NotEqualTo(String value) {
            addCriterion("head70 <>", value, "head70");
            return (Criteria) this;
        }

        public Criteria andHead70GreaterThan(String value) {
            addCriterion("head70 >", value, "head70");
            return (Criteria) this;
        }

        public Criteria andHead70GreaterThanOrEqualTo(String value) {
            addCriterion("head70 >=", value, "head70");
            return (Criteria) this;
        }

        public Criteria andHead70LessThan(String value) {
            addCriterion("head70 <", value, "head70");
            return (Criteria) this;
        }

        public Criteria andHead70LessThanOrEqualTo(String value) {
            addCriterion("head70 <=", value, "head70");
            return (Criteria) this;
        }

        public Criteria andHead70Like(String value) {
            addCriterion("head70 like", value, "head70");
            return (Criteria) this;
        }

        public Criteria andHead70NotLike(String value) {
            addCriterion("head70 not like", value, "head70");
            return (Criteria) this;
        }

        public Criteria andHead70In(List<String> values) {
            addCriterion("head70 in", values, "head70");
            return (Criteria) this;
        }

        public Criteria andHead70NotIn(List<String> values) {
            addCriterion("head70 not in", values, "head70");
            return (Criteria) this;
        }

        public Criteria andHead70Between(String value1, String value2) {
            addCriterion("head70 between", value1, value2, "head70");
            return (Criteria) this;
        }

        public Criteria andHead70NotBetween(String value1, String value2) {
            addCriterion("head70 not between", value1, value2, "head70");
            return (Criteria) this;
        }

        public Criteria andHead100IsNull() {
            addCriterion("head100 is null");
            return (Criteria) this;
        }

        public Criteria andHead100IsNotNull() {
            addCriterion("head100 is not null");
            return (Criteria) this;
        }

        public Criteria andHead100EqualTo(String value) {
            addCriterion("head100 =", value, "head100");
            return (Criteria) this;
        }

        public Criteria andHead100NotEqualTo(String value) {
            addCriterion("head100 <>", value, "head100");
            return (Criteria) this;
        }

        public Criteria andHead100GreaterThan(String value) {
            addCriterion("head100 >", value, "head100");
            return (Criteria) this;
        }

        public Criteria andHead100GreaterThanOrEqualTo(String value) {
            addCriterion("head100 >=", value, "head100");
            return (Criteria) this;
        }

        public Criteria andHead100LessThan(String value) {
            addCriterion("head100 <", value, "head100");
            return (Criteria) this;
        }

        public Criteria andHead100LessThanOrEqualTo(String value) {
            addCriterion("head100 <=", value, "head100");
            return (Criteria) this;
        }

        public Criteria andHead100Like(String value) {
            addCriterion("head100 like", value, "head100");
            return (Criteria) this;
        }

        public Criteria andHead100NotLike(String value) {
            addCriterion("head100 not like", value, "head100");
            return (Criteria) this;
        }

        public Criteria andHead100In(List<String> values) {
            addCriterion("head100 in", values, "head100");
            return (Criteria) this;
        }

        public Criteria andHead100NotIn(List<String> values) {
            addCriterion("head100 not in", values, "head100");
            return (Criteria) this;
        }

        public Criteria andHead100Between(String value1, String value2) {
            addCriterion("head100 between", value1, value2, "head100");
            return (Criteria) this;
        }

        public Criteria andHead100NotBetween(String value1, String value2) {
            addCriterion("head100 not between", value1, value2, "head100");
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