package com.isprint.jslx.lccfd.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FdStudentVipQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public FdStudentVipQuery() {
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

        public Criteria andSearchNumIsNull() {
            addCriterion("search_num is null");
            return (Criteria) this;
        }

        public Criteria andSearchNumIsNotNull() {
            addCriterion("search_num is not null");
            return (Criteria) this;
        }

        public Criteria andSearchNumEqualTo(Integer value) {
            addCriterion("search_num =", value, "searchNum");
            return (Criteria) this;
        }

        public Criteria andSearchNumNotEqualTo(Integer value) {
            addCriterion("search_num <>", value, "searchNum");
            return (Criteria) this;
        }

        public Criteria andSearchNumGreaterThan(Integer value) {
            addCriterion("search_num >", value, "searchNum");
            return (Criteria) this;
        }

        public Criteria andSearchNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("search_num >=", value, "searchNum");
            return (Criteria) this;
        }

        public Criteria andSearchNumLessThan(Integer value) {
            addCriterion("search_num <", value, "searchNum");
            return (Criteria) this;
        }

        public Criteria andSearchNumLessThanOrEqualTo(Integer value) {
            addCriterion("search_num <=", value, "searchNum");
            return (Criteria) this;
        }

        public Criteria andSearchNumIn(List<Integer> values) {
            addCriterion("search_num in", values, "searchNum");
            return (Criteria) this;
        }

        public Criteria andSearchNumNotIn(List<Integer> values) {
            addCriterion("search_num not in", values, "searchNum");
            return (Criteria) this;
        }

        public Criteria andSearchNumBetween(Integer value1, Integer value2) {
            addCriterion("search_num between", value1, value2, "searchNum");
            return (Criteria) this;
        }

        public Criteria andSearchNumNotBetween(Integer value1, Integer value2) {
            addCriterion("search_num not between", value1, value2, "searchNum");
            return (Criteria) this;
        }

        public Criteria andMathStartTimeIsNull() {
            addCriterion("math_start_time is null");
            return (Criteria) this;
        }

        public Criteria andMathStartTimeIsNotNull() {
            addCriterion("math_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andMathStartTimeEqualTo(Date value) {
            addCriterion("math_start_time =", value, "mathStartTime");
            return (Criteria) this;
        }

        public Criteria andMathStartTimeNotEqualTo(Date value) {
            addCriterion("math_start_time <>", value, "mathStartTime");
            return (Criteria) this;
        }

        public Criteria andMathStartTimeGreaterThan(Date value) {
            addCriterion("math_start_time >", value, "mathStartTime");
            return (Criteria) this;
        }

        public Criteria andMathStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("math_start_time >=", value, "mathStartTime");
            return (Criteria) this;
        }

        public Criteria andMathStartTimeLessThan(Date value) {
            addCriterion("math_start_time <", value, "mathStartTime");
            return (Criteria) this;
        }

        public Criteria andMathStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("math_start_time <=", value, "mathStartTime");
            return (Criteria) this;
        }

        public Criteria andMathStartTimeIn(List<Date> values) {
            addCriterion("math_start_time in", values, "mathStartTime");
            return (Criteria) this;
        }

        public Criteria andMathStartTimeNotIn(List<Date> values) {
            addCriterion("math_start_time not in", values, "mathStartTime");
            return (Criteria) this;
        }

        public Criteria andMathStartTimeBetween(Date value1, Date value2) {
            addCriterion("math_start_time between", value1, value2, "mathStartTime");
            return (Criteria) this;
        }

        public Criteria andMathStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("math_start_time not between", value1, value2, "mathStartTime");
            return (Criteria) this;
        }

        public Criteria andMathEndTimeIsNull() {
            addCriterion("math_end_time is null");
            return (Criteria) this;
        }

        public Criteria andMathEndTimeIsNotNull() {
            addCriterion("math_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andMathEndTimeEqualTo(Date value) {
            addCriterion("math_end_time =", value, "mathEndTime");
            return (Criteria) this;
        }

        public Criteria andMathEndTimeNotEqualTo(Date value) {
            addCriterion("math_end_time <>", value, "mathEndTime");
            return (Criteria) this;
        }

        public Criteria andMathEndTimeGreaterThan(Date value) {
            addCriterion("math_end_time >", value, "mathEndTime");
            return (Criteria) this;
        }

        public Criteria andMathEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("math_end_time >=", value, "mathEndTime");
            return (Criteria) this;
        }

        public Criteria andMathEndTimeLessThan(Date value) {
            addCriterion("math_end_time <", value, "mathEndTime");
            return (Criteria) this;
        }

        public Criteria andMathEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("math_end_time <=", value, "mathEndTime");
            return (Criteria) this;
        }

        public Criteria andMathEndTimeIn(List<Date> values) {
            addCriterion("math_end_time in", values, "mathEndTime");
            return (Criteria) this;
        }

        public Criteria andMathEndTimeNotIn(List<Date> values) {
            addCriterion("math_end_time not in", values, "mathEndTime");
            return (Criteria) this;
        }

        public Criteria andMathEndTimeBetween(Date value1, Date value2) {
            addCriterion("math_end_time between", value1, value2, "mathEndTime");
            return (Criteria) this;
        }

        public Criteria andMathEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("math_end_time not between", value1, value2, "mathEndTime");
            return (Criteria) this;
        }

        public Criteria andPhysicsStartTimeIsNull() {
            addCriterion("physics_start_time is null");
            return (Criteria) this;
        }

        public Criteria andPhysicsStartTimeIsNotNull() {
            addCriterion("physics_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andPhysicsStartTimeEqualTo(Date value) {
            addCriterion("physics_start_time =", value, "physicsStartTime");
            return (Criteria) this;
        }

        public Criteria andPhysicsStartTimeNotEqualTo(Date value) {
            addCriterion("physics_start_time <>", value, "physicsStartTime");
            return (Criteria) this;
        }

        public Criteria andPhysicsStartTimeGreaterThan(Date value) {
            addCriterion("physics_start_time >", value, "physicsStartTime");
            return (Criteria) this;
        }

        public Criteria andPhysicsStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("physics_start_time >=", value, "physicsStartTime");
            return (Criteria) this;
        }

        public Criteria andPhysicsStartTimeLessThan(Date value) {
            addCriterion("physics_start_time <", value, "physicsStartTime");
            return (Criteria) this;
        }

        public Criteria andPhysicsStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("physics_start_time <=", value, "physicsStartTime");
            return (Criteria) this;
        }

        public Criteria andPhysicsStartTimeIn(List<Date> values) {
            addCriterion("physics_start_time in", values, "physicsStartTime");
            return (Criteria) this;
        }

        public Criteria andPhysicsStartTimeNotIn(List<Date> values) {
            addCriterion("physics_start_time not in", values, "physicsStartTime");
            return (Criteria) this;
        }

        public Criteria andPhysicsStartTimeBetween(Date value1, Date value2) {
            addCriterion("physics_start_time between", value1, value2, "physicsStartTime");
            return (Criteria) this;
        }

        public Criteria andPhysicsStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("physics_start_time not between", value1, value2, "physicsStartTime");
            return (Criteria) this;
        }

        public Criteria andPhysicsEndTimeIsNull() {
            addCriterion("physics_end_time is null");
            return (Criteria) this;
        }

        public Criteria andPhysicsEndTimeIsNotNull() {
            addCriterion("physics_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andPhysicsEndTimeEqualTo(Date value) {
            addCriterion("physics_end_time =", value, "physicsEndTime");
            return (Criteria) this;
        }

        public Criteria andPhysicsEndTimeNotEqualTo(Date value) {
            addCriterion("physics_end_time <>", value, "physicsEndTime");
            return (Criteria) this;
        }

        public Criteria andPhysicsEndTimeGreaterThan(Date value) {
            addCriterion("physics_end_time >", value, "physicsEndTime");
            return (Criteria) this;
        }

        public Criteria andPhysicsEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("physics_end_time >=", value, "physicsEndTime");
            return (Criteria) this;
        }

        public Criteria andPhysicsEndTimeLessThan(Date value) {
            addCriterion("physics_end_time <", value, "physicsEndTime");
            return (Criteria) this;
        }

        public Criteria andPhysicsEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("physics_end_time <=", value, "physicsEndTime");
            return (Criteria) this;
        }

        public Criteria andPhysicsEndTimeIn(List<Date> values) {
            addCriterion("physics_end_time in", values, "physicsEndTime");
            return (Criteria) this;
        }

        public Criteria andPhysicsEndTimeNotIn(List<Date> values) {
            addCriterion("physics_end_time not in", values, "physicsEndTime");
            return (Criteria) this;
        }

        public Criteria andPhysicsEndTimeBetween(Date value1, Date value2) {
            addCriterion("physics_end_time between", value1, value2, "physicsEndTime");
            return (Criteria) this;
        }

        public Criteria andPhysicsEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("physics_end_time not between", value1, value2, "physicsEndTime");
            return (Criteria) this;
        }

        public Criteria andChemieStartTimeIsNull() {
            addCriterion("chemie_start_time is null");
            return (Criteria) this;
        }

        public Criteria andChemieStartTimeIsNotNull() {
            addCriterion("chemie_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andChemieStartTimeEqualTo(Date value) {
            addCriterion("chemie_start_time =", value, "chemieStartTime");
            return (Criteria) this;
        }

        public Criteria andChemieStartTimeNotEqualTo(Date value) {
            addCriterion("chemie_start_time <>", value, "chemieStartTime");
            return (Criteria) this;
        }

        public Criteria andChemieStartTimeGreaterThan(Date value) {
            addCriterion("chemie_start_time >", value, "chemieStartTime");
            return (Criteria) this;
        }

        public Criteria andChemieStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("chemie_start_time >=", value, "chemieStartTime");
            return (Criteria) this;
        }

        public Criteria andChemieStartTimeLessThan(Date value) {
            addCriterion("chemie_start_time <", value, "chemieStartTime");
            return (Criteria) this;
        }

        public Criteria andChemieStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("chemie_start_time <=", value, "chemieStartTime");
            return (Criteria) this;
        }

        public Criteria andChemieStartTimeIn(List<Date> values) {
            addCriterion("chemie_start_time in", values, "chemieStartTime");
            return (Criteria) this;
        }

        public Criteria andChemieStartTimeNotIn(List<Date> values) {
            addCriterion("chemie_start_time not in", values, "chemieStartTime");
            return (Criteria) this;
        }

        public Criteria andChemieStartTimeBetween(Date value1, Date value2) {
            addCriterion("chemie_start_time between", value1, value2, "chemieStartTime");
            return (Criteria) this;
        }

        public Criteria andChemieStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("chemie_start_time not between", value1, value2, "chemieStartTime");
            return (Criteria) this;
        }

        public Criteria andChemieEndTimeIsNull() {
            addCriterion("chemie_end_time is null");
            return (Criteria) this;
        }

        public Criteria andChemieEndTimeIsNotNull() {
            addCriterion("chemie_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andChemieEndTimeEqualTo(Date value) {
            addCriterion("chemie_end_time =", value, "chemieEndTime");
            return (Criteria) this;
        }

        public Criteria andChemieEndTimeNotEqualTo(Date value) {
            addCriterion("chemie_end_time <>", value, "chemieEndTime");
            return (Criteria) this;
        }

        public Criteria andChemieEndTimeGreaterThan(Date value) {
            addCriterion("chemie_end_time >", value, "chemieEndTime");
            return (Criteria) this;
        }

        public Criteria andChemieEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("chemie_end_time >=", value, "chemieEndTime");
            return (Criteria) this;
        }

        public Criteria andChemieEndTimeLessThan(Date value) {
            addCriterion("chemie_end_time <", value, "chemieEndTime");
            return (Criteria) this;
        }

        public Criteria andChemieEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("chemie_end_time <=", value, "chemieEndTime");
            return (Criteria) this;
        }

        public Criteria andChemieEndTimeIn(List<Date> values) {
            addCriterion("chemie_end_time in", values, "chemieEndTime");
            return (Criteria) this;
        }

        public Criteria andChemieEndTimeNotIn(List<Date> values) {
            addCriterion("chemie_end_time not in", values, "chemieEndTime");
            return (Criteria) this;
        }

        public Criteria andChemieEndTimeBetween(Date value1, Date value2) {
            addCriterion("chemie_end_time between", value1, value2, "chemieEndTime");
            return (Criteria) this;
        }

        public Criteria andChemieEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("chemie_end_time not between", value1, value2, "chemieEndTime");
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