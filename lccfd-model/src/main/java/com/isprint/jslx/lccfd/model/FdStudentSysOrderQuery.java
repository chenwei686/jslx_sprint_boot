package com.isprint.jslx.lccfd.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FdStudentSysOrderQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public FdStudentSysOrderQuery() {
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

        public Criteria andMathNumberIsNull() {
            addCriterion("math_number is null");
            return (Criteria) this;
        }

        public Criteria andMathNumberIsNotNull() {
            addCriterion("math_number is not null");
            return (Criteria) this;
        }

        public Criteria andMathNumberEqualTo(Integer value) {
            addCriterion("math_number =", value, "mathNumber");
            return (Criteria) this;
        }

        public Criteria andMathNumberNotEqualTo(Integer value) {
            addCriterion("math_number <>", value, "mathNumber");
            return (Criteria) this;
        }

        public Criteria andMathNumberGreaterThan(Integer value) {
            addCriterion("math_number >", value, "mathNumber");
            return (Criteria) this;
        }

        public Criteria andMathNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("math_number >=", value, "mathNumber");
            return (Criteria) this;
        }

        public Criteria andMathNumberLessThan(Integer value) {
            addCriterion("math_number <", value, "mathNumber");
            return (Criteria) this;
        }

        public Criteria andMathNumberLessThanOrEqualTo(Integer value) {
            addCriterion("math_number <=", value, "mathNumber");
            return (Criteria) this;
        }

        public Criteria andMathNumberIn(List<Integer> values) {
            addCriterion("math_number in", values, "mathNumber");
            return (Criteria) this;
        }

        public Criteria andMathNumberNotIn(List<Integer> values) {
            addCriterion("math_number not in", values, "mathNumber");
            return (Criteria) this;
        }

        public Criteria andMathNumberBetween(Integer value1, Integer value2) {
            addCriterion("math_number between", value1, value2, "mathNumber");
            return (Criteria) this;
        }

        public Criteria andMathNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("math_number not between", value1, value2, "mathNumber");
            return (Criteria) this;
        }

        public Criteria andPhysicsNumberIsNull() {
            addCriterion("physics_number is null");
            return (Criteria) this;
        }

        public Criteria andPhysicsNumberIsNotNull() {
            addCriterion("physics_number is not null");
            return (Criteria) this;
        }

        public Criteria andPhysicsNumberEqualTo(Integer value) {
            addCriterion("physics_number =", value, "physicsNumber");
            return (Criteria) this;
        }

        public Criteria andPhysicsNumberNotEqualTo(Integer value) {
            addCriterion("physics_number <>", value, "physicsNumber");
            return (Criteria) this;
        }

        public Criteria andPhysicsNumberGreaterThan(Integer value) {
            addCriterion("physics_number >", value, "physicsNumber");
            return (Criteria) this;
        }

        public Criteria andPhysicsNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("physics_number >=", value, "physicsNumber");
            return (Criteria) this;
        }

        public Criteria andPhysicsNumberLessThan(Integer value) {
            addCriterion("physics_number <", value, "physicsNumber");
            return (Criteria) this;
        }

        public Criteria andPhysicsNumberLessThanOrEqualTo(Integer value) {
            addCriterion("physics_number <=", value, "physicsNumber");
            return (Criteria) this;
        }

        public Criteria andPhysicsNumberIn(List<Integer> values) {
            addCriterion("physics_number in", values, "physicsNumber");
            return (Criteria) this;
        }

        public Criteria andPhysicsNumberNotIn(List<Integer> values) {
            addCriterion("physics_number not in", values, "physicsNumber");
            return (Criteria) this;
        }

        public Criteria andPhysicsNumberBetween(Integer value1, Integer value2) {
            addCriterion("physics_number between", value1, value2, "physicsNumber");
            return (Criteria) this;
        }

        public Criteria andPhysicsNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("physics_number not between", value1, value2, "physicsNumber");
            return (Criteria) this;
        }

        public Criteria andChemistryNumberIsNull() {
            addCriterion("chemistry_number is null");
            return (Criteria) this;
        }

        public Criteria andChemistryNumberIsNotNull() {
            addCriterion("chemistry_number is not null");
            return (Criteria) this;
        }

        public Criteria andChemistryNumberEqualTo(Integer value) {
            addCriterion("chemistry_number =", value, "chemistryNumber");
            return (Criteria) this;
        }

        public Criteria andChemistryNumberNotEqualTo(Integer value) {
            addCriterion("chemistry_number <>", value, "chemistryNumber");
            return (Criteria) this;
        }

        public Criteria andChemistryNumberGreaterThan(Integer value) {
            addCriterion("chemistry_number >", value, "chemistryNumber");
            return (Criteria) this;
        }

        public Criteria andChemistryNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("chemistry_number >=", value, "chemistryNumber");
            return (Criteria) this;
        }

        public Criteria andChemistryNumberLessThan(Integer value) {
            addCriterion("chemistry_number <", value, "chemistryNumber");
            return (Criteria) this;
        }

        public Criteria andChemistryNumberLessThanOrEqualTo(Integer value) {
            addCriterion("chemistry_number <=", value, "chemistryNumber");
            return (Criteria) this;
        }

        public Criteria andChemistryNumberIn(List<Integer> values) {
            addCriterion("chemistry_number in", values, "chemistryNumber");
            return (Criteria) this;
        }

        public Criteria andChemistryNumberNotIn(List<Integer> values) {
            addCriterion("chemistry_number not in", values, "chemistryNumber");
            return (Criteria) this;
        }

        public Criteria andChemistryNumberBetween(Integer value1, Integer value2) {
            addCriterion("chemistry_number between", value1, value2, "chemistryNumber");
            return (Criteria) this;
        }

        public Criteria andChemistryNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("chemistry_number not between", value1, value2, "chemistryNumber");
            return (Criteria) this;
        }

        public Criteria andLastMathNumberIsNull() {
            addCriterion("last_math_number is null");
            return (Criteria) this;
        }

        public Criteria andLastMathNumberIsNotNull() {
            addCriterion("last_math_number is not null");
            return (Criteria) this;
        }

        public Criteria andLastMathNumberEqualTo(Integer value) {
            addCriterion("last_math_number =", value, "lastMathNumber");
            return (Criteria) this;
        }

        public Criteria andLastMathNumberNotEqualTo(Integer value) {
            addCriterion("last_math_number <>", value, "lastMathNumber");
            return (Criteria) this;
        }

        public Criteria andLastMathNumberGreaterThan(Integer value) {
            addCriterion("last_math_number >", value, "lastMathNumber");
            return (Criteria) this;
        }

        public Criteria andLastMathNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_math_number >=", value, "lastMathNumber");
            return (Criteria) this;
        }

        public Criteria andLastMathNumberLessThan(Integer value) {
            addCriterion("last_math_number <", value, "lastMathNumber");
            return (Criteria) this;
        }

        public Criteria andLastMathNumberLessThanOrEqualTo(Integer value) {
            addCriterion("last_math_number <=", value, "lastMathNumber");
            return (Criteria) this;
        }

        public Criteria andLastMathNumberIn(List<Integer> values) {
            addCriterion("last_math_number in", values, "lastMathNumber");
            return (Criteria) this;
        }

        public Criteria andLastMathNumberNotIn(List<Integer> values) {
            addCriterion("last_math_number not in", values, "lastMathNumber");
            return (Criteria) this;
        }

        public Criteria andLastMathNumberBetween(Integer value1, Integer value2) {
            addCriterion("last_math_number between", value1, value2, "lastMathNumber");
            return (Criteria) this;
        }

        public Criteria andLastMathNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("last_math_number not between", value1, value2, "lastMathNumber");
            return (Criteria) this;
        }

        public Criteria andLastPhysicsNumberIsNull() {
            addCriterion("last_physics_number is null");
            return (Criteria) this;
        }

        public Criteria andLastPhysicsNumberIsNotNull() {
            addCriterion("last_physics_number is not null");
            return (Criteria) this;
        }

        public Criteria andLastPhysicsNumberEqualTo(Integer value) {
            addCriterion("last_physics_number =", value, "lastPhysicsNumber");
            return (Criteria) this;
        }

        public Criteria andLastPhysicsNumberNotEqualTo(Integer value) {
            addCriterion("last_physics_number <>", value, "lastPhysicsNumber");
            return (Criteria) this;
        }

        public Criteria andLastPhysicsNumberGreaterThan(Integer value) {
            addCriterion("last_physics_number >", value, "lastPhysicsNumber");
            return (Criteria) this;
        }

        public Criteria andLastPhysicsNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_physics_number >=", value, "lastPhysicsNumber");
            return (Criteria) this;
        }

        public Criteria andLastPhysicsNumberLessThan(Integer value) {
            addCriterion("last_physics_number <", value, "lastPhysicsNumber");
            return (Criteria) this;
        }

        public Criteria andLastPhysicsNumberLessThanOrEqualTo(Integer value) {
            addCriterion("last_physics_number <=", value, "lastPhysicsNumber");
            return (Criteria) this;
        }

        public Criteria andLastPhysicsNumberIn(List<Integer> values) {
            addCriterion("last_physics_number in", values, "lastPhysicsNumber");
            return (Criteria) this;
        }

        public Criteria andLastPhysicsNumberNotIn(List<Integer> values) {
            addCriterion("last_physics_number not in", values, "lastPhysicsNumber");
            return (Criteria) this;
        }

        public Criteria andLastPhysicsNumberBetween(Integer value1, Integer value2) {
            addCriterion("last_physics_number between", value1, value2, "lastPhysicsNumber");
            return (Criteria) this;
        }

        public Criteria andLastPhysicsNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("last_physics_number not between", value1, value2, "lastPhysicsNumber");
            return (Criteria) this;
        }

        public Criteria andLastChemistryNumberIsNull() {
            addCriterion("last_chemistry_number is null");
            return (Criteria) this;
        }

        public Criteria andLastChemistryNumberIsNotNull() {
            addCriterion("last_chemistry_number is not null");
            return (Criteria) this;
        }

        public Criteria andLastChemistryNumberEqualTo(Integer value) {
            addCriterion("last_chemistry_number =", value, "lastChemistryNumber");
            return (Criteria) this;
        }

        public Criteria andLastChemistryNumberNotEqualTo(Integer value) {
            addCriterion("last_chemistry_number <>", value, "lastChemistryNumber");
            return (Criteria) this;
        }

        public Criteria andLastChemistryNumberGreaterThan(Integer value) {
            addCriterion("last_chemistry_number >", value, "lastChemistryNumber");
            return (Criteria) this;
        }

        public Criteria andLastChemistryNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_chemistry_number >=", value, "lastChemistryNumber");
            return (Criteria) this;
        }

        public Criteria andLastChemistryNumberLessThan(Integer value) {
            addCriterion("last_chemistry_number <", value, "lastChemistryNumber");
            return (Criteria) this;
        }

        public Criteria andLastChemistryNumberLessThanOrEqualTo(Integer value) {
            addCriterion("last_chemistry_number <=", value, "lastChemistryNumber");
            return (Criteria) this;
        }

        public Criteria andLastChemistryNumberIn(List<Integer> values) {
            addCriterion("last_chemistry_number in", values, "lastChemistryNumber");
            return (Criteria) this;
        }

        public Criteria andLastChemistryNumberNotIn(List<Integer> values) {
            addCriterion("last_chemistry_number not in", values, "lastChemistryNumber");
            return (Criteria) this;
        }

        public Criteria andLastChemistryNumberBetween(Integer value1, Integer value2) {
            addCriterion("last_chemistry_number between", value1, value2, "lastChemistryNumber");
            return (Criteria) this;
        }

        public Criteria andLastChemistryNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("last_chemistry_number not between", value1, value2, "lastChemistryNumber");
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

        public Criteria andYearIdIsNull() {
            addCriterion("year_id is null");
            return (Criteria) this;
        }

        public Criteria andYearIdIsNotNull() {
            addCriterion("year_id is not null");
            return (Criteria) this;
        }

        public Criteria andYearIdEqualTo(Integer value) {
            addCriterion("year_id =", value, "yearId");
            return (Criteria) this;
        }

        public Criteria andYearIdNotEqualTo(Integer value) {
            addCriterion("year_id <>", value, "yearId");
            return (Criteria) this;
        }

        public Criteria andYearIdGreaterThan(Integer value) {
            addCriterion("year_id >", value, "yearId");
            return (Criteria) this;
        }

        public Criteria andYearIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("year_id >=", value, "yearId");
            return (Criteria) this;
        }

        public Criteria andYearIdLessThan(Integer value) {
            addCriterion("year_id <", value, "yearId");
            return (Criteria) this;
        }

        public Criteria andYearIdLessThanOrEqualTo(Integer value) {
            addCriterion("year_id <=", value, "yearId");
            return (Criteria) this;
        }

        public Criteria andYearIdIn(List<Integer> values) {
            addCriterion("year_id in", values, "yearId");
            return (Criteria) this;
        }

        public Criteria andYearIdNotIn(List<Integer> values) {
            addCriterion("year_id not in", values, "yearId");
            return (Criteria) this;
        }

        public Criteria andYearIdBetween(Integer value1, Integer value2) {
            addCriterion("year_id between", value1, value2, "yearId");
            return (Criteria) this;
        }

        public Criteria andYearIdNotBetween(Integer value1, Integer value2) {
            addCriterion("year_id not between", value1, value2, "yearId");
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